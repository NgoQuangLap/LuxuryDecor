package com.luxurydecor.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tbl_products_images")
public class ProductImages extends ParentEntity{
	@Column(name = "title", nullable = true)
	private String title;

	@Column(name = "path", nullable = false)
	private String path;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
}
