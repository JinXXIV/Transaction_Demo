package com.example.transaction_demo.repository;

import com.example.transaction_demo.model.UserTransaction;
import com.example.transaction_demo.model.UserTransactionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserTransactionRepository extends JpaRepository<UserTransaction, UserTransactionId> {
    public List<UserTransaction> findByAccountId(String accountId);
}
