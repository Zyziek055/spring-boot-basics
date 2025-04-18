package com.zyziek055.spring_boot_basics;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount: " +  amount);
    }
}
