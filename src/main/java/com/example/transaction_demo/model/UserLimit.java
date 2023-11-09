package com.example.transaction_demo.model;

import java.io.Serializable;
import java.util.List;

public class UserLimit implements Serializable {
    private List<UserTransaction> limit;

    public UserLimit() {
    }

    public UserLimit(List<UserTransaction> limit){
        this.limit = limit;
    }

    public List<UserTransaction> getLimit(){
        return this.limit;
    }
}
