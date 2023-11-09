package com.example.transaction_demo.service;

import com.example.transaction_demo.model.UserTransaction;
import com.example.transaction_demo.repository.UserTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionLimitServiceImpl implements TransactionLimitService{
    @Autowired
    private UserTransactionRepository transactionLimitRepo;

    @Override
    public List<UserTransaction> getUserLimit(String accountId){
        return transactionLimitRepo.findByAccountId(accountId);
    }
}
