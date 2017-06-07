package entity;

import java.math.BigDecimal;
import java.util.Date;

public class ErmasCaseMain {
    private Long acctNbr;

    private String org;

    private Long custId;

    private String name;

    private String idNo;

    private String idType;

    private String gender;

    private String mobileNo;

    private String email;

    private String preFunctionCode;

    private String functionCode;

    private String createUser;

    private Date createTime;

    private Date collectInDate;

    private Date collectOutDate;

    private String collectFlag;

    private Date lastCollTime;

    private String loanProdGroup;

    private Long jpaVersion;

    private Integer overDueDays;

    private BigDecimal passDueAmt;

    private Date batchDate;

    private String serialCaseStatus;

    private String caseInfoTruth;

    private Integer maxOverDueDays;

    private BigDecimal maxPassDueAmt;

    public Long getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(Long acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org == null ? null : org.trim();
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPreFunctionCode() {
        return preFunctionCode;
    }

    public void setPreFunctionCode(String preFunctionCode) {
        this.preFunctionCode = preFunctionCode == null ? null : preFunctionCode.trim();
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode == null ? null : functionCode.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCollectInDate() {
        return collectInDate;
    }

    public void setCollectInDate(Date collectInDate) {
        this.collectInDate = collectInDate;
    }

    public Date getCollectOutDate() {
        return collectOutDate;
    }

    public void setCollectOutDate(Date collectOutDate) {
        this.collectOutDate = collectOutDate;
    }

    public String getCollectFlag() {
        return collectFlag;
    }

    public void setCollectFlag(String collectFlag) {
        this.collectFlag = collectFlag == null ? null : collectFlag.trim();
    }

    public Date getLastCollTime() {
        return lastCollTime;
    }

    public void setLastCollTime(Date lastCollTime) {
        this.lastCollTime = lastCollTime;
    }

    public String getLoanProdGroup() {
        return loanProdGroup;
    }

    public void setLoanProdGroup(String loanProdGroup) {
        this.loanProdGroup = loanProdGroup == null ? null : loanProdGroup.trim();
    }

    public Long getJpaVersion() {
        return jpaVersion;
    }

    public void setJpaVersion(Long jpaVersion) {
        this.jpaVersion = jpaVersion;
    }

    public Integer getOverDueDays() {
        return overDueDays;
    }

    public void setOverDueDays(Integer overDueDays) {
        this.overDueDays = overDueDays;
    }

    public BigDecimal getPassDueAmt() {
        return passDueAmt;
    }

    public void setPassDueAmt(BigDecimal passDueAmt) {
        this.passDueAmt = passDueAmt;
    }

    public Date getBatchDate() {
        return batchDate;
    }

    public void setBatchDate(Date batchDate) {
        this.batchDate = batchDate;
    }

    public String getSerialCaseStatus() {
        return serialCaseStatus;
    }

    public void setSerialCaseStatus(String serialCaseStatus) {
        this.serialCaseStatus = serialCaseStatus == null ? null : serialCaseStatus.trim();
    }

    public String getCaseInfoTruth() {
        return caseInfoTruth;
    }

    public void setCaseInfoTruth(String caseInfoTruth) {
        this.caseInfoTruth = caseInfoTruth == null ? null : caseInfoTruth.trim();
    }

    public Integer getMaxOverDueDays() {
        return maxOverDueDays;
    }

    public void setMaxOverDueDays(Integer maxOverDueDays) {
        this.maxOverDueDays = maxOverDueDays;
    }

    public BigDecimal getMaxPassDueAmt() {
        return maxPassDueAmt;
    }

    public void setMaxPassDueAmt(BigDecimal maxPassDueAmt) {
        this.maxPassDueAmt = maxPassDueAmt;
    }
}