package com.app.dao;

<<<<<<< Updated upstream
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Login;
=======
import java.util.List;

import com.app.pojos.Login;
import com.app.pojos.Product;
import com.app.pojos.User;
>>>>>>> Stashed changes


<<<<<<< Updated upstream
public interface ICommonDao extends JpaRepository<Login,Integer>{
=======
	public List<Product> getProduct(String category);

>>>>>>> Stashed changes
	
	//public List<EnumCategory> fetchCategory();
	//public EnumRole loginUser(Login login);
	//public User fetchUser(Login l);
	//public boolean signUp(User u, Login login);

}
