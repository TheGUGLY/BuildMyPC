package com.app.service;

import java.util.List;

import com.app.pojos.Login;
import com.app.pojos.Order;
import com.app.pojos.Product;
import com.app.pojos.User;

public interface ICommonService {
	
	
	public String login(Login login);
	
	User getUser(User user);
	
	List<Order> getUserOrders(User user);

	public boolean register(User user, Login login);
	public boolean ifExist(String email);

	public List<Product> fetchProduct(String category);

	
}
