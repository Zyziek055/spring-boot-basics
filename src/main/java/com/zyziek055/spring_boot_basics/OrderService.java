package com.zyziek055.spring_boot_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    @Autowired //Use for multiconctrutor classes
    public OrderService(PaymentService paymentService) { //@Qualifier we use this if we want to override primiary method
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
}
