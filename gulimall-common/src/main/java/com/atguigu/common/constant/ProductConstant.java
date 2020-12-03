package com.atguigu.common.constant;

/**
 * @author wlj Email:wanglujiexx@gmail.com
 * @version 1.0
 * @description .
 * @date 2020/11/30 下午9:13
 */
public class ProductConstant {

    public enum AttrEnum {
        ATTR_TYPE_BASE(1, "基本属性"),
        ATTR_TYPE_SALE(0, "销售属性");

        private int code;
        private String msg;

        AttrEnum(int code, String msg) {
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
