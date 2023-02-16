package com.techStaxAssesment1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/webhook")
public class Controller {
	
//	@GetMapping("/git/pull")
//	public String pull() {
//		return "Pull from Github";
//	}
//
//	@GetMapping("/git/push")
//	public String push() {
//		return "Push to Github";
//	}
//
//	@GetMapping("/git/merge")
//	public String merge() {
//		return "Merge from Github";
//	}
	
	@PostMapping
	public ResponseEntity<String> post(@RequestBody String requestBody){
		
		return new ResponseEntity<String>(requestBody, HttpStatus.OK);
		
	}
	
}
