package com.qiuzhidi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsRecruitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsRecruitExample() {
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

        public Criteria andRecruitNameIsNull() {
            addCriterion("recruit_name is null");
            return (Criteria) this;
        }

        public Criteria andRecruitNameIsNotNull() {
            addCriterion("recruit_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitNameEqualTo(String value) {
            addCriterion("recruit_name =", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameNotEqualTo(String value) {
            addCriterion("recruit_name <>", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameGreaterThan(String value) {
            addCriterion("recruit_name >", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameGreaterThanOrEqualTo(String value) {
            addCriterion("recruit_name >=", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameLessThan(String value) {
            addCriterion("recruit_name <", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameLessThanOrEqualTo(String value) {
            addCriterion("recruit_name <=", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameLike(String value) {
            addCriterion("recruit_name like", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameNotLike(String value) {
            addCriterion("recruit_name not like", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameIn(List<String> values) {
            addCriterion("recruit_name in", values, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameNotIn(List<String> values) {
            addCriterion("recruit_name not in", values, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameBetween(String value1, String value2) {
            addCriterion("recruit_name between", value1, value2, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameNotBetween(String value1, String value2) {
            addCriterion("recruit_name not between", value1, value2, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitSalaryIsNull() {
            addCriterion("recruit_salary is null");
            return (Criteria) this;
        }

        public Criteria andRecruitSalaryIsNotNull() {
            addCriterion("recruit_salary is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitSalaryEqualTo(String value) {
            addCriterion("recruit_salary =", value, "recruitSalary");
            return (Criteria) this;
        }

        public Criteria andRecruitSalaryNotEqualTo(String value) {
            addCriterion("recruit_salary <>", value, "recruitSalary");
            return (Criteria) this;
        }

        public Criteria andRecruitSalaryGreaterThan(String value) {
            addCriterion("recruit_salary >", value, "recruitSalary");
            return (Criteria) this;
        }

        public Criteria andRecruitSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("recruit_salary >=", value, "recruitSalary");
            return (Criteria) this;
        }

        public Criteria andRecruitSalaryLessThan(String value) {
            addCriterion("recruit_salary <", value, "recruitSalary");
            return (Criteria) this;
        }

        public Criteria andRecruitSalaryLessThanOrEqualTo(String value) {
            addCriterion("recruit_salary <=", value, "recruitSalary");
            return (Criteria) this;
        }

        public Criteria andRecruitSalaryLike(String value) {
            addCriterion("recruit_salary like", value, "recruitSalary");
            return (Criteria) this;
        }

        public Criteria andRecruitSalaryNotLike(String value) {
            addCriterion("recruit_salary not like", value, "recruitSalary");
            return (Criteria) this;
        }

        public Criteria andRecruitSalaryIn(List<String> values) {
            addCriterion("recruit_salary in", values, "recruitSalary");
            return (Criteria) this;
        }

        public Criteria andRecruitSalaryNotIn(List<String> values) {
            addCriterion("recruit_salary not in", values, "recruitSalary");
            return (Criteria) this;
        }

        public Criteria andRecruitSalaryBetween(String value1, String value2) {
            addCriterion("recruit_salary between", value1, value2, "recruitSalary");
            return (Criteria) this;
        }

        public Criteria andRecruitSalaryNotBetween(String value1, String value2) {
            addCriterion("recruit_salary not between", value1, value2, "recruitSalary");
            return (Criteria) this;
        }

        public Criteria andRecruitWorkspaceIsNull() {
            addCriterion("recruit_workspace is null");
            return (Criteria) this;
        }

        public Criteria andRecruitWorkspaceIsNotNull() {
            addCriterion("recruit_workspace is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitWorkspaceEqualTo(String value) {
            addCriterion("recruit_workspace =", value, "recruitWorkspace");
            return (Criteria) this;
        }

        public Criteria andRecruitWorkspaceNotEqualTo(String value) {
            addCriterion("recruit_workspace <>", value, "recruitWorkspace");
            return (Criteria) this;
        }

        public Criteria andRecruitWorkspaceGreaterThan(String value) {
            addCriterion("recruit_workspace >", value, "recruitWorkspace");
            return (Criteria) this;
        }

        public Criteria andRecruitWorkspaceGreaterThanOrEqualTo(String value) {
            addCriterion("recruit_workspace >=", value, "recruitWorkspace");
            return (Criteria) this;
        }

        public Criteria andRecruitWorkspaceLessThan(String value) {
            addCriterion("recruit_workspace <", value, "recruitWorkspace");
            return (Criteria) this;
        }

        public Criteria andRecruitWorkspaceLessThanOrEqualTo(String value) {
            addCriterion("recruit_workspace <=", value, "recruitWorkspace");
            return (Criteria) this;
        }

        public Criteria andRecruitWorkspaceLike(String value) {
            addCriterion("recruit_workspace like", value, "recruitWorkspace");
            return (Criteria) this;
        }

        public Criteria andRecruitWorkspaceNotLike(String value) {
            addCriterion("recruit_workspace not like", value, "recruitWorkspace");
            return (Criteria) this;
        }

        public Criteria andRecruitWorkspaceIn(List<String> values) {
            addCriterion("recruit_workspace in", values, "recruitWorkspace");
            return (Criteria) this;
        }

        public Criteria andRecruitWorkspaceNotIn(List<String> values) {
            addCriterion("recruit_workspace not in", values, "recruitWorkspace");
            return (Criteria) this;
        }

        public Criteria andRecruitWorkspaceBetween(String value1, String value2) {
            addCriterion("recruit_workspace between", value1, value2, "recruitWorkspace");
            return (Criteria) this;
        }

        public Criteria andRecruitWorkspaceNotBetween(String value1, String value2) {
            addCriterion("recruit_workspace not between", value1, value2, "recruitWorkspace");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNull() {
            addCriterion("release_date is null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNotNull() {
            addCriterion("release_date is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateEqualTo(Date value) {
            addCriterion("release_date =", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotEqualTo(Date value) {
            addCriterion("release_date <>", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThan(Date value) {
            addCriterion("release_date >", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("release_date >=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThan(Date value) {
            addCriterion("release_date <", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThanOrEqualTo(Date value) {
            addCriterion("release_date <=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIn(List<Date> values) {
            addCriterion("release_date in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotIn(List<Date> values) {
            addCriterion("release_date not in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateBetween(Date value1, Date value2) {
            addCriterion("release_date between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotBetween(Date value1, Date value2) {
            addCriterion("release_date not between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andIsCloseIsNull() {
            addCriterion("is_close is null");
            return (Criteria) this;
        }

        public Criteria andIsCloseIsNotNull() {
            addCriterion("is_close is not null");
            return (Criteria) this;
        }

        public Criteria andIsCloseEqualTo(Integer value) {
            addCriterion("is_close =", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseNotEqualTo(Integer value) {
            addCriterion("is_close <>", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseGreaterThan(Integer value) {
            addCriterion("is_close >", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_close >=", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseLessThan(Integer value) {
            addCriterion("is_close <", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseLessThanOrEqualTo(Integer value) {
            addCriterion("is_close <=", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseIn(List<Integer> values) {
            addCriterion("is_close in", values, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseNotIn(List<Integer> values) {
            addCriterion("is_close not in", values, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseBetween(Integer value1, Integer value2) {
            addCriterion("is_close between", value1, value2, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseNotBetween(Integer value1, Integer value2) {
            addCriterion("is_close not between", value1, value2, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andMinDegreeIsNull() {
            addCriterion("min_degree is null");
            return (Criteria) this;
        }

        public Criteria andMinDegreeIsNotNull() {
            addCriterion("min_degree is not null");
            return (Criteria) this;
        }

        public Criteria andMinDegreeEqualTo(String value) {
            addCriterion("min_degree =", value, "minDegree");
            return (Criteria) this;
        }

        public Criteria andMinDegreeNotEqualTo(String value) {
            addCriterion("min_degree <>", value, "minDegree");
            return (Criteria) this;
        }

        public Criteria andMinDegreeGreaterThan(String value) {
            addCriterion("min_degree >", value, "minDegree");
            return (Criteria) this;
        }

        public Criteria andMinDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("min_degree >=", value, "minDegree");
            return (Criteria) this;
        }

        public Criteria andMinDegreeLessThan(String value) {
            addCriterion("min_degree <", value, "minDegree");
            return (Criteria) this;
        }

        public Criteria andMinDegreeLessThanOrEqualTo(String value) {
            addCriterion("min_degree <=", value, "minDegree");
            return (Criteria) this;
        }

        public Criteria andMinDegreeLike(String value) {
            addCriterion("min_degree like", value, "minDegree");
            return (Criteria) this;
        }

        public Criteria andMinDegreeNotLike(String value) {
            addCriterion("min_degree not like", value, "minDegree");
            return (Criteria) this;
        }

        public Criteria andMinDegreeIn(List<String> values) {
            addCriterion("min_degree in", values, "minDegree");
            return (Criteria) this;
        }

        public Criteria andMinDegreeNotIn(List<String> values) {
            addCriterion("min_degree not in", values, "minDegree");
            return (Criteria) this;
        }

        public Criteria andMinDegreeBetween(String value1, String value2) {
            addCriterion("min_degree between", value1, value2, "minDegree");
            return (Criteria) this;
        }

        public Criteria andMinDegreeNotBetween(String value1, String value2) {
            addCriterion("min_degree not between", value1, value2, "minDegree");
            return (Criteria) this;
        }

        public Criteria andIsPositiveIsNull() {
            addCriterion("is_positive is null");
            return (Criteria) this;
        }

        public Criteria andIsPositiveIsNotNull() {
            addCriterion("is_positive is not null");
            return (Criteria) this;
        }

        public Criteria andIsPositiveEqualTo(Integer value) {
            addCriterion("is_positive =", value, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveNotEqualTo(Integer value) {
            addCriterion("is_positive <>", value, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveGreaterThan(Integer value) {
            addCriterion("is_positive >", value, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_positive >=", value, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveLessThan(Integer value) {
            addCriterion("is_positive <", value, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveLessThanOrEqualTo(Integer value) {
            addCriterion("is_positive <=", value, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveIn(List<Integer> values) {
            addCriterion("is_positive in", values, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveNotIn(List<Integer> values) {
            addCriterion("is_positive not in", values, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveBetween(Integer value1, Integer value2) {
            addCriterion("is_positive between", value1, value2, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveNotBetween(Integer value1, Integer value2) {
            addCriterion("is_positive not between", value1, value2, "isPositive");
            return (Criteria) this;
        }

        public Criteria andPracticeTimeIsNull() {
            addCriterion("practice_time is null");
            return (Criteria) this;
        }

        public Criteria andPracticeTimeIsNotNull() {
            addCriterion("practice_time is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeTimeEqualTo(String value) {
            addCriterion("practice_time =", value, "practiceTime");
            return (Criteria) this;
        }

        public Criteria andPracticeTimeNotEqualTo(String value) {
            addCriterion("practice_time <>", value, "practiceTime");
            return (Criteria) this;
        }

        public Criteria andPracticeTimeGreaterThan(String value) {
            addCriterion("practice_time >", value, "practiceTime");
            return (Criteria) this;
        }

        public Criteria andPracticeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("practice_time >=", value, "practiceTime");
            return (Criteria) this;
        }

        public Criteria andPracticeTimeLessThan(String value) {
            addCriterion("practice_time <", value, "practiceTime");
            return (Criteria) this;
        }

        public Criteria andPracticeTimeLessThanOrEqualTo(String value) {
            addCriterion("practice_time <=", value, "practiceTime");
            return (Criteria) this;
        }

        public Criteria andPracticeTimeLike(String value) {
            addCriterion("practice_time like", value, "practiceTime");
            return (Criteria) this;
        }

        public Criteria andPracticeTimeNotLike(String value) {
            addCriterion("practice_time not like", value, "practiceTime");
            return (Criteria) this;
        }

        public Criteria andPracticeTimeIn(List<String> values) {
            addCriterion("practice_time in", values, "practiceTime");
            return (Criteria) this;
        }

        public Criteria andPracticeTimeNotIn(List<String> values) {
            addCriterion("practice_time not in", values, "practiceTime");
            return (Criteria) this;
        }

        public Criteria andPracticeTimeBetween(String value1, String value2) {
            addCriterion("practice_time between", value1, value2, "practiceTime");
            return (Criteria) this;
        }

        public Criteria andPracticeTimeNotBetween(String value1, String value2) {
            addCriterion("practice_time not between", value1, value2, "practiceTime");
            return (Criteria) this;
        }

        public Criteria andSellingPointsIsNull() {
            addCriterion("selling_points is null");
            return (Criteria) this;
        }

        public Criteria andSellingPointsIsNotNull() {
            addCriterion("selling_points is not null");
            return (Criteria) this;
        }

        public Criteria andSellingPointsEqualTo(String value) {
            addCriterion("selling_points =", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsNotEqualTo(String value) {
            addCriterion("selling_points <>", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsGreaterThan(String value) {
            addCriterion("selling_points >", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsGreaterThanOrEqualTo(String value) {
            addCriterion("selling_points >=", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsLessThan(String value) {
            addCriterion("selling_points <", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsLessThanOrEqualTo(String value) {
            addCriterion("selling_points <=", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsLike(String value) {
            addCriterion("selling_points like", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsNotLike(String value) {
            addCriterion("selling_points not like", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsIn(List<String> values) {
            addCriterion("selling_points in", values, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsNotIn(List<String> values) {
            addCriterion("selling_points not in", values, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsBetween(String value1, String value2) {
            addCriterion("selling_points between", value1, value2, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsNotBetween(String value1, String value2) {
            addCriterion("selling_points not between", value1, value2, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andRecruitNumIsNull() {
            addCriterion("recruit_num is null");
            return (Criteria) this;
        }

        public Criteria andRecruitNumIsNotNull() {
            addCriterion("recruit_num is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitNumEqualTo(Integer value) {
            addCriterion("recruit_num =", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumNotEqualTo(Integer value) {
            addCriterion("recruit_num <>", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumGreaterThan(Integer value) {
            addCriterion("recruit_num >", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruit_num >=", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumLessThan(Integer value) {
            addCriterion("recruit_num <", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumLessThanOrEqualTo(Integer value) {
            addCriterion("recruit_num <=", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumIn(List<Integer> values) {
            addCriterion("recruit_num in", values, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumNotIn(List<Integer> values) {
            addCriterion("recruit_num not in", values, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumBetween(Integer value1, Integer value2) {
            addCriterion("recruit_num between", value1, value2, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("recruit_num not between", value1, value2, "recruitNum");
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