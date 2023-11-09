package com.example.transaction_demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Transaction {
    @Id
    private String type;

    @ElementCollection(targetClass = Integer.class)
    @CollectionTable(name = "allowValue", joinColumns = @JoinColumn(name = "type"))
    private List<Integer> allowValue;

    public Transaction() {
    }

    public Transaction(String type, List<Integer> allowValue) {
        this.type = type;
        this.allowValue = allowValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Integer> getAllowValue() {
        return allowValue;
    }

    public void setAllowValue(List<Integer> allowValue) {
        this.allowValue = allowValue;
    }
}
