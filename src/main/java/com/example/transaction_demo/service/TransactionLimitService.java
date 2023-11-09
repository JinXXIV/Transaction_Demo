package com.example.transaction_demo.service;

import com.example.transaction_demo.model.UserTransaction;

import java.util.List;

public interface TransactionLimitService {
    public List<UserTransaction> getUserLimit(String userId);
}
