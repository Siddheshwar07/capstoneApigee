package com.capstone.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.demo.dto.CategoryCount;
import com.capstone.demo.dto.CategoryDTO;
import com.capstone.demo.dto.CategoryResponse;
import com.capstone.demo.dto.ProductResponse;
import com.capstone.demo.dto.ProductsDTO;
import com.capstone.demo.entity.Category;
import com.capstone.demo.entity.Products;
import com.capstone.demo.repository.CategoryRepo;
import com.capstone.demo.repository.ProductsRepo;

@Service
public class CategoryService {
	

	@Autowired
	CategoryRepo catRepo;

	@Autowired
	ProductsRepo proRepo;
	
	public CategoryResponse getAllCategories() {
		CategoryResponse catRes = new CategoryResponse();
		CategoryCount catCount = new CategoryCount();
		ArrayList<CategoryDTO> arr1 = new ArrayList();
		List<Category> cats = catRepo.findAll();
		for(Category cat : cats) {
			CategoryDTO catDTO = CategoryDTO.valueOf(cat);
			arr1.add(catDTO);
		}
		System.out.println(arr1);
		catCount.setCat_count(arr1.size());
		catRes.setData(arr1);
		catRes.setMetadata(catCount);
		return catRes;
	}

	public ProductResponse getByProdID(String prod_code) throws Exception {
		ProductsDTO prodDTOs = null;
		CategoryCount proCount = new CategoryCount();
		proCount.setCat_count(1);
	    List<ProductsDTO> listOne = new ArrayList<>();
	    
		ProductResponse Res = new ProductResponse();
		
		CategoryResponse proRes = new CategoryResponse();
		
		Optional<Products>	 prodEntity = proRepo.findById(prod_code);
		if(prodEntity.isPresent() && prodEntity.get().isAvailability()==true)
		{
			Products pro = prodEntity.get();
			prodDTOs = prodDTOs.valueOf(pro);
			Res.setMetadata(proCount);
			listOne.add(prodDTOs);
			Res.setData(listOne);
		}
		else
		{
			throw new Exception("Product code not available");
		}
		return Res;
	}

	@SuppressWarnings("static-access")
	public ProductResponse getByCategory(String category) {
		ProductsDTO prodDTOs = null;
		CategoryCount proCount = new CategoryCount();
		List<ProductsDTO> listTwo = new ArrayList<>();
		
		ProductResponse Res = new ProductResponse();
		
		List<Products> prodEntity =  proRepo.findBycategory(category);
		
		if(!prodEntity.isEmpty())
		{
			for(Products result:prodEntity)
			{
				prodDTOs = prodDTOs.valueOf(result);
				listTwo.add(prodDTOs);
			}	
			Res.setData(listTwo);
			proCount.setCat_count(listTwo.size());
			Res.setMetadata(proCount);
		}
		return Res;
	}

	public ProductsDTO addNewProduct(ProductsDTO proDTO){
			Products pro = proDTO.createEntity();
			proRepo.save(pro);
			ProductsDTO proDTORes = ProductsDTO.valueOf(pro);
			return proDTORes;
	}
	
	public CategoryDTO addNewCategory(CategoryDTO catDTO) {
		Category cat = catDTO.createEntity();
		catRepo.save(cat);
		CategoryDTO catDTORes = CategoryDTO.valueOf(cat);
		return catDTORes;
	}
}
