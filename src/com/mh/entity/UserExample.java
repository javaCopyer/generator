package com.mh.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("loginname is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("loginname is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("loginname =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("loginname <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("loginname >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("loginname >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("loginname <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("loginname <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("loginname like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("loginname not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("loginname in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("loginname not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("loginname between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("loginname not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andNickIsNull() {
            addCriterion("nick is null");
            return (Criteria) this;
        }

        public Criteria andNickIsNotNull() {
            addCriterion("nick is not null");
            return (Criteria) this;
        }

        public Criteria andNickEqualTo(String value) {
            addCriterion("nick =", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotEqualTo(String value) {
            addCriterion("nick <>", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThan(String value) {
            addCriterion("nick >", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThanOrEqualTo(String value) {
            addCriterion("nick >=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThan(String value) {
            addCriterion("nick <", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThanOrEqualTo(String value) {
            addCriterion("nick <=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLike(String value) {
            addCriterion("nick like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotLike(String value) {
            addCriterion("nick not like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickIn(List<String> values) {
            addCriterion("nick in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotIn(List<String> values) {
            addCriterion("nick not in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickBetween(String value1, String value2) {
            addCriterion("nick between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotBetween(String value1, String value2) {
            addCriterion("nick not between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("usertype is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("usertype is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Integer value) {
            addCriterion("usertype =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Integer value) {
            addCriterion("usertype <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Integer value) {
            addCriterion("usertype >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("usertype >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Integer value) {
            addCriterion("usertype <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Integer value) {
            addCriterion("usertype <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Integer> values) {
            addCriterion("usertype in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Integer> values) {
            addCriterion("usertype not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Integer value1, Integer value2) {
            addCriterion("usertype between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("usertype not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andOrderpoolstatusIsNull() {
            addCriterion("orderpoolstatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderpoolstatusIsNotNull() {
            addCriterion("orderpoolstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpoolstatusEqualTo(String value) {
            addCriterion("orderpoolstatus =", value, "orderpoolstatus");
            return (Criteria) this;
        }

        public Criteria andOrderpoolstatusNotEqualTo(String value) {
            addCriterion("orderpoolstatus <>", value, "orderpoolstatus");
            return (Criteria) this;
        }

        public Criteria andOrderpoolstatusGreaterThan(String value) {
            addCriterion("orderpoolstatus >", value, "orderpoolstatus");
            return (Criteria) this;
        }

        public Criteria andOrderpoolstatusGreaterThanOrEqualTo(String value) {
            addCriterion("orderpoolstatus >=", value, "orderpoolstatus");
            return (Criteria) this;
        }

        public Criteria andOrderpoolstatusLessThan(String value) {
            addCriterion("orderpoolstatus <", value, "orderpoolstatus");
            return (Criteria) this;
        }

        public Criteria andOrderpoolstatusLessThanOrEqualTo(String value) {
            addCriterion("orderpoolstatus <=", value, "orderpoolstatus");
            return (Criteria) this;
        }

        public Criteria andOrderpoolstatusLike(String value) {
            addCriterion("orderpoolstatus like", value, "orderpoolstatus");
            return (Criteria) this;
        }

        public Criteria andOrderpoolstatusNotLike(String value) {
            addCriterion("orderpoolstatus not like", value, "orderpoolstatus");
            return (Criteria) this;
        }

        public Criteria andOrderpoolstatusIn(List<String> values) {
            addCriterion("orderpoolstatus in", values, "orderpoolstatus");
            return (Criteria) this;
        }

        public Criteria andOrderpoolstatusNotIn(List<String> values) {
            addCriterion("orderpoolstatus not in", values, "orderpoolstatus");
            return (Criteria) this;
        }

        public Criteria andOrderpoolstatusBetween(String value1, String value2) {
            addCriterion("orderpoolstatus between", value1, value2, "orderpoolstatus");
            return (Criteria) this;
        }

        public Criteria andOrderpoolstatusNotBetween(String value1, String value2) {
            addCriterion("orderpoolstatus not between", value1, value2, "orderpoolstatus");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Boolean value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Boolean value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Boolean value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Boolean value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Boolean value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Boolean> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Boolean> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Boolean value1, Boolean value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(BigDecimal value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(BigDecimal value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(BigDecimal value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(BigDecimal value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<BigDecimal> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<BigDecimal> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andMinzuIsNull() {
            addCriterion("minzu is null");
            return (Criteria) this;
        }

        public Criteria andMinzuIsNotNull() {
            addCriterion("minzu is not null");
            return (Criteria) this;
        }

        public Criteria andMinzuEqualTo(String value) {
            addCriterion("minzu =", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotEqualTo(String value) {
            addCriterion("minzu <>", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuGreaterThan(String value) {
            addCriterion("minzu >", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuGreaterThanOrEqualTo(String value) {
            addCriterion("minzu >=", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLessThan(String value) {
            addCriterion("minzu <", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLessThanOrEqualTo(String value) {
            addCriterion("minzu <=", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLike(String value) {
            addCriterion("minzu like", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotLike(String value) {
            addCriterion("minzu not like", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuIn(List<String> values) {
            addCriterion("minzu in", values, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotIn(List<String> values) {
            addCriterion("minzu not in", values, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuBetween(String value1, String value2) {
            addCriterion("minzu between", value1, value2, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotBetween(String value1, String value2) {
            addCriterion("minzu not between", value1, value2, "minzu");
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

        public Criteria andAccessuseridIsNull() {
            addCriterion("accessuserid is null");
            return (Criteria) this;
        }

        public Criteria andAccessuseridIsNotNull() {
            addCriterion("accessuserid is not null");
            return (Criteria) this;
        }

        public Criteria andAccessuseridEqualTo(Long value) {
            addCriterion("accessuserid =", value, "accessuserid");
            return (Criteria) this;
        }

        public Criteria andAccessuseridNotEqualTo(Long value) {
            addCriterion("accessuserid <>", value, "accessuserid");
            return (Criteria) this;
        }

        public Criteria andAccessuseridGreaterThan(Long value) {
            addCriterion("accessuserid >", value, "accessuserid");
            return (Criteria) this;
        }

        public Criteria andAccessuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("accessuserid >=", value, "accessuserid");
            return (Criteria) this;
        }

        public Criteria andAccessuseridLessThan(Long value) {
            addCriterion("accessuserid <", value, "accessuserid");
            return (Criteria) this;
        }

        public Criteria andAccessuseridLessThanOrEqualTo(Long value) {
            addCriterion("accessuserid <=", value, "accessuserid");
            return (Criteria) this;
        }

        public Criteria andAccessuseridIn(List<Long> values) {
            addCriterion("accessuserid in", values, "accessuserid");
            return (Criteria) this;
        }

        public Criteria andAccessuseridNotIn(List<Long> values) {
            addCriterion("accessuserid not in", values, "accessuserid");
            return (Criteria) this;
        }

        public Criteria andAccessuseridBetween(Long value1, Long value2) {
            addCriterion("accessuserid between", value1, value2, "accessuserid");
            return (Criteria) this;
        }

        public Criteria andAccessuseridNotBetween(Long value1, Long value2) {
            addCriterion("accessuserid not between", value1, value2, "accessuserid");
            return (Criteria) this;
        }

        public Criteria andIslocalIsNull() {
            addCriterion("islocal is null");
            return (Criteria) this;
        }

        public Criteria andIslocalIsNotNull() {
            addCriterion("islocal is not null");
            return (Criteria) this;
        }

        public Criteria andIslocalEqualTo(String value) {
            addCriterion("islocal =", value, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalNotEqualTo(String value) {
            addCriterion("islocal <>", value, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalGreaterThan(String value) {
            addCriterion("islocal >", value, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalGreaterThanOrEqualTo(String value) {
            addCriterion("islocal >=", value, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalLessThan(String value) {
            addCriterion("islocal <", value, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalLessThanOrEqualTo(String value) {
            addCriterion("islocal <=", value, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalLike(String value) {
            addCriterion("islocal like", value, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalNotLike(String value) {
            addCriterion("islocal not like", value, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalIn(List<String> values) {
            addCriterion("islocal in", values, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalNotIn(List<String> values) {
            addCriterion("islocal not in", values, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalBetween(String value1, String value2) {
            addCriterion("islocal between", value1, value2, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalNotBetween(String value1, String value2) {
            addCriterion("islocal not between", value1, value2, "islocal");
            return (Criteria) this;
        }

        public Criteria andAcccompanyidIsNull() {
            addCriterion("acccompanyid is null");
            return (Criteria) this;
        }

        public Criteria andAcccompanyidIsNotNull() {
            addCriterion("acccompanyid is not null");
            return (Criteria) this;
        }

        public Criteria andAcccompanyidEqualTo(Long value) {
            addCriterion("acccompanyid =", value, "acccompanyid");
            return (Criteria) this;
        }

        public Criteria andAcccompanyidNotEqualTo(Long value) {
            addCriterion("acccompanyid <>", value, "acccompanyid");
            return (Criteria) this;
        }

        public Criteria andAcccompanyidGreaterThan(Long value) {
            addCriterion("acccompanyid >", value, "acccompanyid");
            return (Criteria) this;
        }

        public Criteria andAcccompanyidGreaterThanOrEqualTo(Long value) {
            addCriterion("acccompanyid >=", value, "acccompanyid");
            return (Criteria) this;
        }

        public Criteria andAcccompanyidLessThan(Long value) {
            addCriterion("acccompanyid <", value, "acccompanyid");
            return (Criteria) this;
        }

        public Criteria andAcccompanyidLessThanOrEqualTo(Long value) {
            addCriterion("acccompanyid <=", value, "acccompanyid");
            return (Criteria) this;
        }

        public Criteria andAcccompanyidIn(List<Long> values) {
            addCriterion("acccompanyid in", values, "acccompanyid");
            return (Criteria) this;
        }

        public Criteria andAcccompanyidNotIn(List<Long> values) {
            addCriterion("acccompanyid not in", values, "acccompanyid");
            return (Criteria) this;
        }

        public Criteria andAcccompanyidBetween(Long value1, Long value2) {
            addCriterion("acccompanyid between", value1, value2, "acccompanyid");
            return (Criteria) this;
        }

        public Criteria andAcccompanyidNotBetween(Long value1, Long value2) {
            addCriterion("acccompanyid not between", value1, value2, "acccompanyid");
            return (Criteria) this;
        }

        public Criteria andIsdeformityIsNull() {
            addCriterion("isdeformity is null");
            return (Criteria) this;
        }

        public Criteria andIsdeformityIsNotNull() {
            addCriterion("isdeformity is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeformityEqualTo(String value) {
            addCriterion("isdeformity =", value, "isdeformity");
            return (Criteria) this;
        }

        public Criteria andIsdeformityNotEqualTo(String value) {
            addCriterion("isdeformity <>", value, "isdeformity");
            return (Criteria) this;
        }

        public Criteria andIsdeformityGreaterThan(String value) {
            addCriterion("isdeformity >", value, "isdeformity");
            return (Criteria) this;
        }

        public Criteria andIsdeformityGreaterThanOrEqualTo(String value) {
            addCriterion("isdeformity >=", value, "isdeformity");
            return (Criteria) this;
        }

        public Criteria andIsdeformityLessThan(String value) {
            addCriterion("isdeformity <", value, "isdeformity");
            return (Criteria) this;
        }

        public Criteria andIsdeformityLessThanOrEqualTo(String value) {
            addCriterion("isdeformity <=", value, "isdeformity");
            return (Criteria) this;
        }

        public Criteria andIsdeformityLike(String value) {
            addCriterion("isdeformity like", value, "isdeformity");
            return (Criteria) this;
        }

        public Criteria andIsdeformityNotLike(String value) {
            addCriterion("isdeformity not like", value, "isdeformity");
            return (Criteria) this;
        }

        public Criteria andIsdeformityIn(List<String> values) {
            addCriterion("isdeformity in", values, "isdeformity");
            return (Criteria) this;
        }

        public Criteria andIsdeformityNotIn(List<String> values) {
            addCriterion("isdeformity not in", values, "isdeformity");
            return (Criteria) this;
        }

        public Criteria andIsdeformityBetween(String value1, String value2) {
            addCriterion("isdeformity between", value1, value2, "isdeformity");
            return (Criteria) this;
        }

        public Criteria andIsdeformityNotBetween(String value1, String value2) {
            addCriterion("isdeformity not between", value1, value2, "isdeformity");
            return (Criteria) this;
        }

        public Criteria andIsstudentIsNull() {
            addCriterion("isstudent is null");
            return (Criteria) this;
        }

        public Criteria andIsstudentIsNotNull() {
            addCriterion("isstudent is not null");
            return (Criteria) this;
        }

        public Criteria andIsstudentEqualTo(String value) {
            addCriterion("isstudent =", value, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentNotEqualTo(String value) {
            addCriterion("isstudent <>", value, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentGreaterThan(String value) {
            addCriterion("isstudent >", value, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentGreaterThanOrEqualTo(String value) {
            addCriterion("isstudent >=", value, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentLessThan(String value) {
            addCriterion("isstudent <", value, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentLessThanOrEqualTo(String value) {
            addCriterion("isstudent <=", value, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentLike(String value) {
            addCriterion("isstudent like", value, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentNotLike(String value) {
            addCriterion("isstudent not like", value, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentIn(List<String> values) {
            addCriterion("isstudent in", values, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentNotIn(List<String> values) {
            addCriterion("isstudent not in", values, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentBetween(String value1, String value2) {
            addCriterion("isstudent between", value1, value2, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentNotBetween(String value1, String value2) {
            addCriterion("isstudent not between", value1, value2, "isstudent");
            return (Criteria) this;
        }

        public Criteria andYaoqingmaIsNull() {
            addCriterion("yaoqingma is null");
            return (Criteria) this;
        }

        public Criteria andYaoqingmaIsNotNull() {
            addCriterion("yaoqingma is not null");
            return (Criteria) this;
        }

        public Criteria andYaoqingmaEqualTo(String value) {
            addCriterion("yaoqingma =", value, "yaoqingma");
            return (Criteria) this;
        }

        public Criteria andYaoqingmaNotEqualTo(String value) {
            addCriterion("yaoqingma <>", value, "yaoqingma");
            return (Criteria) this;
        }

        public Criteria andYaoqingmaGreaterThan(String value) {
            addCriterion("yaoqingma >", value, "yaoqingma");
            return (Criteria) this;
        }

        public Criteria andYaoqingmaGreaterThanOrEqualTo(String value) {
            addCriterion("yaoqingma >=", value, "yaoqingma");
            return (Criteria) this;
        }

        public Criteria andYaoqingmaLessThan(String value) {
            addCriterion("yaoqingma <", value, "yaoqingma");
            return (Criteria) this;
        }

        public Criteria andYaoqingmaLessThanOrEqualTo(String value) {
            addCriterion("yaoqingma <=", value, "yaoqingma");
            return (Criteria) this;
        }

        public Criteria andYaoqingmaLike(String value) {
            addCriterion("yaoqingma like", value, "yaoqingma");
            return (Criteria) this;
        }

        public Criteria andYaoqingmaNotLike(String value) {
            addCriterion("yaoqingma not like", value, "yaoqingma");
            return (Criteria) this;
        }

        public Criteria andYaoqingmaIn(List<String> values) {
            addCriterion("yaoqingma in", values, "yaoqingma");
            return (Criteria) this;
        }

        public Criteria andYaoqingmaNotIn(List<String> values) {
            addCriterion("yaoqingma not in", values, "yaoqingma");
            return (Criteria) this;
        }

        public Criteria andYaoqingmaBetween(String value1, String value2) {
            addCriterion("yaoqingma between", value1, value2, "yaoqingma");
            return (Criteria) this;
        }

        public Criteria andYaoqingmaNotBetween(String value1, String value2) {
            addCriterion("yaoqingma not between", value1, value2, "yaoqingma");
            return (Criteria) this;
        }

        public Criteria andInviterIsNull() {
            addCriterion("inviter is null");
            return (Criteria) this;
        }

        public Criteria andInviterIsNotNull() {
            addCriterion("inviter is not null");
            return (Criteria) this;
        }

        public Criteria andInviterEqualTo(String value) {
            addCriterion("inviter =", value, "inviter");
            return (Criteria) this;
        }

        public Criteria andInviterNotEqualTo(String value) {
            addCriterion("inviter <>", value, "inviter");
            return (Criteria) this;
        }

        public Criteria andInviterGreaterThan(String value) {
            addCriterion("inviter >", value, "inviter");
            return (Criteria) this;
        }

        public Criteria andInviterGreaterThanOrEqualTo(String value) {
            addCriterion("inviter >=", value, "inviter");
            return (Criteria) this;
        }

        public Criteria andInviterLessThan(String value) {
            addCriterion("inviter <", value, "inviter");
            return (Criteria) this;
        }

        public Criteria andInviterLessThanOrEqualTo(String value) {
            addCriterion("inviter <=", value, "inviter");
            return (Criteria) this;
        }

        public Criteria andInviterLike(String value) {
            addCriterion("inviter like", value, "inviter");
            return (Criteria) this;
        }

        public Criteria andInviterNotLike(String value) {
            addCriterion("inviter not like", value, "inviter");
            return (Criteria) this;
        }

        public Criteria andInviterIn(List<String> values) {
            addCriterion("inviter in", values, "inviter");
            return (Criteria) this;
        }

        public Criteria andInviterNotIn(List<String> values) {
            addCriterion("inviter not in", values, "inviter");
            return (Criteria) this;
        }

        public Criteria andInviterBetween(String value1, String value2) {
            addCriterion("inviter between", value1, value2, "inviter");
            return (Criteria) this;
        }

        public Criteria andInviterNotBetween(String value1, String value2) {
            addCriterion("inviter not between", value1, value2, "inviter");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNull() {
            addCriterion("channelid is null");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNotNull() {
            addCriterion("channelid is not null");
            return (Criteria) this;
        }

        public Criteria andChannelidEqualTo(Long value) {
            addCriterion("channelid =", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotEqualTo(Long value) {
            addCriterion("channelid <>", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThan(Long value) {
            addCriterion("channelid >", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThanOrEqualTo(Long value) {
            addCriterion("channelid >=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThan(Long value) {
            addCriterion("channelid <", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThanOrEqualTo(Long value) {
            addCriterion("channelid <=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidIn(List<Long> values) {
            addCriterion("channelid in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotIn(List<Long> values) {
            addCriterion("channelid not in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidBetween(Long value1, Long value2) {
            addCriterion("channelid between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotBetween(Long value1, Long value2) {
            addCriterion("channelid not between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(Long value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(Long value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(Long value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(Long value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(Long value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(Long value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<Long> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<Long> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(Long value1, Long value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(Long value1, Long value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andFundIsNull() {
            addCriterion("fund is null");
            return (Criteria) this;
        }

        public Criteria andFundIsNotNull() {
            addCriterion("fund is not null");
            return (Criteria) this;
        }

        public Criteria andFundEqualTo(Long value) {
            addCriterion("fund =", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundNotEqualTo(Long value) {
            addCriterion("fund <>", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundGreaterThan(Long value) {
            addCriterion("fund >", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundGreaterThanOrEqualTo(Long value) {
            addCriterion("fund >=", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundLessThan(Long value) {
            addCriterion("fund <", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundLessThanOrEqualTo(Long value) {
            addCriterion("fund <=", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundIn(List<Long> values) {
            addCriterion("fund in", values, "fund");
            return (Criteria) this;
        }

        public Criteria andFundNotIn(List<Long> values) {
            addCriterion("fund not in", values, "fund");
            return (Criteria) this;
        }

        public Criteria andFundBetween(Long value1, Long value2) {
            addCriterion("fund between", value1, value2, "fund");
            return (Criteria) this;
        }

        public Criteria andFundNotBetween(Long value1, Long value2) {
            addCriterion("fund not between", value1, value2, "fund");
            return (Criteria) this;
        }

        public Criteria andLoginstatusIsNull() {
            addCriterion("loginstatus is null");
            return (Criteria) this;
        }

        public Criteria andLoginstatusIsNotNull() {
            addCriterion("loginstatus is not null");
            return (Criteria) this;
        }

        public Criteria andLoginstatusEqualTo(Integer value) {
            addCriterion("loginstatus =", value, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusNotEqualTo(Integer value) {
            addCriterion("loginstatus <>", value, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusGreaterThan(Integer value) {
            addCriterion("loginstatus >", value, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("loginstatus >=", value, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusLessThan(Integer value) {
            addCriterion("loginstatus <", value, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusLessThanOrEqualTo(Integer value) {
            addCriterion("loginstatus <=", value, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusIn(List<Integer> values) {
            addCriterion("loginstatus in", values, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusNotIn(List<Integer> values) {
            addCriterion("loginstatus not in", values, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusBetween(Integer value1, Integer value2) {
            addCriterion("loginstatus between", value1, value2, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("loginstatus not between", value1, value2, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andBelongcityIsNull() {
            addCriterion("belongcity is null");
            return (Criteria) this;
        }

        public Criteria andBelongcityIsNotNull() {
            addCriterion("belongcity is not null");
            return (Criteria) this;
        }

        public Criteria andBelongcityEqualTo(String value) {
            addCriterion("belongcity =", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityNotEqualTo(String value) {
            addCriterion("belongcity <>", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityGreaterThan(String value) {
            addCriterion("belongcity >", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityGreaterThanOrEqualTo(String value) {
            addCriterion("belongcity >=", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityLessThan(String value) {
            addCriterion("belongcity <", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityLessThanOrEqualTo(String value) {
            addCriterion("belongcity <=", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityLike(String value) {
            addCriterion("belongcity like", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityNotLike(String value) {
            addCriterion("belongcity not like", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityIn(List<String> values) {
            addCriterion("belongcity in", values, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityNotIn(List<String> values) {
            addCriterion("belongcity not in", values, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityBetween(String value1, String value2) {
            addCriterion("belongcity between", value1, value2, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityNotBetween(String value1, String value2) {
            addCriterion("belongcity not between", value1, value2, "belongcity");
            return (Criteria) this;
        }

        public Criteria andExpectedworkcityIsNull() {
            addCriterion("expectedworkcity is null");
            return (Criteria) this;
        }

        public Criteria andExpectedworkcityIsNotNull() {
            addCriterion("expectedworkcity is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedworkcityEqualTo(String value) {
            addCriterion("expectedworkcity =", value, "expectedworkcity");
            return (Criteria) this;
        }

        public Criteria andExpectedworkcityNotEqualTo(String value) {
            addCriterion("expectedworkcity <>", value, "expectedworkcity");
            return (Criteria) this;
        }

        public Criteria andExpectedworkcityGreaterThan(String value) {
            addCriterion("expectedworkcity >", value, "expectedworkcity");
            return (Criteria) this;
        }

        public Criteria andExpectedworkcityGreaterThanOrEqualTo(String value) {
            addCriterion("expectedworkcity >=", value, "expectedworkcity");
            return (Criteria) this;
        }

        public Criteria andExpectedworkcityLessThan(String value) {
            addCriterion("expectedworkcity <", value, "expectedworkcity");
            return (Criteria) this;
        }

        public Criteria andExpectedworkcityLessThanOrEqualTo(String value) {
            addCriterion("expectedworkcity <=", value, "expectedworkcity");
            return (Criteria) this;
        }

        public Criteria andExpectedworkcityLike(String value) {
            addCriterion("expectedworkcity like", value, "expectedworkcity");
            return (Criteria) this;
        }

        public Criteria andExpectedworkcityNotLike(String value) {
            addCriterion("expectedworkcity not like", value, "expectedworkcity");
            return (Criteria) this;
        }

        public Criteria andExpectedworkcityIn(List<String> values) {
            addCriterion("expectedworkcity in", values, "expectedworkcity");
            return (Criteria) this;
        }

        public Criteria andExpectedworkcityNotIn(List<String> values) {
            addCriterion("expectedworkcity not in", values, "expectedworkcity");
            return (Criteria) this;
        }

        public Criteria andExpectedworkcityBetween(String value1, String value2) {
            addCriterion("expectedworkcity between", value1, value2, "expectedworkcity");
            return (Criteria) this;
        }

        public Criteria andExpectedworkcityNotBetween(String value1, String value2) {
            addCriterion("expectedworkcity not between", value1, value2, "expectedworkcity");
            return (Criteria) this;
        }

        public Criteria andIsvalidateIsNull() {
            addCriterion("isvalidate is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidateIsNotNull() {
            addCriterion("isvalidate is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidateEqualTo(Boolean value) {
            addCriterion("isvalidate =", value, "isvalidate");
            return (Criteria) this;
        }

        public Criteria andIsvalidateNotEqualTo(Boolean value) {
            addCriterion("isvalidate <>", value, "isvalidate");
            return (Criteria) this;
        }

        public Criteria andIsvalidateGreaterThan(Boolean value) {
            addCriterion("isvalidate >", value, "isvalidate");
            return (Criteria) this;
        }

        public Criteria andIsvalidateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isvalidate >=", value, "isvalidate");
            return (Criteria) this;
        }

        public Criteria andIsvalidateLessThan(Boolean value) {
            addCriterion("isvalidate <", value, "isvalidate");
            return (Criteria) this;
        }

        public Criteria andIsvalidateLessThanOrEqualTo(Boolean value) {
            addCriterion("isvalidate <=", value, "isvalidate");
            return (Criteria) this;
        }

        public Criteria andIsvalidateIn(List<Boolean> values) {
            addCriterion("isvalidate in", values, "isvalidate");
            return (Criteria) this;
        }

        public Criteria andIsvalidateNotIn(List<Boolean> values) {
            addCriterion("isvalidate not in", values, "isvalidate");
            return (Criteria) this;
        }

        public Criteria andIsvalidateBetween(Boolean value1, Boolean value2) {
            addCriterion("isvalidate between", value1, value2, "isvalidate");
            return (Criteria) this;
        }

        public Criteria andIsvalidateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isvalidate not between", value1, value2, "isvalidate");
            return (Criteria) this;
        }

        public Criteria andOsIsNull() {
            addCriterion("os is null");
            return (Criteria) this;
        }

        public Criteria andOsIsNotNull() {
            addCriterion("os is not null");
            return (Criteria) this;
        }

        public Criteria andOsEqualTo(String value) {
            addCriterion("os =", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotEqualTo(String value) {
            addCriterion("os <>", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThan(String value) {
            addCriterion("os >", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThanOrEqualTo(String value) {
            addCriterion("os >=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThan(String value) {
            addCriterion("os <", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThanOrEqualTo(String value) {
            addCriterion("os <=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLike(String value) {
            addCriterion("os like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotLike(String value) {
            addCriterion("os not like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsIn(List<String> values) {
            addCriterion("os in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotIn(List<String> values) {
            addCriterion("os not in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsBetween(String value1, String value2) {
            addCriterion("os between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotBetween(String value1, String value2) {
            addCriterion("os not between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSubsourceIsNull() {
            addCriterion("subsource is null");
            return (Criteria) this;
        }

        public Criteria andSubsourceIsNotNull() {
            addCriterion("subsource is not null");
            return (Criteria) this;
        }

        public Criteria andSubsourceEqualTo(String value) {
            addCriterion("subsource =", value, "subsource");
            return (Criteria) this;
        }

        public Criteria andSubsourceNotEqualTo(String value) {
            addCriterion("subsource <>", value, "subsource");
            return (Criteria) this;
        }

        public Criteria andSubsourceGreaterThan(String value) {
            addCriterion("subsource >", value, "subsource");
            return (Criteria) this;
        }

        public Criteria andSubsourceGreaterThanOrEqualTo(String value) {
            addCriterion("subsource >=", value, "subsource");
            return (Criteria) this;
        }

        public Criteria andSubsourceLessThan(String value) {
            addCriterion("subsource <", value, "subsource");
            return (Criteria) this;
        }

        public Criteria andSubsourceLessThanOrEqualTo(String value) {
            addCriterion("subsource <=", value, "subsource");
            return (Criteria) this;
        }

        public Criteria andSubsourceLike(String value) {
            addCriterion("subsource like", value, "subsource");
            return (Criteria) this;
        }

        public Criteria andSubsourceNotLike(String value) {
            addCriterion("subsource not like", value, "subsource");
            return (Criteria) this;
        }

        public Criteria andSubsourceIn(List<String> values) {
            addCriterion("subsource in", values, "subsource");
            return (Criteria) this;
        }

        public Criteria andSubsourceNotIn(List<String> values) {
            addCriterion("subsource not in", values, "subsource");
            return (Criteria) this;
        }

        public Criteria andSubsourceBetween(String value1, String value2) {
            addCriterion("subsource between", value1, value2, "subsource");
            return (Criteria) this;
        }

        public Criteria andSubsourceNotBetween(String value1, String value2) {
            addCriterion("subsource not between", value1, value2, "subsource");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIsinviterIsNull() {
            addCriterion("isinviter is null");
            return (Criteria) this;
        }

        public Criteria andIsinviterIsNotNull() {
            addCriterion("isinviter is not null");
            return (Criteria) this;
        }

        public Criteria andIsinviterEqualTo(String value) {
            addCriterion("isinviter =", value, "isinviter");
            return (Criteria) this;
        }

        public Criteria andIsinviterNotEqualTo(String value) {
            addCriterion("isinviter <>", value, "isinviter");
            return (Criteria) this;
        }

        public Criteria andIsinviterGreaterThan(String value) {
            addCriterion("isinviter >", value, "isinviter");
            return (Criteria) this;
        }

        public Criteria andIsinviterGreaterThanOrEqualTo(String value) {
            addCriterion("isinviter >=", value, "isinviter");
            return (Criteria) this;
        }

        public Criteria andIsinviterLessThan(String value) {
            addCriterion("isinviter <", value, "isinviter");
            return (Criteria) this;
        }

        public Criteria andIsinviterLessThanOrEqualTo(String value) {
            addCriterion("isinviter <=", value, "isinviter");
            return (Criteria) this;
        }

        public Criteria andIsinviterLike(String value) {
            addCriterion("isinviter like", value, "isinviter");
            return (Criteria) this;
        }

        public Criteria andIsinviterNotLike(String value) {
            addCriterion("isinviter not like", value, "isinviter");
            return (Criteria) this;
        }

        public Criteria andIsinviterIn(List<String> values) {
            addCriterion("isinviter in", values, "isinviter");
            return (Criteria) this;
        }

        public Criteria andIsinviterNotIn(List<String> values) {
            addCriterion("isinviter not in", values, "isinviter");
            return (Criteria) this;
        }

        public Criteria andIsinviterBetween(String value1, String value2) {
            addCriterion("isinviter between", value1, value2, "isinviter");
            return (Criteria) this;
        }

        public Criteria andIsinviterNotBetween(String value1, String value2) {
            addCriterion("isinviter not between", value1, value2, "isinviter");
            return (Criteria) this;
        }

        public Criteria andInvitednumberIsNull() {
            addCriterion("invitednumber is null");
            return (Criteria) this;
        }

        public Criteria andInvitednumberIsNotNull() {
            addCriterion("invitednumber is not null");
            return (Criteria) this;
        }

        public Criteria andInvitednumberEqualTo(Integer value) {
            addCriterion("invitednumber =", value, "invitednumber");
            return (Criteria) this;
        }

        public Criteria andInvitednumberNotEqualTo(Integer value) {
            addCriterion("invitednumber <>", value, "invitednumber");
            return (Criteria) this;
        }

        public Criteria andInvitednumberGreaterThan(Integer value) {
            addCriterion("invitednumber >", value, "invitednumber");
            return (Criteria) this;
        }

        public Criteria andInvitednumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("invitednumber >=", value, "invitednumber");
            return (Criteria) this;
        }

        public Criteria andInvitednumberLessThan(Integer value) {
            addCriterion("invitednumber <", value, "invitednumber");
            return (Criteria) this;
        }

        public Criteria andInvitednumberLessThanOrEqualTo(Integer value) {
            addCriterion("invitednumber <=", value, "invitednumber");
            return (Criteria) this;
        }

        public Criteria andInvitednumberIn(List<Integer> values) {
            addCriterion("invitednumber in", values, "invitednumber");
            return (Criteria) this;
        }

        public Criteria andInvitednumberNotIn(List<Integer> values) {
            addCriterion("invitednumber not in", values, "invitednumber");
            return (Criteria) this;
        }

        public Criteria andInvitednumberBetween(Integer value1, Integer value2) {
            addCriterion("invitednumber between", value1, value2, "invitednumber");
            return (Criteria) this;
        }

        public Criteria andInvitednumberNotBetween(Integer value1, Integer value2) {
            addCriterion("invitednumber not between", value1, value2, "invitednumber");
            return (Criteria) this;
        }

        public Criteria andClientidIsNull() {
            addCriterion("clientid is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("clientid is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(String value) {
            addCriterion("clientid =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(String value) {
            addCriterion("clientid <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(String value) {
            addCriterion("clientid >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(String value) {
            addCriterion("clientid >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(String value) {
            addCriterion("clientid <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(String value) {
            addCriterion("clientid <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLike(String value) {
            addCriterion("clientid like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotLike(String value) {
            addCriterion("clientid not like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<String> values) {
            addCriterion("clientid in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<String> values) {
            addCriterion("clientid not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(String value1, String value2) {
            addCriterion("clientid between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(String value1, String value2) {
            addCriterion("clientid not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andTattooIsNull() {
            addCriterion("tattoo is null");
            return (Criteria) this;
        }

        public Criteria andTattooIsNotNull() {
            addCriterion("tattoo is not null");
            return (Criteria) this;
        }

        public Criteria andTattooEqualTo(String value) {
            addCriterion("tattoo =", value, "tattoo");
            return (Criteria) this;
        }

        public Criteria andTattooNotEqualTo(String value) {
            addCriterion("tattoo <>", value, "tattoo");
            return (Criteria) this;
        }

        public Criteria andTattooGreaterThan(String value) {
            addCriterion("tattoo >", value, "tattoo");
            return (Criteria) this;
        }

        public Criteria andTattooGreaterThanOrEqualTo(String value) {
            addCriterion("tattoo >=", value, "tattoo");
            return (Criteria) this;
        }

        public Criteria andTattooLessThan(String value) {
            addCriterion("tattoo <", value, "tattoo");
            return (Criteria) this;
        }

        public Criteria andTattooLessThanOrEqualTo(String value) {
            addCriterion("tattoo <=", value, "tattoo");
            return (Criteria) this;
        }

        public Criteria andTattooLike(String value) {
            addCriterion("tattoo like", value, "tattoo");
            return (Criteria) this;
        }

        public Criteria andTattooNotLike(String value) {
            addCriterion("tattoo not like", value, "tattoo");
            return (Criteria) this;
        }

        public Criteria andTattooIn(List<String> values) {
            addCriterion("tattoo in", values, "tattoo");
            return (Criteria) this;
        }

        public Criteria andTattooNotIn(List<String> values) {
            addCriterion("tattoo not in", values, "tattoo");
            return (Criteria) this;
        }

        public Criteria andTattooBetween(String value1, String value2) {
            addCriterion("tattoo between", value1, value2, "tattoo");
            return (Criteria) this;
        }

        public Criteria andTattooNotBetween(String value1, String value2) {
            addCriterion("tattoo not between", value1, value2, "tattoo");
            return (Criteria) this;
        }

        public Criteria andDisabilityIsNull() {
            addCriterion("disability is null");
            return (Criteria) this;
        }

        public Criteria andDisabilityIsNotNull() {
            addCriterion("disability is not null");
            return (Criteria) this;
        }

        public Criteria andDisabilityEqualTo(String value) {
            addCriterion("disability =", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotEqualTo(String value) {
            addCriterion("disability <>", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityGreaterThan(String value) {
            addCriterion("disability >", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityGreaterThanOrEqualTo(String value) {
            addCriterion("disability >=", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityLessThan(String value) {
            addCriterion("disability <", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityLessThanOrEqualTo(String value) {
            addCriterion("disability <=", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityLike(String value) {
            addCriterion("disability like", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotLike(String value) {
            addCriterion("disability not like", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityIn(List<String> values) {
            addCriterion("disability in", values, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotIn(List<String> values) {
            addCriterion("disability not in", values, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityBetween(String value1, String value2) {
            addCriterion("disability between", value1, value2, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotBetween(String value1, String value2) {
            addCriterion("disability not between", value1, value2, "disability");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNull() {
            addCriterion("certificate is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNotNull() {
            addCriterion("certificate is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEqualTo(String value) {
            addCriterion("certificate =", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotEqualTo(String value) {
            addCriterion("certificate <>", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThan(String value) {
            addCriterion("certificate >", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("certificate >=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThan(String value) {
            addCriterion("certificate <", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThanOrEqualTo(String value) {
            addCriterion("certificate <=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLike(String value) {
            addCriterion("certificate like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotLike(String value) {
            addCriterion("certificate not like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateIn(List<String> values) {
            addCriterion("certificate in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotIn(List<String> values) {
            addCriterion("certificate not in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateBetween(String value1, String value2) {
            addCriterion("certificate between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotBetween(String value1, String value2) {
            addCriterion("certificate not between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Long value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Long value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Long value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Long value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Long value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Long value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Long> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Long> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Long value1, Long value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Long value1, Long value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNull() {
            addCriterion("provinceid is null");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("provinceid is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(String value) {
            addCriterion("provinceid =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(String value) {
            addCriterion("provinceid <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(String value) {
            addCriterion("provinceid >", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(String value) {
            addCriterion("provinceid >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThan(String value) {
            addCriterion("provinceid <", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThanOrEqualTo(String value) {
            addCriterion("provinceid <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLike(String value) {
            addCriterion("provinceid like", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotLike(String value) {
            addCriterion("provinceid not like", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIn(List<String> values) {
            addCriterion("provinceid in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotIn(List<String> values) {
            addCriterion("provinceid not in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(String value1, String value2) {
            addCriterion("provinceid between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(String value1, String value2) {
            addCriterion("provinceid not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("cityid is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityid is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(String value) {
            addCriterion("cityid =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(String value) {
            addCriterion("cityid <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(String value) {
            addCriterion("cityid >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(String value) {
            addCriterion("cityid >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(String value) {
            addCriterion("cityid <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(String value) {
            addCriterion("cityid <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLike(String value) {
            addCriterion("cityid like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotLike(String value) {
            addCriterion("cityid not like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<String> values) {
            addCriterion("cityid in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<String> values) {
            addCriterion("cityid not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(String value1, String value2) {
            addCriterion("cityid between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(String value1, String value2) {
            addCriterion("cityid not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andDistrictidIsNull() {
            addCriterion("districtid is null");
            return (Criteria) this;
        }

        public Criteria andDistrictidIsNotNull() {
            addCriterion("districtid is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictidEqualTo(String value) {
            addCriterion("districtid =", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotEqualTo(String value) {
            addCriterion("districtid <>", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidGreaterThan(String value) {
            addCriterion("districtid >", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidGreaterThanOrEqualTo(String value) {
            addCriterion("districtid >=", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLessThan(String value) {
            addCriterion("districtid <", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLessThanOrEqualTo(String value) {
            addCriterion("districtid <=", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLike(String value) {
            addCriterion("districtid like", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotLike(String value) {
            addCriterion("districtid not like", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidIn(List<String> values) {
            addCriterion("districtid in", values, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotIn(List<String> values) {
            addCriterion("districtid not in", values, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidBetween(String value1, String value2) {
            addCriterion("districtid between", value1, value2, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotBetween(String value1, String value2) {
            addCriterion("districtid not between", value1, value2, "districtid");
            return (Criteria) this;
        }

        public Criteria andTownidIsNull() {
            addCriterion("townid is null");
            return (Criteria) this;
        }

        public Criteria andTownidIsNotNull() {
            addCriterion("townid is not null");
            return (Criteria) this;
        }

        public Criteria andTownidEqualTo(String value) {
            addCriterion("townid =", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidNotEqualTo(String value) {
            addCriterion("townid <>", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidGreaterThan(String value) {
            addCriterion("townid >", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidGreaterThanOrEqualTo(String value) {
            addCriterion("townid >=", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidLessThan(String value) {
            addCriterion("townid <", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidLessThanOrEqualTo(String value) {
            addCriterion("townid <=", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidLike(String value) {
            addCriterion("townid like", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidNotLike(String value) {
            addCriterion("townid not like", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidIn(List<String> values) {
            addCriterion("townid in", values, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidNotIn(List<String> values) {
            addCriterion("townid not in", values, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidBetween(String value1, String value2) {
            addCriterion("townid between", value1, value2, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidNotBetween(String value1, String value2) {
            addCriterion("townid not between", value1, value2, "townid");
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