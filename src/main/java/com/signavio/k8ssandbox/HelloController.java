package com.signavio.k8ssandbox;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	
	
	@RequestMapping("/hello")
	public String hello() {
		
		StringBuilder message = new StringBuilder("Hello there, Skaffold!");
		
		try {
			InetAddress ip = InetAddress.getLocalHost();
			message.append(" From host: ").append(ip);
		} catch (UnknownHostException e) {
			LOGGER.error("error", e);
		}
		
		return message.toString();
	}
	
}
