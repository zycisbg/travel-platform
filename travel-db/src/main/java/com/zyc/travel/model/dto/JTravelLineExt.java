package com.zyc.travel.model.dto;

import java.io.Serializable;

public class JTravelLineExt implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_ext.id
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_ext.transportation_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    private String transportationDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_ext.deposit_remark
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    private String depositRemark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_ext.cost_contain
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    private String costContain;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_ext.cost_not_contain
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    private String costNotContain;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_ext.oneself_project
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    private String oneselfProject;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_ext.insurance_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    private String insuranceDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_ext.reservations_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    private String reservationsDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_ext.go_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    private String goDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_ext.shopping_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    private String shoppingDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_ext.team_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    private String teamDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_ext.transportation_change_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    private String transportationChangeDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column j_travel_line_ext.customer_limit
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    private String customerLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table j_travel_line_ext
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_ext.id
     *
     * @return the value of j_travel_line_ext.id
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_ext.id
     *
     * @param id the value for j_travel_line_ext.id
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_ext.transportation_detail
     *
     * @return the value of j_travel_line_ext.transportation_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public String getTransportationDetail() {
        return transportationDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_ext.transportation_detail
     *
     * @param transportationDetail the value for j_travel_line_ext.transportation_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public void setTransportationDetail(String transportationDetail) {
        this.transportationDetail = transportationDetail == null ? null : transportationDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_ext.deposit_remark
     *
     * @return the value of j_travel_line_ext.deposit_remark
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public String getDepositRemark() {
        return depositRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_ext.deposit_remark
     *
     * @param depositRemark the value for j_travel_line_ext.deposit_remark
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public void setDepositRemark(String depositRemark) {
        this.depositRemark = depositRemark == null ? null : depositRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_ext.cost_contain
     *
     * @return the value of j_travel_line_ext.cost_contain
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public String getCostContain() {
        return costContain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_ext.cost_contain
     *
     * @param costContain the value for j_travel_line_ext.cost_contain
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public void setCostContain(String costContain) {
        this.costContain = costContain == null ? null : costContain.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_ext.cost_not_contain
     *
     * @return the value of j_travel_line_ext.cost_not_contain
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public String getCostNotContain() {
        return costNotContain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_ext.cost_not_contain
     *
     * @param costNotContain the value for j_travel_line_ext.cost_not_contain
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public void setCostNotContain(String costNotContain) {
        this.costNotContain = costNotContain == null ? null : costNotContain.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_ext.oneself_project
     *
     * @return the value of j_travel_line_ext.oneself_project
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public String getOneselfProject() {
        return oneselfProject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_ext.oneself_project
     *
     * @param oneselfProject the value for j_travel_line_ext.oneself_project
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public void setOneselfProject(String oneselfProject) {
        this.oneselfProject = oneselfProject == null ? null : oneselfProject.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_ext.insurance_detail
     *
     * @return the value of j_travel_line_ext.insurance_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public String getInsuranceDetail() {
        return insuranceDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_ext.insurance_detail
     *
     * @param insuranceDetail the value for j_travel_line_ext.insurance_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public void setInsuranceDetail(String insuranceDetail) {
        this.insuranceDetail = insuranceDetail == null ? null : insuranceDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_ext.reservations_detail
     *
     * @return the value of j_travel_line_ext.reservations_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public String getReservationsDetail() {
        return reservationsDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_ext.reservations_detail
     *
     * @param reservationsDetail the value for j_travel_line_ext.reservations_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public void setReservationsDetail(String reservationsDetail) {
        this.reservationsDetail = reservationsDetail == null ? null : reservationsDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_ext.go_detail
     *
     * @return the value of j_travel_line_ext.go_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public String getGoDetail() {
        return goDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_ext.go_detail
     *
     * @param goDetail the value for j_travel_line_ext.go_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public void setGoDetail(String goDetail) {
        this.goDetail = goDetail == null ? null : goDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_ext.shopping_detail
     *
     * @return the value of j_travel_line_ext.shopping_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public String getShoppingDetail() {
        return shoppingDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_ext.shopping_detail
     *
     * @param shoppingDetail the value for j_travel_line_ext.shopping_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public void setShoppingDetail(String shoppingDetail) {
        this.shoppingDetail = shoppingDetail == null ? null : shoppingDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_ext.team_detail
     *
     * @return the value of j_travel_line_ext.team_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public String getTeamDetail() {
        return teamDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_ext.team_detail
     *
     * @param teamDetail the value for j_travel_line_ext.team_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public void setTeamDetail(String teamDetail) {
        this.teamDetail = teamDetail == null ? null : teamDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_ext.transportation_change_detail
     *
     * @return the value of j_travel_line_ext.transportation_change_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public String getTransportationChangeDetail() {
        return transportationChangeDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_ext.transportation_change_detail
     *
     * @param transportationChangeDetail the value for j_travel_line_ext.transportation_change_detail
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public void setTransportationChangeDetail(String transportationChangeDetail) {
        this.transportationChangeDetail = transportationChangeDetail == null ? null : transportationChangeDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column j_travel_line_ext.customer_limit
     *
     * @return the value of j_travel_line_ext.customer_limit
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public String getCustomerLimit() {
        return customerLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column j_travel_line_ext.customer_limit
     *
     * @param customerLimit the value for j_travel_line_ext.customer_limit
     *
     * @mbggenerated Wed Mar 01 17:53:38 CST 2017
     */
    public void setCustomerLimit(String customerLimit) {
        this.customerLimit = customerLimit == null ? null : customerLimit.trim();
    }
}