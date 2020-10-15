package com.packageSample.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.packageSample.modal.Product;
import com.packageSample.service.ProductService;


@RestController
public class ProductController {
	
	
	@Autowired
	ProductService productservice;
	
	private Logger logger = LogManager.getLogger(ProductController.class);
	
	@PostMapping("/productData")
	public Product productData(@RequestBody Product product)
	{
		Product p=null;
		logger.info("vaibhav bhai");
		try{
			p=productservice.saveData(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}	
	@PostMapping("/productDatas")
	public List<Product> productDatas(@RequestBody List<Product> products){
		return productservice.saveDatas(products);
	}
	
	@GetMapping("/findById/{id}")
	public Product findById(@PathVariable("id") int id)
	{
		return productservice.FindById(id);
	}
	
	@GetMapping("/findAll")
	public List<Product> findAllData()
	{
		return productservice.findAll();
	}
	
	/*@GetMapping("/findByName/{name}")
	public Product findByName(@PathVariable String name)
	{
		return productservice.findByName(name);
	}*/
	
	
	
	@DeleteMapping("/deleteById/{id}")
	public String delete(@PathVariable int id){
	return productservice.deleteProductById(id);
	
	}
	
	@PutMapping("/updateData")
	public Product updateData(@RequestBody Product product)
	{
		return productservice.updateProduct(product);
	}
	
}
