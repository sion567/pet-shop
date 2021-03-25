package com.example.pet.shop.biz;

import com.example.pet.shop.common.base.biz.BaseBiz;
import com.example.pet.shop.manager.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class GoodsBiz extends BaseBiz {
    private SkuInfoManager skuInfoManager;
    private SkuImagesManager skuImagesManager;
    private SkuSaleAttrValueManager skuSaleAttrValueManager;
    private SpuInfoManager spuInfoManager;
    private SpuImagesManager spuImagesManager;
    private SpuCommentManager spuCommentManager;
    private ProductAttrValueManager productAttrValueManager;
    private AttrGroupManager attrGroupManager;
    private AttrManager attrManager;
    private CategoryManager categoryManager;
    private BrandManager brandManager;

    @Autowired
    public GoodsBiz(SkuInfoManager skuInfoManager,
                    SkuImagesManager skuImagesManager,
                    SkuSaleAttrValueManager skuSaleAttrValueManager,
                    SpuInfoManager spuInfoManager,
                    SpuImagesManager spuImagesManager,
                    SpuCommentManager spuCommentManager,
                    ProductAttrValueManager productAttrValueManager,
                    AttrGroupManager attrGroupManager,
                    AttrManager attrManager,
                    CategoryManager categoryManager,
                    BrandManager brandManager) {
        this.skuInfoManager = skuInfoManager;
        this.skuImagesManager = skuImagesManager;
        this.skuSaleAttrValueManager = skuSaleAttrValueManager;
        this.spuInfoManager = spuInfoManager;
        this.spuImagesManager = spuImagesManager;
        this.spuCommentManager = spuCommentManager;
        this.productAttrValueManager = productAttrValueManager;
        this.attrGroupManager = attrGroupManager;
        this.attrManager = attrManager;
        this.categoryManager = categoryManager;
        this.brandManager = brandManager;
    }
}
