package com.luxurydecor.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luxurydecor.entities.DetailOrder;
import com.luxurydecor.entities.User;

@Repository
public interface DetailOrderRepository extends JpaRepository<DetailOrder, Integer>{
	public List<DetailOrder> findByUser(User user, Sort sort);
}
