package com.springboot.ansovannath.web.customer;

import lombok.Getter;
import lombok.Setter;

public class Customer {



    @Getter
    @Setter
    private String customerNameEn;

    @Getter
    @Setter
    private String customerNameKh;

    public Customer(String customerNameEn, String customerNameKh){
        this.customerNameEn = customerNameEn;
        this.customerNameKh = customerNameKh;
    }





}
