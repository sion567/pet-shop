package com.example.pet.shop.common;

public interface Constants {
    String CURRENT_USER = "user";
    /**
     * 当前页码
     */
    String PAGE = "page";
    /**
     * 每页显示记录数
     */
    String LIMIT = "limit";
    /**
     * 排序字段
     */
    String ORDER_FIELD = "sidx";
    /**
     * 排序方式
     */
    String ORDER = "order";
    /**
     *  升序
     */
    String ASC = "asc";

    enum MenuType {
        /**
         * 目录
         */
        CATALOG(0),
        /**
         * 菜单
         */
        MENU(1),
        /**
         * 按钮
         */
        BUTTON(2);

        private int value;

        MenuType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    enum Role {
        GUEST(0),
        ADMIN(1),
        SYSTEM(2);

        private int value;
        Role(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
