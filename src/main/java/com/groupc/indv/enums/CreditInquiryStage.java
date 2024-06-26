package com.groupc.indv.enums;

public enum CreditInquiryStage {
    PRE_SCREEN("Pre-Screen"),
    PRE_DISB("Pre-Disbursement"),
    UW_REVIEW("Underwriting Review"),
    COLLECTION("Collection"),
    RENEWAL("Renewal");

    private final String description;

    private CreditInquiryStage(String description) {
        this.description = description;
    }
}
