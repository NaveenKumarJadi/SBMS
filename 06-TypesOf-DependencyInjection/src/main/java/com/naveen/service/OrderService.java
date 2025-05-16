package com.naveen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentService paymentService; // Constructor injection
    
    private DiscountService discountService;     // Setter injection

    @Autowired
    private LoggerService loggerService;         // Field injection

    // Constructor Injection
    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // Setter Injection
    @Autowired
    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }

    public void placeOrder() {
        loggerService.log("Placing order...");
        paymentService.processPayment();
        if (discountService != null) {
            discountService.applyDiscount();
        }
        loggerService.log("Order placed successfully.");
    }
}
