package com.zyc.travel.client.util;

/**
 * Created by zyc on 17/1/19.
 */
public enum TravelTypeEnum {
    NOT_APPLY(0,"未申请"),SEND_TEAM_AGENCY(1,"发团社"),ORGANIZED_TEAM_AGENCY(2,"组团社"),APPLYING(3,"申请中");

    private int code;

    private String info;
    TravelTypeEnum(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public static TravelTypeEnum valueOf(int code) {
        switch (code) {
            case 0:
                return NOT_APPLY;
            case 1:
                return SEND_TEAM_AGENCY;
            case 2:
                return ORGANIZED_TEAM_AGENCY;
            case 3:
                return APPLYING;
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
