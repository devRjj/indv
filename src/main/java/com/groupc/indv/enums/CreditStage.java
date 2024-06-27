package com.groupc.indv.enums;

public enum CreditStage {
    PRE_SCREEN("Pre-Screen"),
    PRE_DISB("Pre-Disbursement"),
    UW_REVIEW("Underwriting Review"),
    COLLECTION("Collection"),
    RENEWAL("Renewal");

    private final String description;

    private CreditStage(String description) {
        this.description = description;
    }
}
