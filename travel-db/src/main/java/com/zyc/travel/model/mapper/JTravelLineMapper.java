package com.zyc.travel.model.mapper;

import com.zyc.travel.model.dto.JTravelLine;
import com.zyc.travel.model.dto.JTravelLineExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JTravelLineMapper {
    int countByExample(JTravelLineExample example);

    int deleteByExample(JTravelLineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JTravelLine record);

    int insertSelective(JTravelLine record);

    List<JTravelLine> selectByExample(JTravelLineExample example);

    JTravelLine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JTravelLine record, @Param("example") JTravelLineExample example);

    int updateByExample(@Param("record") JTravelLine record, @Param("example") JTravelLineExample example);

    int updateByPrimaryKeySelective(JTravelLine record);

    int updateByPrimaryKey(JTravelLine record);

    JTravelLine getById(Integer id);

    Integer updateOutDateLine();
}