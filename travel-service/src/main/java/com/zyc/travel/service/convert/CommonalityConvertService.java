package com.zyc.travel.service.convert;

/**
 * Created by songxinlei on 2016/3/9.
 */
public interface CommonalityConvertService<V, P> {

    public V fromVO(P v);

    public P fromPO(V v);
}
