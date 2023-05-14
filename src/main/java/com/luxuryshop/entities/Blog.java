package com.luxurydecor.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_blogs")
public class Blog {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "title", nullable = true)
	private String title;
	
	@Column(name = "image", length = 100 ,nullable = true)
	private String image;
	
	@Column(name = "description" , columnDefinition = "TEXT",nullable = true)
	private String description;
}
