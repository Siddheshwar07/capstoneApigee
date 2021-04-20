package com.capstone.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.demo.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, String>{
	

}
