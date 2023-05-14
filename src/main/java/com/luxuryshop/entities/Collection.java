package com.luxurydecor.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_collections")
public class Collection extends ParentEntity{
	
	@Column(name="name", length = 100, nullable = false)
	private String name;
	
	@Column(name="description",nullable = true,columnDefinition = "TEXT")
	private String description;
	
	@Column(name = "seo" , nullable = true)
	private String seo;
	
	@OneToMany(mappedBy = "collection")
	List<Product> products;
	
	@PreRemove
	void setForeignKeyNull() {
		List<Product> pros = this.getProducts();
		for (Product p : pros) {
			p.setCollection(null);
		}
	}
	
}
