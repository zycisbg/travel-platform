package com.zyc.travel.model.dto;

import java.io.Serializable;

public class JTravelLineExt implements Serializable {
    private Integer id;

    private String transportationDetail;

    private String depositRemark;

    private String costContain;

    private String costNotContain;

    private String oneselfProject;

    private String insuranceDetail;

    private String reservationsDetail;

    private String goDetail;

    private String shoppingDetail;

    private String teamDetail;

    private String transportationChangeDetail;

    private String customerLimit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransportationDetail() {
        return transportationDetail;
    }

    public void setTransportationDetail(String transportationDetail) {
        this.transportationDetail = transportationDetail == null ? null : transportationDetail.trim();
    }

    public String getDepositRemark() {
        return depositRemark;
    }

    public void setDepositRemark(String depositRemark) {
        this.depositRemark = depositRemark == null ? null : depositRemark.trim();
    }

    public String getCostContain() {
        return costContain;
    }

    public void setCostContain(String costContain) {
        this.costContain = costContain == null ? null : costContain.trim();
    }

    public String getCostNotContain() {
        return costNotContain;
    }

    public void setCostNotContain(String costNotContain) {
        this.costNotContain = costNotContain == null ? null : costNotContain.trim();
    }

    public String getOneselfProject() {
        return oneselfProject;
    }

    public void setOneselfProject(String oneselfProject) {
        this.oneselfProject = oneselfProject == null ? null : oneselfProject.trim();
    }

    public String getInsuranceDetail() {
        return insuranceDetail;
    }

    public void setInsuranceDetail(String insuranceDetail) {
        this.insuranceDetail = insuranceDetail == null ? null : insuranceDetail.trim();
    }

    public String getReservationsDetail() {
        return reservationsDetail;
    }

    public void setReservationsDetail(String reservationsDetail) {
        this.reservationsDetail = reservationsDetail == null ? null : reservationsDetail.trim();
    }

    public String getGoDetail() {
        return goDetail;
    }

    public void setGoDetail(String goDetail) {
        this.goDetail = goDetail == null ? null : goDetail.trim();
    }

    public String getShoppingDetail() {
        return shoppingDetail;
    }

    public void setShoppingDetail(String shoppingDetail) {
        this.shoppingDetail = shoppingDetail == null ? null : shoppingDetail.trim();
    }

    public String getTeamDetail() {
        return teamDetail;
    }

    public void setTeamDetail(String teamDetail) {
        this.teamDetail = teamDetail == null ? null : teamDetail.trim();
    }

    public String getTransportationChangeDetail() {
        return transportationChangeDetail;
    }

    public void setTransportationChangeDetail(String transportationChangeDetail) {
        this.transportationChangeDetail = transportationChangeDetail == null ? null : transportationChangeDetail.trim();
    }

    public String getCustomerLimit() {
        return customerLimit;
    }

    public void setCustomerLimit(String customerLimit) {
        this.customerLimit = customerLimit == null ? null : customerLimit.trim();
    }
}