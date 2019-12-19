package com.hous.pojo;

import java.util.ArrayList;
import java.util.List;

public class HetongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HetongExample() {
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

        public Criteria andChuzuIsNull() {
            addCriterion("chuzu is null");
            return (Criteria) this;
        }

        public Criteria andChuzuIsNotNull() {
            addCriterion("chuzu is not null");
            return (Criteria) this;
        }

        public Criteria andChuzuEqualTo(String value) {
            addCriterion("chuzu =", value, "chuzu");
            return (Criteria) this;
        }

        public Criteria andChuzuNotEqualTo(String value) {
            addCriterion("chuzu <>", value, "chuzu");
            return (Criteria) this;
        }

        public Criteria andChuzuGreaterThan(String value) {
            addCriterion("chuzu >", value, "chuzu");
            return (Criteria) this;
        }

        public Criteria andChuzuGreaterThanOrEqualTo(String value) {
            addCriterion("chuzu >=", value, "chuzu");
            return (Criteria) this;
        }

        public Criteria andChuzuLessThan(String value) {
            addCriterion("chuzu <", value, "chuzu");
            return (Criteria) this;
        }

        public Criteria andChuzuLessThanOrEqualTo(String value) {
            addCriterion("chuzu <=", value, "chuzu");
            return (Criteria) this;
        }

        public Criteria andChuzuLike(String value) {
            addCriterion("chuzu like", value, "chuzu");
            return (Criteria) this;
        }

        public Criteria andChuzuNotLike(String value) {
            addCriterion("chuzu not like", value, "chuzu");
            return (Criteria) this;
        }

        public Criteria andChuzuIn(List<String> values) {
            addCriterion("chuzu in", values, "chuzu");
            return (Criteria) this;
        }

        public Criteria andChuzuNotIn(List<String> values) {
            addCriterion("chuzu not in", values, "chuzu");
            return (Criteria) this;
        }

        public Criteria andChuzuBetween(String value1, String value2) {
            addCriterion("chuzu between", value1, value2, "chuzu");
            return (Criteria) this;
        }

        public Criteria andChuzuNotBetween(String value1, String value2) {
            addCriterion("chuzu not between", value1, value2, "chuzu");
            return (Criteria) this;
        }

        public Criteria andChuzuIdcardIsNull() {
            addCriterion("chuzu_idcard is null");
            return (Criteria) this;
        }

        public Criteria andChuzuIdcardIsNotNull() {
            addCriterion("chuzu_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andChuzuIdcardEqualTo(String value) {
            addCriterion("chuzu_idcard =", value, "chuzuIdcard");
            return (Criteria) this;
        }

        public Criteria andChuzuIdcardNotEqualTo(String value) {
            addCriterion("chuzu_idcard <>", value, "chuzuIdcard");
            return (Criteria) this;
        }

        public Criteria andChuzuIdcardGreaterThan(String value) {
            addCriterion("chuzu_idcard >", value, "chuzuIdcard");
            return (Criteria) this;
        }

        public Criteria andChuzuIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("chuzu_idcard >=", value, "chuzuIdcard");
            return (Criteria) this;
        }

        public Criteria andChuzuIdcardLessThan(String value) {
            addCriterion("chuzu_idcard <", value, "chuzuIdcard");
            return (Criteria) this;
        }

        public Criteria andChuzuIdcardLessThanOrEqualTo(String value) {
            addCriterion("chuzu_idcard <=", value, "chuzuIdcard");
            return (Criteria) this;
        }

        public Criteria andChuzuIdcardLike(String value) {
            addCriterion("chuzu_idcard like", value, "chuzuIdcard");
            return (Criteria) this;
        }

        public Criteria andChuzuIdcardNotLike(String value) {
            addCriterion("chuzu_idcard not like", value, "chuzuIdcard");
            return (Criteria) this;
        }

        public Criteria andChuzuIdcardIn(List<String> values) {
            addCriterion("chuzu_idcard in", values, "chuzuIdcard");
            return (Criteria) this;
        }

        public Criteria andChuzuIdcardNotIn(List<String> values) {
            addCriterion("chuzu_idcard not in", values, "chuzuIdcard");
            return (Criteria) this;
        }

        public Criteria andChuzuIdcardBetween(String value1, String value2) {
            addCriterion("chuzu_idcard between", value1, value2, "chuzuIdcard");
            return (Criteria) this;
        }

        public Criteria andChuzuIdcardNotBetween(String value1, String value2) {
            addCriterion("chuzu_idcard not between", value1, value2, "chuzuIdcard");
            return (Criteria) this;
        }

        public Criteria andZukeIsNull() {
            addCriterion("zuke is null");
            return (Criteria) this;
        }

        public Criteria andZukeIsNotNull() {
            addCriterion("zuke is not null");
            return (Criteria) this;
        }

        public Criteria andZukeEqualTo(String value) {
            addCriterion("zuke =", value, "zuke");
            return (Criteria) this;
        }

        public Criteria andZukeNotEqualTo(String value) {
            addCriterion("zuke <>", value, "zuke");
            return (Criteria) this;
        }

        public Criteria andZukeGreaterThan(String value) {
            addCriterion("zuke >", value, "zuke");
            return (Criteria) this;
        }

        public Criteria andZukeGreaterThanOrEqualTo(String value) {
            addCriterion("zuke >=", value, "zuke");
            return (Criteria) this;
        }

        public Criteria andZukeLessThan(String value) {
            addCriterion("zuke <", value, "zuke");
            return (Criteria) this;
        }

        public Criteria andZukeLessThanOrEqualTo(String value) {
            addCriterion("zuke <=", value, "zuke");
            return (Criteria) this;
        }

        public Criteria andZukeLike(String value) {
            addCriterion("zuke like", value, "zuke");
            return (Criteria) this;
        }

        public Criteria andZukeNotLike(String value) {
            addCriterion("zuke not like", value, "zuke");
            return (Criteria) this;
        }

        public Criteria andZukeIn(List<String> values) {
            addCriterion("zuke in", values, "zuke");
            return (Criteria) this;
        }

        public Criteria andZukeNotIn(List<String> values) {
            addCriterion("zuke not in", values, "zuke");
            return (Criteria) this;
        }

        public Criteria andZukeBetween(String value1, String value2) {
            addCriterion("zuke between", value1, value2, "zuke");
            return (Criteria) this;
        }

        public Criteria andZukeNotBetween(String value1, String value2) {
            addCriterion("zuke not between", value1, value2, "zuke");
            return (Criteria) this;
        }

        public Criteria andZukeIdcardIsNull() {
            addCriterion("zuke_idcard is null");
            return (Criteria) this;
        }

        public Criteria andZukeIdcardIsNotNull() {
            addCriterion("zuke_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andZukeIdcardEqualTo(String value) {
            addCriterion("zuke_idcard =", value, "zukeIdcard");
            return (Criteria) this;
        }

        public Criteria andZukeIdcardNotEqualTo(String value) {
            addCriterion("zuke_idcard <>", value, "zukeIdcard");
            return (Criteria) this;
        }

        public Criteria andZukeIdcardGreaterThan(String value) {
            addCriterion("zuke_idcard >", value, "zukeIdcard");
            return (Criteria) this;
        }

        public Criteria andZukeIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("zuke_idcard >=", value, "zukeIdcard");
            return (Criteria) this;
        }

        public Criteria andZukeIdcardLessThan(String value) {
            addCriterion("zuke_idcard <", value, "zukeIdcard");
            return (Criteria) this;
        }

        public Criteria andZukeIdcardLessThanOrEqualTo(String value) {
            addCriterion("zuke_idcard <=", value, "zukeIdcard");
            return (Criteria) this;
        }

        public Criteria andZukeIdcardLike(String value) {
            addCriterion("zuke_idcard like", value, "zukeIdcard");
            return (Criteria) this;
        }

        public Criteria andZukeIdcardNotLike(String value) {
            addCriterion("zuke_idcard not like", value, "zukeIdcard");
            return (Criteria) this;
        }

        public Criteria andZukeIdcardIn(List<String> values) {
            addCriterion("zuke_idcard in", values, "zukeIdcard");
            return (Criteria) this;
        }

        public Criteria andZukeIdcardNotIn(List<String> values) {
            addCriterion("zuke_idcard not in", values, "zukeIdcard");
            return (Criteria) this;
        }

        public Criteria andZukeIdcardBetween(String value1, String value2) {
            addCriterion("zuke_idcard between", value1, value2, "zukeIdcard");
            return (Criteria) this;
        }

        public Criteria andZukeIdcardNotBetween(String value1, String value2) {
            addCriterion("zuke_idcard not between", value1, value2, "zukeIdcard");
            return (Criteria) this;
        }

        public Criteria andFromdateIsNull() {
            addCriterion("fromdate is null");
            return (Criteria) this;
        }

        public Criteria andFromdateIsNotNull() {
            addCriterion("fromdate is not null");
            return (Criteria) this;
        }

        public Criteria andFromdateEqualTo(String value) {
            addCriterion("fromdate =", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateNotEqualTo(String value) {
            addCriterion("fromdate <>", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateGreaterThan(String value) {
            addCriterion("fromdate >", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateGreaterThanOrEqualTo(String value) {
            addCriterion("fromdate >=", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateLessThan(String value) {
            addCriterion("fromdate <", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateLessThanOrEqualTo(String value) {
            addCriterion("fromdate <=", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateLike(String value) {
            addCriterion("fromdate like", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateNotLike(String value) {
            addCriterion("fromdate not like", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateIn(List<String> values) {
            addCriterion("fromdate in", values, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateNotIn(List<String> values) {
            addCriterion("fromdate not in", values, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateBetween(String value1, String value2) {
            addCriterion("fromdate between", value1, value2, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateNotBetween(String value1, String value2) {
            addCriterion("fromdate not between", value1, value2, "fromdate");
            return (Criteria) this;
        }

        public Criteria andTodateIsNull() {
            addCriterion("todate is null");
            return (Criteria) this;
        }

        public Criteria andTodateIsNotNull() {
            addCriterion("todate is not null");
            return (Criteria) this;
        }

        public Criteria andTodateEqualTo(String value) {
            addCriterion("todate =", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateNotEqualTo(String value) {
            addCriterion("todate <>", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateGreaterThan(String value) {
            addCriterion("todate >", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateGreaterThanOrEqualTo(String value) {
            addCriterion("todate >=", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateLessThan(String value) {
            addCriterion("todate <", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateLessThanOrEqualTo(String value) {
            addCriterion("todate <=", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateLike(String value) {
            addCriterion("todate like", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateNotLike(String value) {
            addCriterion("todate not like", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateIn(List<String> values) {
            addCriterion("todate in", values, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateNotIn(List<String> values) {
            addCriterion("todate not in", values, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateBetween(String value1, String value2) {
            addCriterion("todate between", value1, value2, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateNotBetween(String value1, String value2) {
            addCriterion("todate not between", value1, value2, "todate");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(String value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(String value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(String value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(String value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(String value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLike(String value) {
            addCriterion("house_id like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotLike(String value) {
            addCriterion("house_id not like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<String> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<String> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(String value1, String value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(String value1, String value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andPaydayIsNull() {
            addCriterion("payday is null");
            return (Criteria) this;
        }

        public Criteria andPaydayIsNotNull() {
            addCriterion("payday is not null");
            return (Criteria) this;
        }

        public Criteria andPaydayEqualTo(Integer value) {
            addCriterion("payday =", value, "payday");
            return (Criteria) this;
        }

        public Criteria andPaydayNotEqualTo(Integer value) {
            addCriterion("payday <>", value, "payday");
            return (Criteria) this;
        }

        public Criteria andPaydayGreaterThan(Integer value) {
            addCriterion("payday >", value, "payday");
            return (Criteria) this;
        }

        public Criteria andPaydayGreaterThanOrEqualTo(Integer value) {
            addCriterion("payday >=", value, "payday");
            return (Criteria) this;
        }

        public Criteria andPaydayLessThan(Integer value) {
            addCriterion("payday <", value, "payday");
            return (Criteria) this;
        }

        public Criteria andPaydayLessThanOrEqualTo(Integer value) {
            addCriterion("payday <=", value, "payday");
            return (Criteria) this;
        }

        public Criteria andPaydayIn(List<Integer> values) {
            addCriterion("payday in", values, "payday");
            return (Criteria) this;
        }

        public Criteria andPaydayNotIn(List<Integer> values) {
            addCriterion("payday not in", values, "payday");
            return (Criteria) this;
        }

        public Criteria andPaydayBetween(Integer value1, Integer value2) {
            addCriterion("payday between", value1, value2, "payday");
            return (Criteria) this;
        }

        public Criteria andPaydayNotBetween(Integer value1, Integer value2) {
            addCriterion("payday not between", value1, value2, "payday");
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