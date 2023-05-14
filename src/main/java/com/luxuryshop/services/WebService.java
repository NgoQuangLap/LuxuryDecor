package com.luxurydecor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.luxurydecor.entities.Category;
import com.luxurydecor.entities.Collection;
import com.luxurydecor.entities.Product;
import com.luxurydecor.entities.Tag;
import com.luxurydecor.repositories.CategoryRepository;
import com.luxurydecor.repositories.CollectionRepository;
import com.luxurydecor.repositories.ProductRepository;
import com.luxurydecor.repositories.TagRepository;

@Service
public class WebService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	TagRepository tagRepository;
	
	@Autowired
	CollectionRepository collectionRepository;
	
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}
	
	public List<Product> getAllProduct(PageRequest page) {
		return productRepository.findAll(page).getContent();
	}
	
	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
	}
	
	public List<Collection> getAllCollection() {
		return collectionRepository.findAll();
	}
	
	public List<Tag> getAllTag() {
		return tagRepository.findAll();
	}
}
