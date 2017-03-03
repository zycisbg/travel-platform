package com.zyc.travel.client.util;

import static com.zyc.travel.client.util.TravelTypeEnum.*;

/**
 * Created by zyc on 17/3/2.
 */
public enum LineTipsEnum {
    RECOMMEND(0,"推荐"),HOT_SALE(1,"热卖"),COMMON(2,"正常");

    private int code;

    private String info;
    LineTipsEnum(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public static LineTipsEnum valueOf(int code) {
        switch (code) {
            case 0:
                return RECOMMEND;
            case 1:
                return HOT_SALE;
            case 2:
                return COMMON;
            default:
                return null;
        }
    }

    public int getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
