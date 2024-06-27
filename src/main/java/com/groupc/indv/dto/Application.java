package com.groupc.indv.dto;

import com.groupc.indv.enums.CreditPurposeType;

public class Application {

	private CreditPurposeType creditPurposeType;
	private String loanType;
	private String loanAmount;
	private String customerId;
	private String leadId;
	private String source;
	private String bureauTransactionId;
	
	public CreditPurposeType getCreditPurposeType() {
		return creditPurposeType;
	}
	public void setCreditPurposeType(CreditPurposeType creditPurposeType) {
		this.creditPurposeType = creditPurposeType;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getLoadId() {
		return leadId;
	}
	public void setLoadId(String leadId) {
		this.leadId = leadId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getBureauTransactionId() {
		return bureauTransactionId;
	}
	public void setBureauTransactionId(String bureauTransactionId) {
		this.bureauTransactionId = bureauTransactionId;
	}
	
}
