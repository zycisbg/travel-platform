package com.zyc.travel.model.mapper;

import com.zyc.travel.model.dto.JTravelAgencyContacts;
import com.zyc.travel.model.dto.JTravelAgencyContactsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JTravelAgencyContactsMapper {
    int countByExample(JTravelAgencyContactsExample example);

    int deleteByExample(JTravelAgencyContactsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JTravelAgencyContacts record);

    int insertSelective(JTravelAgencyContacts record);

    List<JTravelAgencyContacts> selectByExample(JTravelAgencyContactsExample example);

    JTravelAgencyContacts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JTravelAgencyContacts record, @Param("example") JTravelAgencyContactsExample example);

    int updateByExample(@Param("record") JTravelAgencyContacts record, @Param("example") JTravelAgencyContactsExample example);

    int updateByPrimaryKeySelective(JTravelAgencyContacts record);

    int updateByPrimaryKey(JTravelAgencyContacts record);
}