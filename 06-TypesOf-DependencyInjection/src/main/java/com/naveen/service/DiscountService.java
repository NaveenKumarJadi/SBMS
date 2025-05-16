package com.naveen.service;

import org.springframework.stereotype.Service;


// Optional service
@Service
public class DiscountService {
    public void applyDiscount() {
        System.out.println("Discount applied.");
    }
}
