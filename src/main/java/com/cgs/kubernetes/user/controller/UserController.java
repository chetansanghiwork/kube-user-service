package com.cgs.kubernetes.user.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cgs.kubernetes.user.model.UserValidationResponse;

@RestController
public class UserController {

	@GetMapping("/user/validate")
	public UserValidationResponse validateUser(@RequestParam(required=true) String username) {
		
		UserValidationResponse response = new UserValidationResponse();
		response.setStatus("success");
		response.setUsername(username);
		return response;
	}
	
}
