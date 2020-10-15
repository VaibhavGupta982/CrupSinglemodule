package com.packageSample.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.packageSample.modal.Product;


public interface Repository extends JpaRepository<Product,Integer> {
}
