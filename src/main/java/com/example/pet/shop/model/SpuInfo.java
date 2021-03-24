package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "T_SPU_INFO")
public class SpuInfo extends BizEntity {
    /**
     * 商品名称
     */
    private String spuName;
    /**
     * 商品描述
     */
    private String spuDescription;
    /**
     * 所属分类id
     */
    @ManyToOne(cascade = { CascadeType.MERGE,CascadeType.REFRESH}, optional=false)
    @JoinColumn(name = "catalog_id")
    private Category catalog;
    /**
     * 品牌id
     */
    @ManyToOne(cascade = { CascadeType.MERGE,CascadeType.REFRESH}, optional=false)
    @JoinColumn(name = "brand_id")
    private Brand brand;
    /**
     *
     */
    private BigDecimal weight;
    /**
     * 上架状态[0 - 下架，1 - 上架]
     */
    @Column(columnDefinition="tinyint default 1")
    private Integer publishStatus;

    /**
     * 商品介绍
     */
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String decript;

    @OneToMany(mappedBy = "spu", cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    private List<SpuImages> images = new ArrayList<>();

    @OneToMany(mappedBy = "spu", cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    private List<SkuInfo> skuInfos = new ArrayList<>();

    @OneToMany(mappedBy = "spu", cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    private List<SpuComment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "spu", cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<ProductAttrValue> productAttrValueList = new ArrayList<>();

    @ManyToMany(mappedBy = "spuList")
    private List<Member> memberList = new ArrayList<>();
}
