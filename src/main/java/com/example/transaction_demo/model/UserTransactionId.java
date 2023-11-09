package com.example.transaction_demo.model;

import java.io.Serializable;

public class UserTransactionId implements Serializable {
    private String accountId;
    private String transactionType;

    public UserTransactionId() {
    }

    public UserTransactionId(String accountId, String transactionType) {
        this.accountId = accountId;
        this.transactionType = transactionType;
    }
}
