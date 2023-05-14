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
@Table(name = "tbl_tagsearch")
public class Tag {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name" , length = 50)
	private String name;
	
	@Column(name="description",length = 100, nullable = true)
	private String description;
	
	public String upperName() {
		if (name != null)
			return name.toUpperCase();
		else return name;
	}
}
