package com.zyc.travel.bpo.read;

import com.zyc.travel.model.dto.JTravelLine;

import java.util.List;

/**
 * Created by zyc on 17/3/2.
 */
public interface TravelLineReadBPO {

    /**
     * 根据参数分页查询线路列表
     * @param jTravelLine
     * @param start
     * @param limit
     * @return
     */
    List<JTravelLine> getListByParam(JTravelLine jTravelLine, Integer start, Integer limit);

    /**
     * 根据id获取线路
     * @param id
     * @return
     */
    JTravelLine getLineById(Integer id);
}
