package com.example.transaction_demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@IdClass(UserTransactionId.class)
public class UserTransaction {
    @Id
    private String accountId;
    @Id
    private String transactionType;
    private int maxValue;
    private int minValue;

    @ManyToOne
    @JoinColumn(name="transactionType", referencedColumnName = "Type", insertable = false, updatable = false)
    private Transaction transaction;

    public UserTransaction() {
    }

    public UserTransaction(String accountId, String transactionType, int maxValue, int minValue) {
        this.accountId = accountId;
        this.transactionType = transactionType;
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public Transaction getTransaction() {
        return transaction;
    }
}
