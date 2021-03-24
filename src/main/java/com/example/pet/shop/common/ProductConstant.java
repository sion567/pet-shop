package com.example.pet.shop.common;

public class ProductConstant {
    public enum ProductStatus {
        NEW_SPU(0, "商品新建"),
        SPU_UP(1, "商品上架"),
        SPU_DOWN(1, "商品上架");


        private int code;
        private String msg;

        ProductStatus(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }
}
