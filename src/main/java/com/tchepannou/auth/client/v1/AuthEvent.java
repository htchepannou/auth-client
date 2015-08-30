package com.tchepannou.auth.client.v1;

import java.io.Serializable;
import java.util.Date;

public class AuthEvent implements Serializable{
    //-- Attributes
    private String accessTokenId;
    private String type;
    private String transactionId;
    private Date date = new Date();

    //-- Attributes
    public AuthEvent(String accessTokenId, String type, String transactionId){
        this.accessTokenId = accessTokenId;
        this.type = type;
        this.transactionId = transactionId;
    }

    //-- Getter/Setter
    public String getAccessTokenId() {
        return accessTokenId;
    }

    public String getType() {
        return type;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Date getDate() {
        return date;
    }
}
