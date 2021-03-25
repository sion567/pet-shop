package com.example.pet.shop.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

/**
 *成长值变化历史记录
 */
@Setter
@Getter
public class GrowthChangeHistory {
    /**
     * member_id
     */
    private Long memberId;
    /**
     * 改变的值（正负计数）
     */
    private Integer changeCount;
    /**
     * 备注
     */
    private String note;
    /**
     * 积分来源[0-购物，1-管理员修改]
     */
    @Column(columnDefinition="tinyint")
    private Integer sourceType;
}
