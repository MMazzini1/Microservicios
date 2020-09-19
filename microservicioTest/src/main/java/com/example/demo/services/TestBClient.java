package com.example.demo.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="testB", fallback = TestBFallbackClient.class)
public interface TestBClient {


	@GetMapping("/test")
	public String test();


}


@Component
class TestBFallbackClient implements TestBClient{

	@Override public String test() {
		return  "El microservicio B esta caído";
	}
}

