package entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ErmasCaseMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErmasCaseMainExample() {
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

        public Criteria andAcctNbrIsNull() {
            addCriterion("ACCT_NBR is null");
            return (Criteria) this;
        }

        public Criteria andAcctNbrIsNotNull() {
            addCriterion("ACCT_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andAcctNbrEqualTo(Long value) {
            addCriterion("ACCT_NBR =", value, "acctNbr");
            return (Criteria) this;
        }

        public Criteria andAcctNbrNotEqualTo(Long value) {
            addCriterion("ACCT_NBR <>", value, "acctNbr");
            return (Criteria) this;
        }

        public Criteria andAcctNbrGreaterThan(Long value) {
            addCriterion("ACCT_NBR >", value, "acctNbr");
            return (Criteria) this;
        }

        public Criteria andAcctNbrGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCT_NBR >=", value, "acctNbr");
            return (Criteria) this;
        }

        public Criteria andAcctNbrLessThan(Long value) {
            addCriterion("ACCT_NBR <", value, "acctNbr");
            return (Criteria) this;
        }

        public Criteria andAcctNbrLessThanOrEqualTo(Long value) {
            addCriterion("ACCT_NBR <=", value, "acctNbr");
            return (Criteria) this;
        }

        public Criteria andAcctNbrIn(List<Long> values) {
            addCriterion("ACCT_NBR in", values, "acctNbr");
            return (Criteria) this;
        }

        public Criteria andAcctNbrNotIn(List<Long> values) {
            addCriterion("ACCT_NBR not in", values, "acctNbr");
            return (Criteria) this;
        }

        public Criteria andAcctNbrBetween(Long value1, Long value2) {
            addCriterion("ACCT_NBR between", value1, value2, "acctNbr");
            return (Criteria) this;
        }

        public Criteria andAcctNbrNotBetween(Long value1, Long value2) {
            addCriterion("ACCT_NBR not between", value1, value2, "acctNbr");
            return (Criteria) this;
        }

        public Criteria andOrgIsNull() {
            addCriterion("ORG is null");
            return (Criteria) this;
        }

        public Criteria andOrgIsNotNull() {
            addCriterion("ORG is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEqualTo(String value) {
            addCriterion("ORG =", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotEqualTo(String value) {
            addCriterion("ORG <>", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThan(String value) {
            addCriterion("ORG >", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThanOrEqualTo(String value) {
            addCriterion("ORG >=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThan(String value) {
            addCriterion("ORG <", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThanOrEqualTo(String value) {
            addCriterion("ORG <=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLike(String value) {
            addCriterion("ORG like", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotLike(String value) {
            addCriterion("ORG not like", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgIn(List<String> values) {
            addCriterion("ORG in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotIn(List<String> values) {
            addCriterion("ORG not in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgBetween(String value1, String value2) {
            addCriterion("ORG between", value1, value2, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotBetween(String value1, String value2) {
            addCriterion("ORG not between", value1, value2, "org");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Long value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Long value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Long value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Long value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Long value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Long> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Long> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Long value1, Long value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Long value1, Long value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
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

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("ID_TYPE like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("ID_TYPE not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNull() {
            addCriterion("MOBILE_NO is null");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNotNull() {
            addCriterion("MOBILE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNoEqualTo(String value) {
            addCriterion("MOBILE_NO =", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotEqualTo(String value) {
            addCriterion("MOBILE_NO <>", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThan(String value) {
            addCriterion("MOBILE_NO >", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_NO >=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThan(String value) {
            addCriterion("MOBILE_NO <", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_NO <=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLike(String value) {
            addCriterion("MOBILE_NO like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotLike(String value) {
            addCriterion("MOBILE_NO not like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoIn(List<String> values) {
            addCriterion("MOBILE_NO in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotIn(List<String> values) {
            addCriterion("MOBILE_NO not in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoBetween(String value1, String value2) {
            addCriterion("MOBILE_NO between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotBetween(String value1, String value2) {
            addCriterion("MOBILE_NO not between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPreFunctionCodeIsNull() {
            addCriterion("PRE_FUNCTION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPreFunctionCodeIsNotNull() {
            addCriterion("PRE_FUNCTION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPreFunctionCodeEqualTo(String value) {
            addCriterion("PRE_FUNCTION_CODE =", value, "preFunctionCode");
            return (Criteria) this;
        }

        public Criteria andPreFunctionCodeNotEqualTo(String value) {
            addCriterion("PRE_FUNCTION_CODE <>", value, "preFunctionCode");
            return (Criteria) this;
        }

        public Criteria andPreFunctionCodeGreaterThan(String value) {
            addCriterion("PRE_FUNCTION_CODE >", value, "preFunctionCode");
            return (Criteria) this;
        }

        public Criteria andPreFunctionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_FUNCTION_CODE >=", value, "preFunctionCode");
            return (Criteria) this;
        }

        public Criteria andPreFunctionCodeLessThan(String value) {
            addCriterion("PRE_FUNCTION_CODE <", value, "preFunctionCode");
            return (Criteria) this;
        }

        public Criteria andPreFunctionCodeLessThanOrEqualTo(String value) {
            addCriterion("PRE_FUNCTION_CODE <=", value, "preFunctionCode");
            return (Criteria) this;
        }

        public Criteria andPreFunctionCodeLike(String value) {
            addCriterion("PRE_FUNCTION_CODE like", value, "preFunctionCode");
            return (Criteria) this;
        }

        public Criteria andPreFunctionCodeNotLike(String value) {
            addCriterion("PRE_FUNCTION_CODE not like", value, "preFunctionCode");
            return (Criteria) this;
        }

        public Criteria andPreFunctionCodeIn(List<String> values) {
            addCriterion("PRE_FUNCTION_CODE in", values, "preFunctionCode");
            return (Criteria) this;
        }

        public Criteria andPreFunctionCodeNotIn(List<String> values) {
            addCriterion("PRE_FUNCTION_CODE not in", values, "preFunctionCode");
            return (Criteria) this;
        }

        public Criteria andPreFunctionCodeBetween(String value1, String value2) {
            addCriterion("PRE_FUNCTION_CODE between", value1, value2, "preFunctionCode");
            return (Criteria) this;
        }

        public Criteria andPreFunctionCodeNotBetween(String value1, String value2) {
            addCriterion("PRE_FUNCTION_CODE not between", value1, value2, "preFunctionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNull() {
            addCriterion("FUNCTION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNotNull() {
            addCriterion("FUNCTION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeEqualTo(String value) {
            addCriterion("FUNCTION_CODE =", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotEqualTo(String value) {
            addCriterion("FUNCTION_CODE <>", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThan(String value) {
            addCriterion("FUNCTION_CODE >", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_CODE >=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThan(String value) {
            addCriterion("FUNCTION_CODE <", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_CODE <=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLike(String value) {
            addCriterion("FUNCTION_CODE like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotLike(String value) {
            addCriterion("FUNCTION_CODE not like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIn(List<String> values) {
            addCriterion("FUNCTION_CODE in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotIn(List<String> values) {
            addCriterion("FUNCTION_CODE not in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeBetween(String value1, String value2) {
            addCriterion("FUNCTION_CODE between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_CODE not between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCollectInDateIsNull() {
            addCriterion("COLLECT_IN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCollectInDateIsNotNull() {
            addCriterion("COLLECT_IN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCollectInDateEqualTo(Date value) {
            addCriterionForJDBCDate("COLLECT_IN_DATE =", value, "collectInDate");
            return (Criteria) this;
        }

        public Criteria andCollectInDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("COLLECT_IN_DATE <>", value, "collectInDate");
            return (Criteria) this;
        }

        public Criteria andCollectInDateGreaterThan(Date value) {
            addCriterionForJDBCDate("COLLECT_IN_DATE >", value, "collectInDate");
            return (Criteria) this;
        }

        public Criteria andCollectInDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COLLECT_IN_DATE >=", value, "collectInDate");
            return (Criteria) this;
        }

        public Criteria andCollectInDateLessThan(Date value) {
            addCriterionForJDBCDate("COLLECT_IN_DATE <", value, "collectInDate");
            return (Criteria) this;
        }

        public Criteria andCollectInDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COLLECT_IN_DATE <=", value, "collectInDate");
            return (Criteria) this;
        }

        public Criteria andCollectInDateIn(List<Date> values) {
            addCriterionForJDBCDate("COLLECT_IN_DATE in", values, "collectInDate");
            return (Criteria) this;
        }

        public Criteria andCollectInDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("COLLECT_IN_DATE not in", values, "collectInDate");
            return (Criteria) this;
        }

        public Criteria andCollectInDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COLLECT_IN_DATE between", value1, value2, "collectInDate");
            return (Criteria) this;
        }

        public Criteria andCollectInDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COLLECT_IN_DATE not between", value1, value2, "collectInDate");
            return (Criteria) this;
        }

        public Criteria andCollectOutDateIsNull() {
            addCriterion("COLLECT_OUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCollectOutDateIsNotNull() {
            addCriterion("COLLECT_OUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCollectOutDateEqualTo(Date value) {
            addCriterionForJDBCDate("COLLECT_OUT_DATE =", value, "collectOutDate");
            return (Criteria) this;
        }

        public Criteria andCollectOutDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("COLLECT_OUT_DATE <>", value, "collectOutDate");
            return (Criteria) this;
        }

        public Criteria andCollectOutDateGreaterThan(Date value) {
            addCriterionForJDBCDate("COLLECT_OUT_DATE >", value, "collectOutDate");
            return (Criteria) this;
        }

        public Criteria andCollectOutDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COLLECT_OUT_DATE >=", value, "collectOutDate");
            return (Criteria) this;
        }

        public Criteria andCollectOutDateLessThan(Date value) {
            addCriterionForJDBCDate("COLLECT_OUT_DATE <", value, "collectOutDate");
            return (Criteria) this;
        }

        public Criteria andCollectOutDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COLLECT_OUT_DATE <=", value, "collectOutDate");
            return (Criteria) this;
        }

        public Criteria andCollectOutDateIn(List<Date> values) {
            addCriterionForJDBCDate("COLLECT_OUT_DATE in", values, "collectOutDate");
            return (Criteria) this;
        }

        public Criteria andCollectOutDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("COLLECT_OUT_DATE not in", values, "collectOutDate");
            return (Criteria) this;
        }

        public Criteria andCollectOutDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COLLECT_OUT_DATE between", value1, value2, "collectOutDate");
            return (Criteria) this;
        }

        public Criteria andCollectOutDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COLLECT_OUT_DATE not between", value1, value2, "collectOutDate");
            return (Criteria) this;
        }

        public Criteria andCollectFlagIsNull() {
            addCriterion("COLLECT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCollectFlagIsNotNull() {
            addCriterion("COLLECT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCollectFlagEqualTo(String value) {
            addCriterion("COLLECT_FLAG =", value, "collectFlag");
            return (Criteria) this;
        }

        public Criteria andCollectFlagNotEqualTo(String value) {
            addCriterion("COLLECT_FLAG <>", value, "collectFlag");
            return (Criteria) this;
        }

        public Criteria andCollectFlagGreaterThan(String value) {
            addCriterion("COLLECT_FLAG >", value, "collectFlag");
            return (Criteria) this;
        }

        public Criteria andCollectFlagGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECT_FLAG >=", value, "collectFlag");
            return (Criteria) this;
        }

        public Criteria andCollectFlagLessThan(String value) {
            addCriterion("COLLECT_FLAG <", value, "collectFlag");
            return (Criteria) this;
        }

        public Criteria andCollectFlagLessThanOrEqualTo(String value) {
            addCriterion("COLLECT_FLAG <=", value, "collectFlag");
            return (Criteria) this;
        }

        public Criteria andCollectFlagLike(String value) {
            addCriterion("COLLECT_FLAG like", value, "collectFlag");
            return (Criteria) this;
        }

        public Criteria andCollectFlagNotLike(String value) {
            addCriterion("COLLECT_FLAG not like", value, "collectFlag");
            return (Criteria) this;
        }

        public Criteria andCollectFlagIn(List<String> values) {
            addCriterion("COLLECT_FLAG in", values, "collectFlag");
            return (Criteria) this;
        }

        public Criteria andCollectFlagNotIn(List<String> values) {
            addCriterion("COLLECT_FLAG not in", values, "collectFlag");
            return (Criteria) this;
        }

        public Criteria andCollectFlagBetween(String value1, String value2) {
            addCriterion("COLLECT_FLAG between", value1, value2, "collectFlag");
            return (Criteria) this;
        }

        public Criteria andCollectFlagNotBetween(String value1, String value2) {
            addCriterion("COLLECT_FLAG not between", value1, value2, "collectFlag");
            return (Criteria) this;
        }

        public Criteria andLastCollTimeIsNull() {
            addCriterion("LAST_COLL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastCollTimeIsNotNull() {
            addCriterion("LAST_COLL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastCollTimeEqualTo(Date value) {
            addCriterion("LAST_COLL_TIME =", value, "lastCollTime");
            return (Criteria) this;
        }

        public Criteria andLastCollTimeNotEqualTo(Date value) {
            addCriterion("LAST_COLL_TIME <>", value, "lastCollTime");
            return (Criteria) this;
        }

        public Criteria andLastCollTimeGreaterThan(Date value) {
            addCriterion("LAST_COLL_TIME >", value, "lastCollTime");
            return (Criteria) this;
        }

        public Criteria andLastCollTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_COLL_TIME >=", value, "lastCollTime");
            return (Criteria) this;
        }

        public Criteria andLastCollTimeLessThan(Date value) {
            addCriterion("LAST_COLL_TIME <", value, "lastCollTime");
            return (Criteria) this;
        }

        public Criteria andLastCollTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_COLL_TIME <=", value, "lastCollTime");
            return (Criteria) this;
        }

        public Criteria andLastCollTimeIn(List<Date> values) {
            addCriterion("LAST_COLL_TIME in", values, "lastCollTime");
            return (Criteria) this;
        }

        public Criteria andLastCollTimeNotIn(List<Date> values) {
            addCriterion("LAST_COLL_TIME not in", values, "lastCollTime");
            return (Criteria) this;
        }

        public Criteria andLastCollTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_COLL_TIME between", value1, value2, "lastCollTime");
            return (Criteria) this;
        }

        public Criteria andLastCollTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_COLL_TIME not between", value1, value2, "lastCollTime");
            return (Criteria) this;
        }

        public Criteria andLoanProdGroupIsNull() {
            addCriterion("LOAN_PROD_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andLoanProdGroupIsNotNull() {
            addCriterion("LOAN_PROD_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andLoanProdGroupEqualTo(String value) {
            addCriterion("LOAN_PROD_GROUP =", value, "loanProdGroup");
            return (Criteria) this;
        }

        public Criteria andLoanProdGroupNotEqualTo(String value) {
            addCriterion("LOAN_PROD_GROUP <>", value, "loanProdGroup");
            return (Criteria) this;
        }

        public Criteria andLoanProdGroupGreaterThan(String value) {
            addCriterion("LOAN_PROD_GROUP >", value, "loanProdGroup");
            return (Criteria) this;
        }

        public Criteria andLoanProdGroupGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_PROD_GROUP >=", value, "loanProdGroup");
            return (Criteria) this;
        }

        public Criteria andLoanProdGroupLessThan(String value) {
            addCriterion("LOAN_PROD_GROUP <", value, "loanProdGroup");
            return (Criteria) this;
        }

        public Criteria andLoanProdGroupLessThanOrEqualTo(String value) {
            addCriterion("LOAN_PROD_GROUP <=", value, "loanProdGroup");
            return (Criteria) this;
        }

        public Criteria andLoanProdGroupLike(String value) {
            addCriterion("LOAN_PROD_GROUP like", value, "loanProdGroup");
            return (Criteria) this;
        }

        public Criteria andLoanProdGroupNotLike(String value) {
            addCriterion("LOAN_PROD_GROUP not like", value, "loanProdGroup");
            return (Criteria) this;
        }

        public Criteria andLoanProdGroupIn(List<String> values) {
            addCriterion("LOAN_PROD_GROUP in", values, "loanProdGroup");
            return (Criteria) this;
        }

        public Criteria andLoanProdGroupNotIn(List<String> values) {
            addCriterion("LOAN_PROD_GROUP not in", values, "loanProdGroup");
            return (Criteria) this;
        }

        public Criteria andLoanProdGroupBetween(String value1, String value2) {
            addCriterion("LOAN_PROD_GROUP between", value1, value2, "loanProdGroup");
            return (Criteria) this;
        }

        public Criteria andLoanProdGroupNotBetween(String value1, String value2) {
            addCriterion("LOAN_PROD_GROUP not between", value1, value2, "loanProdGroup");
            return (Criteria) this;
        }

        public Criteria andJpaVersionIsNull() {
            addCriterion("JPA_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andJpaVersionIsNotNull() {
            addCriterion("JPA_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andJpaVersionEqualTo(Long value) {
            addCriterion("JPA_VERSION =", value, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionNotEqualTo(Long value) {
            addCriterion("JPA_VERSION <>", value, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionGreaterThan(Long value) {
            addCriterion("JPA_VERSION >", value, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("JPA_VERSION >=", value, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionLessThan(Long value) {
            addCriterion("JPA_VERSION <", value, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionLessThanOrEqualTo(Long value) {
            addCriterion("JPA_VERSION <=", value, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionIn(List<Long> values) {
            addCriterion("JPA_VERSION in", values, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionNotIn(List<Long> values) {
            addCriterion("JPA_VERSION not in", values, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionBetween(Long value1, Long value2) {
            addCriterion("JPA_VERSION between", value1, value2, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionNotBetween(Long value1, Long value2) {
            addCriterion("JPA_VERSION not between", value1, value2, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andOverDueDaysIsNull() {
            addCriterion("OVER_DUE_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andOverDueDaysIsNotNull() {
            addCriterion("OVER_DUE_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andOverDueDaysEqualTo(Integer value) {
            addCriterion("OVER_DUE_DAYS =", value, "overDueDays");
            return (Criteria) this;
        }

        public Criteria andOverDueDaysNotEqualTo(Integer value) {
            addCriterion("OVER_DUE_DAYS <>", value, "overDueDays");
            return (Criteria) this;
        }

        public Criteria andOverDueDaysGreaterThan(Integer value) {
            addCriterion("OVER_DUE_DAYS >", value, "overDueDays");
            return (Criteria) this;
        }

        public Criteria andOverDueDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("OVER_DUE_DAYS >=", value, "overDueDays");
            return (Criteria) this;
        }

        public Criteria andOverDueDaysLessThan(Integer value) {
            addCriterion("OVER_DUE_DAYS <", value, "overDueDays");
            return (Criteria) this;
        }

        public Criteria andOverDueDaysLessThanOrEqualTo(Integer value) {
            addCriterion("OVER_DUE_DAYS <=", value, "overDueDays");
            return (Criteria) this;
        }

        public Criteria andOverDueDaysIn(List<Integer> values) {
            addCriterion("OVER_DUE_DAYS in", values, "overDueDays");
            return (Criteria) this;
        }

        public Criteria andOverDueDaysNotIn(List<Integer> values) {
            addCriterion("OVER_DUE_DAYS not in", values, "overDueDays");
            return (Criteria) this;
        }

        public Criteria andOverDueDaysBetween(Integer value1, Integer value2) {
            addCriterion("OVER_DUE_DAYS between", value1, value2, "overDueDays");
            return (Criteria) this;
        }

        public Criteria andOverDueDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("OVER_DUE_DAYS not between", value1, value2, "overDueDays");
            return (Criteria) this;
        }

        public Criteria andPassDueAmtIsNull() {
            addCriterion("PASS_DUE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPassDueAmtIsNotNull() {
            addCriterion("PASS_DUE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPassDueAmtEqualTo(BigDecimal value) {
            addCriterion("PASS_DUE_AMT =", value, "passDueAmt");
            return (Criteria) this;
        }

        public Criteria andPassDueAmtNotEqualTo(BigDecimal value) {
            addCriterion("PASS_DUE_AMT <>", value, "passDueAmt");
            return (Criteria) this;
        }

        public Criteria andPassDueAmtGreaterThan(BigDecimal value) {
            addCriterion("PASS_DUE_AMT >", value, "passDueAmt");
            return (Criteria) this;
        }

        public Criteria andPassDueAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PASS_DUE_AMT >=", value, "passDueAmt");
            return (Criteria) this;
        }

        public Criteria andPassDueAmtLessThan(BigDecimal value) {
            addCriterion("PASS_DUE_AMT <", value, "passDueAmt");
            return (Criteria) this;
        }

        public Criteria andPassDueAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PASS_DUE_AMT <=", value, "passDueAmt");
            return (Criteria) this;
        }

        public Criteria andPassDueAmtIn(List<BigDecimal> values) {
            addCriterion("PASS_DUE_AMT in", values, "passDueAmt");
            return (Criteria) this;
        }

        public Criteria andPassDueAmtNotIn(List<BigDecimal> values) {
            addCriterion("PASS_DUE_AMT not in", values, "passDueAmt");
            return (Criteria) this;
        }

        public Criteria andPassDueAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PASS_DUE_AMT between", value1, value2, "passDueAmt");
            return (Criteria) this;
        }

        public Criteria andPassDueAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PASS_DUE_AMT not between", value1, value2, "passDueAmt");
            return (Criteria) this;
        }

        public Criteria andBatchDateIsNull() {
            addCriterion("BATCH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBatchDateIsNotNull() {
            addCriterion("BATCH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBatchDateEqualTo(Date value) {
            addCriterionForJDBCDate("BATCH_DATE =", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BATCH_DATE <>", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateGreaterThan(Date value) {
            addCriterionForJDBCDate("BATCH_DATE >", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BATCH_DATE >=", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateLessThan(Date value) {
            addCriterionForJDBCDate("BATCH_DATE <", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BATCH_DATE <=", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateIn(List<Date> values) {
            addCriterionForJDBCDate("BATCH_DATE in", values, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BATCH_DATE not in", values, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BATCH_DATE between", value1, value2, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BATCH_DATE not between", value1, value2, "batchDate");
            return (Criteria) this;
        }

        public Criteria andSerialCaseStatusIsNull() {
            addCriterion("SERIAL_CASE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSerialCaseStatusIsNotNull() {
            addCriterion("SERIAL_CASE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSerialCaseStatusEqualTo(String value) {
            addCriterion("SERIAL_CASE_STATUS =", value, "serialCaseStatus");
            return (Criteria) this;
        }

        public Criteria andSerialCaseStatusNotEqualTo(String value) {
            addCriterion("SERIAL_CASE_STATUS <>", value, "serialCaseStatus");
            return (Criteria) this;
        }

        public Criteria andSerialCaseStatusGreaterThan(String value) {
            addCriterion("SERIAL_CASE_STATUS >", value, "serialCaseStatus");
            return (Criteria) this;
        }

        public Criteria andSerialCaseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SERIAL_CASE_STATUS >=", value, "serialCaseStatus");
            return (Criteria) this;
        }

        public Criteria andSerialCaseStatusLessThan(String value) {
            addCriterion("SERIAL_CASE_STATUS <", value, "serialCaseStatus");
            return (Criteria) this;
        }

        public Criteria andSerialCaseStatusLessThanOrEqualTo(String value) {
            addCriterion("SERIAL_CASE_STATUS <=", value, "serialCaseStatus");
            return (Criteria) this;
        }

        public Criteria andSerialCaseStatusLike(String value) {
            addCriterion("SERIAL_CASE_STATUS like", value, "serialCaseStatus");
            return (Criteria) this;
        }

        public Criteria andSerialCaseStatusNotLike(String value) {
            addCriterion("SERIAL_CASE_STATUS not like", value, "serialCaseStatus");
            return (Criteria) this;
        }

        public Criteria andSerialCaseStatusIn(List<String> values) {
            addCriterion("SERIAL_CASE_STATUS in", values, "serialCaseStatus");
            return (Criteria) this;
        }

        public Criteria andSerialCaseStatusNotIn(List<String> values) {
            addCriterion("SERIAL_CASE_STATUS not in", values, "serialCaseStatus");
            return (Criteria) this;
        }

        public Criteria andSerialCaseStatusBetween(String value1, String value2) {
            addCriterion("SERIAL_CASE_STATUS between", value1, value2, "serialCaseStatus");
            return (Criteria) this;
        }

        public Criteria andSerialCaseStatusNotBetween(String value1, String value2) {
            addCriterion("SERIAL_CASE_STATUS not between", value1, value2, "serialCaseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseInfoTruthIsNull() {
            addCriterion("CASE_INFO_TRUTH is null");
            return (Criteria) this;
        }

        public Criteria andCaseInfoTruthIsNotNull() {
            addCriterion("CASE_INFO_TRUTH is not null");
            return (Criteria) this;
        }

        public Criteria andCaseInfoTruthEqualTo(String value) {
            addCriterion("CASE_INFO_TRUTH =", value, "caseInfoTruth");
            return (Criteria) this;
        }

        public Criteria andCaseInfoTruthNotEqualTo(String value) {
            addCriterion("CASE_INFO_TRUTH <>", value, "caseInfoTruth");
            return (Criteria) this;
        }

        public Criteria andCaseInfoTruthGreaterThan(String value) {
            addCriterion("CASE_INFO_TRUTH >", value, "caseInfoTruth");
            return (Criteria) this;
        }

        public Criteria andCaseInfoTruthGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_INFO_TRUTH >=", value, "caseInfoTruth");
            return (Criteria) this;
        }

        public Criteria andCaseInfoTruthLessThan(String value) {
            addCriterion("CASE_INFO_TRUTH <", value, "caseInfoTruth");
            return (Criteria) this;
        }

        public Criteria andCaseInfoTruthLessThanOrEqualTo(String value) {
            addCriterion("CASE_INFO_TRUTH <=", value, "caseInfoTruth");
            return (Criteria) this;
        }

        public Criteria andCaseInfoTruthLike(String value) {
            addCriterion("CASE_INFO_TRUTH like", value, "caseInfoTruth");
            return (Criteria) this;
        }

        public Criteria andCaseInfoTruthNotLike(String value) {
            addCriterion("CASE_INFO_TRUTH not like", value, "caseInfoTruth");
            return (Criteria) this;
        }

        public Criteria andCaseInfoTruthIn(List<String> values) {
            addCriterion("CASE_INFO_TRUTH in", values, "caseInfoTruth");
            return (Criteria) this;
        }

        public Criteria andCaseInfoTruthNotIn(List<String> values) {
            addCriterion("CASE_INFO_TRUTH not in", values, "caseInfoTruth");
            return (Criteria) this;
        }

        public Criteria andCaseInfoTruthBetween(String value1, String value2) {
            addCriterion("CASE_INFO_TRUTH between", value1, value2, "caseInfoTruth");
            return (Criteria) this;
        }

        public Criteria andCaseInfoTruthNotBetween(String value1, String value2) {
            addCriterion("CASE_INFO_TRUTH not between", value1, value2, "caseInfoTruth");
            return (Criteria) this;
        }

        public Criteria andMaxOverDueDaysIsNull() {
            addCriterion("MAX_OVER_DUE_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andMaxOverDueDaysIsNotNull() {
            addCriterion("MAX_OVER_DUE_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andMaxOverDueDaysEqualTo(Integer value) {
            addCriterion("MAX_OVER_DUE_DAYS =", value, "maxOverDueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverDueDaysNotEqualTo(Integer value) {
            addCriterion("MAX_OVER_DUE_DAYS <>", value, "maxOverDueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverDueDaysGreaterThan(Integer value) {
            addCriterion("MAX_OVER_DUE_DAYS >", value, "maxOverDueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverDueDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAX_OVER_DUE_DAYS >=", value, "maxOverDueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverDueDaysLessThan(Integer value) {
            addCriterion("MAX_OVER_DUE_DAYS <", value, "maxOverDueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverDueDaysLessThanOrEqualTo(Integer value) {
            addCriterion("MAX_OVER_DUE_DAYS <=", value, "maxOverDueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverDueDaysIn(List<Integer> values) {
            addCriterion("MAX_OVER_DUE_DAYS in", values, "maxOverDueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverDueDaysNotIn(List<Integer> values) {
            addCriterion("MAX_OVER_DUE_DAYS not in", values, "maxOverDueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverDueDaysBetween(Integer value1, Integer value2) {
            addCriterion("MAX_OVER_DUE_DAYS between", value1, value2, "maxOverDueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverDueDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("MAX_OVER_DUE_DAYS not between", value1, value2, "maxOverDueDays");
            return (Criteria) this;
        }

        public Criteria andMaxPassDueAmtIsNull() {
            addCriterion("MAX_PASS_DUE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andMaxPassDueAmtIsNotNull() {
            addCriterion("MAX_PASS_DUE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPassDueAmtEqualTo(BigDecimal value) {
            addCriterion("MAX_PASS_DUE_AMT =", value, "maxPassDueAmt");
            return (Criteria) this;
        }

        public Criteria andMaxPassDueAmtNotEqualTo(BigDecimal value) {
            addCriterion("MAX_PASS_DUE_AMT <>", value, "maxPassDueAmt");
            return (Criteria) this;
        }

        public Criteria andMaxPassDueAmtGreaterThan(BigDecimal value) {
            addCriterion("MAX_PASS_DUE_AMT >", value, "maxPassDueAmt");
            return (Criteria) this;
        }

        public Criteria andMaxPassDueAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_PASS_DUE_AMT >=", value, "maxPassDueAmt");
            return (Criteria) this;
        }

        public Criteria andMaxPassDueAmtLessThan(BigDecimal value) {
            addCriterion("MAX_PASS_DUE_AMT <", value, "maxPassDueAmt");
            return (Criteria) this;
        }

        public Criteria andMaxPassDueAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_PASS_DUE_AMT <=", value, "maxPassDueAmt");
            return (Criteria) this;
        }

        public Criteria andMaxPassDueAmtIn(List<BigDecimal> values) {
            addCriterion("MAX_PASS_DUE_AMT in", values, "maxPassDueAmt");
            return (Criteria) this;
        }

        public Criteria andMaxPassDueAmtNotIn(List<BigDecimal> values) {
            addCriterion("MAX_PASS_DUE_AMT not in", values, "maxPassDueAmt");
            return (Criteria) this;
        }

        public Criteria andMaxPassDueAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_PASS_DUE_AMT between", value1, value2, "maxPassDueAmt");
            return (Criteria) this;
        }

        public Criteria andMaxPassDueAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_PASS_DUE_AMT not between", value1, value2, "maxPassDueAmt");
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