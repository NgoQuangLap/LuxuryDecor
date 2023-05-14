package com.luxurydecor.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luxurydecor.entities.ProductDetail;
@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer>{
	public List<ProductDetail> findByProductId(int productId);
}
