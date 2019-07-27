package com.app.controller;

<<<<<<< Updated upstream
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
=======
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
>>>>>>> Stashed changes
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.ICommonDao;
import com.app.other.EnumRole;
import com.app.pojos.Login;
import com.app.pojos.Product;
import com.app.pojos.User;
<<<<<<< Updated upstream
=======
import com.app.service.ICommonService;
import com.app.wrapper.WrapperSignUp;

>>>>>>> Stashed changes


@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/Common")
public class CommonController {
	@Autowired
<<<<<<< Updated upstream
	private ICommonDao dao; 
	

	@PostMapping("/login")
	public EnumRole logIn(@RequestBody Login l){
		EnumRole role =EnumRole.ADMIN;//= dao.loginUser(l);
		//User u = dao.fetchUser(l);
		return role;
	}
	
	@PostMapping("/SignUp")
	public boolean signUp(@RequestBody User u,@RequestParam String password){
		
		//dao.signUp(u,new Login(u.getEmail(),password,EnumRole.USER));
		
		return false;
	}

=======
	private ICommonService service;
	
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
		return role; 
	}
	
	@PostMapping("/register")
	public boolean registerUser(@RequestBody WrapperSignUp signUp){
		
		if(service.ifExist(signUp.getEmail())){
			return false;
		}
		
		User user = new User(signUp.getEmail(), signUp.getName(), LocalDate.parse(signUp.getDob()), signUp.getMob());
		Login login = new Login(signUp.getEmail(), signUp.getPassword());
			return service.register(user,login);	
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/product")
	public List<Product> fetchProductByCategory(@RequestParam String category){
		return service.fetchProduct(category);
		
		
	}
	
	
	
	
>>>>>>> Stashed changes
}
