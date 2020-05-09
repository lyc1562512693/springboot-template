package com.surfilter.bootmybatis.ssm.model;

import java.util.ArrayList;
import java.util.List;

public class SmUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmUserExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andUSER_IDIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUSER_IDIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_IDEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDLessThan(Integer value) {
            addCriterion("USER_ID <", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEEqualTo(String value) {
            addCriterion("USER_NAME =", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMELessThan(String value) {
            addCriterion("USER_NAME <", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMELessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMELike(String value) {
            addCriterion("USER_NAME like", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotLike(String value) {
            addCriterion("USER_NAME not like", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEIn(List<String> values) {
            addCriterion("USER_NAME in", values, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPEIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPEIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPEEqualTo(Integer value) {
            addCriterion("USER_TYPE =", value, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPENotEqualTo(Integer value) {
            addCriterion("USER_TYPE <>", value, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPEGreaterThan(Integer value) {
            addCriterion("USER_TYPE >", value, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPEGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE >=", value, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPELessThan(Integer value) {
            addCriterion("USER_TYPE <", value, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPELessThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE <=", value, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPEIn(List<Integer> values) {
            addCriterion("USER_TYPE in", values, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPENotIn(List<Integer> values) {
            addCriterion("USER_TYPE not in", values, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPEBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE between", value1, value2, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPENotBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE not between", value1, value2, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andMAILIsNull() {
            addCriterion("MAIL is null");
            return (Criteria) this;
        }

        public Criteria andMAILIsNotNull() {
            addCriterion("MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMAILEqualTo(String value) {
            addCriterion("MAIL =", value, "MAIL");
            return (Criteria) this;
        }

        public Criteria andMAILNotEqualTo(String value) {
            addCriterion("MAIL <>", value, "MAIL");
            return (Criteria) this;
        }

        public Criteria andMAILGreaterThan(String value) {
            addCriterion("MAIL >", value, "MAIL");
            return (Criteria) this;
        }

        public Criteria andMAILGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL >=", value, "MAIL");
            return (Criteria) this;
        }

        public Criteria andMAILLessThan(String value) {
            addCriterion("MAIL <", value, "MAIL");
            return (Criteria) this;
        }

        public Criteria andMAILLessThanOrEqualTo(String value) {
            addCriterion("MAIL <=", value, "MAIL");
            return (Criteria) this;
        }

        public Criteria andMAILLike(String value) {
            addCriterion("MAIL like", value, "MAIL");
            return (Criteria) this;
        }

        public Criteria andMAILNotLike(String value) {
            addCriterion("MAIL not like", value, "MAIL");
            return (Criteria) this;
        }

        public Criteria andMAILIn(List<String> values) {
            addCriterion("MAIL in", values, "MAIL");
            return (Criteria) this;
        }

        public Criteria andMAILNotIn(List<String> values) {
            addCriterion("MAIL not in", values, "MAIL");
            return (Criteria) this;
        }

        public Criteria andMAILBetween(String value1, String value2) {
            addCriterion("MAIL between", value1, value2, "MAIL");
            return (Criteria) this;
        }

        public Criteria andMAILNotBetween(String value1, String value2) {
            addCriterion("MAIL not between", value1, value2, "MAIL");
            return (Criteria) this;
        }

        public Criteria andADDRESSIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andADDRESSIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andADDRESSEqualTo(String value) {
            addCriterion("ADDRESS =", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSLessThan(String value) {
            addCriterion("ADDRESS <", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSLike(String value) {
            addCriterion("ADDRESS like", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotLike(String value) {
            addCriterion("ADDRESS not like", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSIn(List<String> values) {
            addCriterion("ADDRESS in", values, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andPHONEIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPHONEIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPHONEEqualTo(String value) {
            addCriterion("PHONE =", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotEqualTo(String value) {
            addCriterion("PHONE <>", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEGreaterThan(String value) {
            addCriterion("PHONE >", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONELessThan(String value) {
            addCriterion("PHONE <", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONELessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONELike(String value) {
            addCriterion("PHONE like", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotLike(String value) {
            addCriterion("PHONE not like", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEIn(List<String> values) {
            addCriterion("PHONE in", values, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotIn(List<String> values) {
            addCriterion("PHONE not in", values, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "PHONE");
            return (Criteria) this;
        }

        public Criteria andUSER_PICIsNull() {
            addCriterion("USER_PIC is null");
            return (Criteria) this;
        }

        public Criteria andUSER_PICIsNotNull() {
            addCriterion("USER_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_PICEqualTo(String value) {
            addCriterion("USER_PIC =", value, "USER_PIC");
            return (Criteria) this;
        }

        public Criteria andUSER_PICNotEqualTo(String value) {
            addCriterion("USER_PIC <>", value, "USER_PIC");
            return (Criteria) this;
        }

        public Criteria andUSER_PICGreaterThan(String value) {
            addCriterion("USER_PIC >", value, "USER_PIC");
            return (Criteria) this;
        }

        public Criteria andUSER_PICGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PIC >=", value, "USER_PIC");
            return (Criteria) this;
        }

        public Criteria andUSER_PICLessThan(String value) {
            addCriterion("USER_PIC <", value, "USER_PIC");
            return (Criteria) this;
        }

        public Criteria andUSER_PICLessThanOrEqualTo(String value) {
            addCriterion("USER_PIC <=", value, "USER_PIC");
            return (Criteria) this;
        }

        public Criteria andUSER_PICLike(String value) {
            addCriterion("USER_PIC like", value, "USER_PIC");
            return (Criteria) this;
        }

        public Criteria andUSER_PICNotLike(String value) {
            addCriterion("USER_PIC not like", value, "USER_PIC");
            return (Criteria) this;
        }

        public Criteria andUSER_PICIn(List<String> values) {
            addCriterion("USER_PIC in", values, "USER_PIC");
            return (Criteria) this;
        }

        public Criteria andUSER_PICNotIn(List<String> values) {
            addCriterion("USER_PIC not in", values, "USER_PIC");
            return (Criteria) this;
        }

        public Criteria andUSER_PICBetween(String value1, String value2) {
            addCriterion("USER_PIC between", value1, value2, "USER_PIC");
            return (Criteria) this;
        }

        public Criteria andUSER_PICNotBetween(String value1, String value2) {
            addCriterion("USER_PIC not between", value1, value2, "USER_PIC");
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