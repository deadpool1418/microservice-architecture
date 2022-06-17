package com.cypher.api.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/userfallback")
	public String userServiceFallBackMethod() {
		return "User service is taking longer than expected."
				+ "Try again later.";
	}
	
	@GetMapping("/departmentfallback")
	public String departmentServiceFallBackMethod() {
		return "Department service is taking longer than expected."
				+ "Try again later.";
	}
}
