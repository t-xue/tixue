package com.tixue.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andLogPasswordIsNull() {
            addCriterion("log_password is null");
            return (Criteria) this;
        }

        public Criteria andLogPasswordIsNotNull() {
            addCriterion("log_password is not null");
            return (Criteria) this;
        }

        public Criteria andLogPasswordEqualTo(String value) {
            addCriterion("log_password =", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotEqualTo(String value) {
            addCriterion("log_password <>", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordGreaterThan(String value) {
            addCriterion("log_password >", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("log_password >=", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordLessThan(String value) {
            addCriterion("log_password <", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordLessThanOrEqualTo(String value) {
            addCriterion("log_password <=", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordLike(String value) {
            addCriterion("log_password like", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotLike(String value) {
            addCriterion("log_password not like", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordIn(List<String> values) {
            addCriterion("log_password in", values, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotIn(List<String> values) {
            addCriterion("log_password not in", values, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordBetween(String value1, String value2) {
            addCriterion("log_password between", value1, value2, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotBetween(String value1, String value2) {
            addCriterion("log_password not between", value1, value2, "logPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNull() {
            addCriterion("pay_password is null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNotNull() {
            addCriterion("pay_password is not null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordEqualTo(String value) {
            addCriterion("pay_password =", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotEqualTo(String value) {
            addCriterion("pay_password <>", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThan(String value) {
            addCriterion("pay_password >", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("pay_password >=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThan(String value) {
            addCriterion("pay_password <", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThanOrEqualTo(String value) {
            addCriterion("pay_password <=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLike(String value) {
            addCriterion("pay_password like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotLike(String value) {
            addCriterion("pay_password not like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIn(List<String> values) {
            addCriterion("pay_password in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotIn(List<String> values) {
            addCriterion("pay_password not in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordBetween(String value1, String value2) {
            addCriterion("pay_password between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotBetween(String value1, String value2) {
            addCriterion("pay_password not between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBindingIsNull() {
            addCriterion("mobile_binding is null");
            return (Criteria) this;
        }

        public Criteria andMobileBindingIsNotNull() {
            addCriterion("mobile_binding is not null");
            return (Criteria) this;
        }

        public Criteria andMobileBindingEqualTo(String value) {
            addCriterion("mobile_binding =", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingNotEqualTo(String value) {
            addCriterion("mobile_binding <>", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingGreaterThan(String value) {
            addCriterion("mobile_binding >", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_binding >=", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingLessThan(String value) {
            addCriterion("mobile_binding <", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingLessThanOrEqualTo(String value) {
            addCriterion("mobile_binding <=", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingLike(String value) {
            addCriterion("mobile_binding like", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingNotLike(String value) {
            addCriterion("mobile_binding not like", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingIn(List<String> values) {
            addCriterion("mobile_binding in", values, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingNotIn(List<String> values) {
            addCriterion("mobile_binding not in", values, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingBetween(String value1, String value2) {
            addCriterion("mobile_binding between", value1, value2, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingNotBetween(String value1, String value2) {
            addCriterion("mobile_binding not between", value1, value2, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBindingIsNull() {
            addCriterion("mail_binding is null");
            return (Criteria) this;
        }

        public Criteria andMailBindingIsNotNull() {
            addCriterion("mail_binding is not null");
            return (Criteria) this;
        }

        public Criteria andMailBindingEqualTo(String value) {
            addCriterion("mail_binding =", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingNotEqualTo(String value) {
            addCriterion("mail_binding <>", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingGreaterThan(String value) {
            addCriterion("mail_binding >", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingGreaterThanOrEqualTo(String value) {
            addCriterion("mail_binding >=", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingLessThan(String value) {
            addCriterion("mail_binding <", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingLessThanOrEqualTo(String value) {
            addCriterion("mail_binding <=", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingLike(String value) {
            addCriterion("mail_binding like", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingNotLike(String value) {
            addCriterion("mail_binding not like", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingIn(List<String> values) {
            addCriterion("mail_binding in", values, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingNotIn(List<String> values) {
            addCriterion("mail_binding not in", values, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingBetween(String value1, String value2) {
            addCriterion("mail_binding between", value1, value2, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingNotBetween(String value1, String value2) {
            addCriterion("mail_binding not between", value1, value2, "mailBinding");
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

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationIsNull() {
            addCriterion("real_name_authentication is null");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationIsNotNull() {
            addCriterion("real_name_authentication is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationEqualTo(String value) {
            addCriterion("real_name_authentication =", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationNotEqualTo(String value) {
            addCriterion("real_name_authentication <>", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationGreaterThan(String value) {
            addCriterion("real_name_authentication >", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationGreaterThanOrEqualTo(String value) {
            addCriterion("real_name_authentication >=", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationLessThan(String value) {
            addCriterion("real_name_authentication <", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationLessThanOrEqualTo(String value) {
            addCriterion("real_name_authentication <=", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationLike(String value) {
            addCriterion("real_name_authentication like", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationNotLike(String value) {
            addCriterion("real_name_authentication not like", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationIn(List<String> values) {
            addCriterion("real_name_authentication in", values, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationNotIn(List<String> values) {
            addCriterion("real_name_authentication not in", values, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationBetween(String value1, String value2) {
            addCriterion("real_name_authentication between", value1, value2, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationNotBetween(String value1, String value2) {
            addCriterion("real_name_authentication not between", value1, value2, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountIsNull() {
            addCriterion("pwd_error_count is null");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountIsNotNull() {
            addCriterion("pwd_error_count is not null");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountEqualTo(Integer value) {
            addCriterion("pwd_error_count =", value, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountNotEqualTo(Integer value) {
            addCriterion("pwd_error_count <>", value, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountGreaterThan(Integer value) {
            addCriterion("pwd_error_count >", value, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pwd_error_count >=", value, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountLessThan(Integer value) {
            addCriterion("pwd_error_count <", value, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountLessThanOrEqualTo(Integer value) {
            addCriterion("pwd_error_count <=", value, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountIn(List<Integer> values) {
            addCriterion("pwd_error_count in", values, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountNotIn(List<Integer> values) {
            addCriterion("pwd_error_count not in", values, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountBetween(Integer value1, Integer value2) {
            addCriterion("pwd_error_count between", value1, value2, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountNotBetween(Integer value1, Integer value2) {
            addCriterion("pwd_error_count not between", value1, value2, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeIsNull() {
            addCriterion("change_lock_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeIsNotNull() {
            addCriterion("change_lock_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeEqualTo(Date value) {
            addCriterion("change_lock_time =", value, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeNotEqualTo(Date value) {
            addCriterion("change_lock_time <>", value, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeGreaterThan(Date value) {
            addCriterion("change_lock_time >", value, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("change_lock_time >=", value, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeLessThan(Date value) {
            addCriterion("change_lock_time <", value, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeLessThanOrEqualTo(Date value) {
            addCriterion("change_lock_time <=", value, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeIn(List<Date> values) {
            addCriterion("change_lock_time in", values, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeNotIn(List<Date> values) {
            addCriterion("change_lock_time not in", values, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeBetween(Date value1, Date value2) {
            addCriterion("change_lock_time between", value1, value2, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeNotBetween(Date value1, Date value2) {
            addCriterion("change_lock_time not between", value1, value2, "changeLockTime");
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

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeIsNull() {
            addCriterion("user_custom_type is null");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeIsNotNull() {
            addCriterion("user_custom_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeEqualTo(String value) {
            addCriterion("user_custom_type =", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeNotEqualTo(String value) {
            addCriterion("user_custom_type <>", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeGreaterThan(String value) {
            addCriterion("user_custom_type >", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_custom_type >=", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeLessThan(String value) {
            addCriterion("user_custom_type <", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeLessThanOrEqualTo(String value) {
            addCriterion("user_custom_type <=", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeLike(String value) {
            addCriterion("user_custom_type like", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeNotLike(String value) {
            addCriterion("user_custom_type not like", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeIn(List<String> values) {
            addCriterion("user_custom_type in", values, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeNotIn(List<String> values) {
            addCriterion("user_custom_type not in", values, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeBetween(String value1, String value2) {
            addCriterion("user_custom_type between", value1, value2, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeNotBetween(String value1, String value2) {
            addCriterion("user_custom_type not between", value1, value2, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeIsNull() {
            addCriterion("row_add_time is null");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeIsNotNull() {
            addCriterion("row_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeEqualTo(Date value) {
            addCriterion("row_add_time =", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeNotEqualTo(Date value) {
            addCriterion("row_add_time <>", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeGreaterThan(Date value) {
            addCriterion("row_add_time >", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("row_add_time >=", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeLessThan(Date value) {
            addCriterion("row_add_time <", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("row_add_time <=", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeIn(List<Date> values) {
            addCriterion("row_add_time in", values, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeNotIn(List<Date> values) {
            addCriterion("row_add_time not in", values, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeBetween(Date value1, Date value2) {
            addCriterion("row_add_time between", value1, value2, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("row_add_time not between", value1, value2, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeIsNull() {
            addCriterion("row_update_time is null");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeIsNotNull() {
            addCriterion("row_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeEqualTo(Date value) {
            addCriterion("row_update_time =", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeNotEqualTo(Date value) {
            addCriterion("row_update_time <>", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeGreaterThan(Date value) {
            addCriterion("row_update_time >", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("row_update_time >=", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeLessThan(Date value) {
            addCriterion("row_update_time <", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("row_update_time <=", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeIn(List<Date> values) {
            addCriterion("row_update_time in", values, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeNotIn(List<Date> values) {
            addCriterion("row_update_time not in", values, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("row_update_time between", value1, value2, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("row_update_time not between", value1, value2, "rowUpdateTime");
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