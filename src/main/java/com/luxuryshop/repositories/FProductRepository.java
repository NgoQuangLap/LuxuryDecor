package com.luxurydecor.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.luxurydecor.entities.FavoriteProduct;
import com.luxurydecor.entities.primarykey.PKOfCart;

@Repository
public interface FProductRepository extends JpaRepository<FavoriteProduct, PKOfCart>{
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM FavoriteProduct fp WHERE fp.pk.productId = ?1")
	public int deleteProduct(Integer id);
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM FavoriteProduct fp WHERE fp.pk.userId = ?1")
	public int deleteUser(Integer id);
}
