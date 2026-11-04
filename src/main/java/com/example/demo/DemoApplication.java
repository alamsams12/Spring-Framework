package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;


@SpringBootApplication
public class DemoApplication {

  	// private final OrderService orderService;

    // DemoApplication(OrderService orderService) {
    //     this.orderService = orderService;
    // }

    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		//ApplicationContext-responsible for instantiating, configuring, and assembling the beans (objects) in your application 

		//AnnotationConfigApplicationContext-a specific implementation class of the ApplicationContext interface. It is designed to start the container using Java-based configuration (annotations)
		

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		OrderService order = context.getBean(OrderService.class);
		order.placeOrder();

		// PaymentService pay = context.getBean(PaymentService.class);
		// pay.pay();
		
	}

}
