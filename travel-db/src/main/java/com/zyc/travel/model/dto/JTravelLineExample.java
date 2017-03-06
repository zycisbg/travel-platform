package com.zyc.travel.model.dto;

import com.zyc.travel.common.page.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JTravelLineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public JTravelLineExample() {
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

        public Criteria andTravelIdIsNull() {
            addCriterion("travel_id is null");
            return (Criteria) this;
        }

        public Criteria andTravelIdIsNotNull() {
            addCriterion("travel_id is not null");
            return (Criteria) this;
        }

        public Criteria andTravelIdEqualTo(Integer value) {
            addCriterion("travel_id =", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotEqualTo(Integer value) {
            addCriterion("travel_id <>", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdGreaterThan(Integer value) {
            addCriterion("travel_id >", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("travel_id >=", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdLessThan(Integer value) {
            addCriterion("travel_id <", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdLessThanOrEqualTo(Integer value) {
            addCriterion("travel_id <=", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdIn(List<Integer> values) {
            addCriterion("travel_id in", values, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotIn(List<Integer> values) {
            addCriterion("travel_id not in", values, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdBetween(Integer value1, Integer value2) {
            addCriterion("travel_id between", value1, value2, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("travel_id not between", value1, value2, "travelId");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceIsNull() {
            addCriterion("business_price is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceIsNotNull() {
            addCriterion("business_price is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceEqualTo(BigDecimal value) {
            addCriterion("business_price =", value, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceNotEqualTo(BigDecimal value) {
            addCriterion("business_price <>", value, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceGreaterThan(BigDecimal value) {
            addCriterion("business_price >", value, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("business_price >=", value, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceLessThan(BigDecimal value) {
            addCriterion("business_price <", value, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("business_price <=", value, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceIn(List<BigDecimal> values) {
            addCriterion("business_price in", values, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceNotIn(List<BigDecimal> values) {
            addCriterion("business_price not in", values, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("business_price between", value1, value2, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("business_price not between", value1, value2, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andAgencyPriceIsNull() {
            addCriterion("agency_price is null");
            return (Criteria) this;
        }

        public Criteria andAgencyPriceIsNotNull() {
            addCriterion("agency_price is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyPriceEqualTo(BigDecimal value) {
            addCriterion("agency_price =", value, "agencyPrice");
            return (Criteria) this;
        }

        public Criteria andAgencyPriceNotEqualTo(BigDecimal value) {
            addCriterion("agency_price <>", value, "agencyPrice");
            return (Criteria) this;
        }

        public Criteria andAgencyPriceGreaterThan(BigDecimal value) {
            addCriterion("agency_price >", value, "agencyPrice");
            return (Criteria) this;
        }

        public Criteria andAgencyPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("agency_price >=", value, "agencyPrice");
            return (Criteria) this;
        }

        public Criteria andAgencyPriceLessThan(BigDecimal value) {
            addCriterion("agency_price <", value, "agencyPrice");
            return (Criteria) this;
        }

        public Criteria andAgencyPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("agency_price <=", value, "agencyPrice");
            return (Criteria) this;
        }

        public Criteria andAgencyPriceIn(List<BigDecimal> values) {
            addCriterion("agency_price in", values, "agencyPrice");
            return (Criteria) this;
        }

        public Criteria andAgencyPriceNotIn(List<BigDecimal> values) {
            addCriterion("agency_price not in", values, "agencyPrice");
            return (Criteria) this;
        }

        public Criteria andAgencyPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("agency_price between", value1, value2, "agencyPrice");
            return (Criteria) this;
        }

        public Criteria andAgencyPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("agency_price not between", value1, value2, "agencyPrice");
            return (Criteria) this;
        }

        public Criteria andTravelDayCountIsNull() {
            addCriterion("travel_day_count is null");
            return (Criteria) this;
        }

        public Criteria andTravelDayCountIsNotNull() {
            addCriterion("travel_day_count is not null");
            return (Criteria) this;
        }

        public Criteria andTravelDayCountEqualTo(Integer value) {
            addCriterion("travel_day_count =", value, "travelDayCount");
            return (Criteria) this;
        }

        public Criteria andTravelDayCountNotEqualTo(Integer value) {
            addCriterion("travel_day_count <>", value, "travelDayCount");
            return (Criteria) this;
        }

        public Criteria andTravelDayCountGreaterThan(Integer value) {
            addCriterion("travel_day_count >", value, "travelDayCount");
            return (Criteria) this;
        }

        public Criteria andTravelDayCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("travel_day_count >=", value, "travelDayCount");
            return (Criteria) this;
        }

        public Criteria andTravelDayCountLessThan(Integer value) {
            addCriterion("travel_day_count <", value, "travelDayCount");
            return (Criteria) this;
        }

        public Criteria andTravelDayCountLessThanOrEqualTo(Integer value) {
            addCriterion("travel_day_count <=", value, "travelDayCount");
            return (Criteria) this;
        }

        public Criteria andTravelDayCountIn(List<Integer> values) {
            addCriterion("travel_day_count in", values, "travelDayCount");
            return (Criteria) this;
        }

        public Criteria andTravelDayCountNotIn(List<Integer> values) {
            addCriterion("travel_day_count not in", values, "travelDayCount");
            return (Criteria) this;
        }

        public Criteria andTravelDayCountBetween(Integer value1, Integer value2) {
            addCriterion("travel_day_count between", value1, value2, "travelDayCount");
            return (Criteria) this;
        }

        public Criteria andTravelDayCountNotBetween(Integer value1, Integer value2) {
            addCriterion("travel_day_count not between", value1, value2, "travelDayCount");
            return (Criteria) this;
        }

        public Criteria andTransportationIsNull() {
            addCriterion("transportation is null");
            return (Criteria) this;
        }

        public Criteria andTransportationIsNotNull() {
            addCriterion("transportation is not null");
            return (Criteria) this;
        }

        public Criteria andTransportationEqualTo(String value) {
            addCriterion("transportation =", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationNotEqualTo(String value) {
            addCriterion("transportation <>", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationGreaterThan(String value) {
            addCriterion("transportation >", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationGreaterThanOrEqualTo(String value) {
            addCriterion("transportation >=", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationLessThan(String value) {
            addCriterion("transportation <", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationLessThanOrEqualTo(String value) {
            addCriterion("transportation <=", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationLike(String value) {
            addCriterion("transportation like", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationNotLike(String value) {
            addCriterion("transportation not like", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationIn(List<String> values) {
            addCriterion("transportation in", values, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationNotIn(List<String> values) {
            addCriterion("transportation not in", values, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationBetween(String value1, String value2) {
            addCriterion("transportation between", value1, value2, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationNotBetween(String value1, String value2) {
            addCriterion("transportation not between", value1, value2, "transportation");
            return (Criteria) this;
        }

        public Criteria andGoDateIsNull() {
            addCriterion("go_date is null");
            return (Criteria) this;
        }

        public Criteria andGoDateIsNotNull() {
            addCriterion("go_date is not null");
            return (Criteria) this;
        }

        public Criteria andGoDateEqualTo(Date value) {
            addCriterion("go_date =", value, "goDate");
            return (Criteria) this;
        }

        public Criteria andGoDateNotEqualTo(Date value) {
            addCriterion("go_date <>", value, "goDate");
            return (Criteria) this;
        }

        public Criteria andGoDateGreaterThan(Date value) {
            addCriterion("go_date >", value, "goDate");
            return (Criteria) this;
        }

        public Criteria andGoDateGreaterThanOrEqualTo(Date value) {
            addCriterion("go_date >=", value, "goDate");
            return (Criteria) this;
        }

        public Criteria andGoDateLessThan(Date value) {
            addCriterion("go_date <", value, "goDate");
            return (Criteria) this;
        }

        public Criteria andGoDateLessThanOrEqualTo(Date value) {
            addCriterion("go_date <=", value, "goDate");
            return (Criteria) this;
        }

        public Criteria andGoDateIn(List<Date> values) {
            addCriterion("go_date in", values, "goDate");
            return (Criteria) this;
        }

        public Criteria andGoDateNotIn(List<Date> values) {
            addCriterion("go_date not in", values, "goDate");
            return (Criteria) this;
        }

        public Criteria andGoDateBetween(Date value1, Date value2) {
            addCriterion("go_date between", value1, value2, "goDate");
            return (Criteria) this;
        }

        public Criteria andGoDateNotBetween(Date value1, Date value2) {
            addCriterion("go_date not between", value1, value2, "goDate");
            return (Criteria) this;
        }

        public Criteria andSurplusCountIsNull() {
            addCriterion("surplus_count is null");
            return (Criteria) this;
        }

        public Criteria andSurplusCountIsNotNull() {
            addCriterion("surplus_count is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusCountEqualTo(Integer value) {
            addCriterion("surplus_count =", value, "surplusCount");
            return (Criteria) this;
        }

        public Criteria andSurplusCountNotEqualTo(Integer value) {
            addCriterion("surplus_count <>", value, "surplusCount");
            return (Criteria) this;
        }

        public Criteria andSurplusCountGreaterThan(Integer value) {
            addCriterion("surplus_count >", value, "surplusCount");
            return (Criteria) this;
        }

        public Criteria andSurplusCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("surplus_count >=", value, "surplusCount");
            return (Criteria) this;
        }

        public Criteria andSurplusCountLessThan(Integer value) {
            addCriterion("surplus_count <", value, "surplusCount");
            return (Criteria) this;
        }

        public Criteria andSurplusCountLessThanOrEqualTo(Integer value) {
            addCriterion("surplus_count <=", value, "surplusCount");
            return (Criteria) this;
        }

        public Criteria andSurplusCountIn(List<Integer> values) {
            addCriterion("surplus_count in", values, "surplusCount");
            return (Criteria) this;
        }

        public Criteria andSurplusCountNotIn(List<Integer> values) {
            addCriterion("surplus_count not in", values, "surplusCount");
            return (Criteria) this;
        }

        public Criteria andSurplusCountBetween(Integer value1, Integer value2) {
            addCriterion("surplus_count between", value1, value2, "surplusCount");
            return (Criteria) this;
        }

        public Criteria andSurplusCountNotBetween(Integer value1, Integer value2) {
            addCriterion("surplus_count not between", value1, value2, "surplusCount");
            return (Criteria) this;
        }

        public Criteria andAdvanceDayCountIsNull() {
            addCriterion("advance_day_count is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceDayCountIsNotNull() {
            addCriterion("advance_day_count is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceDayCountEqualTo(Integer value) {
            addCriterion("advance_day_count =", value, "advanceDayCount");
            return (Criteria) this;
        }

        public Criteria andAdvanceDayCountNotEqualTo(Integer value) {
            addCriterion("advance_day_count <>", value, "advanceDayCount");
            return (Criteria) this;
        }

        public Criteria andAdvanceDayCountGreaterThan(Integer value) {
            addCriterion("advance_day_count >", value, "advanceDayCount");
            return (Criteria) this;
        }

        public Criteria andAdvanceDayCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("advance_day_count >=", value, "advanceDayCount");
            return (Criteria) this;
        }

        public Criteria andAdvanceDayCountLessThan(Integer value) {
            addCriterion("advance_day_count <", value, "advanceDayCount");
            return (Criteria) this;
        }

        public Criteria andAdvanceDayCountLessThanOrEqualTo(Integer value) {
            addCriterion("advance_day_count <=", value, "advanceDayCount");
            return (Criteria) this;
        }

        public Criteria andAdvanceDayCountIn(List<Integer> values) {
            addCriterion("advance_day_count in", values, "advanceDayCount");
            return (Criteria) this;
        }

        public Criteria andAdvanceDayCountNotIn(List<Integer> values) {
            addCriterion("advance_day_count not in", values, "advanceDayCount");
            return (Criteria) this;
        }

        public Criteria andAdvanceDayCountBetween(Integer value1, Integer value2) {
            addCriterion("advance_day_count between", value1, value2, "advanceDayCount");
            return (Criteria) this;
        }

        public Criteria andAdvanceDayCountNotBetween(Integer value1, Integer value2) {
            addCriterion("advance_day_count not between", value1, value2, "advanceDayCount");
            return (Criteria) this;
        }

        public Criteria andLookCountIsNull() {
            addCriterion("look_count is null");
            return (Criteria) this;
        }

        public Criteria andLookCountIsNotNull() {
            addCriterion("look_count is not null");
            return (Criteria) this;
        }

        public Criteria andLookCountEqualTo(Integer value) {
            addCriterion("look_count =", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountNotEqualTo(Integer value) {
            addCriterion("look_count <>", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountGreaterThan(Integer value) {
            addCriterion("look_count >", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("look_count >=", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountLessThan(Integer value) {
            addCriterion("look_count <", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountLessThanOrEqualTo(Integer value) {
            addCriterion("look_count <=", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountIn(List<Integer> values) {
            addCriterion("look_count in", values, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountNotIn(List<Integer> values) {
            addCriterion("look_count not in", values, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountBetween(Integer value1, Integer value2) {
            addCriterion("look_count between", value1, value2, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountNotBetween(Integer value1, Integer value2) {
            addCriterion("look_count not between", value1, value2, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLineAreaIsNull() {
            addCriterion("line_area is null");
            return (Criteria) this;
        }

        public Criteria andLineAreaIsNotNull() {
            addCriterion("line_area is not null");
            return (Criteria) this;
        }

        public Criteria andLineAreaEqualTo(String value) {
            addCriterion("line_area =", value, "lineArea");
            return (Criteria) this;
        }

        public Criteria andLineAreaNotEqualTo(String value) {
            addCriterion("line_area <>", value, "lineArea");
            return (Criteria) this;
        }

        public Criteria andLineAreaGreaterThan(String value) {
            addCriterion("line_area >", value, "lineArea");
            return (Criteria) this;
        }

        public Criteria andLineAreaGreaterThanOrEqualTo(String value) {
            addCriterion("line_area >=", value, "lineArea");
            return (Criteria) this;
        }

        public Criteria andLineAreaLessThan(String value) {
            addCriterion("line_area <", value, "lineArea");
            return (Criteria) this;
        }

        public Criteria andLineAreaLessThanOrEqualTo(String value) {
            addCriterion("line_area <=", value, "lineArea");
            return (Criteria) this;
        }

        public Criteria andLineAreaLike(String value) {
            addCriterion("line_area like", value, "lineArea");
            return (Criteria) this;
        }

        public Criteria andLineAreaNotLike(String value) {
            addCriterion("line_area not like", value, "lineArea");
            return (Criteria) this;
        }

        public Criteria andLineAreaIn(List<String> values) {
            addCriterion("line_area in", values, "lineArea");
            return (Criteria) this;
        }

        public Criteria andLineAreaNotIn(List<String> values) {
            addCriterion("line_area not in", values, "lineArea");
            return (Criteria) this;
        }

        public Criteria andLineAreaBetween(String value1, String value2) {
            addCriterion("line_area between", value1, value2, "lineArea");
            return (Criteria) this;
        }

        public Criteria andLineAreaNotBetween(String value1, String value2) {
            addCriterion("line_area not between", value1, value2, "lineArea");
            return (Criteria) this;
        }

        public Criteria andLineTipsIsNull() {
            addCriterion("line_tips is null");
            return (Criteria) this;
        }

        public Criteria andLineTipsIsNotNull() {
            addCriterion("line_tips is not null");
            return (Criteria) this;
        }

        public Criteria andLineTipsEqualTo(Integer value) {
            addCriterion("line_tips =", value, "lineTips");
            return (Criteria) this;
        }

        public Criteria andLineTipsNotEqualTo(Integer value) {
            addCriterion("line_tips <>", value, "lineTips");
            return (Criteria) this;
        }

        public Criteria andLineTipsGreaterThan(Integer value) {
            addCriterion("line_tips >", value, "lineTips");
            return (Criteria) this;
        }

        public Criteria andLineTipsGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_tips >=", value, "lineTips");
            return (Criteria) this;
        }

        public Criteria andLineTipsLessThan(Integer value) {
            addCriterion("line_tips <", value, "lineTips");
            return (Criteria) this;
        }

        public Criteria andLineTipsLessThanOrEqualTo(Integer value) {
            addCriterion("line_tips <=", value, "lineTips");
            return (Criteria) this;
        }

        public Criteria andLineTipsIn(List<Integer> values) {
            addCriterion("line_tips in", values, "lineTips");
            return (Criteria) this;
        }

        public Criteria andLineTipsNotIn(List<Integer> values) {
            addCriterion("line_tips not in", values, "lineTips");
            return (Criteria) this;
        }

        public Criteria andLineTipsBetween(Integer value1, Integer value2) {
            addCriterion("line_tips between", value1, value2, "lineTips");
            return (Criteria) this;
        }

        public Criteria andLineTipsNotBetween(Integer value1, Integer value2) {
            addCriterion("line_tips not between", value1, value2, "lineTips");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andTravelTelLikeInsensitive(String value) {
            addCriterion("upper(travel_tel) like", value.toUpperCase(), "travelTel");
            return (Criteria) this;
        }

        public Criteria andTravelNameLikeInsensitive(String value) {
            addCriterion("upper(travel_name) like", value.toUpperCase(), "travelName");
            return (Criteria) this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andTransportationLikeInsensitive(String value) {
            addCriterion("upper(transportation) like", value.toUpperCase(), "transportation");
            return (Criteria) this;
        }

        public Criteria andLineAreaLikeInsensitive(String value) {
            addCriterion("upper(line_area) like", value.toUpperCase(), "lineArea");
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