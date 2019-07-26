package com.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;

@Service
@Transactional
public class UserService implements IUserService{
	
	private IUserDao dao;

}
