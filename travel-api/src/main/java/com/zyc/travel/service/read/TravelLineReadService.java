package com.zyc.travel.service.read;

import com.zyc.travel.client.vo.TravelLineVO;

import java.util.List;

/**
 * Created by zyc on 17/3/2.
 */
public interface TravelLineReadService {

    /**
     * 根据参数查询旅行线路列表
     * @param travelLineVO
     * @return
     */
    List<TravelLineVO> queryList(TravelLineVO travelLineVO,Integer start,Integer limit);

    /**
     * 根据id查询旅行线路
     * @param id
     * @return
     */
    TravelLineVO getById(Integer id);
}
