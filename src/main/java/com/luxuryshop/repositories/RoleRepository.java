package com.luxurydecor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luxurydecor.entities.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
	public Role findByName(String name);
}
