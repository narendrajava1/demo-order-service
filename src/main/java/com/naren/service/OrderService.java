package com.naren.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class OrderService {
	private static final Logger logger=LoggerFactory.getLogger(OrderService.class);
	
	public String getOrder(){
		logger.info("In getOrder the message in order service ");
		return "Your Order Condomes got delivered";
	}
}
