package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Login;

public interface IAdminDao extends JpaRepository<Login,Integer>{

}
