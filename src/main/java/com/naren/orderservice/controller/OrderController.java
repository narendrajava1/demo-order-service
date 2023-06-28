package com.naren.orderservice.controller;

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
	
	@Value("${order.message}")
    private String message;
	
	@GetMapping
	public String createOrder() {
		return message;
	}

}
