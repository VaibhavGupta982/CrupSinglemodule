package com.packageSample.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packageSample.modal.Product;
import com.packageSample.repository.Repository;
import com.packageSample.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private Repository dataRepository;

	public Product saveData(Product product) {
		return dataRepository.save(product);
	}

	public List<Product> saveDatas(List<Product> product1) {
		return dataRepository.saveAll(product1);
	}

	public Product FindById(int id) {
		return dataRepository.findById(id).orElse(null);
	}

	public List<Product> findAll() {
		return dataRepository.findAll();
	}
/*
	public Product findByName(String name) {

		return dataRepository.findByNameData(name);
	}*/

	public String deleteProductById(int id) {
      dataRepository.deleteById(id);
      return "Deleted";
	}
	
	public Product updateProduct(Product products){
		Product exist =dataRepository.findById(products.getId()).orElse(null);
        exist.setName(products.getName());
        exist.setPrice(products.getPrice());
        return dataRepository.save(exist);
	}
	
}
