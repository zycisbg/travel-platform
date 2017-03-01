package com.zyc.travel.client.vo;

import com.zyc.travel.client.util.StatusEnum;
import com.zyc.travel.client.util.TravelTypeEnum;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TravelAgencyVO implements Serializable {

    private Integer id;


    private String travelName;


    private String travelTel;


    private String travelPhone;


    private String travelRemark;


    private StatusEnum travelStatus;


    private TravelTypeEnum travelType;


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
        this.travelName = travelName;
    }

    public String getTravelTel() {
        return travelTel;
    }

    public void setTravelTel(String travelTel) {
        this.travelTel = travelTel;
    }

    public String getTravelPhone() {
        return travelPhone;
    }

    public void setTravelPhone(String travelPhone) {
        this.travelPhone = travelPhone;
    }

    public String getTravelRemark() {
        return travelRemark;
    }

    public void setTravelRemark(String travelRemark) {
        this.travelRemark = travelRemark;
    }

    public StatusEnum getTravelStatus() {
        return travelStatus;
    }

    public void setTravelStatus(StatusEnum travelStatus) {
        this.travelStatus = travelStatus;
    }

    public TravelTypeEnum getTravelType() {
        return travelType;
    }

    public void setTravelType(TravelTypeEnum travelType) {
        this.travelType = travelType;
    }

    public BigDecimal getTravelBalance() {
        return travelBalance;
    }

    public void setTravelBalance(BigDecimal travelBalance) {
        this.travelBalance = travelBalance;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTravelArea() {
        return travelArea;
    }

    public void setTravelArea(String travelArea) {
        this.travelArea = travelArea;
    }

    public String getTravelAddressDetail() {
        return travelAddressDetail;
    }

    public void setTravelAddressDetail(String travelAddressDetail) {
        this.travelAddressDetail = travelAddressDetail;
    }

    public String getBusinessLicenseUrl() {
        return businessLicenseUrl;
    }

    public void setBusinessLicenseUrl(String businessLicenseUrl) {
        this.businessLicenseUrl = businessLicenseUrl;
    }

    public String getProcedureProveUrl() {
        return procedureProveUrl;
    }

    public void setProcedureProveUrl(String procedureProveUrl) {
        this.procedureProveUrl = procedureProveUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "TravelAgencyVO{" +
                  "id=" + id +
                  ", travelName='" + travelName + '\'' +
                  ", travelTel='" + travelTel + '\'' +
                  ", travelPhone='" + travelPhone + '\'' +
                  ", travelRemark='" + travelRemark + '\'' +
                  ", travelStatus=" + travelStatus +
                  ", travelType=" + travelType +
                  ", travelBalance=" + travelBalance +
                  ", travelArea='" + travelArea + '\'' +
                  ", travelAddressDetail='" + travelAddressDetail + '\'' +
                  ", businessLicenseUrl='" + businessLicenseUrl + '\'' +
                  ", procedureProveUrl='" + procedureProveUrl + '\'' +
                  ", username='" + username + '\'' +
                  ", password='" + password + '\'' +
                  ", createDate=" + createDate +
                  ", updateDate=" + updateDate +
                  '}';
    }
}