package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 */
@Setter
@Getter
public class HomeSubject extends BizEntity {
    /**
     * 专题名字
     */
    private String name;
    /**
     * 专题标题
     */
    private String title;
    /**
     * 专题副标题
     */
    private String subTitle;
    /**
     * 显示状态
     */
    private Integer status;
    /**
     * 详情连接
     */
    private String url;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 专题图片地址
     */
    private String img;

    //专题 spu 多对多
}
