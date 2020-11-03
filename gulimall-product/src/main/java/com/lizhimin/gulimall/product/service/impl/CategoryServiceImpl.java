package com.lizhimin.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        List<CategoryEntity> allCategoryEntityList = baseMapper.selectList(null);
        //一级分类
        List<CategoryEntity> level1Meus = allCategoryEntityList.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid() == 0L;
        }).map((menu)->{
            menu.setChildren(getChildren(menu,allCategoryEntityList));
            return menu;
        }).sorted((menu1, menu2)->{
            return menu1.getSort() - menu2.getSort();
        }).collect(Collectors.toList());



        return level1Meus;
    }

    /**
     * 递归查找所有菜单的子菜单
     * @param categoryEntity
     * @param allCategoryEntityList
     * @return
     */
    private List<CategoryEntity> getChildren(CategoryEntity categoryEntity,List<CategoryEntity> allCategoryEntityList){

        List<CategoryEntity> children = allCategoryEntityList.stream().filter((categoryEntity1) -> {
            return categoryEntity1.getParentCid() == categoryEntity.getCatId();
        }).map((categoryEntity2)->{
            //递归找法
            categoryEntity2.setChildren(getChildren(categoryEntity2,allCategoryEntityList));
            return categoryEntity2;
            }
        ).sorted((menu1,menu2)->{
            //菜单的排序
            return menu1.getSort() == null?0:menu1.getSort() - (menu2.getSort() == null?0:menu2.getSort());
        }).collect(Collectors.toList());

        return children;
    }

}