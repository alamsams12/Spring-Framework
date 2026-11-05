package com.example.demo;

import com.example.demo.payement.CardPayment;
import com.example.demo.payement.PaymentService;
import com.example.demo.payement.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo") // Use your project's package name here
public class AppConfig {

    @Bean
    public User createUser() {
        return new User("Sams", 22);
    }

    @Bean
    @Qualifier("card") // Renamed from "cp" to "card"
    public PaymentService createCardPayment() {
        return new CardPayment();
    }

    @Bean
    @Qualifier("upi")
    public PaymentService createUpiPayment() {
        return new UpiPayment();
    }

    @Bean
    // Make sure this @Qualifier matches the one above exactly!
    public OrderService createOrderService(@Qualifier("upi") PaymentService paymentService) {
        return new OrderService(paymentService);
    }
}
