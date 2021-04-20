package com.capstone.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.demo.entity.Products;
@Repository
public interface ProductsRepo extends JpaRepository<Products, String>{

	List<Products> findBycategory(String category);
}
