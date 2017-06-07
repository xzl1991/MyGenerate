package entity;

import java.math.BigDecimal;
import java.util.Date;

public class ErmasCar {
    private Long cardId;

    private String org;

    private Long acctNbr;

    private String acctType;

    private String applicationNo;

    private String contrNbr;

    private String dealerId;

    private String dealerName;

    private String dealerCompanyId;

    private String dealerCompanyName;

    private String dealerMobileNo;

    private String storeNo;

    private String carBrand;

    private String carLicenseNo;

    private String carModelNo;

    private String transferTimes;

    private String carFrameNo;

    private String carEngineNo;

    private String carColor;

    private BigDecimal travelMileage;

    private Date purchaseTime;

    private BigDecimal purchaseAmt;

    private BigDecimal carPrice;

    private BigDecimal loanAmt;

    private Date bizDate;

    private BigDecimal accessedValue;

    private String mortgageInd;

    private BigDecimal returnAmt;

    private BigDecimal returnMerFee;

    private String returnInd;

    private Date returnDate;

    private Date bizTime;

    private Date createTime;

    private String createUser;

    private Date lstUpdTime;

    private String lstUpdUser;

    private Long jpaVersion;

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org == null ? null : org.trim();
    }

    public Long getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(Long acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType == null ? null : acctType.trim();
    }

    public String getApplicationNo() {
        return applicationNo;
    }

    public void setApplicationNo(String applicationNo) {
        this.applicationNo = applicationNo == null ? null : applicationNo.trim();
    }

    public String getContrNbr() {
        return contrNbr;
    }

    public void setContrNbr(String contrNbr) {
        this.contrNbr = contrNbr == null ? null : contrNbr.trim();
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId == null ? null : dealerId.trim();
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName == null ? null : dealerName.trim();
    }

    public String getDealerCompanyId() {
        return dealerCompanyId;
    }

    public void setDealerCompanyId(String dealerCompanyId) {
        this.dealerCompanyId = dealerCompanyId == null ? null : dealerCompanyId.trim();
    }

    public String getDealerCompanyName() {
        return dealerCompanyName;
    }

    public void setDealerCompanyName(String dealerCompanyName) {
        this.dealerCompanyName = dealerCompanyName == null ? null : dealerCompanyName.trim();
    }

    public String getDealerMobileNo() {
        return dealerMobileNo;
    }

    public void setDealerMobileNo(String dealerMobileNo) {
        this.dealerMobileNo = dealerMobileNo == null ? null : dealerMobileNo.trim();
    }

    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo == null ? null : storeNo.trim();
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand == null ? null : carBrand.trim();
    }

    public String getCarLicenseNo() {
        return carLicenseNo;
    }

    public void setCarLicenseNo(String carLicenseNo) {
        this.carLicenseNo = carLicenseNo == null ? null : carLicenseNo.trim();
    }

    public String getCarModelNo() {
        return carModelNo;
    }

    public void setCarModelNo(String carModelNo) {
        this.carModelNo = carModelNo == null ? null : carModelNo.trim();
    }

    public String getTransferTimes() {
        return transferTimes;
    }

    public void setTransferTimes(String transferTimes) {
        this.transferTimes = transferTimes == null ? null : transferTimes.trim();
    }

    public String getCarFrameNo() {
        return carFrameNo;
    }

    public void setCarFrameNo(String carFrameNo) {
        this.carFrameNo = carFrameNo == null ? null : carFrameNo.trim();
    }

    public String getCarEngineNo() {
        return carEngineNo;
    }

    public void setCarEngineNo(String carEngineNo) {
        this.carEngineNo = carEngineNo == null ? null : carEngineNo.trim();
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor == null ? null : carColor.trim();
    }

    public BigDecimal getTravelMileage() {
        return travelMileage;
    }

    public void setTravelMileage(BigDecimal travelMileage) {
        this.travelMileage = travelMileage;
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public BigDecimal getPurchaseAmt() {
        return purchaseAmt;
    }

    public void setPurchaseAmt(BigDecimal purchaseAmt) {
        this.purchaseAmt = purchaseAmt;
    }

    public BigDecimal getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(BigDecimal carPrice) {
        this.carPrice = carPrice;
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public Date getBizDate() {
        return bizDate;
    }

    public void setBizDate(Date bizDate) {
        this.bizDate = bizDate;
    }

    public BigDecimal getAccessedValue() {
        return accessedValue;
    }

    public void setAccessedValue(BigDecimal accessedValue) {
        this.accessedValue = accessedValue;
    }

    public String getMortgageInd() {
        return mortgageInd;
    }

    public void setMortgageInd(String mortgageInd) {
        this.mortgageInd = mortgageInd == null ? null : mortgageInd.trim();
    }

    public BigDecimal getReturnAmt() {
        return returnAmt;
    }

    public void setReturnAmt(BigDecimal returnAmt) {
        this.returnAmt = returnAmt;
    }

    public BigDecimal getReturnMerFee() {
        return returnMerFee;
    }

    public void setReturnMerFee(BigDecimal returnMerFee) {
        this.returnMerFee = returnMerFee;
    }

    public String getReturnInd() {
        return returnInd;
    }

    public void setReturnInd(String returnInd) {
        this.returnInd = returnInd == null ? null : returnInd.trim();
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Date getBizTime() {
        return bizTime;
    }

    public void setBizTime(Date bizTime) {
        this.bizTime = bizTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getLstUpdTime() {
        return lstUpdTime;
    }

    public void setLstUpdTime(Date lstUpdTime) {
        this.lstUpdTime = lstUpdTime;
    }

    public String getLstUpdUser() {
        return lstUpdUser;
    }

    public void setLstUpdUser(String lstUpdUser) {
        this.lstUpdUser = lstUpdUser == null ? null : lstUpdUser.trim();
    }

    public Long getJpaVersion() {
        return jpaVersion;
    }

    public void setJpaVersion(Long jpaVersion) {
        this.jpaVersion = jpaVersion;
    }
}