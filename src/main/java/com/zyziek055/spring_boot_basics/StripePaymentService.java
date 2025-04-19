package com.zyziek055.spring_boot_basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("stripe")
@Primary //We use this if we have two beans to set this as a primiary option
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount: " +  amount);
    }
}
