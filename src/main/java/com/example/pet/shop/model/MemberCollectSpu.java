package com.example.pet.shop.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 会员收藏的商品
 */
@Setter
@Getter
public class MemberCollectSpu {
    /**
     * 会员id
     */
    private Long memberId;
    /**
     * spu_id
     */
    private Long spuId;
    /**
     * spu_name
     */
    private String spuName;
    /**
     * spu_img
     */
    private String spuImg;

}
