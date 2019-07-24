package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ICommonDao;
import com.app.pojos.Login;
import com.app.pojos.Order;
import com.app.pojos.User;

@Service
@Transactional
public class AdminService implements IAdminService{
	@Autowired
	private ICommonDao dao;

	@Override
	public boolean signUp(User user, String password) {
		return dao.signUp(user, new Login(user.getEmail(),password));
		
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getUserOrders(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
