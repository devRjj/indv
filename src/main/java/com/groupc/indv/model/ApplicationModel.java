package com.groupc.indv.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.groupc.indv.enums.CreditPurposeType;
import com.groupc.indv.enums.CreditPurposeTypeDescription;
import com.groupc.indv.enums.CreditStage;
import com.groupc.indv.enums.CreditRequestType;

@Entity
@Table(name = "application")
public class ApplicationModel {

    private String inquiryUniqueRefNo;
    private String creditRepetitionTransactionID;
    private CreditPurposeType creditInquiryPurposeType;
    private CreditPurposeTypeDescription creditInquiryPurposeTypeDescription;
    private CreditStage creditInquiryStage;
    private String creditRepetitionTransactionDateAndTime;
    private String mbrId;
    private String kendraId;
    private String branchId;
    private String losApplicantId;
    private Long loanAmount;
    private String creditRptID;
    private CreditRequestType creditReqType;

    // Getter and setter methods

    public String getInquiryUniqueRefNo() {
        return inquiryUniqueRefNo;
    }

    public void setInquiryUniqueRefNo(String inquiryUniqueRefNo) {
        this.inquiryUniqueRefNo = inquiryUniqueRefNo;
    }

    public String getCreditRptID() {
        return creditRptID;
    }

    public void setCreditRptID(String creditRptID) {
        this.creditRptID = creditRptID;
    }

    public CreditRequestType getCreditReqType() {
        return creditReqType;
    }

    public void setCreditReqType(CreditRequestType creditReqType) {
        this.creditReqType = creditReqType;
    }

    public String getCreditRepetitionTransactionID() {
        return creditRepetitionTransactionID;
    }

    public void setCreditRepetitionTransactionID(String creditRepetitionTransactionID) {
        this.creditRepetitionTransactionID = creditRepetitionTransactionID;
    }

    public CreditPurposeType getCreditInquiryPurposeType() {
        return creditInquiryPurposeType;
    }

    public void setCreditInquiryPurposeType(CreditPurposeType creditInquiryPurposeType) {
        this.creditInquiryPurposeType = creditInquiryPurposeType;
    }

    public CreditPurposeTypeDescription getCreditInquiryPurposeTypeDescription() {
        return creditInquiryPurposeTypeDescription;
    }

    public void setCreditInquiryPurposeTypeDescription(CreditPurposeTypeDescription creditInquiryPurposeTypeDescription) {
        this.creditInquiryPurposeTypeDescription = creditInquiryPurposeTypeDescription;
    }

    public CreditStage getCreditInquiryStage() {
        return creditInquiryStage;
    }

    public void setCreditInquiryStage(CreditStage creditInquiryStage) {
        this.creditInquiryStage = creditInquiryStage;
    }

    public String getCreditRepetitionTransactionDateAndTime() {
        return creditRepetitionTransactionDateAndTime;
    }

    public void setCreditRepetitionTransactionDateAndTime(String creditRepetitionTransactionDateAndTime) {
        this.creditRepetitionTransactionDateAndTime = creditRepetitionTransactionDateAndTime;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId;
    }

    public String getKendraId() {
        return kendraId;
    }

    public void setKendraId(String kendraId) {
        this.kendraId = kendraId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getLosApplicantId() {
        return losApplicantId;
    }

    public void setLosApplicantId(String losApplicantId) {
        this.losApplicantId = losApplicantId;
    }

    public Long getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Long loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String generateUniqueInquiryRefNo() {
        StringBuilder refNo = new StringBuilder();

        // Current date and time
        String dateTime = new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date());
        refNo.append(dateTime);

        // LOS Application ID
        if (losApplicantId != null && !losApplicantId.isEmpty()) {
            refNo.append(losApplicantId);
        }

        // 6-digit random number
        Random random = new Random();
        int randomNumber = 100000 + random.nextInt(900000); // Ensures a 6-digit number
        refNo.append(randomNumber);

        // Member ID if LOS Application ID is not available
        if ((losApplicantId == null || losApplicantId.isEmpty()) && mbrId != null) {
            refNo.insert(0, mbrId);
        }

        return refNo.toString();
    }
}