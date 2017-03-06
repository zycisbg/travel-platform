package com.zyc.travel.model.mapper;

import com.zyc.travel.model.dto.JTravelAgency;
import com.zyc.travel.model.dto.JTravelAgencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JTravelAgencyMapper {
    int countByExample(JTravelAgencyExample example);

    int deleteByExample(JTravelAgencyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JTravelAgency record);

    int insertSelective(JTravelAgency record);

    List<JTravelAgency> selectByExample(JTravelAgencyExample example);

    JTravelAgency selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JTravelAgency record, @Param("example") JTravelAgencyExample example);

    int updateByExample(@Param("record") JTravelAgency record, @Param("example") JTravelAgencyExample example);

    int updateByPrimaryKeySelective(JTravelAgency record);

    int updateByPrimaryKey(JTravelAgency record);
}