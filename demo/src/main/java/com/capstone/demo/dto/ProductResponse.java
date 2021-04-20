package com.capstone.demo.dto;

import java.util.List;

public class ProductResponse {
	List<ProductsDTO> data;
	CategoryCount metadata;
	
	public ProductResponse() {
		super();
	}

	

	public ProductResponse(List<ProductsDTO> data, CategoryCount metadata) {
		super();
		this.data = data;
		this.metadata = metadata;
	}



	public List<ProductsDTO> getData() {
		return data;
	}

	public void setData(List<ProductsDTO> data) {
		this.data = data;
	}

	public CategoryCount getMetadata() {
		return metadata;
	}

	public void setMetadata(CategoryCount metadata) {
		this.metadata = metadata;
	}

}
