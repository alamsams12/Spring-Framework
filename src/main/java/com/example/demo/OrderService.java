package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.payement.PaymentService;

//@Component 
public class OrderService {
    
    private final PaymentService paymentService;

    // No @Qualifier or @Autowired here. AppConfig handles it.
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed successfully!!");
    }
}
