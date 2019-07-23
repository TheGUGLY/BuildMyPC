package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Item;

public interface IItemRepo extends JpaRepository<Item,Integer > {

}
