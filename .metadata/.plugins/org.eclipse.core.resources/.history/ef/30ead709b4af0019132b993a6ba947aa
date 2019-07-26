package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.IAdminService;


//@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RequestMapping("/Admin")
@RestController
public class AdminController {
	@Autowired
	private IAdminService service;
	
	@GetMapping
	public String Testme(){
		return "Tested";
	}
		
}
