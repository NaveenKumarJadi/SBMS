package com.naveen.service;

import org.springframework.stereotype.Service;


// Mandatory Service
@Service
public class PaymentService {
    public void processPayment() {
        System.out.println("Payment processed.");
    }
}
