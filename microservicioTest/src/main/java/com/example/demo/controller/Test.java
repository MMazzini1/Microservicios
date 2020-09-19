package com.example.demo.controller;


import com.example.demo.services.TestBClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {


	@Autowired Environment environment;

	@Autowired TestBClient testBclient;


	@GetMapping
	public String test(){
		System.out.println("test");
		String testBresponse = testBclient.test();
		return "This microservice listening on port: " + environment.getProperty("local.server.port") +
				"\n  Microservice B listening on port: " + testBresponse;
	}


}
