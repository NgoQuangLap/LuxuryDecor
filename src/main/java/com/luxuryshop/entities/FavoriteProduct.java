package com.luxurydecor.entities;

import com.luxurydecor.entities.primarykey.PKOfCart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_favorite_products")
public class FavoriteProduct implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4577245630479225066L;
	@EmbeddedId
	private PKOfCart pk;
}
