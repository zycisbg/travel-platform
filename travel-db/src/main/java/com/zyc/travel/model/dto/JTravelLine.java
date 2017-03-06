package com.zyc.travel.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class JTravelLine implements Serializable {
    private Integer id;

    private Integer travelId;

    private String travelTel;

    private String travelName;

    private String title;

    private BigDecimal businessPrice;

    private BigDecimal agencyPrice;

    private Integer travelDayCount;

    private String transportation;

    private Date goDate;

    private Integer surplusCount;

    private Integer advanceDayCount;

    private Integer lookCount;

    private String lineArea;

    private Integer lineTips;

    private Integer status;

    private Date createDate;

    private Date updateDate;

    private JTravelLineExt jTravelLineExt;

    private List<JTravelLineDetail> jTravelLineDetailList;
    private Date goDateBegin;

    private Date goDateEnd;

    private static final long serialVersionUID = 1L;

    public Date getGoDateBegin() {
        return goDateBegin;
    }

    public void setGoDateBegin(Date goDateBegin) {
        this.goDateBegin = goDateBegin;
    }

    public Date getGoDateEnd() {
        return goDateEnd;
    }

    public void setGoDateEnd(Date goDateEnd) {
        this.goDateEnd = goDateEnd;
    }

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTravelId() {
        return travelId;
    }

    public void setTravelId(Integer travelId) {
        this.travelId = travelId;
    }

    public String getTravelTel() {
        return travelTel;
    }

    public void setTravelTel(String travelTel) {
        this.travelTel = travelTel == null ? null : travelTel.trim();
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName == null ? null : travelName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public BigDecimal getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(BigDecimal businessPrice) {
        this.businessPrice = businessPrice;
    }

    public BigDecimal getAgencyPrice() {
        return agencyPrice;
    }

    public void setAgencyPrice(BigDecimal agencyPrice) {
        this.agencyPrice = agencyPrice;
    }

    public Integer getTravelDayCount() {
        return travelDayCount;
    }

    public void setTravelDayCount(Integer travelDayCount) {
        this.travelDayCount = travelDayCount;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation == null ? null : transportation.trim();
    }

    public Date getGoDate() {
        return goDate;
    }

    public void setGoDate(Date goDate) {
        this.goDate = goDate;
    }

    public Integer getSurplusCount() {
        return surplusCount;
    }

    public void setSurplusCount(Integer surplusCount) {
        this.surplusCount = surplusCount;
    }

    public Integer getAdvanceDayCount() {
        return advanceDayCount;
    }

    public void setAdvanceDayCount(Integer advanceDayCount) {
        this.advanceDayCount = advanceDayCount;
    }

    public Integer getLookCount() {
        return lookCount;
    }

    public void setLookCount(Integer lookCount) {
        this.lookCount = lookCount;
    }

    public String getLineArea() {
        return lineArea;
    }

    public void setLineArea(String lineArea) {
        this.lineArea = lineArea == null ? null : lineArea.trim();
    }

    public Integer getLineTips() {
        return lineTips;
    }

    public void setLineTips(Integer lineTips) {
        this.lineTips = lineTips;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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