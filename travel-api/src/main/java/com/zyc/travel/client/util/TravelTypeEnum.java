package com.zyc.travel.client.util;

/**
 * Created by zyc on 17/1/19.
 */
public enum TravelTypeEnum {
    SEND_TEAM_AGENCY(0,"发团社"),ORGANIZED_TEAM_AGENCY(1,"组团社");

    private int code;

    private String info;
    TravelTypeEnum(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public static TravelTypeEnum valueOf(int code) {
        switch (code) {
            case 0:
                return SEND_TEAM_AGENCY;
            case 1:
                return ORGANIZED_TEAM_AGENCY;
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
