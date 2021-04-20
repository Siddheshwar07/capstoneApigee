package com.capstone.demo.entity;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table
public class Products {
	@Id
	String prod_code;
	@Column
	String prod_name;
	@Column
	int price;
	@Column
	String brand;
	@Column
	Date year_mfg;
	@Column
	String description;
	@Column
	boolean availability;
	@Column
	String category;
	
	public Products() {
		super();
	}
	public Products(String prod_code, String prod_name, int price, String brand, Date year_mfg, String description,
			boolean availability, String category) {
		super();
		this.prod_code = prod_code;
		this.prod_name = prod_name;
		this.price = price;
		this.brand = brand;
		this.year_mfg = year_mfg;
		this.description = description;
		this.availability = availability;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
