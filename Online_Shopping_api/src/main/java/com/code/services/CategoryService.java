package com.code.services;

import java.util.List;

import com.code.payload.CategoryDto;

public interface CategoryService {
			 CategoryDto createCategory(CategoryDto categoryDto);
			 CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
			 public void deleteCategory(Integer categoryId);
			 CategoryDto getCategory(Integer categoryId);
			 
			 
			 List<CategoryDto> getCategories();
				
				
			
}
