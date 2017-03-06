package com.zyc.travel.model.dto;

import java.io.Serializable;
import java.util.Date;

public class JTravelAgencyContacts implements Serializable {
    private Integer id;

    private Integer travelId;

    private String contactsName;

    private String contactsPhone;

    private String contactsWeixin;

    private String contactsQq;

    private String contactsPosition;

    private Integer status;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

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
        this.contactsName = contactsName == null ? null : contactsName.trim();
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone == null ? null : contactsPhone.trim();
    }

    public String getContactsWeixin() {
        return contactsWeixin;
    }

    public void setContactsWeixin(String contactsWeixin) {
        this.contactsWeixin = contactsWeixin == null ? null : contactsWeixin.trim();
    }

    public String getContactsQq() {
        return contactsQq;
    }

    public void setContactsQq(String contactsQq) {
        this.contactsQq = contactsQq == null ? null : contactsQq.trim();
    }

    public String getContactsPosition() {
        return contactsPosition;
    }

    public void setContactsPosition(String contactsPosition) {
        this.contactsPosition = contactsPosition == null ? null : contactsPosition.trim();
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