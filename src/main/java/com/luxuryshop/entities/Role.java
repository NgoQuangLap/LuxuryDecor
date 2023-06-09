package com.luxuryshop.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_roles")
public class Role extends ParentEntity implements Serializable {

	@Column(name = "name", length = 45, nullable = false)
	private String name;

	@Column(name = "description", length = 45, nullable = true)
	private String description;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "roles", fetch = FetchType.LAZY)
	List<User> users;
	
}
