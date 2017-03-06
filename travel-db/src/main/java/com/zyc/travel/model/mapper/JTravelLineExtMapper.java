package com.zyc.travel.model.mapper;

import com.zyc.travel.model.dto.JTravelLineExt;
import com.zyc.travel.model.dto.JTravelLineExtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JTravelLineExtMapper {
    int countByExample(JTravelLineExtExample example);

    int deleteByExample(JTravelLineExtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JTravelLineExt record);

    int insertSelective(JTravelLineExt record);

    List<JTravelLineExt> selectByExampleWithBLOBs(JTravelLineExtExample example);

    List<JTravelLineExt> selectByExample(JTravelLineExtExample example);

    JTravelLineExt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JTravelLineExt record, @Param("example") JTravelLineExtExample example);

    int updateByExampleWithBLOBs(@Param("record") JTravelLineExt record, @Param("example") JTravelLineExtExample example);

    int updateByExample(@Param("record") JTravelLineExt record, @Param("example") JTravelLineExtExample example);

    int updateByPrimaryKeySelective(JTravelLineExt record);

    int updateByPrimaryKeyWithBLOBs(JTravelLineExt record);
}