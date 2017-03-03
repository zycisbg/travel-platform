package com.zyc.travel.client.vo;

import com.zyc.travel.client.util.LineStatusEnum;
import com.zyc.travel.client.util.LineTipsEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by zyc on 17/3/2.
 */
public class TravelLineVO implements Serializable{
    private Integer id;

    private Integer travelId;

    private String travelTel;

    private String travelName;

    private String title;

    private Long businessPrice;

    private Long agencyPrice;

    private Integer travelDayCount;

    private String transportation;

    private Date goDate;

    private Integer surplusCount;

    private Integer advanceDayCount;

    private Integer lookCount;

    private String lineArea;

    private LineTipsEnum lineTips;

    private LineStatusEnum status;

    private Date createDate;

    private Date updateDate;

    private TravelLineExtVO travelLineExtVO;

    private List<TravelLineDetailVO> travelLineDetailVOList;

    private List<Date> dateList;

    @Override
    public String toString() {
        return "TravelLineVO{" +
                  "id=" + id +
                  ", travelId=" + travelId +
                  ", travelTel='" + travelTel + '\'' +
                  ", travelName='" + travelName + '\'' +
                  ", title='" + title + '\'' +
                  ", businessPrice=" + businessPrice +
                  ", agencyPrice=" + agencyPrice +
                  ", travelDayCount=" + travelDayCount +
                  ", transportation='" + transportation + '\'' +
                  ", goDate=" + goDate +
                  ", surplusCount=" + surplusCount +
                  ", advanceDayCount=" + advanceDayCount +
                  ", lookCount=" + lookCount +
                  ", lineArea='" + lineArea + '\'' +
                  ", lineTips=" + lineTips +
                  ", status=" + status +
                  ", createDate=" + createDate +
                  ", updateDate=" + updateDate +
                  ", travelLineExtVO=" + travelLineExtVO +
                  ", travelLineDetailVOList=" + travelLineDetailVOList +
                  '}';
    }

    public List<Date> getDateList() {
        return dateList;
    }

    public void setDateList(List<Date> dateList) {
        this.dateList = dateList;
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
        this.travelTel = travelTel;
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(Long businessPrice) {
        this.businessPrice = businessPrice;
    }

    public Long getAgencyPrice() {
        return agencyPrice;
    }

    public void setAgencyPrice(Long agencyPrice) {
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
        this.transportation = transportation;
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
        this.lineArea = lineArea;
    }

    public LineTipsEnum getLineTips() {
        return lineTips;
    }

    public void setLineTips(LineTipsEnum lineTips) {
        this.lineTips = lineTips;
    }

    public LineStatusEnum getStatus() {
        return status;
    }

    public void setStatus(LineStatusEnum status) {
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

    public TravelLineExtVO getTravelLineExtVO() {
        return travelLineExtVO;
    }

    public void setTravelLineExtVO(TravelLineExtVO travelLineExtVO) {
        this.travelLineExtVO = travelLineExtVO;
    }

    public List<TravelLineDetailVO> getTravelLineDetailVOList() {
        return travelLineDetailVOList;
    }

    public void setTravelLineDetailVOList(List<TravelLineDetailVO> travelLineDetailVOList) {
        this.travelLineDetailVOList = travelLineDetailVOList;
    }
}
