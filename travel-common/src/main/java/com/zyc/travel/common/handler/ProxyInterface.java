package com.zyc.travel.common.handler;

/**
 * Created by songxinlei on 2016/8/29.
 */
public interface ProxyInterface<T,V> {

    /**
     * T 参数代表需要操作对象的工具类
     * V 参数实体对象
     * @param
     * @return
     */
    public abstract Object doBegin(T t, Object[] parm);

    /**
     * T 参数代表需要操作对象的工具类
     * returnObj invok 后返回的参数
     *
     * @param returnObj
     * @param t
     * @return
     */
    public abstract Object doEnd(V returnObj, T t);
}
