package com.groupc.indv.utils;

import com.groupc.indv.dto.ApplicationDto;
import com.groupc.indv.model.ApplicationModel;

public class ApplicationConverter {

    // Convert ApplicationDto to ApplicationModel
    public static ApplicationModel toModel(ApplicationDto dto) {
        ApplicationModel model = new ApplicationModel();
        
        model.setInquiryUniqueRefNo(dto.getInquiryUniqueRefNo() != null ? dto.getInquiryUniqueRefNo() : null);
        model.setCreditRepetitionTransactionID(dto.getCreditRepetitionTransactionID());
        model.setCreditInquiryPurposeType(dto.getCreditInquiryPurposeType());
        model.setCreditInquiryPurposeTypeDescription(dto.getCreditInquiryPurposeTypeDescription());
        model.setCreditInquiryStage(dto.getCreditInquiryStage());
        model.setCreditRepetitionTransactionDateAndTime(dto.getCreditRepetitionTransactionDateAndTime());
        model.setMbrId(dto.getMbrId());
        model.setKendraId(dto.getKendraId());
        model.setBranchId(dto.getBranchId());
        model.setLosApplicantId(dto.getLosApplicantId());
        model.setLoanAmount(dto.getLoanAmount());
        model.setCreditRptID(dto.getCreditRptID());
        model.setCreditReqType(dto.getCreditReqType());
        
        return model;
    }

    // Convert ApplicationModel to ApplicationDto
    public static ApplicationDto toDto(ApplicationModel model) {
        ApplicationDto dto = new ApplicationDto();
        
        dto.setInquiryUniqueRefNo(model.getInquiryUniqueRefNo() != null ? model.getInquiryUniqueRefNo().toString() : null);
        dto.setCreditRepetitionTransactionID(model.getCreditRepetitionTransactionID());
        dto.setCreditInquiryPurposeType(model.getCreditInquiryPurposeType());
        dto.setCreditInquiryPurposeTypeDescription(model.getCreditInquiryPurposeTypeDescription());
        dto.setCreditInquiryStage(model.getCreditInquiryStage());
        dto.setCreditRepetitionTransactionDateAndTime(model.getCreditRepetitionTransactionDateAndTime());
        dto.setMbrId(model.getMbrId());
        dto.setKendraId(model.getKendraId());
        dto.setBranchId(model.getBranchId());
        dto.setLosApplicantId(model.getLosApplicantId());
        dto.setLoanAmount(model.getLoanAmount());
        dto.setCreditRptID(model.getCreditRptID());
        dto.setCreditReqType(model.getCreditReqType());
        
        return dto;
    }
}