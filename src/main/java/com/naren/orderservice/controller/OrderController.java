package com.naren.orderservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = "application/json")
@CrossOrigin(origins = "*")
@RefreshScope
public class OrderController {
	
	Logger logger=LoggerFactory.getLogger(OrderController.class);
	
	@Value("${order.message}")
    private String message;
	
	@GetMapping("/create-order")
	public String createOrder() {
		logger.info("In createOrder the message is {}",message);
		return message;
	}

}
