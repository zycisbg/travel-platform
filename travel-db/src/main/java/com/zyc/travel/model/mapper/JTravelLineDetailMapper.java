package com.zyc.travel.model.mapper;

import com.zyc.travel.model.dto.JTravelLineDetail;
import com.zyc.travel.model.dto.JTravelLineDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JTravelLineDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_line_detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    int countByExample(JTravelLineDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_line_detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    int deleteByExample(JTravelLineDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_line_detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_line_detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    int insert(JTravelLineDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_line_detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    int insertSelective(JTravelLineDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_line_detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    List<JTravelLineDetail> selectByExampleWithBLOBs(JTravelLineDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_line_detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    List<JTravelLineDetail> selectByExample(JTravelLineDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_line_detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    JTravelLineDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_line_detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    int updateByExampleSelective(@Param("record") JTravelLineDetail record, @Param("example") JTravelLineDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_line_detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") JTravelLineDetail record, @Param("example") JTravelLineDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_line_detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    int updateByExample(@Param("record") JTravelLineDetail record, @Param("example") JTravelLineDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_line_detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    int updateByPrimaryKeySelective(JTravelLineDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_line_detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(JTravelLineDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_line_detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    int updateByPrimaryKey(JTravelLineDetail record);
}