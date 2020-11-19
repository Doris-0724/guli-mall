package com.lizhimin.gulimall.product.po;

import lombok.Data;

@Data
public class QueryPage {
    private Integer page;
    private Integer limit;
    private String key;
}
