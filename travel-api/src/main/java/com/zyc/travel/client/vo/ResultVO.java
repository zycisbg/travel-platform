package com.zyc.travel.client.vo;

/**
 * Created by songxinlei on 2016/8/24.
 */
public class ResultVO implements java.io.Serializable {

    public int errorCode;

    public String errorInfo;

    public ResultVO() {
        this.errorCode = 0;
        this.errorInfo = "成功";
    }

    public ResultVO(ErrorInfoEnum errorInfoEnum) {
        this.setErrorInfo(errorInfoEnum.getInfo());
        this.setErrorCode(errorInfoEnum.getCode());
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

    public boolean isSuccess() {
        if (errorCode == 0) {
            return true;
        }
        return false;
    }
}
