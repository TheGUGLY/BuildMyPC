package com.app.dao;

import java.util.List;

import com.app.pojos.Login;
import com.app.pojos.Product;
import com.app.pojos.User;

public interface ICommonDao {
	public boolean register(User user,Login login);
	
	public boolean ifExist(String email);
	
	public Login getLogin(String email);

	List<Product> getProduct(String category);

	
}
