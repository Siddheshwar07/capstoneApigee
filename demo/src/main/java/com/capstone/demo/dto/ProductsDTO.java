package com.capstone.demo.dto;

import java.sql.Date;

import com.capstone.demo.entity.Category;
import com.capstone.demo.entity.Products;

public class ProductsDTO {
	
	String prod_code;
	String prod_name;
	int price;
	String brand;
	Date year_mfg;
	String description;
	boolean availability;
	String category;
	

	public ProductsDTO() {
		super();
	}

	public ProductsDTO(String prod_code, String prod_name, int price, String brand, Date year_mfg, String description,
			boolean availability,String category) {
		super();
		this.prod_code = prod_code;
		this.prod_name = prod_name;
		this.price = price;
		this.brand = brand;
		this.year_mfg = year_mfg;
		this.description = description;
		this.availability = availability;
		this.category =category;
	}
	

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProd_code() {
		return prod_code;
	}

	public void setProd_code(String prod_code) {
		this.prod_code = prod_code;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Date getYear_mfg() {
		return year_mfg;
	}

	public void setYear_mfg(Date year_mfg) {
		this.year_mfg = year_mfg;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}	
	
	// Converts Entity into DTO
		public static ProductsDTO valueOf(Products pro) {
			ProductsDTO proDTO = new ProductsDTO();
			proDTO.setAvailability(pro.isAvailability());
			proDTO.setBrand(pro.getBrand());
			proDTO.setDescription(pro.getDescription());
			proDTO.setPrice(pro.getPrice());
			proDTO.setProd_code(pro.getProd_code());
			proDTO.setProd_name(pro.getProd_name());
			proDTO.setYear_mfg(pro.getYear_mfg());
			proDTO.setCategory(pro.getCategory());
			return proDTO;
		}

		// Converts DTO into Entity
		public Products createEntity() {
			Products pro = new Products();
			pro.setAvailability(this.isAvailability());
			pro.setBrand(this.getBrand());
			pro.setDescription(this.getDescription());
			pro.setPrice(this.getPrice());
			pro.setProd_code(this.getProd_code());
			pro.setProd_name(this.getProd_name());
			pro.setYear_mfg(this.getYear_mfg());
			pro.setCategory(this.getCategory());
			return pro;
		}
	
	
}
