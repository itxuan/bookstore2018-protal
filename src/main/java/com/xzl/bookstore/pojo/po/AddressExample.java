package com.xzl.bookstore.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCompleteAddressIsNull() {
            addCriterion("complete_address is null");
            return (Criteria) this;
        }

        public Criteria andCompleteAddressIsNotNull() {
            addCriterion("complete_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteAddressEqualTo(String value) {
            addCriterion("complete_address =", value, "completeAddress");
            return (Criteria) this;
        }

        public Criteria andCompleteAddressNotEqualTo(String value) {
            addCriterion("complete_address <>", value, "completeAddress");
            return (Criteria) this;
        }

        public Criteria andCompleteAddressGreaterThan(String value) {
            addCriterion("complete_address >", value, "completeAddress");
            return (Criteria) this;
        }

        public Criteria andCompleteAddressGreaterThanOrEqualTo(String value) {
            addCriterion("complete_address >=", value, "completeAddress");
            return (Criteria) this;
        }

        public Criteria andCompleteAddressLessThan(String value) {
            addCriterion("complete_address <", value, "completeAddress");
            return (Criteria) this;
        }

        public Criteria andCompleteAddressLessThanOrEqualTo(String value) {
            addCriterion("complete_address <=", value, "completeAddress");
            return (Criteria) this;
        }

        public Criteria andCompleteAddressLike(String value) {
            addCriterion("complete_address like", value, "completeAddress");
            return (Criteria) this;
        }

        public Criteria andCompleteAddressNotLike(String value) {
            addCriterion("complete_address not like", value, "completeAddress");
            return (Criteria) this;
        }

        public Criteria andCompleteAddressIn(List<String> values) {
            addCriterion("complete_address in", values, "completeAddress");
            return (Criteria) this;
        }

        public Criteria andCompleteAddressNotIn(List<String> values) {
            addCriterion("complete_address not in", values, "completeAddress");
            return (Criteria) this;
        }

        public Criteria andCompleteAddressBetween(String value1, String value2) {
            addCriterion("complete_address between", value1, value2, "completeAddress");
            return (Criteria) this;
        }

        public Criteria andCompleteAddressNotBetween(String value1, String value2) {
            addCriterion("complete_address not between", value1, value2, "completeAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveTelephoneIsNull() {
            addCriterion("receive_telephone is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTelephoneIsNotNull() {
            addCriterion("receive_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTelephoneEqualTo(String value) {
            addCriterion("receive_telephone =", value, "receiveTelephone");
            return (Criteria) this;
        }

        public Criteria andReceiveTelephoneNotEqualTo(String value) {
            addCriterion("receive_telephone <>", value, "receiveTelephone");
            return (Criteria) this;
        }

        public Criteria andReceiveTelephoneGreaterThan(String value) {
            addCriterion("receive_telephone >", value, "receiveTelephone");
            return (Criteria) this;
        }

        public Criteria andReceiveTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("receive_telephone >=", value, "receiveTelephone");
            return (Criteria) this;
        }

        public Criteria andReceiveTelephoneLessThan(String value) {
            addCriterion("receive_telephone <", value, "receiveTelephone");
            return (Criteria) this;
        }

        public Criteria andReceiveTelephoneLessThanOrEqualTo(String value) {
            addCriterion("receive_telephone <=", value, "receiveTelephone");
            return (Criteria) this;
        }

        public Criteria andReceiveTelephoneLike(String value) {
            addCriterion("receive_telephone like", value, "receiveTelephone");
            return (Criteria) this;
        }

        public Criteria andReceiveTelephoneNotLike(String value) {
            addCriterion("receive_telephone not like", value, "receiveTelephone");
            return (Criteria) this;
        }

        public Criteria andReceiveTelephoneIn(List<String> values) {
            addCriterion("receive_telephone in", values, "receiveTelephone");
            return (Criteria) this;
        }

        public Criteria andReceiveTelephoneNotIn(List<String> values) {
            addCriterion("receive_telephone not in", values, "receiveTelephone");
            return (Criteria) this;
        }

        public Criteria andReceiveTelephoneBetween(String value1, String value2) {
            addCriterion("receive_telephone between", value1, value2, "receiveTelephone");
            return (Criteria) this;
        }

        public Criteria andReceiveTelephoneNotBetween(String value1, String value2) {
            addCriterion("receive_telephone not between", value1, value2, "receiveTelephone");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNull() {
            addCriterion("receive_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNotNull() {
            addCriterion("receive_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameEqualTo(String value) {
            addCriterion("receive_name =", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotEqualTo(String value) {
            addCriterion("receive_name <>", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThan(String value) {
            addCriterion("receive_name >", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_name >=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThan(String value) {
            addCriterion("receive_name <", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThanOrEqualTo(String value) {
            addCriterion("receive_name <=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLike(String value) {
            addCriterion("receive_name like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotLike(String value) {
            addCriterion("receive_name not like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIn(List<String> values) {
            addCriterion("receive_name in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotIn(List<String> values) {
            addCriterion("receive_name not in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameBetween(String value1, String value2) {
            addCriterion("receive_name between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotBetween(String value1, String value2) {
            addCriterion("receive_name not between", value1, value2, "receiveName");
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