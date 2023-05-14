package com.luxurydecor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luxurydecor.entities.Tag;
@Repository
public interface TagRepository extends JpaRepository<Tag, Integer>{

}
