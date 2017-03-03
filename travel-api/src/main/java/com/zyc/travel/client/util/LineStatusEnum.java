package com.zyc.travel.client.util;

/**
 * Created by zyc on 17/1/19.
 */
public enum LineStatusEnum {
    ALREADY_FORBIDDEN(0,"已禁用"),ALREADY_START(1,"启用中"),OUT_OF_DATE(2,"已过期");

    private int code;

    private String info;
    LineStatusEnum(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public static LineStatusEnum valueOf(int code) {
        switch (code) {
            case 0:
                return ALREADY_FORBIDDEN;
            case 1:
                return ALREADY_START;
            case 2:
                return OUT_OF_DATE;
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
