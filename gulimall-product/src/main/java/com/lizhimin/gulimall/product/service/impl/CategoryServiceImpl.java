package com.lizhimin.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizhimin.common.utils.PageUtils;
import com.lizhimin.common.utils.Query;

import com.lizhimin.gulimall.product.dao.CategoryDao;
import com.lizhimin.gulimall.product.entity.CategoryEntity;
import com.lizhimin.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listwithTree() {
        //1、查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        //2、组装成父子的树形结构

        //2.1）、找到所有的一级分类
        List<CategoryEntity> level1Menus = entities.stream().filter(categoryEntity ->
              categoryEntity.getParentCid() == 0L
        ).map((menu)->{
            menu.setChildren(getChildrens(menu,entities));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());




        return level1Menus;
    }

    @Override
    public Integer removeMenuByIds(List<Long> asList) {
       return baseMapper.deleteBatchIds(asList);
    }

    /**
     * 递归查找所有菜单的子菜单
     * @param root
     * @param all
     * @return
     */
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream().filter(categoryEntity ->
            categoryEntity.getParentCid().equals(root.getCatId())
        ).map(categoryEntity -> {
            //1、找到子菜单
            System.out.println("==========="+categoryEntity);
            categoryEntity.setChildren(getChildrens(categoryEntity,all));

            return categoryEntity;
        }).collect(Collectors.toList());
        return children;
    }
    private List<CategoryEntity> getC(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> filterList = new ArrayList<>();
        for(CategoryEntity cc:all){
            if (cc.getParentCid().equals(root.getCatId())){
               filterList.add(cc);
               getC(cc,all);
            }
        }
        return filterList;
    }

}