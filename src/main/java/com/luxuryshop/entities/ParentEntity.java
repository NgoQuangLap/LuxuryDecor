package com.luxuryshop.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public abstract class ParentEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@JsonIgnore
	@Column(name = "created_date", nullable = true)
	private LocalDateTime createdDate;
	
	@JsonIgnore
	@Column(name = "updated_date", nullable = true)
	private LocalDateTime updatedDate;

	@Column(name = "created_by", nullable = true)
	private Integer createdBy;

	@Column(name = "updated_by", nullable = true)
	private Integer updatedBy;
}
