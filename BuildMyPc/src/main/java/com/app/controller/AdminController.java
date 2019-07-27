package com.app.controller;

<<<<<<< Updated upstream
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Product;
import com.app.service.IAdminService;


//@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RequestMapping("/Admin")
>>>>>>> Stashed changes
@RestController
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RequestMapping("/Admin")
public class AdminController {
<<<<<<< Updated upstream
=======
		@Autowired
		private IAdminService service;
		
		@PostMapping("/product")
		public boolean getProduct() {
			return false;
		}
	}
	
>>>>>>> Stashed changes
		
