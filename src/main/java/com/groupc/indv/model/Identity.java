package com.groupc.indv.model;

import com.groupc.indv.enums.IdsType;

public class Identity {
    private IdsType idType;
    private String uniqueId;

    public Identity(IdsType idType, String uniqueId) {
        this.idType = idType;
        this.uniqueId = uniqueId;
    }

    public IdsType getIdType() {
        return idType;
    }

    public String getUniqueId() {
        return uniqueId;
    }

}
