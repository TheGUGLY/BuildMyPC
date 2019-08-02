package com.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.pojos.Order;

@Service
@Transactional
public class UserService implements IUserService{
	
	private IUserDao dao;

	@Override
	public boolean placeOrder(Order order) {
		try{
			dao.plceOrder(order);
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
	
	

}
