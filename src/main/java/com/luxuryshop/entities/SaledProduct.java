package com.luxuryshop.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

/**
 * bảng lưu những sản phẩm đã bán trong hóa đơn
 * 
 * @author LinhVu
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_saledorder_products")
public class SaledProduct {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="product_title", nullable = false)
	private String productTitle;
	
	@Column(name="product_price", nullable = false)
	private Float productPrice;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "selled_date")
	private Date selledDate;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private DetailOrder order;
}
