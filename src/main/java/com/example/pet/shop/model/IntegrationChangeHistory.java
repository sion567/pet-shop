package com.example.pet.shop.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

/**
 * 积分变化历史记录
 */
@Setter
@Getter
public class IntegrationChangeHistory {
    /**
     * member_id
     */
    private Long memberId;
    /**
     * 变化的值
     */
    private Integer changeCount;
    /**
     * 备注
     */
    private String note;
    /**
     * 来源[0->购物；1->管理员修改;2->活动]
     */
    @Column(columnDefinition="tinyint")
    private Integer sourceTyoe;
}
