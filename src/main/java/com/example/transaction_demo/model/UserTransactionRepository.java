package com.example.transaction_demo.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTransactionRepository extends JpaRepository<UserTransaction, UserTransactionId> {
}
