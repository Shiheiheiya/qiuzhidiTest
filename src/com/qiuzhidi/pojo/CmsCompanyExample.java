package com.qiuzhidi.pojo;

import java.util.ArrayList;
import java.util.List;

public class CmsCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsCompanyExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIsNull() {
            addCriterion("company_logo is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIsNotNull() {
            addCriterion("company_logo is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoEqualTo(String value) {
            addCriterion("company_logo =", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotEqualTo(String value) {
            addCriterion("company_logo <>", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoGreaterThan(String value) {
            addCriterion("company_logo >", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoGreaterThanOrEqualTo(String value) {
            addCriterion("company_logo >=", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLessThan(String value) {
            addCriterion("company_logo <", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLessThanOrEqualTo(String value) {
            addCriterion("company_logo <=", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLike(String value) {
            addCriterion("company_logo like", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotLike(String value) {
            addCriterion("company_logo not like", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIn(List<String> values) {
            addCriterion("company_logo in", values, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotIn(List<String> values) {
            addCriterion("company_logo not in", values, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoBetween(String value1, String value2) {
            addCriterion("company_logo between", value1, value2, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotBetween(String value1, String value2) {
            addCriterion("company_logo not between", value1, value2, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroIsNull() {
            addCriterion("company_intro is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroIsNotNull() {
            addCriterion("company_intro is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroEqualTo(String value) {
            addCriterion("company_intro =", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroNotEqualTo(String value) {
            addCriterion("company_intro <>", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroGreaterThan(String value) {
            addCriterion("company_intro >", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroGreaterThanOrEqualTo(String value) {
            addCriterion("company_intro >=", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroLessThan(String value) {
            addCriterion("company_intro <", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroLessThanOrEqualTo(String value) {
            addCriterion("company_intro <=", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroLike(String value) {
            addCriterion("company_intro like", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroNotLike(String value) {
            addCriterion("company_intro not like", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroIn(List<String> values) {
            addCriterion("company_intro in", values, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroNotIn(List<String> values) {
            addCriterion("company_intro not in", values, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroBetween(String value1, String value2) {
            addCriterion("company_intro between", value1, value2, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroNotBetween(String value1, String value2) {
            addCriterion("company_intro not between", value1, value2, "companyIntro");
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