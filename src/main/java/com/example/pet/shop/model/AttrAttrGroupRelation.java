package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "T_ATTR_ATTRGROUP")
public class AttrAttrGroupRelation extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "attr_id")
    private Attr attr;
    @ManyToOne
    @JoinColumn(name = "attr_group_id")
    private AttrGroup attrGroup;
    /**
     * 排序
     */
    private Integer sort;
}
