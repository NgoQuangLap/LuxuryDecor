package com.luxurydecor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luxurydecor.entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
