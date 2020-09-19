package com.example.demo.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="testB")
public interface TestBClient {


	@GetMapping("/test")
	public String test();


}
