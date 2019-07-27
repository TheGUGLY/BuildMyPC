package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IAdminDao;
import com.app.pojos.Product;

@Service
@Transactional
public class AdminService implements IAdminService{
	@Autowired
	private IAdminDao dao;
	
	
	@Override
	public boolean addProduct(Product product) {
		
		return dao.addProduct(product);
	}


	@Override
	public void deleteProduct(int id) {
		Product p =new Product(id);
		dao.deleteProduct(p);
		
	}


	@Override
	public ResponseEntity<Object> updateProduct(Product product) {
		return dao.updateProduct(product);
	}

	
	

}
