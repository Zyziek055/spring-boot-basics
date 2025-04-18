package com.zyziek055.spring_boot_basics;

public class PayPalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal");
        System.out.println("Amount: " +  amount);
    }
}
