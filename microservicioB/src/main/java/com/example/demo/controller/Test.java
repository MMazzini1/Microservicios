package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {



	@Autowired Environment environment;


	@GetMapping
	public String test(){
		System.out.println("test");
		return "Working on port: " + environment.getProperty("local.server.port");
	}


}
