package com.luxurydecor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luxurydecor.entities.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
