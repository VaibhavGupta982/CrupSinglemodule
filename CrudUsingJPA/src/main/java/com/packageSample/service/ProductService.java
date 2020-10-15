package com.packageSample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.packageSample.modal.Product;

@Service("productService")
public interface ProductService {


	public Product saveData(Product product);
	
	
	public List<Product> saveDatas(List<Product> product1);

	public Product FindById(int id);
	public List<Product> findAll();

	public String deleteProductById(int id);
	
	public Product updateProduct(Product products);
	
	
}
