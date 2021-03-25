package com.example.pet.shop.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Setter
@Getter
public class MemberLoginLog {
    /**
     * member_id
     */
    private Long memberId;
    /**
     * ip
     */
    private String ip;
    /**
     * city
     */
    private String city;
    /**
     * 登录类型[1-web，2-app]
     */
    @Column(columnDefinition="tinyint")
    private Integer loginType;
}
