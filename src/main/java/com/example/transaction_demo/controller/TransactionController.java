package com.example.transaction_demo.controller;

import com.example.transaction_demo.model.UserLimit;
import com.example.transaction_demo.service.TransactionLimitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {
    @Autowired
    private TransactionLimitServiceImpl transactionLimitService;

    @GetMapping(path = "/api/transaction/userid")
    public UserLimit getUserLimit(){
        return new UserLimit(transactionLimitService.getUserLimit("ABC"));
    }
}
