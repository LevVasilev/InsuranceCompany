package com.example.insurance.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="records")
@Data
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String insurance;

    private int monthcount;

    private int priceforonemonth;
    private int cost;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Record() {
    }

    public Record(String insurance, int count,int cost, int priceforonemonth, User user) {
        this.insurance = insurance;
        this.monthcount = monthcount;
        this.priceforonemonth = priceforonemonth;
        this.cost = cost;
        this.user = user;

    }
}
