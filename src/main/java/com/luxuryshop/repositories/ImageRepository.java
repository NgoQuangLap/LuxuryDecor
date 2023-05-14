package com.luxurydecor.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luxurydecor.entities.Product;
import com.luxurydecor.entities.ProductImages;
@Repository
public interface ImageRepository extends JpaRepository<ProductImages, Integer>{
	
	public List<ProductImages> findByProduct(Product product);
}
