package com.zyc.travel.model.dto;

import java.io.Serializable;

public class JTravelLineDetail implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_detail.id
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_detail.line_id
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    private Integer lineId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_detail.day_count
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    private Integer dayCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_detail.title
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_detail.detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    private String detail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table j_travel_line_detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_detail.id
     *
     * @return the value of j_travel_line_detail.id
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_detail.id
     *
     * @param id the value for j_travel_line_detail.id
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_detail.line_id
     *
     * @return the value of j_travel_line_detail.line_id
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    public Integer getLineId() {
        return lineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_detail.line_id
     *
     * @param lineId the value for j_travel_line_detail.line_id
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_detail.day_count
     *
     * @return the value of j_travel_line_detail.day_count
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    public Integer getDayCount() {
        return dayCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_detail.day_count
     *
     * @param dayCount the value for j_travel_line_detail.day_count
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    public void setDayCount(Integer dayCount) {
        this.dayCount = dayCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_detail.title
     *
     * @return the value of j_travel_line_detail.title
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_detail.title
     *
     * @param title the value for j_travel_line_detail.title
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_detail.detail
     *
     * @return the value of j_travel_line_detail.detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_detail.detail
     *
     * @param detail the value for j_travel_line_detail.detail
     *
     * @mbggenerated Wed Mar 01 17:53:37 CST 2017
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}