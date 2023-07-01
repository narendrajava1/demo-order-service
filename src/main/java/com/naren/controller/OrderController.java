package com.naren.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naren.service.OrderService;

@RestController
@RequestMapping(produces = "application/json")
@CrossOrigin(origins = "*")
@RefreshScope
public class OrderController {
	
	Logger logger=LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private OrderService orderService;
	
	@Value("${order.message}")
    private String message;
	
	@GetMapping("/create-order")
	public String createOrder() {
		logger.info("In createOrder the message is {}",message);
		return message;
	}
	@GetMapping("/get-order")
	public String getOrder() {
		logger.info("In getOrder the message is {}",message);
		return orderService.getOrder();
	}

}
