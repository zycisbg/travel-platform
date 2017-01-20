package com.zyc.travel.common.exception;

import com.zyc.travel.client.vo.ErrorInfoEnum;

/**
 * Created by zyc on 17/1/19.
 */
public class TravelException extends Exception{
    private int errorCode;

    private String errorInfo;

    private ErrorInfoEnum errorInfoEnum;

    public TravelException(ErrorInfoEnum errorInfoEnum) {
        this.errorInfoEnum = errorInfoEnum;
        this.errorCode = errorInfoEnum.getCode();
        this.errorInfo = errorInfoEnum.getInfo();
    }

    public ErrorInfoEnum getErrorEnum() {
        return errorInfoEnum;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }
}
