package com.zyc.travel.model.dto;

import com.zyc.travel.common.page.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JTravelAgencyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public JTravelAgencyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTravelNameIsNull() {
            addCriterion("travel_name is null");
            return (Criteria) this;
        }

        public Criteria andTravelNameIsNotNull() {
            addCriterion("travel_name is not null");
            return (Criteria) this;
        }

        public Criteria andTravelNameEqualTo(String value) {
            addCriterion("travel_name =", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotEqualTo(String value) {
            addCriterion("travel_name <>", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameGreaterThan(String value) {
            addCriterion("travel_name >", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameGreaterThanOrEqualTo(String value) {
            addCriterion("travel_name >=", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameLessThan(String value) {
            addCriterion("travel_name <", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameLessThanOrEqualTo(String value) {
            addCriterion("travel_name <=", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameLike(String value) {
            addCriterion("travel_name like", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotLike(String value) {
            addCriterion("travel_name not like", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameIn(List<String> values) {
            addCriterion("travel_name in", values, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotIn(List<String> values) {
            addCriterion("travel_name not in", values, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameBetween(String value1, String value2) {
            addCriterion("travel_name between", value1, value2, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotBetween(String value1, String value2) {
            addCriterion("travel_name not between", value1, value2, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelTelIsNull() {
            addCriterion("travel_tel is null");
            return (Criteria) this;
        }

        public Criteria andTravelTelIsNotNull() {
            addCriterion("travel_tel is not null");
            return (Criteria) this;
        }

        public Criteria andTravelTelEqualTo(String value) {
            addCriterion("travel_tel =", value, "travelTel");
            return (Criteria) this;
        }

        public Criteria andTravelTelNotEqualTo(String value) {
            addCriterion("travel_tel <>", value, "travelTel");
            return (Criteria) this;
        }

        public Criteria andTravelTelGreaterThan(String value) {
            addCriterion("travel_tel >", value, "travelTel");
            return (Criteria) this;
        }

        public Criteria andTravelTelGreaterThanOrEqualTo(String value) {
            addCriterion("travel_tel >=", value, "travelTel");
            return (Criteria) this;
        }

        public Criteria andTravelTelLessThan(String value) {
            addCriterion("travel_tel <", value, "travelTel");
            return (Criteria) this;
        }

        public Criteria andTravelTelLessThanOrEqualTo(String value) {
            addCriterion("travel_tel <=", value, "travelTel");
            return (Criteria) this;
        }

        public Criteria andTravelTelLike(String value) {
            addCriterion("travel_tel like", value, "travelTel");
            return (Criteria) this;
        }

        public Criteria andTravelTelNotLike(String value) {
            addCriterion("travel_tel not like", value, "travelTel");
            return (Criteria) this;
        }

        public Criteria andTravelTelIn(List<String> values) {
            addCriterion("travel_tel in", values, "travelTel");
            return (Criteria) this;
        }

        public Criteria andTravelTelNotIn(List<String> values) {
            addCriterion("travel_tel not in", values, "travelTel");
            return (Criteria) this;
        }

        public Criteria andTravelTelBetween(String value1, String value2) {
            addCriterion("travel_tel between", value1, value2, "travelTel");
            return (Criteria) this;
        }

        public Criteria andTravelTelNotBetween(String value1, String value2) {
            addCriterion("travel_tel not between", value1, value2, "travelTel");
            return (Criteria) this;
        }

        public Criteria andTravelPhoneIsNull() {
            addCriterion("travel_phone is null");
            return (Criteria) this;
        }

        public Criteria andTravelPhoneIsNotNull() {
            addCriterion("travel_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTravelPhoneEqualTo(String value) {
            addCriterion("travel_phone =", value, "travelPhone");
            return (Criteria) this;
        }

        public Criteria andTravelPhoneNotEqualTo(String value) {
            addCriterion("travel_phone <>", value, "travelPhone");
            return (Criteria) this;
        }

        public Criteria andTravelPhoneGreaterThan(String value) {
            addCriterion("travel_phone >", value, "travelPhone");
            return (Criteria) this;
        }

        public Criteria andTravelPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("travel_phone >=", value, "travelPhone");
            return (Criteria) this;
        }

        public Criteria andTravelPhoneLessThan(String value) {
            addCriterion("travel_phone <", value, "travelPhone");
            return (Criteria) this;
        }

        public Criteria andTravelPhoneLessThanOrEqualTo(String value) {
            addCriterion("travel_phone <=", value, "travelPhone");
            return (Criteria) this;
        }

        public Criteria andTravelPhoneLike(String value) {
            addCriterion("travel_phone like", value, "travelPhone");
            return (Criteria) this;
        }

        public Criteria andTravelPhoneNotLike(String value) {
            addCriterion("travel_phone not like", value, "travelPhone");
            return (Criteria) this;
        }

        public Criteria andTravelPhoneIn(List<String> values) {
            addCriterion("travel_phone in", values, "travelPhone");
            return (Criteria) this;
        }

        public Criteria andTravelPhoneNotIn(List<String> values) {
            addCriterion("travel_phone not in", values, "travelPhone");
            return (Criteria) this;
        }

        public Criteria andTravelPhoneBetween(String value1, String value2) {
            addCriterion("travel_phone between", value1, value2, "travelPhone");
            return (Criteria) this;
        }

        public Criteria andTravelPhoneNotBetween(String value1, String value2) {
            addCriterion("travel_phone not between", value1, value2, "travelPhone");
            return (Criteria) this;
        }

        public Criteria andTravelRemarkIsNull() {
            addCriterion("travel_remark is null");
            return (Criteria) this;
        }

        public Criteria andTravelRemarkIsNotNull() {
            addCriterion("travel_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTravelRemarkEqualTo(String value) {
            addCriterion("travel_remark =", value, "travelRemark");
            return (Criteria) this;
        }

        public Criteria andTravelRemarkNotEqualTo(String value) {
            addCriterion("travel_remark <>", value, "travelRemark");
            return (Criteria) this;
        }

        public Criteria andTravelRemarkGreaterThan(String value) {
            addCriterion("travel_remark >", value, "travelRemark");
            return (Criteria) this;
        }

        public Criteria andTravelRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("travel_remark >=", value, "travelRemark");
            return (Criteria) this;
        }

        public Criteria andTravelRemarkLessThan(String value) {
            addCriterion("travel_remark <", value, "travelRemark");
            return (Criteria) this;
        }

        public Criteria andTravelRemarkLessThanOrEqualTo(String value) {
            addCriterion("travel_remark <=", value, "travelRemark");
            return (Criteria) this;
        }

        public Criteria andTravelRemarkLike(String value) {
            addCriterion("travel_remark like", value, "travelRemark");
            return (Criteria) this;
        }

        public Criteria andTravelRemarkNotLike(String value) {
            addCriterion("travel_remark not like", value, "travelRemark");
            return (Criteria) this;
        }

        public Criteria andTravelRemarkIn(List<String> values) {
            addCriterion("travel_remark in", values, "travelRemark");
            return (Criteria) this;
        }

        public Criteria andTravelRemarkNotIn(List<String> values) {
            addCriterion("travel_remark not in", values, "travelRemark");
            return (Criteria) this;
        }

        public Criteria andTravelRemarkBetween(String value1, String value2) {
            addCriterion("travel_remark between", value1, value2, "travelRemark");
            return (Criteria) this;
        }

        public Criteria andTravelRemarkNotBetween(String value1, String value2) {
            addCriterion("travel_remark not between", value1, value2, "travelRemark");
            return (Criteria) this;
        }

        public Criteria andTravelStatusIsNull() {
            addCriterion("travel_status is null");
            return (Criteria) this;
        }

        public Criteria andTravelStatusIsNotNull() {
            addCriterion("travel_status is not null");
            return (Criteria) this;
        }

        public Criteria andTravelStatusEqualTo(Integer value) {
            addCriterion("travel_status =", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusNotEqualTo(Integer value) {
            addCriterion("travel_status <>", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusGreaterThan(Integer value) {
            addCriterion("travel_status >", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("travel_status >=", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusLessThan(Integer value) {
            addCriterion("travel_status <", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusLessThanOrEqualTo(Integer value) {
            addCriterion("travel_status <=", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusIn(List<Integer> values) {
            addCriterion("travel_status in", values, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusNotIn(List<Integer> values) {
            addCriterion("travel_status not in", values, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusBetween(Integer value1, Integer value2) {
            addCriterion("travel_status between", value1, value2, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("travel_status not between", value1, value2, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIsNull() {
            addCriterion("travel_type is null");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIsNotNull() {
            addCriterion("travel_type is not null");
            return (Criteria) this;
        }

        public Criteria andTravelTypeEqualTo(Integer value) {
            addCriterion("travel_type =", value, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeNotEqualTo(Integer value) {
            addCriterion("travel_type <>", value, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeGreaterThan(Integer value) {
            addCriterion("travel_type >", value, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("travel_type >=", value, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeLessThan(Integer value) {
            addCriterion("travel_type <", value, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeLessThanOrEqualTo(Integer value) {
            addCriterion("travel_type <=", value, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIn(List<Integer> values) {
            addCriterion("travel_type in", values, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeNotIn(List<Integer> values) {
            addCriterion("travel_type not in", values, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeBetween(Integer value1, Integer value2) {
            addCriterion("travel_type between", value1, value2, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("travel_type not between", value1, value2, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelBalanceIsNull() {
            addCriterion("travel_balance is null");
            return (Criteria) this;
        }

        public Criteria andTravelBalanceIsNotNull() {
            addCriterion("travel_balance is not null");
            return (Criteria) this;
        }

        public Criteria andTravelBalanceEqualTo(BigDecimal value) {
            addCriterion("travel_balance =", value, "travelBalance");
            return (Criteria) this;
        }

        public Criteria andTravelBalanceNotEqualTo(BigDecimal value) {
            addCriterion("travel_balance <>", value, "travelBalance");
            return (Criteria) this;
        }

        public Criteria andTravelBalanceGreaterThan(BigDecimal value) {
            addCriterion("travel_balance >", value, "travelBalance");
            return (Criteria) this;
        }

        public Criteria andTravelBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("travel_balance >=", value, "travelBalance");
            return (Criteria) this;
        }

        public Criteria andTravelBalanceLessThan(BigDecimal value) {
            addCriterion("travel_balance <", value, "travelBalance");
            return (Criteria) this;
        }

        public Criteria andTravelBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("travel_balance <=", value, "travelBalance");
            return (Criteria) this;
        }

        public Criteria andTravelBalanceIn(List<BigDecimal> values) {
            addCriterion("travel_balance in", values, "travelBalance");
            return (Criteria) this;
        }

        public Criteria andTravelBalanceNotIn(List<BigDecimal> values) {
            addCriterion("travel_balance not in", values, "travelBalance");
            return (Criteria) this;
        }

        public Criteria andTravelBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("travel_balance between", value1, value2, "travelBalance");
            return (Criteria) this;
        }

        public Criteria andTravelBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("travel_balance not between", value1, value2, "travelBalance");
            return (Criteria) this;
        }

        public Criteria andTravelAreaIsNull() {
            addCriterion("travel_area is null");
            return (Criteria) this;
        }

        public Criteria andTravelAreaIsNotNull() {
            addCriterion("travel_area is not null");
            return (Criteria) this;
        }

        public Criteria andTravelAreaEqualTo(String value) {
            addCriterion("travel_area =", value, "travelArea");
            return (Criteria) this;
        }

        public Criteria andTravelAreaNotEqualTo(String value) {
            addCriterion("travel_area <>", value, "travelArea");
            return (Criteria) this;
        }

        public Criteria andTravelAreaGreaterThan(String value) {
            addCriterion("travel_area >", value, "travelArea");
            return (Criteria) this;
        }

        public Criteria andTravelAreaGreaterThanOrEqualTo(String value) {
            addCriterion("travel_area >=", value, "travelArea");
            return (Criteria) this;
        }

        public Criteria andTravelAreaLessThan(String value) {
            addCriterion("travel_area <", value, "travelArea");
            return (Criteria) this;
        }

        public Criteria andTravelAreaLessThanOrEqualTo(String value) {
            addCriterion("travel_area <=", value, "travelArea");
            return (Criteria) this;
        }

        public Criteria andTravelAreaLike(String value) {
            addCriterion("travel_area like", value, "travelArea");
            return (Criteria) this;
        }

        public Criteria andTravelAreaNotLike(String value) {
            addCriterion("travel_area not like", value, "travelArea");
            return (Criteria) this;
        }

        public Criteria andTravelAreaIn(List<String> values) {
            addCriterion("travel_area in", values, "travelArea");
            return (Criteria) this;
        }

        public Criteria andTravelAreaNotIn(List<String> values) {
            addCriterion("travel_area not in", values, "travelArea");
            return (Criteria) this;
        }

        public Criteria andTravelAreaBetween(String value1, String value2) {
            addCriterion("travel_area between", value1, value2, "travelArea");
            return (Criteria) this;
        }

        public Criteria andTravelAreaNotBetween(String value1, String value2) {
            addCriterion("travel_area not between", value1, value2, "travelArea");
            return (Criteria) this;
        }

        public Criteria andTravelAddressDetailIsNull() {
            addCriterion("travel_address_detail is null");
            return (Criteria) this;
        }

        public Criteria andTravelAddressDetailIsNotNull() {
            addCriterion("travel_address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andTravelAddressDetailEqualTo(String value) {
            addCriterion("travel_address_detail =", value, "travelAddressDetail");
            return (Criteria) this;
        }

        public Criteria andTravelAddressDetailNotEqualTo(String value) {
            addCriterion("travel_address_detail <>", value, "travelAddressDetail");
            return (Criteria) this;
        }

        public Criteria andTravelAddressDetailGreaterThan(String value) {
            addCriterion("travel_address_detail >", value, "travelAddressDetail");
            return (Criteria) this;
        }

        public Criteria andTravelAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("travel_address_detail >=", value, "travelAddressDetail");
            return (Criteria) this;
        }

        public Criteria andTravelAddressDetailLessThan(String value) {
            addCriterion("travel_address_detail <", value, "travelAddressDetail");
            return (Criteria) this;
        }

        public Criteria andTravelAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("travel_address_detail <=", value, "travelAddressDetail");
            return (Criteria) this;
        }

        public Criteria andTravelAddressDetailLike(String value) {
            addCriterion("travel_address_detail like", value, "travelAddressDetail");
            return (Criteria) this;
        }

        public Criteria andTravelAddressDetailNotLike(String value) {
            addCriterion("travel_address_detail not like", value, "travelAddressDetail");
            return (Criteria) this;
        }

        public Criteria andTravelAddressDetailIn(List<String> values) {
            addCriterion("travel_address_detail in", values, "travelAddressDetail");
            return (Criteria) this;
        }

        public Criteria andTravelAddressDetailNotIn(List<String> values) {
            addCriterion("travel_address_detail not in", values, "travelAddressDetail");
            return (Criteria) this;
        }

        public Criteria andTravelAddressDetailBetween(String value1, String value2) {
            addCriterion("travel_address_detail between", value1, value2, "travelAddressDetail");
            return (Criteria) this;
        }

        public Criteria andTravelAddressDetailNotBetween(String value1, String value2) {
            addCriterion("travel_address_detail not between", value1, value2, "travelAddressDetail");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlIsNull() {
            addCriterion("business_license_url is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlIsNotNull() {
            addCriterion("business_license_url is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlEqualTo(String value) {
            addCriterion("business_license_url =", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotEqualTo(String value) {
            addCriterion("business_license_url <>", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlGreaterThan(String value) {
            addCriterion("business_license_url >", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_url >=", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLessThan(String value) {
            addCriterion("business_license_url <", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLessThanOrEqualTo(String value) {
            addCriterion("business_license_url <=", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLike(String value) {
            addCriterion("business_license_url like", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotLike(String value) {
            addCriterion("business_license_url not like", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlIn(List<String> values) {
            addCriterion("business_license_url in", values, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotIn(List<String> values) {
            addCriterion("business_license_url not in", values, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlBetween(String value1, String value2) {
            addCriterion("business_license_url between", value1, value2, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotBetween(String value1, String value2) {
            addCriterion("business_license_url not between", value1, value2, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andProcedureProveUrlIsNull() {
            addCriterion("procedure_prove_url is null");
            return (Criteria) this;
        }

        public Criteria andProcedureProveUrlIsNotNull() {
            addCriterion("procedure_prove_url is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureProveUrlEqualTo(String value) {
            addCriterion("procedure_prove_url =", value, "procedureProveUrl");
            return (Criteria) this;
        }

        public Criteria andProcedureProveUrlNotEqualTo(String value) {
            addCriterion("procedure_prove_url <>", value, "procedureProveUrl");
            return (Criteria) this;
        }

        public Criteria andProcedureProveUrlGreaterThan(String value) {
            addCriterion("procedure_prove_url >", value, "procedureProveUrl");
            return (Criteria) this;
        }

        public Criteria andProcedureProveUrlGreaterThanOrEqualTo(String value) {
            addCriterion("procedure_prove_url >=", value, "procedureProveUrl");
            return (Criteria) this;
        }

        public Criteria andProcedureProveUrlLessThan(String value) {
            addCriterion("procedure_prove_url <", value, "procedureProveUrl");
            return (Criteria) this;
        }

        public Criteria andProcedureProveUrlLessThanOrEqualTo(String value) {
            addCriterion("procedure_prove_url <=", value, "procedureProveUrl");
            return (Criteria) this;
        }

        public Criteria andProcedureProveUrlLike(String value) {
            addCriterion("procedure_prove_url like", value, "procedureProveUrl");
            return (Criteria) this;
        }

        public Criteria andProcedureProveUrlNotLike(String value) {
            addCriterion("procedure_prove_url not like", value, "procedureProveUrl");
            return (Criteria) this;
        }

        public Criteria andProcedureProveUrlIn(List<String> values) {
            addCriterion("procedure_prove_url in", values, "procedureProveUrl");
            return (Criteria) this;
        }

        public Criteria andProcedureProveUrlNotIn(List<String> values) {
            addCriterion("procedure_prove_url not in", values, "procedureProveUrl");
            return (Criteria) this;
        }

        public Criteria andProcedureProveUrlBetween(String value1, String value2) {
            addCriterion("procedure_prove_url between", value1, value2, "procedureProveUrl");
            return (Criteria) this;
        }

        public Criteria andProcedureProveUrlNotBetween(String value1, String value2) {
            addCriterion("procedure_prove_url not between", value1, value2, "procedureProveUrl");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andTravelNameLikeInsensitive(String value) {
            addCriterion("upper(travel_name) like", value.toUpperCase(), "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelTelLikeInsensitive(String value) {
            addCriterion("upper(travel_tel) like", value.toUpperCase(), "travelTel");
            return (Criteria) this;
        }

        public Criteria andTravelPhoneLikeInsensitive(String value) {
            addCriterion("upper(travel_phone) like", value.toUpperCase(), "travelPhone");
            return (Criteria) this;
        }

        public Criteria andTravelRemarkLikeInsensitive(String value) {
            addCriterion("upper(travel_remark) like", value.toUpperCase(), "travelRemark");
            return (Criteria) this;
        }

        public Criteria andTravelAreaLikeInsensitive(String value) {
            addCriterion("upper(travel_area) like", value.toUpperCase(), "travelArea");
            return (Criteria) this;
        }

        public Criteria andTravelAddressDetailLikeInsensitive(String value) {
            addCriterion("upper(travel_address_detail) like", value.toUpperCase(), "travelAddressDetail");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLikeInsensitive(String value) {
            addCriterion("upper(business_license_url) like", value.toUpperCase(), "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andProcedureProveUrlLikeInsensitive(String value) {
            addCriterion("upper(procedure_prove_url) like", value.toUpperCase(), "procedureProveUrl");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(username) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(password) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}