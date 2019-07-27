package com.app.dao;

import java.util.List;
import java.util.Optional;

<<<<<<< Updated upstream
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
=======
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

>>>>>>> Stashed changes
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.other.EnumCategory;
import com.app.pojos.Login;
<<<<<<< Updated upstream

@Repository
@Transactional
public class DaoImplementation implements IAdminDao, ICommonDao, IUserDao {

	@Autowired
	private SessionFactory sf;
	
	
	public DaoImplementation() {
		super();
		System.out.println("in dao ");
=======
import com.app.pojos.Order;
import com.app.pojos.Product;
import com.app.pojos.User;

@Repository
public class DaoImplementation implements IAdminDao,IUserDao,ICommonDao{
	@PersistenceContext
	private EntityManager entityManager;
	private Query q;

	public DaoImplementation() {
		}
	
	@Override
	public User getUser(User user) {
		return entityManager.find(User.class, user.getEmail());
>>>>>>> Stashed changes
	}


//	@Override
//	public List<EnumCategory> fetchCategory(){
//		List<EnumCategory> category= Arrays.asList(EnumCategory.values());
//		return category;
//	}
	
	
//	@Override
//	public EnumRole loginUser(Login login){
//		Login l = sf.getCurrentSession().createQuery("Select l From Login l where l.Email=:email",Login.class).setParameter("email",login.getEmail()).getSingleResult();
//		if(!l.getPassword().equals(login.getPassword())){
//			
//		}
//		return l.getRole();
//	}
	
//	@Override
//	public User fetchUser(Login l){
//		return sf.getCurrentSession().createQuery("select u FROM User u where u.Email=:email", User.class).setParameter("email", l.getEmail()).getSingleResult();
//	}


//	@Override
//	public boolean signUp(User u, Login login) {
//		try{
//			sf.getCurrentSession().save(u);
//			sf.getCurrentSession().save(login);
//			return true;
//		}
//		catch(HibernateException he){
//			return false;
//		}
//	}


	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteInBatch(Iterable<Login> arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Login> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Login> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Login> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Login> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Login> findAllById(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Login getOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Login> List<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Login> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Page<Login> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void delete(Login arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll(Iterable<? extends Login> arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteById(Integer arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean existsById(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
<<<<<<< Updated upstream
	public Optional<Login> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Login> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Login> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public <S extends Login> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public <S extends Login> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Login> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
=======
	public List<Product> getProduct(String category) {
		 q=entityManager.createQuery("SELECT p from Product p where p.category =: category");
		 entityManager.getEntityManagerFactory().addNamedQuery("fetchByCategory", q);
		Query nq = entityManager.createNamedQuery("fetchByCategory");
		nq.setParameter("category",EnumCategory.valueOf(category));
		@SuppressWarnings("unchecked")
		List<Product> products = nq.getResultList();
		return products;
		}


>>>>>>> Stashed changes
}
