package com.example.insurance.web.dto;

import lombok.Data;

@Data
public class RecordDto {

    private String insurance;
    private int monthcount;
    private int priceforonemonth;

    private int cost;

    public RecordDto() {
    }

    public RecordDto(String insurance,int monthcount,int priceforonemonth,int cost) {
        super();
        this.insurance = insurance;
        this.monthcount = monthcount;
        this.priceforonemonth = priceforonemonth;
        this.cost = cost;

    }
}
