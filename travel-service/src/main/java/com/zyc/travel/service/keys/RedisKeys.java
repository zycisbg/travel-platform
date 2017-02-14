package com.zyc.travel.service.keys;

/**
 * Created by songxinlei on 2016/8/29.
 */
public enum RedisKeys {
    TRAVEL_INFO("travel_info:","旅行社的缓存数据");

    private String key;

    private String value;

    RedisKeys(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
