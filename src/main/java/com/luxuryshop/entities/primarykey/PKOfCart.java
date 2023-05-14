package com.luxurydecor.entities.primarykey;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * khóa chính của bảng Cart
 * @author LinhVu
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PKOfCart implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3567798310776512705L;

	@Column(name = "user_id",nullable = false)
	private Integer userId;
	
	@Column(name="product_id",nullable = false)
	private Integer productId;
}
