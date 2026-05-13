package com.example.CloudGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/orderServiceFallback")
    public String OrderServiceFallBack(){
        return "Order Service is taking longer than expected. Please try again later.";
    }

    @GetMapping("/paymentServiceFallback")
    public String PaymentServiceFallBack(){
        return "Payment Service is taking longer than expected. Please try again later.";
    }

    @GetMapping("/productServiceFallback")
    public String ProductServiceFallBack(){
        return "Product Service is taking longer than expected. Please try again later.";
    }

}
