package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "T_SPU_IMAGES")
public class SpuImages extends BizEntity {
    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional=false)
    @JoinColumn(name = "spu_id")
    private SpuInfo spu;
    /**
     * 图片名
     */
    private String imgName;
    /**
     * 图片地址
     */
    private String imgUrl;
    /**
     * 顺序
     */
    private Integer imgSort;
    /**
     * 是否默认图
     */
    @Column(columnDefinition="tinyint default 0")
    private Integer defaultImg;
}
