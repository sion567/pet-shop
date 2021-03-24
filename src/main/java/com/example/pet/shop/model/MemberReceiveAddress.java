package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "T_MEMBER_RECEIVE_ADDRESS")
public class MemberReceiveAddress extends BizEntity {
    /**
     * member_id
     */
    @ManyToOne(cascade = { CascadeType.MERGE,CascadeType.REFRESH}, optional=false)
    @JoinColumn(name = "member_id")
    private Member member;
    /**
     * 收货人姓名
     */
    private String name;
    /**
     * 电话
     */
    private String phone;
    /**
     * 邮政编码
     */
    private String postCode;
    /**
     * 省份/直辖市
     */
    private String province;
    /**
     * 城市
     */
    private String city;
    /**
     * 区
     */
    private String region;
    /**
     * 详细地址(街道)
     */
    private String detailAddress;
    /**
     * 省市区代码
     */
    private String areaCode;
    /**
     * 是否默认
     */
    @Column(columnDefinition="tinyint default 0")
    private Integer defaultStatus;
}
