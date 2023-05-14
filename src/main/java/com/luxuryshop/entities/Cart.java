package com.luxurydecor.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.luxurydecor.entities.primarykey.PKOfCart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * bảng lưu giỏ hàng của khách
 * @author LinhVu
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_cart")
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Cart implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2673587709486561023L;

	@EmbeddedId
	private PKOfCart pk;
	
	@Column(name="quantity")
	private Integer quantity;

	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId(value = "userId")
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private User user;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@MapsId(value = "productId")
	@JoinColumn(name="product_id")
	@JsonIgnore
	private Product productCart;
	
}
