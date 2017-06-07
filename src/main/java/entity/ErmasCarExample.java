package entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ErmasCarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErmasCarExample() {
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

        public Criteria andCardIdIsNull() {
            addCriterion("CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Long value) {
            addCriterion("CARD_ID =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Long value) {
            addCriterion("CARD_ID <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Long value) {
            addCriterion("CARD_ID >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CARD_ID >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Long value) {
            addCriterion("CARD_ID <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Long value) {
            addCriterion("CARD_ID <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Long> values) {
            addCriterion("CARD_ID in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Long> values) {
            addCriterion("CARD_ID not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Long value1, Long value2) {
            addCriterion("CARD_ID between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Long value1, Long value2) {
            addCriterion("CARD_ID not between", value1, value2, "cardId");
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

        public Criteria andAcctTypeIsNull() {
            addCriterion("ACCT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeIsNotNull() {
            addCriterion("ACCT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeEqualTo(String value) {
            addCriterion("ACCT_TYPE =", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotEqualTo(String value) {
            addCriterion("ACCT_TYPE <>", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeGreaterThan(String value) {
            addCriterion("ACCT_TYPE >", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_TYPE >=", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeLessThan(String value) {
            addCriterion("ACCT_TYPE <", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeLessThanOrEqualTo(String value) {
            addCriterion("ACCT_TYPE <=", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeLike(String value) {
            addCriterion("ACCT_TYPE like", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotLike(String value) {
            addCriterion("ACCT_TYPE not like", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeIn(List<String> values) {
            addCriterion("ACCT_TYPE in", values, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotIn(List<String> values) {
            addCriterion("ACCT_TYPE not in", values, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeBetween(String value1, String value2) {
            addCriterion("ACCT_TYPE between", value1, value2, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotBetween(String value1, String value2) {
            addCriterion("ACCT_TYPE not between", value1, value2, "acctType");
            return (Criteria) this;
        }

        public Criteria andApplicationNoIsNull() {
            addCriterion("APPLICATION_NO is null");
            return (Criteria) this;
        }

        public Criteria andApplicationNoIsNotNull() {
            addCriterion("APPLICATION_NO is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationNoEqualTo(String value) {
            addCriterion("APPLICATION_NO =", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotEqualTo(String value) {
            addCriterion("APPLICATION_NO <>", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoGreaterThan(String value) {
            addCriterion("APPLICATION_NO >", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_NO >=", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoLessThan(String value) {
            addCriterion("APPLICATION_NO <", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_NO <=", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoLike(String value) {
            addCriterion("APPLICATION_NO like", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotLike(String value) {
            addCriterion("APPLICATION_NO not like", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoIn(List<String> values) {
            addCriterion("APPLICATION_NO in", values, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotIn(List<String> values) {
            addCriterion("APPLICATION_NO not in", values, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoBetween(String value1, String value2) {
            addCriterion("APPLICATION_NO between", value1, value2, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_NO not between", value1, value2, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andContrNbrIsNull() {
            addCriterion("CONTR_NBR is null");
            return (Criteria) this;
        }

        public Criteria andContrNbrIsNotNull() {
            addCriterion("CONTR_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andContrNbrEqualTo(String value) {
            addCriterion("CONTR_NBR =", value, "contrNbr");
            return (Criteria) this;
        }

        public Criteria andContrNbrNotEqualTo(String value) {
            addCriterion("CONTR_NBR <>", value, "contrNbr");
            return (Criteria) this;
        }

        public Criteria andContrNbrGreaterThan(String value) {
            addCriterion("CONTR_NBR >", value, "contrNbr");
            return (Criteria) this;
        }

        public Criteria andContrNbrGreaterThanOrEqualTo(String value) {
            addCriterion("CONTR_NBR >=", value, "contrNbr");
            return (Criteria) this;
        }

        public Criteria andContrNbrLessThan(String value) {
            addCriterion("CONTR_NBR <", value, "contrNbr");
            return (Criteria) this;
        }

        public Criteria andContrNbrLessThanOrEqualTo(String value) {
            addCriterion("CONTR_NBR <=", value, "contrNbr");
            return (Criteria) this;
        }

        public Criteria andContrNbrLike(String value) {
            addCriterion("CONTR_NBR like", value, "contrNbr");
            return (Criteria) this;
        }

        public Criteria andContrNbrNotLike(String value) {
            addCriterion("CONTR_NBR not like", value, "contrNbr");
            return (Criteria) this;
        }

        public Criteria andContrNbrIn(List<String> values) {
            addCriterion("CONTR_NBR in", values, "contrNbr");
            return (Criteria) this;
        }

        public Criteria andContrNbrNotIn(List<String> values) {
            addCriterion("CONTR_NBR not in", values, "contrNbr");
            return (Criteria) this;
        }

        public Criteria andContrNbrBetween(String value1, String value2) {
            addCriterion("CONTR_NBR between", value1, value2, "contrNbr");
            return (Criteria) this;
        }

        public Criteria andContrNbrNotBetween(String value1, String value2) {
            addCriterion("CONTR_NBR not between", value1, value2, "contrNbr");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNull() {
            addCriterion("DEALER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNotNull() {
            addCriterion("DEALER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDealerIdEqualTo(String value) {
            addCriterion("DEALER_ID =", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotEqualTo(String value) {
            addCriterion("DEALER_ID <>", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThan(String value) {
            addCriterion("DEALER_ID >", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEALER_ID >=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThan(String value) {
            addCriterion("DEALER_ID <", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThanOrEqualTo(String value) {
            addCriterion("DEALER_ID <=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLike(String value) {
            addCriterion("DEALER_ID like", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotLike(String value) {
            addCriterion("DEALER_ID not like", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdIn(List<String> values) {
            addCriterion("DEALER_ID in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotIn(List<String> values) {
            addCriterion("DEALER_ID not in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdBetween(String value1, String value2) {
            addCriterion("DEALER_ID between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotBetween(String value1, String value2) {
            addCriterion("DEALER_ID not between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNull() {
            addCriterion("DEALER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNotNull() {
            addCriterion("DEALER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDealerNameEqualTo(String value) {
            addCriterion("DEALER_NAME =", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotEqualTo(String value) {
            addCriterion("DEALER_NAME <>", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThan(String value) {
            addCriterion("DEALER_NAME >", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEALER_NAME >=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThan(String value) {
            addCriterion("DEALER_NAME <", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThanOrEqualTo(String value) {
            addCriterion("DEALER_NAME <=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLike(String value) {
            addCriterion("DEALER_NAME like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotLike(String value) {
            addCriterion("DEALER_NAME not like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameIn(List<String> values) {
            addCriterion("DEALER_NAME in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotIn(List<String> values) {
            addCriterion("DEALER_NAME not in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameBetween(String value1, String value2) {
            addCriterion("DEALER_NAME between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotBetween(String value1, String value2) {
            addCriterion("DEALER_NAME not between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyIdIsNull() {
            addCriterion("DEALER_COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyIdIsNotNull() {
            addCriterion("DEALER_COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyIdEqualTo(String value) {
            addCriterion("DEALER_COMPANY_ID =", value, "dealerCompanyId");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyIdNotEqualTo(String value) {
            addCriterion("DEALER_COMPANY_ID <>", value, "dealerCompanyId");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyIdGreaterThan(String value) {
            addCriterion("DEALER_COMPANY_ID >", value, "dealerCompanyId");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEALER_COMPANY_ID >=", value, "dealerCompanyId");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyIdLessThan(String value) {
            addCriterion("DEALER_COMPANY_ID <", value, "dealerCompanyId");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("DEALER_COMPANY_ID <=", value, "dealerCompanyId");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyIdLike(String value) {
            addCriterion("DEALER_COMPANY_ID like", value, "dealerCompanyId");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyIdNotLike(String value) {
            addCriterion("DEALER_COMPANY_ID not like", value, "dealerCompanyId");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyIdIn(List<String> values) {
            addCriterion("DEALER_COMPANY_ID in", values, "dealerCompanyId");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyIdNotIn(List<String> values) {
            addCriterion("DEALER_COMPANY_ID not in", values, "dealerCompanyId");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyIdBetween(String value1, String value2) {
            addCriterion("DEALER_COMPANY_ID between", value1, value2, "dealerCompanyId");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyIdNotBetween(String value1, String value2) {
            addCriterion("DEALER_COMPANY_ID not between", value1, value2, "dealerCompanyId");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyNameIsNull() {
            addCriterion("DEALER_COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyNameIsNotNull() {
            addCriterion("DEALER_COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyNameEqualTo(String value) {
            addCriterion("DEALER_COMPANY_NAME =", value, "dealerCompanyName");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyNameNotEqualTo(String value) {
            addCriterion("DEALER_COMPANY_NAME <>", value, "dealerCompanyName");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyNameGreaterThan(String value) {
            addCriterion("DEALER_COMPANY_NAME >", value, "dealerCompanyName");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEALER_COMPANY_NAME >=", value, "dealerCompanyName");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyNameLessThan(String value) {
            addCriterion("DEALER_COMPANY_NAME <", value, "dealerCompanyName");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("DEALER_COMPANY_NAME <=", value, "dealerCompanyName");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyNameLike(String value) {
            addCriterion("DEALER_COMPANY_NAME like", value, "dealerCompanyName");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyNameNotLike(String value) {
            addCriterion("DEALER_COMPANY_NAME not like", value, "dealerCompanyName");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyNameIn(List<String> values) {
            addCriterion("DEALER_COMPANY_NAME in", values, "dealerCompanyName");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyNameNotIn(List<String> values) {
            addCriterion("DEALER_COMPANY_NAME not in", values, "dealerCompanyName");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyNameBetween(String value1, String value2) {
            addCriterion("DEALER_COMPANY_NAME between", value1, value2, "dealerCompanyName");
            return (Criteria) this;
        }

        public Criteria andDealerCompanyNameNotBetween(String value1, String value2) {
            addCriterion("DEALER_COMPANY_NAME not between", value1, value2, "dealerCompanyName");
            return (Criteria) this;
        }

        public Criteria andDealerMobileNoIsNull() {
            addCriterion("DEALER_MOBILE_NO is null");
            return (Criteria) this;
        }

        public Criteria andDealerMobileNoIsNotNull() {
            addCriterion("DEALER_MOBILE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDealerMobileNoEqualTo(String value) {
            addCriterion("DEALER_MOBILE_NO =", value, "dealerMobileNo");
            return (Criteria) this;
        }

        public Criteria andDealerMobileNoNotEqualTo(String value) {
            addCriterion("DEALER_MOBILE_NO <>", value, "dealerMobileNo");
            return (Criteria) this;
        }

        public Criteria andDealerMobileNoGreaterThan(String value) {
            addCriterion("DEALER_MOBILE_NO >", value, "dealerMobileNo");
            return (Criteria) this;
        }

        public Criteria andDealerMobileNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEALER_MOBILE_NO >=", value, "dealerMobileNo");
            return (Criteria) this;
        }

        public Criteria andDealerMobileNoLessThan(String value) {
            addCriterion("DEALER_MOBILE_NO <", value, "dealerMobileNo");
            return (Criteria) this;
        }

        public Criteria andDealerMobileNoLessThanOrEqualTo(String value) {
            addCriterion("DEALER_MOBILE_NO <=", value, "dealerMobileNo");
            return (Criteria) this;
        }

        public Criteria andDealerMobileNoLike(String value) {
            addCriterion("DEALER_MOBILE_NO like", value, "dealerMobileNo");
            return (Criteria) this;
        }

        public Criteria andDealerMobileNoNotLike(String value) {
            addCriterion("DEALER_MOBILE_NO not like", value, "dealerMobileNo");
            return (Criteria) this;
        }

        public Criteria andDealerMobileNoIn(List<String> values) {
            addCriterion("DEALER_MOBILE_NO in", values, "dealerMobileNo");
            return (Criteria) this;
        }

        public Criteria andDealerMobileNoNotIn(List<String> values) {
            addCriterion("DEALER_MOBILE_NO not in", values, "dealerMobileNo");
            return (Criteria) this;
        }

        public Criteria andDealerMobileNoBetween(String value1, String value2) {
            addCriterion("DEALER_MOBILE_NO between", value1, value2, "dealerMobileNo");
            return (Criteria) this;
        }

        public Criteria andDealerMobileNoNotBetween(String value1, String value2) {
            addCriterion("DEALER_MOBILE_NO not between", value1, value2, "dealerMobileNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoIsNull() {
            addCriterion("STORE_NO is null");
            return (Criteria) this;
        }

        public Criteria andStoreNoIsNotNull() {
            addCriterion("STORE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNoEqualTo(String value) {
            addCriterion("STORE_NO =", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoNotEqualTo(String value) {
            addCriterion("STORE_NO <>", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoGreaterThan(String value) {
            addCriterion("STORE_NO >", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_NO >=", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoLessThan(String value) {
            addCriterion("STORE_NO <", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoLessThanOrEqualTo(String value) {
            addCriterion("STORE_NO <=", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoLike(String value) {
            addCriterion("STORE_NO like", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoNotLike(String value) {
            addCriterion("STORE_NO not like", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoIn(List<String> values) {
            addCriterion("STORE_NO in", values, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoNotIn(List<String> values) {
            addCriterion("STORE_NO not in", values, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoBetween(String value1, String value2) {
            addCriterion("STORE_NO between", value1, value2, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoNotBetween(String value1, String value2) {
            addCriterion("STORE_NO not between", value1, value2, "storeNo");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNull() {
            addCriterion("CAR_BRAND is null");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNotNull() {
            addCriterion("CAR_BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andCarBrandEqualTo(String value) {
            addCriterion("CAR_BRAND =", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotEqualTo(String value) {
            addCriterion("CAR_BRAND <>", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThan(String value) {
            addCriterion("CAR_BRAND >", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_BRAND >=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThan(String value) {
            addCriterion("CAR_BRAND <", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThanOrEqualTo(String value) {
            addCriterion("CAR_BRAND <=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLike(String value) {
            addCriterion("CAR_BRAND like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotLike(String value) {
            addCriterion("CAR_BRAND not like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandIn(List<String> values) {
            addCriterion("CAR_BRAND in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotIn(List<String> values) {
            addCriterion("CAR_BRAND not in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandBetween(String value1, String value2) {
            addCriterion("CAR_BRAND between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotBetween(String value1, String value2) {
            addCriterion("CAR_BRAND not between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNoIsNull() {
            addCriterion("CAR_LICENSE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNoIsNotNull() {
            addCriterion("CAR_LICENSE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNoEqualTo(String value) {
            addCriterion("CAR_LICENSE_NO =", value, "carLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNoNotEqualTo(String value) {
            addCriterion("CAR_LICENSE_NO <>", value, "carLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNoGreaterThan(String value) {
            addCriterion("CAR_LICENSE_NO >", value, "carLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_LICENSE_NO >=", value, "carLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNoLessThan(String value) {
            addCriterion("CAR_LICENSE_NO <", value, "carLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("CAR_LICENSE_NO <=", value, "carLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNoLike(String value) {
            addCriterion("CAR_LICENSE_NO like", value, "carLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNoNotLike(String value) {
            addCriterion("CAR_LICENSE_NO not like", value, "carLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNoIn(List<String> values) {
            addCriterion("CAR_LICENSE_NO in", values, "carLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNoNotIn(List<String> values) {
            addCriterion("CAR_LICENSE_NO not in", values, "carLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNoBetween(String value1, String value2) {
            addCriterion("CAR_LICENSE_NO between", value1, value2, "carLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNoNotBetween(String value1, String value2) {
            addCriterion("CAR_LICENSE_NO not between", value1, value2, "carLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCarModelNoIsNull() {
            addCriterion("CAR_MODEL_NO is null");
            return (Criteria) this;
        }

        public Criteria andCarModelNoIsNotNull() {
            addCriterion("CAR_MODEL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCarModelNoEqualTo(String value) {
            addCriterion("CAR_MODEL_NO =", value, "carModelNo");
            return (Criteria) this;
        }

        public Criteria andCarModelNoNotEqualTo(String value) {
            addCriterion("CAR_MODEL_NO <>", value, "carModelNo");
            return (Criteria) this;
        }

        public Criteria andCarModelNoGreaterThan(String value) {
            addCriterion("CAR_MODEL_NO >", value, "carModelNo");
            return (Criteria) this;
        }

        public Criteria andCarModelNoGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_MODEL_NO >=", value, "carModelNo");
            return (Criteria) this;
        }

        public Criteria andCarModelNoLessThan(String value) {
            addCriterion("CAR_MODEL_NO <", value, "carModelNo");
            return (Criteria) this;
        }

        public Criteria andCarModelNoLessThanOrEqualTo(String value) {
            addCriterion("CAR_MODEL_NO <=", value, "carModelNo");
            return (Criteria) this;
        }

        public Criteria andCarModelNoLike(String value) {
            addCriterion("CAR_MODEL_NO like", value, "carModelNo");
            return (Criteria) this;
        }

        public Criteria andCarModelNoNotLike(String value) {
            addCriterion("CAR_MODEL_NO not like", value, "carModelNo");
            return (Criteria) this;
        }

        public Criteria andCarModelNoIn(List<String> values) {
            addCriterion("CAR_MODEL_NO in", values, "carModelNo");
            return (Criteria) this;
        }

        public Criteria andCarModelNoNotIn(List<String> values) {
            addCriterion("CAR_MODEL_NO not in", values, "carModelNo");
            return (Criteria) this;
        }

        public Criteria andCarModelNoBetween(String value1, String value2) {
            addCriterion("CAR_MODEL_NO between", value1, value2, "carModelNo");
            return (Criteria) this;
        }

        public Criteria andCarModelNoNotBetween(String value1, String value2) {
            addCriterion("CAR_MODEL_NO not between", value1, value2, "carModelNo");
            return (Criteria) this;
        }

        public Criteria andTransferTimesIsNull() {
            addCriterion("TRANSFER_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andTransferTimesIsNotNull() {
            addCriterion("TRANSFER_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andTransferTimesEqualTo(String value) {
            addCriterion("TRANSFER_TIMES =", value, "transferTimes");
            return (Criteria) this;
        }

        public Criteria andTransferTimesNotEqualTo(String value) {
            addCriterion("TRANSFER_TIMES <>", value, "transferTimes");
            return (Criteria) this;
        }

        public Criteria andTransferTimesGreaterThan(String value) {
            addCriterion("TRANSFER_TIMES >", value, "transferTimes");
            return (Criteria) this;
        }

        public Criteria andTransferTimesGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_TIMES >=", value, "transferTimes");
            return (Criteria) this;
        }

        public Criteria andTransferTimesLessThan(String value) {
            addCriterion("TRANSFER_TIMES <", value, "transferTimes");
            return (Criteria) this;
        }

        public Criteria andTransferTimesLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_TIMES <=", value, "transferTimes");
            return (Criteria) this;
        }

        public Criteria andTransferTimesLike(String value) {
            addCriterion("TRANSFER_TIMES like", value, "transferTimes");
            return (Criteria) this;
        }

        public Criteria andTransferTimesNotLike(String value) {
            addCriterion("TRANSFER_TIMES not like", value, "transferTimes");
            return (Criteria) this;
        }

        public Criteria andTransferTimesIn(List<String> values) {
            addCriterion("TRANSFER_TIMES in", values, "transferTimes");
            return (Criteria) this;
        }

        public Criteria andTransferTimesNotIn(List<String> values) {
            addCriterion("TRANSFER_TIMES not in", values, "transferTimes");
            return (Criteria) this;
        }

        public Criteria andTransferTimesBetween(String value1, String value2) {
            addCriterion("TRANSFER_TIMES between", value1, value2, "transferTimes");
            return (Criteria) this;
        }

        public Criteria andTransferTimesNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_TIMES not between", value1, value2, "transferTimes");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoIsNull() {
            addCriterion("CAR_FRAME_NO is null");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoIsNotNull() {
            addCriterion("CAR_FRAME_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoEqualTo(String value) {
            addCriterion("CAR_FRAME_NO =", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoNotEqualTo(String value) {
            addCriterion("CAR_FRAME_NO <>", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoGreaterThan(String value) {
            addCriterion("CAR_FRAME_NO >", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_FRAME_NO >=", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoLessThan(String value) {
            addCriterion("CAR_FRAME_NO <", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoLessThanOrEqualTo(String value) {
            addCriterion("CAR_FRAME_NO <=", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoLike(String value) {
            addCriterion("CAR_FRAME_NO like", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoNotLike(String value) {
            addCriterion("CAR_FRAME_NO not like", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoIn(List<String> values) {
            addCriterion("CAR_FRAME_NO in", values, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoNotIn(List<String> values) {
            addCriterion("CAR_FRAME_NO not in", values, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoBetween(String value1, String value2) {
            addCriterion("CAR_FRAME_NO between", value1, value2, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoNotBetween(String value1, String value2) {
            addCriterion("CAR_FRAME_NO not between", value1, value2, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarEngineNoIsNull() {
            addCriterion("CAR_ENGINE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCarEngineNoIsNotNull() {
            addCriterion("CAR_ENGINE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCarEngineNoEqualTo(String value) {
            addCriterion("CAR_ENGINE_NO =", value, "carEngineNo");
            return (Criteria) this;
        }

        public Criteria andCarEngineNoNotEqualTo(String value) {
            addCriterion("CAR_ENGINE_NO <>", value, "carEngineNo");
            return (Criteria) this;
        }

        public Criteria andCarEngineNoGreaterThan(String value) {
            addCriterion("CAR_ENGINE_NO >", value, "carEngineNo");
            return (Criteria) this;
        }

        public Criteria andCarEngineNoGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_ENGINE_NO >=", value, "carEngineNo");
            return (Criteria) this;
        }

        public Criteria andCarEngineNoLessThan(String value) {
            addCriterion("CAR_ENGINE_NO <", value, "carEngineNo");
            return (Criteria) this;
        }

        public Criteria andCarEngineNoLessThanOrEqualTo(String value) {
            addCriterion("CAR_ENGINE_NO <=", value, "carEngineNo");
            return (Criteria) this;
        }

        public Criteria andCarEngineNoLike(String value) {
            addCriterion("CAR_ENGINE_NO like", value, "carEngineNo");
            return (Criteria) this;
        }

        public Criteria andCarEngineNoNotLike(String value) {
            addCriterion("CAR_ENGINE_NO not like", value, "carEngineNo");
            return (Criteria) this;
        }

        public Criteria andCarEngineNoIn(List<String> values) {
            addCriterion("CAR_ENGINE_NO in", values, "carEngineNo");
            return (Criteria) this;
        }

        public Criteria andCarEngineNoNotIn(List<String> values) {
            addCriterion("CAR_ENGINE_NO not in", values, "carEngineNo");
            return (Criteria) this;
        }

        public Criteria andCarEngineNoBetween(String value1, String value2) {
            addCriterion("CAR_ENGINE_NO between", value1, value2, "carEngineNo");
            return (Criteria) this;
        }

        public Criteria andCarEngineNoNotBetween(String value1, String value2) {
            addCriterion("CAR_ENGINE_NO not between", value1, value2, "carEngineNo");
            return (Criteria) this;
        }

        public Criteria andCarColorIsNull() {
            addCriterion("CAR_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andCarColorIsNotNull() {
            addCriterion("CAR_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andCarColorEqualTo(String value) {
            addCriterion("CAR_COLOR =", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotEqualTo(String value) {
            addCriterion("CAR_COLOR <>", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorGreaterThan(String value) {
            addCriterion("CAR_COLOR >", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_COLOR >=", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorLessThan(String value) {
            addCriterion("CAR_COLOR <", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorLessThanOrEqualTo(String value) {
            addCriterion("CAR_COLOR <=", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorLike(String value) {
            addCriterion("CAR_COLOR like", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotLike(String value) {
            addCriterion("CAR_COLOR not like", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorIn(List<String> values) {
            addCriterion("CAR_COLOR in", values, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotIn(List<String> values) {
            addCriterion("CAR_COLOR not in", values, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorBetween(String value1, String value2) {
            addCriterion("CAR_COLOR between", value1, value2, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotBetween(String value1, String value2) {
            addCriterion("CAR_COLOR not between", value1, value2, "carColor");
            return (Criteria) this;
        }

        public Criteria andTravelMileageIsNull() {
            addCriterion("TRAVEL_MILEAGE is null");
            return (Criteria) this;
        }

        public Criteria andTravelMileageIsNotNull() {
            addCriterion("TRAVEL_MILEAGE is not null");
            return (Criteria) this;
        }

        public Criteria andTravelMileageEqualTo(BigDecimal value) {
            addCriterion("TRAVEL_MILEAGE =", value, "travelMileage");
            return (Criteria) this;
        }

        public Criteria andTravelMileageNotEqualTo(BigDecimal value) {
            addCriterion("TRAVEL_MILEAGE <>", value, "travelMileage");
            return (Criteria) this;
        }

        public Criteria andTravelMileageGreaterThan(BigDecimal value) {
            addCriterion("TRAVEL_MILEAGE >", value, "travelMileage");
            return (Criteria) this;
        }

        public Criteria andTravelMileageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRAVEL_MILEAGE >=", value, "travelMileage");
            return (Criteria) this;
        }

        public Criteria andTravelMileageLessThan(BigDecimal value) {
            addCriterion("TRAVEL_MILEAGE <", value, "travelMileage");
            return (Criteria) this;
        }

        public Criteria andTravelMileageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRAVEL_MILEAGE <=", value, "travelMileage");
            return (Criteria) this;
        }

        public Criteria andTravelMileageIn(List<BigDecimal> values) {
            addCriterion("TRAVEL_MILEAGE in", values, "travelMileage");
            return (Criteria) this;
        }

        public Criteria andTravelMileageNotIn(List<BigDecimal> values) {
            addCriterion("TRAVEL_MILEAGE not in", values, "travelMileage");
            return (Criteria) this;
        }

        public Criteria andTravelMileageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRAVEL_MILEAGE between", value1, value2, "travelMileage");
            return (Criteria) this;
        }

        public Criteria andTravelMileageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRAVEL_MILEAGE not between", value1, value2, "travelMileage");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIsNull() {
            addCriterion("PURCHASE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIsNotNull() {
            addCriterion("PURCHASE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_TIME =", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_TIME <>", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("PURCHASE_TIME >", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_TIME >=", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeLessThan(Date value) {
            addCriterionForJDBCDate("PURCHASE_TIME <", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_TIME <=", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIn(List<Date> values) {
            addCriterionForJDBCDate("PURCHASE_TIME in", values, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("PURCHASE_TIME not in", values, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PURCHASE_TIME between", value1, value2, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PURCHASE_TIME not between", value1, value2, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtIsNull() {
            addCriterion("PURCHASE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtIsNotNull() {
            addCriterion("PURCHASE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_AMT =", value, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtNotEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_AMT <>", value, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtGreaterThan(BigDecimal value) {
            addCriterion("PURCHASE_AMT >", value, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_AMT >=", value, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtLessThan(BigDecimal value) {
            addCriterion("PURCHASE_AMT <", value, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_AMT <=", value, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_AMT in", values, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtNotIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_AMT not in", values, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_AMT between", value1, value2, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_AMT not between", value1, value2, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNull() {
            addCriterion("CAR_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNotNull() {
            addCriterion("CAR_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCarPriceEqualTo(BigDecimal value) {
            addCriterion("CAR_PRICE =", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotEqualTo(BigDecimal value) {
            addCriterion("CAR_PRICE <>", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThan(BigDecimal value) {
            addCriterion("CAR_PRICE >", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CAR_PRICE >=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThan(BigDecimal value) {
            addCriterion("CAR_PRICE <", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CAR_PRICE <=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceIn(List<BigDecimal> values) {
            addCriterion("CAR_PRICE in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotIn(List<BigDecimal> values) {
            addCriterion("CAR_PRICE not in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAR_PRICE between", value1, value2, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAR_PRICE not between", value1, value2, "carPrice");
            return (Criteria) this;
        }

        public Criteria andLoanAmtIsNull() {
            addCriterion("LOAN_AMT is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmtIsNotNull() {
            addCriterion("LOAN_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmtEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMT =", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtNotEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMT <>", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtGreaterThan(BigDecimal value) {
            addCriterion("LOAN_AMT >", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMT >=", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtLessThan(BigDecimal value) {
            addCriterion("LOAN_AMT <", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMT <=", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtIn(List<BigDecimal> values) {
            addCriterion("LOAN_AMT in", values, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtNotIn(List<BigDecimal> values) {
            addCriterion("LOAN_AMT not in", values, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOAN_AMT between", value1, value2, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOAN_AMT not between", value1, value2, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andBizDateIsNull() {
            addCriterion("BIZ_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBizDateIsNotNull() {
            addCriterion("BIZ_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBizDateEqualTo(Date value) {
            addCriterionForJDBCDate("BIZ_DATE =", value, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIZ_DATE <>", value, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateGreaterThan(Date value) {
            addCriterionForJDBCDate("BIZ_DATE >", value, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIZ_DATE >=", value, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateLessThan(Date value) {
            addCriterionForJDBCDate("BIZ_DATE <", value, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIZ_DATE <=", value, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateIn(List<Date> values) {
            addCriterionForJDBCDate("BIZ_DATE in", values, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIZ_DATE not in", values, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIZ_DATE between", value1, value2, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIZ_DATE not between", value1, value2, "bizDate");
            return (Criteria) this;
        }

        public Criteria andAccessedValueIsNull() {
            addCriterion("ACCESSED_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andAccessedValueIsNotNull() {
            addCriterion("ACCESSED_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andAccessedValueEqualTo(BigDecimal value) {
            addCriterion("ACCESSED_VALUE =", value, "accessedValue");
            return (Criteria) this;
        }

        public Criteria andAccessedValueNotEqualTo(BigDecimal value) {
            addCriterion("ACCESSED_VALUE <>", value, "accessedValue");
            return (Criteria) this;
        }

        public Criteria andAccessedValueGreaterThan(BigDecimal value) {
            addCriterion("ACCESSED_VALUE >", value, "accessedValue");
            return (Criteria) this;
        }

        public Criteria andAccessedValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCESSED_VALUE >=", value, "accessedValue");
            return (Criteria) this;
        }

        public Criteria andAccessedValueLessThan(BigDecimal value) {
            addCriterion("ACCESSED_VALUE <", value, "accessedValue");
            return (Criteria) this;
        }

        public Criteria andAccessedValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCESSED_VALUE <=", value, "accessedValue");
            return (Criteria) this;
        }

        public Criteria andAccessedValueIn(List<BigDecimal> values) {
            addCriterion("ACCESSED_VALUE in", values, "accessedValue");
            return (Criteria) this;
        }

        public Criteria andAccessedValueNotIn(List<BigDecimal> values) {
            addCriterion("ACCESSED_VALUE not in", values, "accessedValue");
            return (Criteria) this;
        }

        public Criteria andAccessedValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCESSED_VALUE between", value1, value2, "accessedValue");
            return (Criteria) this;
        }

        public Criteria andAccessedValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCESSED_VALUE not between", value1, value2, "accessedValue");
            return (Criteria) this;
        }

        public Criteria andMortgageIndIsNull() {
            addCriterion("MORTGAGE_IND is null");
            return (Criteria) this;
        }

        public Criteria andMortgageIndIsNotNull() {
            addCriterion("MORTGAGE_IND is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageIndEqualTo(String value) {
            addCriterion("MORTGAGE_IND =", value, "mortgageInd");
            return (Criteria) this;
        }

        public Criteria andMortgageIndNotEqualTo(String value) {
            addCriterion("MORTGAGE_IND <>", value, "mortgageInd");
            return (Criteria) this;
        }

        public Criteria andMortgageIndGreaterThan(String value) {
            addCriterion("MORTGAGE_IND >", value, "mortgageInd");
            return (Criteria) this;
        }

        public Criteria andMortgageIndGreaterThanOrEqualTo(String value) {
            addCriterion("MORTGAGE_IND >=", value, "mortgageInd");
            return (Criteria) this;
        }

        public Criteria andMortgageIndLessThan(String value) {
            addCriterion("MORTGAGE_IND <", value, "mortgageInd");
            return (Criteria) this;
        }

        public Criteria andMortgageIndLessThanOrEqualTo(String value) {
            addCriterion("MORTGAGE_IND <=", value, "mortgageInd");
            return (Criteria) this;
        }

        public Criteria andMortgageIndLike(String value) {
            addCriterion("MORTGAGE_IND like", value, "mortgageInd");
            return (Criteria) this;
        }

        public Criteria andMortgageIndNotLike(String value) {
            addCriterion("MORTGAGE_IND not like", value, "mortgageInd");
            return (Criteria) this;
        }

        public Criteria andMortgageIndIn(List<String> values) {
            addCriterion("MORTGAGE_IND in", values, "mortgageInd");
            return (Criteria) this;
        }

        public Criteria andMortgageIndNotIn(List<String> values) {
            addCriterion("MORTGAGE_IND not in", values, "mortgageInd");
            return (Criteria) this;
        }

        public Criteria andMortgageIndBetween(String value1, String value2) {
            addCriterion("MORTGAGE_IND between", value1, value2, "mortgageInd");
            return (Criteria) this;
        }

        public Criteria andMortgageIndNotBetween(String value1, String value2) {
            addCriterion("MORTGAGE_IND not between", value1, value2, "mortgageInd");
            return (Criteria) this;
        }

        public Criteria andReturnAmtIsNull() {
            addCriterion("RETURN_AMT is null");
            return (Criteria) this;
        }

        public Criteria andReturnAmtIsNotNull() {
            addCriterion("RETURN_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andReturnAmtEqualTo(BigDecimal value) {
            addCriterion("RETURN_AMT =", value, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtNotEqualTo(BigDecimal value) {
            addCriterion("RETURN_AMT <>", value, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtGreaterThan(BigDecimal value) {
            addCriterion("RETURN_AMT >", value, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_AMT >=", value, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtLessThan(BigDecimal value) {
            addCriterion("RETURN_AMT <", value, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_AMT <=", value, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtIn(List<BigDecimal> values) {
            addCriterion("RETURN_AMT in", values, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtNotIn(List<BigDecimal> values) {
            addCriterion("RETURN_AMT not in", values, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_AMT between", value1, value2, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_AMT not between", value1, value2, "returnAmt");
            return (Criteria) this;
        }

        public Criteria andReturnMerFeeIsNull() {
            addCriterion("RETURN_MER_FEE is null");
            return (Criteria) this;
        }

        public Criteria andReturnMerFeeIsNotNull() {
            addCriterion("RETURN_MER_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMerFeeEqualTo(BigDecimal value) {
            addCriterion("RETURN_MER_FEE =", value, "returnMerFee");
            return (Criteria) this;
        }

        public Criteria andReturnMerFeeNotEqualTo(BigDecimal value) {
            addCriterion("RETURN_MER_FEE <>", value, "returnMerFee");
            return (Criteria) this;
        }

        public Criteria andReturnMerFeeGreaterThan(BigDecimal value) {
            addCriterion("RETURN_MER_FEE >", value, "returnMerFee");
            return (Criteria) this;
        }

        public Criteria andReturnMerFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_MER_FEE >=", value, "returnMerFee");
            return (Criteria) this;
        }

        public Criteria andReturnMerFeeLessThan(BigDecimal value) {
            addCriterion("RETURN_MER_FEE <", value, "returnMerFee");
            return (Criteria) this;
        }

        public Criteria andReturnMerFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_MER_FEE <=", value, "returnMerFee");
            return (Criteria) this;
        }

        public Criteria andReturnMerFeeIn(List<BigDecimal> values) {
            addCriterion("RETURN_MER_FEE in", values, "returnMerFee");
            return (Criteria) this;
        }

        public Criteria andReturnMerFeeNotIn(List<BigDecimal> values) {
            addCriterion("RETURN_MER_FEE not in", values, "returnMerFee");
            return (Criteria) this;
        }

        public Criteria andReturnMerFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_MER_FEE between", value1, value2, "returnMerFee");
            return (Criteria) this;
        }

        public Criteria andReturnMerFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_MER_FEE not between", value1, value2, "returnMerFee");
            return (Criteria) this;
        }

        public Criteria andReturnIndIsNull() {
            addCriterion("RETURN_IND is null");
            return (Criteria) this;
        }

        public Criteria andReturnIndIsNotNull() {
            addCriterion("RETURN_IND is not null");
            return (Criteria) this;
        }

        public Criteria andReturnIndEqualTo(String value) {
            addCriterion("RETURN_IND =", value, "returnInd");
            return (Criteria) this;
        }

        public Criteria andReturnIndNotEqualTo(String value) {
            addCriterion("RETURN_IND <>", value, "returnInd");
            return (Criteria) this;
        }

        public Criteria andReturnIndGreaterThan(String value) {
            addCriterion("RETURN_IND >", value, "returnInd");
            return (Criteria) this;
        }

        public Criteria andReturnIndGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_IND >=", value, "returnInd");
            return (Criteria) this;
        }

        public Criteria andReturnIndLessThan(String value) {
            addCriterion("RETURN_IND <", value, "returnInd");
            return (Criteria) this;
        }

        public Criteria andReturnIndLessThanOrEqualTo(String value) {
            addCriterion("RETURN_IND <=", value, "returnInd");
            return (Criteria) this;
        }

        public Criteria andReturnIndLike(String value) {
            addCriterion("RETURN_IND like", value, "returnInd");
            return (Criteria) this;
        }

        public Criteria andReturnIndNotLike(String value) {
            addCriterion("RETURN_IND not like", value, "returnInd");
            return (Criteria) this;
        }

        public Criteria andReturnIndIn(List<String> values) {
            addCriterion("RETURN_IND in", values, "returnInd");
            return (Criteria) this;
        }

        public Criteria andReturnIndNotIn(List<String> values) {
            addCriterion("RETURN_IND not in", values, "returnInd");
            return (Criteria) this;
        }

        public Criteria andReturnIndBetween(String value1, String value2) {
            addCriterion("RETURN_IND between", value1, value2, "returnInd");
            return (Criteria) this;
        }

        public Criteria andReturnIndNotBetween(String value1, String value2) {
            addCriterion("RETURN_IND not between", value1, value2, "returnInd");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNull() {
            addCriterion("RETURN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNotNull() {
            addCriterion("RETURN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDateEqualTo(Date value) {
            addCriterionForJDBCDate("RETURN_DATE =", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("RETURN_DATE <>", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThan(Date value) {
            addCriterionForJDBCDate("RETURN_DATE >", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RETURN_DATE >=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThan(Date value) {
            addCriterionForJDBCDate("RETURN_DATE <", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RETURN_DATE <=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIn(List<Date> values) {
            addCriterionForJDBCDate("RETURN_DATE in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("RETURN_DATE not in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RETURN_DATE between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RETURN_DATE not between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andBizTimeIsNull() {
            addCriterion("BIZ_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBizTimeIsNotNull() {
            addCriterion("BIZ_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBizTimeEqualTo(Date value) {
            addCriterion("BIZ_TIME =", value, "bizTime");
            return (Criteria) this;
        }

        public Criteria andBizTimeNotEqualTo(Date value) {
            addCriterion("BIZ_TIME <>", value, "bizTime");
            return (Criteria) this;
        }

        public Criteria andBizTimeGreaterThan(Date value) {
            addCriterion("BIZ_TIME >", value, "bizTime");
            return (Criteria) this;
        }

        public Criteria andBizTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BIZ_TIME >=", value, "bizTime");
            return (Criteria) this;
        }

        public Criteria andBizTimeLessThan(Date value) {
            addCriterion("BIZ_TIME <", value, "bizTime");
            return (Criteria) this;
        }

        public Criteria andBizTimeLessThanOrEqualTo(Date value) {
            addCriterion("BIZ_TIME <=", value, "bizTime");
            return (Criteria) this;
        }

        public Criteria andBizTimeIn(List<Date> values) {
            addCriterion("BIZ_TIME in", values, "bizTime");
            return (Criteria) this;
        }

        public Criteria andBizTimeNotIn(List<Date> values) {
            addCriterion("BIZ_TIME not in", values, "bizTime");
            return (Criteria) this;
        }

        public Criteria andBizTimeBetween(Date value1, Date value2) {
            addCriterion("BIZ_TIME between", value1, value2, "bizTime");
            return (Criteria) this;
        }

        public Criteria andBizTimeNotBetween(Date value1, Date value2) {
            addCriterion("BIZ_TIME not between", value1, value2, "bizTime");
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

        public Criteria andLstUpdTimeIsNull() {
            addCriterion("LST_UPD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeIsNotNull() {
            addCriterion("LST_UPD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeEqualTo(Date value) {
            addCriterion("LST_UPD_TIME =", value, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeNotEqualTo(Date value) {
            addCriterion("LST_UPD_TIME <>", value, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeGreaterThan(Date value) {
            addCriterion("LST_UPD_TIME >", value, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LST_UPD_TIME >=", value, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeLessThan(Date value) {
            addCriterion("LST_UPD_TIME <", value, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("LST_UPD_TIME <=", value, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeIn(List<Date> values) {
            addCriterion("LST_UPD_TIME in", values, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeNotIn(List<Date> values) {
            addCriterion("LST_UPD_TIME not in", values, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeBetween(Date value1, Date value2) {
            addCriterion("LST_UPD_TIME between", value1, value2, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("LST_UPD_TIME not between", value1, value2, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserIsNull() {
            addCriterion("LST_UPD_USER is null");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserIsNotNull() {
            addCriterion("LST_UPD_USER is not null");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserEqualTo(String value) {
            addCriterion("LST_UPD_USER =", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserNotEqualTo(String value) {
            addCriterion("LST_UPD_USER <>", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserGreaterThan(String value) {
            addCriterion("LST_UPD_USER >", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserGreaterThanOrEqualTo(String value) {
            addCriterion("LST_UPD_USER >=", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserLessThan(String value) {
            addCriterion("LST_UPD_USER <", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserLessThanOrEqualTo(String value) {
            addCriterion("LST_UPD_USER <=", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserLike(String value) {
            addCriterion("LST_UPD_USER like", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserNotLike(String value) {
            addCriterion("LST_UPD_USER not like", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserIn(List<String> values) {
            addCriterion("LST_UPD_USER in", values, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserNotIn(List<String> values) {
            addCriterion("LST_UPD_USER not in", values, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserBetween(String value1, String value2) {
            addCriterion("LST_UPD_USER between", value1, value2, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserNotBetween(String value1, String value2) {
            addCriterion("LST_UPD_USER not between", value1, value2, "lstUpdUser");
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