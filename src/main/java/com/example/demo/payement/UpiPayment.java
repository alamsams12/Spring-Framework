package com.example.demo.payement;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("upi")
public class UpiPayment implements PaymentService {
    
    @Override 
    public void pay(){
        System.out.println("Payment done via UPI");
    }

}
