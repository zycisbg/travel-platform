package com.zyc.travel.service.read;

import com.zyc.travel.client.vo.TravelAgencyVO;

import java.util.List;

/**
 * Created by zyc on 17/1/18.
 */
public interface TravelAgencyReadService {

    /**
     * 根据参数查询列表
     * @param param
     * @param start
     * @param limit
     * @return
     */
    List<TravelAgencyVO> queryList(TravelAgencyVO param,int start,int limit);

    /**
     * 根据id查询旅行社对象
     * @param id
     * @return
     */
    TravelAgencyVO getById(Integer id);

}
