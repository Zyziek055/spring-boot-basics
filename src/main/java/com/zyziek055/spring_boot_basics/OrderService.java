package com.zyziek055.spring_boot_basics;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    @Autowired //Use for multiconctrutor classes
    public OrderService(PaymentService paymentService) { //@Qualifier we use this if we want to override primiary method
        System.out.println("Order service has been created");
        this.paymentService = paymentService;
    }

    @PostConstruct //This function runs right after the bean of class ORderService is created
    public void init() {
        System.out.println("OrderSerice PostConstruct");
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
}
