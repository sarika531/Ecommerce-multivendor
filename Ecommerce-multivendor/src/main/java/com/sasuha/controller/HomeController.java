package com.sasuha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasuha.Response.ApiResponse;

@RestController
public class HomeController {
	
	@GetMapping("/api")
	public ApiResponse HomeControllerHandler() {
	ApiResponse apiresponse = new ApiResponse();
    apiresponse.setMesssage("sasuha brand new project for multivedor");
		return apiresponse;
	
	}

}
