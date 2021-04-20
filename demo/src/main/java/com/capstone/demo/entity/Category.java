package com.capstone.demo.entity;



import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String cat_code;
	@Column
	String cat_name;
	@Column
	String description;
	@Column
	Date added_on;
	@Column
	Timestamp createdat;
	
	
	
	
	/**
	 * 
	 */
	public Category() {
		super();
	}


	public Category(int id, String cat_code, String cat_name, String description, Date added_on, Timestamp createdAt) {
		super();
		this.id = id;
		this.cat_code = cat_code;
		this.cat_name = cat_name;
		this.description = description;
		this.added_on = added_on;
		this.createdat = createdAt;
	}


	public String getCat_code() {
		return cat_code;
	}
	public void setCat_code(String cat_code) {
		this.cat_code = cat_code;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}
	public Date getAdded_on() {
		return added_on;
	}
	public void setAdded_on(Date added_on) {
		this.added_on = added_on;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Timestamp getCreatedat() {
		return createdat;
	}


	public void setCreatedat(Timestamp createdat) {
		this.createdat = createdat;
	}
	
}