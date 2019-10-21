package com.briup.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("IMG is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("IMG is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("IMG =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("IMG <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("IMG >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("IMG >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("IMG <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("IMG <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("IMG like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("IMG not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("IMG in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("IMG not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("IMG between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("IMG not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andClickrateIsNull() {
            addCriterion("CLICKRATE is null");
            return (Criteria) this;
        }

        public Criteria andClickrateIsNotNull() {
            addCriterion("CLICKRATE is not null");
            return (Criteria) this;
        }

        public Criteria andClickrateEqualTo(BigDecimal value) {
            addCriterion("CLICKRATE =", value, "clickrate");
            return (Criteria) this;
        }

        public Criteria andClickrateNotEqualTo(BigDecimal value) {
            addCriterion("CLICKRATE <>", value, "clickrate");
            return (Criteria) this;
        }

        public Criteria andClickrateGreaterThan(BigDecimal value) {
            addCriterion("CLICKRATE >", value, "clickrate");
            return (Criteria) this;
        }

        public Criteria andClickrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLICKRATE >=", value, "clickrate");
            return (Criteria) this;
        }

        public Criteria andClickrateLessThan(BigDecimal value) {
            addCriterion("CLICKRATE <", value, "clickrate");
            return (Criteria) this;
        }

        public Criteria andClickrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLICKRATE <=", value, "clickrate");
            return (Criteria) this;
        }

        public Criteria andClickrateIn(List<BigDecimal> values) {
            addCriterion("CLICKRATE in", values, "clickrate");
            return (Criteria) this;
        }

        public Criteria andClickrateNotIn(List<BigDecimal> values) {
            addCriterion("CLICKRATE not in", values, "clickrate");
            return (Criteria) this;
        }

        public Criteria andClickrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLICKRATE between", value1, value2, "clickrate");
            return (Criteria) this;
        }

        public Criteria andClickrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLICKRATE not between", value1, value2, "clickrate");
            return (Criteria) this;
        }

        public Criteria andRemainIsNull() {
            addCriterion("REMAIN is null");
            return (Criteria) this;
        }

        public Criteria andRemainIsNotNull() {
            addCriterion("REMAIN is not null");
            return (Criteria) this;
        }

        public Criteria andRemainEqualTo(BigDecimal value) {
            addCriterion("REMAIN =", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotEqualTo(BigDecimal value) {
            addCriterion("REMAIN <>", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainGreaterThan(BigDecimal value) {
            addCriterion("REMAIN >", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAIN >=", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainLessThan(BigDecimal value) {
            addCriterion("REMAIN <", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAIN <=", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainIn(List<BigDecimal> values) {
            addCriterion("REMAIN in", values, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotIn(List<BigDecimal> values) {
            addCriterion("REMAIN not in", values, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAIN between", value1, value2, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAIN not between", value1, value2, "remain");
            return (Criteria) this;
        }

        public Criteria andPartpayIsNull() {
            addCriterion("PARTPAY is null");
            return (Criteria) this;
        }

        public Criteria andPartpayIsNotNull() {
            addCriterion("PARTPAY is not null");
            return (Criteria) this;
        }

        public Criteria andPartpayEqualTo(String value) {
            addCriterion("PARTPAY =", value, "partpay");
            return (Criteria) this;
        }

        public Criteria andPartpayNotEqualTo(String value) {
            addCriterion("PARTPAY <>", value, "partpay");
            return (Criteria) this;
        }

        public Criteria andPartpayGreaterThan(String value) {
            addCriterion("PARTPAY >", value, "partpay");
            return (Criteria) this;
        }

        public Criteria andPartpayGreaterThanOrEqualTo(String value) {
            addCriterion("PARTPAY >=", value, "partpay");
            return (Criteria) this;
        }

        public Criteria andPartpayLessThan(String value) {
            addCriterion("PARTPAY <", value, "partpay");
            return (Criteria) this;
        }

        public Criteria andPartpayLessThanOrEqualTo(String value) {
            addCriterion("PARTPAY <=", value, "partpay");
            return (Criteria) this;
        }

        public Criteria andPartpayLike(String value) {
            addCriterion("PARTPAY like", value, "partpay");
            return (Criteria) this;
        }

        public Criteria andPartpayNotLike(String value) {
            addCriterion("PARTPAY not like", value, "partpay");
            return (Criteria) this;
        }

        public Criteria andPartpayIn(List<String> values) {
            addCriterion("PARTPAY in", values, "partpay");
            return (Criteria) this;
        }

        public Criteria andPartpayNotIn(List<String> values) {
            addCriterion("PARTPAY not in", values, "partpay");
            return (Criteria) this;
        }

        public Criteria andPartpayBetween(String value1, String value2) {
            addCriterion("PARTPAY between", value1, value2, "partpay");
            return (Criteria) this;
        }

        public Criteria andPartpayNotBetween(String value1, String value2) {
            addCriterion("PARTPAY not between", value1, value2, "partpay");
            return (Criteria) this;
        }

        public Criteria andPricereduceIsNull() {
            addCriterion("PRICEREDUCE is null");
            return (Criteria) this;
        }

        public Criteria andPricereduceIsNotNull() {
            addCriterion("PRICEREDUCE is not null");
            return (Criteria) this;
        }

        public Criteria andPricereduceEqualTo(BigDecimal value) {
            addCriterion("PRICEREDUCE =", value, "pricereduce");
            return (Criteria) this;
        }

        public Criteria andPricereduceNotEqualTo(BigDecimal value) {
            addCriterion("PRICEREDUCE <>", value, "pricereduce");
            return (Criteria) this;
        }

        public Criteria andPricereduceGreaterThan(BigDecimal value) {
            addCriterion("PRICEREDUCE >", value, "pricereduce");
            return (Criteria) this;
        }

        public Criteria andPricereduceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICEREDUCE >=", value, "pricereduce");
            return (Criteria) this;
        }

        public Criteria andPricereduceLessThan(BigDecimal value) {
            addCriterion("PRICEREDUCE <", value, "pricereduce");
            return (Criteria) this;
        }

        public Criteria andPricereduceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICEREDUCE <=", value, "pricereduce");
            return (Criteria) this;
        }

        public Criteria andPricereduceIn(List<BigDecimal> values) {
            addCriterion("PRICEREDUCE in", values, "pricereduce");
            return (Criteria) this;
        }

        public Criteria andPricereduceNotIn(List<BigDecimal> values) {
            addCriterion("PRICEREDUCE not in", values, "pricereduce");
            return (Criteria) this;
        }

        public Criteria andPricereduceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICEREDUCE between", value1, value2, "pricereduce");
            return (Criteria) this;
        }

        public Criteria andPricereduceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICEREDUCE not between", value1, value2, "pricereduce");
            return (Criteria) this;
        }

        public Criteria andCategorytwoIdIsNull() {
            addCriterion("CATEGORYTWO_ID is null");
            return (Criteria) this;
        }

        public Criteria andCategorytwoIdIsNotNull() {
            addCriterion("CATEGORYTWO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCategorytwoIdEqualTo(BigDecimal value) {
            addCriterion("CATEGORYTWO_ID =", value, "categorytwoId");
            return (Criteria) this;
        }

        public Criteria andCategorytwoIdNotEqualTo(BigDecimal value) {
            addCriterion("CATEGORYTWO_ID <>", value, "categorytwoId");
            return (Criteria) this;
        }

        public Criteria andCategorytwoIdGreaterThan(BigDecimal value) {
            addCriterion("CATEGORYTWO_ID >", value, "categorytwoId");
            return (Criteria) this;
        }

        public Criteria andCategorytwoIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CATEGORYTWO_ID >=", value, "categorytwoId");
            return (Criteria) this;
        }

        public Criteria andCategorytwoIdLessThan(BigDecimal value) {
            addCriterion("CATEGORYTWO_ID <", value, "categorytwoId");
            return (Criteria) this;
        }

        public Criteria andCategorytwoIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CATEGORYTWO_ID <=", value, "categorytwoId");
            return (Criteria) this;
        }

        public Criteria andCategorytwoIdIn(List<BigDecimal> values) {
            addCriterion("CATEGORYTWO_ID in", values, "categorytwoId");
            return (Criteria) this;
        }

        public Criteria andCategorytwoIdNotIn(List<BigDecimal> values) {
            addCriterion("CATEGORYTWO_ID not in", values, "categorytwoId");
            return (Criteria) this;
        }

        public Criteria andCategorytwoIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CATEGORYTWO_ID between", value1, value2, "categorytwoId");
            return (Criteria) this;
        }

        public Criteria andCategorytwoIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CATEGORYTWO_ID not between", value1, value2, "categorytwoId");
            return (Criteria) this;
        }

        public Criteria andHotIsNull() {
            addCriterion("HOT is null");
            return (Criteria) this;
        }

        public Criteria andHotIsNotNull() {
            addCriterion("HOT is not null");
            return (Criteria) this;
        }

        public Criteria andHotEqualTo(BigDecimal value) {
            addCriterion("HOT =", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotEqualTo(BigDecimal value) {
            addCriterion("HOT <>", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThan(BigDecimal value) {
            addCriterion("HOT >", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOT >=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThan(BigDecimal value) {
            addCriterion("HOT <", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOT <=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotIn(List<BigDecimal> values) {
            addCriterion("HOT in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotIn(List<BigDecimal> values) {
            addCriterion("HOT not in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOT between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOT not between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPublishIsNull() {
            addCriterion("PUBLISH is null");
            return (Criteria) this;
        }

        public Criteria andPublishIsNotNull() {
            addCriterion("PUBLISH is not null");
            return (Criteria) this;
        }

        public Criteria andPublishEqualTo(String value) {
            addCriterion("PUBLISH =", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotEqualTo(String value) {
            addCriterion("PUBLISH <>", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThan(String value) {
            addCriterion("PUBLISH >", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLISH >=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThan(String value) {
            addCriterion("PUBLISH <", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThanOrEqualTo(String value) {
            addCriterion("PUBLISH <=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLike(String value) {
            addCriterion("PUBLISH like", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotLike(String value) {
            addCriterion("PUBLISH not like", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishIn(List<String> values) {
            addCriterion("PUBLISH in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotIn(List<String> values) {
            addCriterion("PUBLISH not in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishBetween(String value1, String value2) {
            addCriterion("PUBLISH between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotBetween(String value1, String value2) {
            addCriterion("PUBLISH not between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andParameterIsNull() {
            addCriterion("PARAMETER is null");
            return (Criteria) this;
        }

        public Criteria andParameterIsNotNull() {
            addCriterion("PARAMETER is not null");
            return (Criteria) this;
        }

        public Criteria andParameterEqualTo(String value) {
            addCriterion("PARAMETER =", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotEqualTo(String value) {
            addCriterion("PARAMETER <>", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThan(String value) {
            addCriterion("PARAMETER >", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETER >=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThan(String value) {
            addCriterion("PARAMETER <", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThanOrEqualTo(String value) {
            addCriterion("PARAMETER <=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLike(String value) {
            addCriterion("PARAMETER like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotLike(String value) {
            addCriterion("PARAMETER not like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterIn(List<String> values) {
            addCriterion("PARAMETER in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotIn(List<String> values) {
            addCriterion("PARAMETER not in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterBetween(String value1, String value2) {
            addCriterion("PARAMETER between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotBetween(String value1, String value2) {
            addCriterion("PARAMETER not between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNull() {
            addCriterion("PUBLISHDATE is null");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNotNull() {
            addCriterion("PUBLISHDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPublishdateEqualTo(BigDecimal value) {
            addCriterion("PUBLISHDATE =", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotEqualTo(BigDecimal value) {
            addCriterion("PUBLISHDATE <>", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThan(BigDecimal value) {
            addCriterion("PUBLISHDATE >", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PUBLISHDATE >=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThan(BigDecimal value) {
            addCriterion("PUBLISHDATE <", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PUBLISHDATE <=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateIn(List<BigDecimal> values) {
            addCriterion("PUBLISHDATE in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotIn(List<BigDecimal> values) {
            addCriterion("PUBLISHDATE not in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PUBLISHDATE between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PUBLISHDATE not between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andQuitIsNull() {
            addCriterion("QUIT is null");
            return (Criteria) this;
        }

        public Criteria andQuitIsNotNull() {
            addCriterion("QUIT is not null");
            return (Criteria) this;
        }

        public Criteria andQuitEqualTo(String value) {
            addCriterion("QUIT =", value, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitNotEqualTo(String value) {
            addCriterion("QUIT <>", value, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitGreaterThan(String value) {
            addCriterion("QUIT >", value, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitGreaterThanOrEqualTo(String value) {
            addCriterion("QUIT >=", value, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitLessThan(String value) {
            addCriterion("QUIT <", value, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitLessThanOrEqualTo(String value) {
            addCriterion("QUIT <=", value, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitLike(String value) {
            addCriterion("QUIT like", value, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitNotLike(String value) {
            addCriterion("QUIT not like", value, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitIn(List<String> values) {
            addCriterion("QUIT in", values, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitNotIn(List<String> values) {
            addCriterion("QUIT not in", values, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitBetween(String value1, String value2) {
            addCriterion("QUIT between", value1, value2, "quit");
            return (Criteria) this;
        }

        public Criteria andQuitNotBetween(String value1, String value2) {
            addCriterion("QUIT not between", value1, value2, "quit");
            return (Criteria) this;
        }

        public Criteria andFreeIsNull() {
            addCriterion("FREE is null");
            return (Criteria) this;
        }

        public Criteria andFreeIsNotNull() {
            addCriterion("FREE is not null");
            return (Criteria) this;
        }

        public Criteria andFreeEqualTo(String value) {
            addCriterion("FREE =", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotEqualTo(String value) {
            addCriterion("FREE <>", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThan(String value) {
            addCriterion("FREE >", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThanOrEqualTo(String value) {
            addCriterion("FREE >=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThan(String value) {
            addCriterion("FREE <", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThanOrEqualTo(String value) {
            addCriterion("FREE <=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLike(String value) {
            addCriterion("FREE like", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotLike(String value) {
            addCriterion("FREE not like", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeIn(List<String> values) {
            addCriterion("FREE in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotIn(List<String> values) {
            addCriterion("FREE not in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeBetween(String value1, String value2) {
            addCriterion("FREE between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotBetween(String value1, String value2) {
            addCriterion("FREE not between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andWraplistIsNull() {
            addCriterion("WRAPLIST is null");
            return (Criteria) this;
        }

        public Criteria andWraplistIsNotNull() {
            addCriterion("WRAPLIST is not null");
            return (Criteria) this;
        }

        public Criteria andWraplistEqualTo(String value) {
            addCriterion("WRAPLIST =", value, "wraplist");
            return (Criteria) this;
        }

        public Criteria andWraplistNotEqualTo(String value) {
            addCriterion("WRAPLIST <>", value, "wraplist");
            return (Criteria) this;
        }

        public Criteria andWraplistGreaterThan(String value) {
            addCriterion("WRAPLIST >", value, "wraplist");
            return (Criteria) this;
        }

        public Criteria andWraplistGreaterThanOrEqualTo(String value) {
            addCriterion("WRAPLIST >=", value, "wraplist");
            return (Criteria) this;
        }

        public Criteria andWraplistLessThan(String value) {
            addCriterion("WRAPLIST <", value, "wraplist");
            return (Criteria) this;
        }

        public Criteria andWraplistLessThanOrEqualTo(String value) {
            addCriterion("WRAPLIST <=", value, "wraplist");
            return (Criteria) this;
        }

        public Criteria andWraplistLike(String value) {
            addCriterion("WRAPLIST like", value, "wraplist");
            return (Criteria) this;
        }

        public Criteria andWraplistNotLike(String value) {
            addCriterion("WRAPLIST not like", value, "wraplist");
            return (Criteria) this;
        }

        public Criteria andWraplistIn(List<String> values) {
            addCriterion("WRAPLIST in", values, "wraplist");
            return (Criteria) this;
        }

        public Criteria andWraplistNotIn(List<String> values) {
            addCriterion("WRAPLIST not in", values, "wraplist");
            return (Criteria) this;
        }

        public Criteria andWraplistBetween(String value1, String value2) {
            addCriterion("WRAPLIST between", value1, value2, "wraplist");
            return (Criteria) this;
        }

        public Criteria andWraplistNotBetween(String value1, String value2) {
            addCriterion("WRAPLIST not between", value1, value2, "wraplist");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("INTRODUCTION is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("INTRODUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("INTRODUCTION =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("INTRODUCTION <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("INTRODUCTION >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("INTRODUCTION <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("INTRODUCTION like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("INTRODUCTION not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("INTRODUCTION in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("INTRODUCTION not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("INTRODUCTION between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("INTRODUCTION not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andSellnumIsNull() {
            addCriterion("SELLNUM is null");
            return (Criteria) this;
        }

        public Criteria andSellnumIsNotNull() {
            addCriterion("SELLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSellnumEqualTo(BigDecimal value) {
            addCriterion("SELLNUM =", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumNotEqualTo(BigDecimal value) {
            addCriterion("SELLNUM <>", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumGreaterThan(BigDecimal value) {
            addCriterion("SELLNUM >", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SELLNUM >=", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumLessThan(BigDecimal value) {
            addCriterion("SELLNUM <", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SELLNUM <=", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumIn(List<BigDecimal> values) {
            addCriterion("SELLNUM in", values, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumNotIn(List<BigDecimal> values) {
            addCriterion("SELLNUM not in", values, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELLNUM between", value1, value2, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELLNUM not between", value1, value2, "sellnum");
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