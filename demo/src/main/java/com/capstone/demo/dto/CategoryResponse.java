package com.capstone.demo.dto;

import java.util.List;

public class CategoryResponse {
	CategoryCount metadata;
	List<CategoryDTO> data;

	public List<CategoryDTO> getData() {
		return data;
	}
	public void setData(List<CategoryDTO> data) {
		this.data = data;
	}
	public CategoryCount getMetadata() {
		return metadata;
	}
	public void setMetadata(CategoryCount metadata) {
		this.metadata = metadata;
	}
	
}

