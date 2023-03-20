package com.springboot.ansovannath.web.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {


    //http:8080:8080/customer
    @GetMapping("/customer")
    public Customer getCustomerEntity( ){
      return new Customer("ansovannath", "អានសុវណ្ណាត់");

    }
    @GetMapping("/customers")
    public List<Customer> getCustmers(){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("chivmenghong", "ជាវម៉េងហុង"));
        customers.add(new Customer("cheasokhea", "ជាសុឃា"));
        customers.add(new Customer("chansochea", "ចាន់សុជា"));

        return customers;
    }

    //http://localhost:8080/customer/ansovannath/
    //@pathVariable annotation

    @GetMapping("{customerNameEn}/{customerNameKh}")
    public Customer customerPathVariable(@PathVariable("customerNameEn") String customerNameEn,
                                         @PathVariable("customerNameKh") String customerNameKh){
        return  new Customer(customerNameEn, customerNameKh);

    }

    //build rest api to handle query parametters
    //http://localhost:8080/customer?customerNameEn=ansovannath&customerNameKh=អានសុវណ្ណាត់

    @GetMapping("/customer/query")
    public Customer cutomerQueryParam(@RequestParam(name="customerNameEn") String customerNameEn,
                                      @RequestParam(name="customerNameKh") String customerNameKh){

        return new Customer(customerNameEn, customerNameKh);


    }

}
