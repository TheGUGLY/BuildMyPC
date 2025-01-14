package com.app.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Login;
import com.app.pojos.Product;
import com.app.pojos.User;
import com.app.service.ICommonService;
import com.app.wrapper.WrapperSignUp;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/common")
public class CommonController {
	@Autowired
	private ICommonService service;
	String jwtToken;
	@PostMapping("/test")
	public User text(@RequestBody User user ){
		
		System.out.println("in test");
		return service.getUser(user);
	}
	
	
	@PostMapping("/login")
	public String loginUser(@RequestBody Login login){
		String role = service.login(login);
		if(role == null){
			ResponseEntity.status(HttpStatus.NOT_FOUND);
			return "User Doesn't Exist.";
		}
		ResponseEntity.status(HttpStatus.FOUND);
		return  jwtToken = Jwts.builder().setSubject(login.getEmail()).claim("role", role).setIssuedAt(new Date())
		            .signWith(SignatureAlgorithm.HS256, "secretkey").compact();

	}
	
	@PostMapping("/register")
	public boolean registerUser(@RequestBody WrapperSignUp signUp){
		if(service.ifExist(signUp.getEmail())){
			return false;
		}
		
		User user = new User(signUp.getEmail(), signUp.getName(), LocalDate.parse(signUp.getDob()), signUp.getMob());
		Login login = new Login(signUp.getEmail(), signUp.getPassword());
		System.out.println(user);
			return service.register(user,login);
	}
	
	
	@GetMapping("/product/{category}")
	public List<Product> fetchProductByCategory(@PathVariable String category){
		return service.fetchProduct(category);
	}
	
}
