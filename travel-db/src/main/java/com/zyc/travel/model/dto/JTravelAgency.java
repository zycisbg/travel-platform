package com.zyc.travel.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class JTravelAgency implements Serializable {
    private Integer id;

    private String travelName;

    private String travelTel;

    private String travelPhone;

    private String travelRemark;

    private Integer travelStatus;

    private Integer travelType;

    private BigDecimal travelBalance;

    private String travelArea;

    private String travelAddressDetail;

    private String businessLicenseUrl;

    private String procedureProveUrl;

    private String username;

    private String password;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName == null ? null : travelName.trim();
    }

    public String getTravelTel() {
        return travelTel;
    }

    public void setTravelTel(String travelTel) {
        this.travelTel = travelTel == null ? null : travelTel.trim();
    }

    public String getTravelPhone() {
        return travelPhone;
    }

    public void setTravelPhone(String travelPhone) {
        this.travelPhone = travelPhone == null ? null : travelPhone.trim();
    }

    public String getTravelRemark() {
        return travelRemark;
    }

    public void setTravelRemark(String travelRemark) {
        this.travelRemark = travelRemark == null ? null : travelRemark.trim();
    }

    public Integer getTravelStatus() {
        return travelStatus;
    }

    public void setTravelStatus(Integer travelStatus) {
        this.travelStatus = travelStatus;
    }

    public Integer getTravelType() {
        return travelType;
    }

    public void setTravelType(Integer travelType) {
        this.travelType = travelType;
    }

    public BigDecimal getTravelBalance() {
        return travelBalance;
    }

    public void setTravelBalance(BigDecimal travelBalance) {
        this.travelBalance = travelBalance;
    }

    public String getTravelArea() {
        return travelArea;
    }

    public void setTravelArea(String travelArea) {
        this.travelArea = travelArea == null ? null : travelArea.trim();
    }

    public String getTravelAddressDetail() {
        return travelAddressDetail;
    }

    public void setTravelAddressDetail(String travelAddressDetail) {
        this.travelAddressDetail = travelAddressDetail == null ? null : travelAddressDetail.trim();
    }

    public String getBusinessLicenseUrl() {
        return businessLicenseUrl;
    }

    public void setBusinessLicenseUrl(String businessLicenseUrl) {
        this.businessLicenseUrl = businessLicenseUrl == null ? null : businessLicenseUrl.trim();
    }

    public String getProcedureProveUrl() {
        return procedureProveUrl;
    }

    public void setProcedureProveUrl(String procedureProveUrl) {
        this.procedureProveUrl = procedureProveUrl == null ? null : procedureProveUrl.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}