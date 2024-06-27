package com.groupc.indv.model;

import com.groupc.indv.enums.CreditPurposeType;
import com.groupc.indv.enums.CreditPurposeTypeDescription;
import com.groupc.indv.enums.CreditStage;
import com.groupc.indv.enums.CreditRequestType;

public class ApplicationSegment {

	private InquiryUniqueRefNumber inquiryUniqueRefNo;

	private String creditRptID;

	private CreditRequestType creditReqType;

	private String creditRepetitionTransactionID;

	private CreditPurposeType creditInquiryPurposeType;

	private CreditPurposeTypeDescription creditInquiryPurposeTypeDescription;

	private CreditStage creditInquiryStage;

	private String creditRepetitionTransactionDateAndTime;

	/*
	 * Multibank Reporting (MBR) • Enables review of account information regardless
	 * of which bank holds the funds. • Account information can includes previous
	 * day and summary balances history. • The user has the ability to print ad-hoc
	 * account statement for a specific period of time. • Ability to Import and
	 * export data in a BAI2 (aka BAI) formatted file. • Graphically display of the
	 * cash position for up-to the prior 30-days from all the business accounts.
	 */
	private String mbrId;

	/*
	 * Name/number of requesting centre/Kendra
	 */
	private String kendraId;

	private String branchId;

	/*
	 * A loan origination system (“LOS”) is technology that helps financial
	 * institutions generate loan documentation in a way that complies with
	 * regulator e and internal requirements.
	 */
	private String losApplicantId;

	private Long loanAmount;
}
