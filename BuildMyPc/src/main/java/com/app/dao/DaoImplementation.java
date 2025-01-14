package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.app.other.EnumCategory;
import com.app.pojos.Login;
import com.app.pojos.Order;
import com.app.pojos.Product;
import com.app.pojos.User;
import com.app.wrapper.WrapperUpdate;

@Repository
public class DaoImplementation implements IAdminDao,IUserDao,ICommonDao{
	@PersistenceContext
	EntityManager entityManager;
	Query q;

	@Override
	public User getUser(User user) {
		return entityManager.find(User.class, user.getEmail());
	}
	
	
	@Override
	public boolean ifExist(String email) {
				Login login =entityManager.find(Login.class, email);
				if(login!=null)
					return true;
				return false;
		
	}
	
	@Override
	public List<Product> getProduct(String category) {
		Query nq;
		if(category.equalsIgnoreCase("All")){
			q=entityManager.createQuery("SELECT p from Product p");
			entityManager.getEntityManagerFactory().addNamedQuery("fetchByCategory", q);
			 nq = entityManager.createNamedQuery("fetchByCategory");
		}
		else{
				q=entityManager.createQuery("SELECT p from Product p where p.category =: category");
				entityManager.getEntityManagerFactory().addNamedQuery("fetchByCategory", q);
				nq = entityManager.createNamedQuery("fetchByCategory");
				nq.setParameter("category",EnumCategory.valueOf(category));
				}
		
		@SuppressWarnings("unchecked")
		List<Product> products = nq.getResultList();
		return products;
		}


	@Override
	public boolean register(User user, Login login) {
		try{
			entityManager.persist(user);
			entityManager.persist(login);
			return true;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	
	@Override
	public List<Order> getUserOrders(User user){
		return entityManager.find(User.class, user.getEmail()).getOrders();
	}


	@Override
	public Login getLogin(String email) {
		return entityManager.find(Login.class, email);
	}


	@Override
	public boolean addProduct(Product product) {
		try{
			entityManager.persist(product); 
			return true;
		}catch(Exception e ) {
			System.out.println(e.getMessage());
			return false;
		}
	}


	@Override
	public void deleteProduct(Product p) {
		entityManager.remove(entityManager.find(Product.class,p.getProductId()));
		}


	@Override
	public Product updateProduct(WrapperUpdate product,String id) {
			Product p = entityManager.find(Product.class,Integer.parseInt(id));
			p.setBrand(product.getUpdatebrand());
			p.setCategory(EnumCategory.valueOf(product.getUpdatecategory()));
			p.setDescription(product.getUpdatedescription());
			p.setModelNumber(product.getUpdatemodelNumber());
			p.setPrice(product.getUpdateprice());
			p.setQuantity(product.getUpdatequantity());
			p.setProductName(product.getUpdateName());
			return p;
	}


	@Override
	public boolean plceOrder(Order order) {
		entityManager.persist(order);
		return true;
	}
	
	


	
}
