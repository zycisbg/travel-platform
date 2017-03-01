package com.zyc.travel.client.vo;

import com.zyc.travel.client.util.StatusEnum;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zyc on 17/3/1.
 */
public class TravelAgencyContactsVO implements Serializable{
    private Integer id;

    private Integer travelId;

    private String contactsName;

    private String contactsPhone;

    private String contactsWeixin;

    private String contactsQq;

    private String contactsPosition;

    private StatusEnum status;

    private Date createDate;

    private Date updateDate;

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

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    public String getContactsWeixin() {
        return contactsWeixin;
    }

    public void setContactsWeixin(String contactsWeixin) {
        this.contactsWeixin = contactsWeixin;
    }

    public String getContactsQq() {
        return contactsQq;
    }

    public void setContactsQq(String contactsQq) {
        this.contactsQq = contactsQq;
    }

    public String getContactsPosition() {
        return contactsPosition;
    }

    public void setContactsPosition(String contactsPosition) {
        this.contactsPosition = contactsPosition;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
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

    @Override
    public String toString() {
        return "TravelAgencyContactsVO{" +
                  "id=" + id +
                  ", travelId=" + travelId +
                  ", contactsName='" + contactsName + '\'' +
                  ", contactsPhone='" + contactsPhone + '\'' +
                  ", contactsWeixin='" + contactsWeixin + '\'' +
                  ", contactsQq='" + contactsQq + '\'' +
                  ", contactsPosition='" + contactsPosition + '\'' +
                  ", status=" + status +
                  ", createDate=" + createDate +
                  ", updateDate=" + updateDate +
                  '}';
    }
}
