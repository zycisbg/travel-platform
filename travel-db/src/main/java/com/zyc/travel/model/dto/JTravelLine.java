package com.zyc.travel.model.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class JTravelLine implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.id
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.travel_id
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private Integer travelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.travel_tel
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private String travelTel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.travel_name
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private String travelName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.title
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.business_price
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private Long businessPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.agency_price
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private Long agencyPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.travel_day_count
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private Integer travelDayCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.transportation
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private String transportation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.go_date
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private Date goDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.surplus_count
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private Integer surplusCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.advance_day_count
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private Integer advanceDayCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.look_count
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private Integer lookCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.line_area
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private String lineArea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.line_tips
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private Integer lineTips;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.status
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.create_date
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line.update_date
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private Date updateDate;

    private JTravelLineExt jTravelLineExt;

    private List<JTravelLineDetail> jTravelLineDetailList;

    public JTravelLineExt getjTravelLineExt() {
        return jTravelLineExt;
    }

    public void setjTravelLineExt(JTravelLineExt jTravelLineExt) {
        this.jTravelLineExt = jTravelLineExt;
    }

    public List<JTravelLineDetail> getjTravelLineDetailList() {
        return jTravelLineDetailList;
    }

    public void setjTravelLineDetailList(List<JTravelLineDetail> jTravelLineDetailList) {
        this.jTravelLineDetailList = jTravelLineDetailList;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table j_travel_line
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.id
     *
     * @return the value of j_travel_line.id
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.id
     *
     * @param id the value for j_travel_line.id
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.travel_id
     *
     * @return the value of j_travel_line.travel_id
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public Integer getTravelId() {
        return travelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.travel_id
     *
     * @param travelId the value for j_travel_line.travel_id
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setTravelId(Integer travelId) {
        this.travelId = travelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.travel_tel
     *
     * @return the value of j_travel_line.travel_tel
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public String getTravelTel() {
        return travelTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.travel_tel
     *
     * @param travelTel the value for j_travel_line.travel_tel
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setTravelTel(String travelTel) {
        this.travelTel = travelTel == null ? null : travelTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.travel_name
     *
     * @return the value of j_travel_line.travel_name
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public String getTravelName() {
        return travelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.travel_name
     *
     * @param travelName the value for j_travel_line.travel_name
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setTravelName(String travelName) {
        this.travelName = travelName == null ? null : travelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.title
     *
     * @return the value of j_travel_line.title
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.title
     *
     * @param title the value for j_travel_line.title
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.business_price
     *
     * @return the value of j_travel_line.business_price
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public Long getBusinessPrice() {
        return businessPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.business_price
     *
     * @param businessPrice the value for j_travel_line.business_price
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setBusinessPrice(Long businessPrice) {
        this.businessPrice = businessPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.agency_price
     *
     * @return the value of j_travel_line.agency_price
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public Long getAgencyPrice() {
        return agencyPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.agency_price
     *
     * @param agencyPrice the value for j_travel_line.agency_price
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setAgencyPrice(Long agencyPrice) {
        this.agencyPrice = agencyPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.travel_day_count
     *
     * @return the value of j_travel_line.travel_day_count
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public Integer getTravelDayCount() {
        return travelDayCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.travel_day_count
     *
     * @param travelDayCount the value for j_travel_line.travel_day_count
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setTravelDayCount(Integer travelDayCount) {
        this.travelDayCount = travelDayCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.transportation
     *
     * @return the value of j_travel_line.transportation
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public String getTransportation() {
        return transportation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.transportation
     *
     * @param transportation the value for j_travel_line.transportation
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setTransportation(String transportation) {
        this.transportation = transportation == null ? null : transportation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.go_date
     *
     * @return the value of j_travel_line.go_date
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public Date getGoDate() {
        return goDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.go_date
     *
     * @param goDate the value for j_travel_line.go_date
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setGoDate(Date goDate) {
        this.goDate = goDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.surplus_count
     *
     * @return the value of j_travel_line.surplus_count
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public Integer getSurplusCount() {
        return surplusCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.surplus_count
     *
     * @param surplusCount the value for j_travel_line.surplus_count
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setSurplusCount(Integer surplusCount) {
        this.surplusCount = surplusCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.advance_day_count
     *
     * @return the value of j_travel_line.advance_day_count
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public Integer getAdvanceDayCount() {
        return advanceDayCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.advance_day_count
     *
     * @param advanceDayCount the value for j_travel_line.advance_day_count
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setAdvanceDayCount(Integer advanceDayCount) {
        this.advanceDayCount = advanceDayCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.look_count
     *
     * @return the value of j_travel_line.look_count
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public Integer getLookCount() {
        return lookCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.look_count
     *
     * @param lookCount the value for j_travel_line.look_count
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setLookCount(Integer lookCount) {
        this.lookCount = lookCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.line_area
     *
     * @return the value of j_travel_line.line_area
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public String getLineArea() {
        return lineArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.line_area
     *
     * @param lineArea the value for j_travel_line.line_area
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setLineArea(String lineArea) {
        this.lineArea = lineArea == null ? null : lineArea.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.line_tips
     *
     * @return the value of j_travel_line.line_tips
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public Integer getLineTips() {
        return lineTips;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.line_tips
     *
     * @param lineTips the value for j_travel_line.line_tips
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setLineTips(Integer lineTips) {
        this.lineTips = lineTips;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.status
     *
     * @return the value of j_travel_line.status
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.status
     *
     * @param status the value for j_travel_line.status
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.create_date
     *
     * @return the value of j_travel_line.create_date
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.create_date
     *
     * @param createDate the value for j_travel_line.create_date
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line.update_date
     *
     * @return the value of j_travel_line.update_date
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line.update_date
     *
     * @param updateDate the value for j_travel_line.update_date
     *
     * @mbggenerated Thu Mar 02 14:58:16 CST 2017
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}