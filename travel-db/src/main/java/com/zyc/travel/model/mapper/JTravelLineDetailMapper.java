package com.zyc.travel.model.mapper;

import com.zyc.travel.model.dto.JTravelLineDetail;
import com.zyc.travel.model.dto.JTravelLineDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JTravelLineDetailMapper {
    int countByExample(JTravelLineDetailExample example);

    int deleteByExample(JTravelLineDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JTravelLineDetail record);

    int insertSelective(JTravelLineDetail record);

    List<JTravelLineDetail> selectByExampleWithBLOBs(JTravelLineDetailExample example);

    List<JTravelLineDetail> selectByExample(JTravelLineDetailExample example);

    JTravelLineDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JTravelLineDetail record, @Param("example") JTravelLineDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") JTravelLineDetail record, @Param("example") JTravelLineDetailExample example);

    int updateByExample(@Param("record") JTravelLineDetail record, @Param("example") JTravelLineDetailExample example);

    int updateByPrimaryKeySelective(JTravelLineDetail record);

    int updateByPrimaryKeyWithBLOBs(JTravelLineDetail record);

    int updateByPrimaryKey(JTravelLineDetail record);
}