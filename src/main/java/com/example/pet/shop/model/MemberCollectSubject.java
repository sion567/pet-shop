package com.example.pet.shop.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 会员收藏的专题活动
 */
@Setter
@Getter
public class MemberCollectSubject {
    /**
     * subject_id
     */
    private Long subjectId;
    /**
     * subject_name
     */
    private String subjectName;
    /**
     * subject_img
     */
    private String subjectImg;
    /**
     * 活动url
     */
    private String subjectUrll;
}
