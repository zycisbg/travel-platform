package com.zyc.travel.client.vo;

/**
 * Created by songxinlei on 2016/8/24.
 */
public enum ErrorInfoEnum implements java.io.Serializable {

    SYS_ERROR(999999, "系统异常"),
    TRAVEL_NAME_IS_NOT_NULL(9999998,"旅行社名称不能为空");
    private int code;
    private String info;

    ErrorInfoEnum(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
