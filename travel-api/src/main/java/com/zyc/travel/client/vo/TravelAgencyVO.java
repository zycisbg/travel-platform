package com.zyc.travel.client.vo;

import com.zyc.travel.client.util.TravelStatusEnum;
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


    private TravelStatusEnum travelStatus;


    private TravelTypeEnum travelType;


    private BigDecimal travelBalance;


    private Date createDate;


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

    public TravelStatusEnum getTravelStatus() {
        return travelStatus;
    }

    public void setTravelStatus(TravelStatusEnum travelStatus) {
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
}