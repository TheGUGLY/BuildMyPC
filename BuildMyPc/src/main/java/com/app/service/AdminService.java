package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IAdminDao;
import com.app.pojos.Product;
import com.app.wrapper.WrapperUpdate;

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
	public Product updateProduct(WrapperUpdate product,String id) {
		return dao.updateProduct(product,id);
	}

	
	

}
