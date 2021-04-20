package com.capstone.demo.dto;

import java.sql.Date;
import java.sql.Timestamp;

import com.capstone.demo.entity.Category;


public class CategoryDTO {
	int id;
	String cat_code;
	String cat_name;
	String description;
	Date added_on;
	Timestamp createdat;

	public CategoryDTO() {
		super();
	}

	public CategoryDTO(int id, String cat_code, String cat_name, String description, Date added_on,
			Timestamp createdAt) {
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
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getCreatedat() {
		return createdat;
	}

	public void setCreatedat(Timestamp createdat) {
		this.createdat = createdat;
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

	// Converts Entity into DTO
	public static CategoryDTO valueOf(Category cat) {
		CategoryDTO catDTO = new CategoryDTO();
		catDTO.setCat_code(cat.getCat_code());
		catDTO.setCat_name(cat.getCat_name());
		catDTO.setDescription(cat.getDesc());;
		catDTO.setAdded_on(cat.getAdded_on());
		catDTO.setId(cat.getId());
		catDTO.setCreatedat(cat.getCreatedat());
		return catDTO;
	}

	// Converts DTO into Entity
	public Category createEntity() {
		Category cat = new Category();
		cat.setCat_code(this.getCat_code());
		cat.setCat_name(this.getCat_name());
		cat.setDesc(this.getDescription());
		cat.setAdded_on(this.getAdded_on());
		cat.setId(this.getId());
		cat.setCreatedat(this.getCreatedat());
		return cat;
	}
}