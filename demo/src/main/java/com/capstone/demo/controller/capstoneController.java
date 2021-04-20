package com.capstone.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.demo.dto.CategoryDTO;
import com.capstone.demo.dto.CategoryResponse;
import com.capstone.demo.dto.ProductResponse;
import com.capstone.demo.dto.ProductsDTO;
import com.capstone.demo.service.CategoryService;

@RestController
public class capstoneController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CategoryService catService;
	
	
	// Get All Categories
	@GetMapping(value = "/e-commerce/categories", produces = MediaType.APPLICATION_JSON_VALUE)
	public CategoryResponse getAllCategories() {
		logger.info("Fetching all categories");
		return catService.getAllCategories();
	}
	
	// Get details by product id
	@GetMapping(value = "/e-commerce/products/{prod_code}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getByProdId(@PathVariable String prod_code) throws Exception {
		logger.info("Fetching all categories by prod id");
		return catService.getByProdID(prod_code);
	}
	
	//Get details by Category
	@GetMapping(value = "/e-commerce/categories/{category}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getByCategory(@PathVariable String category) throws Exception {
		logger.info("Fetching all categories");
		return catService.getByCategory(category);
	}
	
	// Inserting a product
	@PostMapping(value = "e-commerce/products")
	public ProductsDTO addNewProduct(@RequestBody ProductsDTO proDTO) {
			logger.info("Inserting the products");
			return catService.addNewProduct(proDTO);
		}
	//Inserting a Category
	@PostMapping(value = "e-commerce/categories")
	public CategoryDTO addNewCategory(@RequestBody CategoryDTO catDTO) {
		logger.info("Inserting all category");
		return catService.addNewCategory(catDTO);
	}
	
}
