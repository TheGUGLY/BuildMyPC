package com.app.dao;

import com.app.pojos.Product;
import com.app.wrapper.WrapperUpdate;

public interface IAdminDao{

	public boolean addProduct(Product product);

	public void deleteProduct(Product p);

	public Product updateProduct(WrapperUpdate product, String id);


	


	
}
