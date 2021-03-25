package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * 库存工作单
 */
@Setter
@Getter
public class WareOrderTaskDetail extends BizEntity {
    /**
     * sku_id
     */
    private Long skuId;
    /**
     * sku_name
     */
    private String skuName;
    /**
     * 购买个数
     */
    private Integer skuNum;
    /**
     * 工作单id
     */
    private Long taskId;
}
