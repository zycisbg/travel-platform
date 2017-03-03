package com.zyc.travel.client.vo;

/**
 * Created by songxinlei on 2016/8/24.
 */
public enum ErrorInfoEnum implements java.io.Serializable {

    SYS_ERROR(999999, "系统异常"),
    TRAVEL_NAME_IS_NOT_NULL(9999998,"旅行社名称不能为空"),
    TRAVEL_ID_IS_NOT_NULL(9999997,"旅行社id不能为空"),
    LINE_ID_IS_NOT_NULL(9999996,"线路id不能为空"),
    SHOPPING_DETAIL_IS_NOT_NULL(9999995,"购物详情不能为空"),
    TRAVEL_LINE_EXT_IS_NOT_NULL(9999994,"旅游线路详情不能为空"),
    TRAVEL_LINE_DETAIL_IS_NOT_NULL(9999993,"旅游行程信息不能为空"),
    GO_DATE_IS_NOT_NULL(9999992,"发团时间不能为空" );
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
