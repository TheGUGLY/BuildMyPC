package com.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Order;
import com.app.service.IUserService;


//@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RequestMapping("/User")
@RestController
public class UserController {
		private IUserService service;
		@PostMapping("placeOrder")
		public boolean order(@RequestBody Order order){
			System.out.println(order);
			return service.placeOrder(order);
		}
		
		
		
	
}
