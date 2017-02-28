package com.zyc.travel.common.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by songxinlei on 2016/8/29.
 */
public class DataBaseProxyHandler<T> implements InvocationHandler {

    private Object delegate;

    private ProxyInterface myProxyInterface;

    private Object param;

    public DataBaseProxyHandler(Object v) {
        this.param = v;
    }

    public <T> T proxy(T delegate, ProxyInterface myProxyInterface) {
        this.myProxyInterface = myProxyInterface;
        this.delegate = delegate;

        return (T) Proxy.newProxyInstance(this.delegate.getClass().getClassLoader(),
                this.delegate.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {


        Object obj = null;



        if (args != null && args.length > 0){
            obj = myProxyInterface.doBegin(param,args);
        }else{
            obj = myProxyInterface.doBegin(param,null);
        }
        if (obj != null)
            return obj;


        obj = method.invoke(this.delegate, args);



        if (args != null && args.length > 0){
            myProxyInterface.doEnd(obj, param,args);
        }else{
            myProxyInterface.doEnd(obj, param,null);
        }




        return obj;
    }
}
