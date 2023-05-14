package com.luxurydecor.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * bảng lưu thông tin đơn hàng
 * @author LinhVu
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_saleorder")
public class DetailOrder extends ParentEntity {
	@Column(name = "code", nullable = true)
	private String code;

	@Column(name = "total", nullable = true)
	private float total = 0;
	
	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "customer_address")
	private String customerAddress;

	@Column(name = "customer_phone")
	private String customerPhone;

	@Column(name = "customer_email")
	private String customerEmail;

	@Column(name = "customer_note")
	private String customerNote;

	@Column(name = "isCancel", nullable = false)
	private Boolean isCancel = Boolean.FALSE;
	
	@Column(name = "status" , nullable = true)
	private String status;
	
	@Column(name = "total_received", nullable = false)
	private Float totalReceived;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany(mappedBy = "order" )
	List<SaledProduct> saledOrder;

	public double total() {
		Double total = 0.00;
		for (SaledProduct pro : this.getSaledOrder()) {
			total = total + pro.getQuantity() * pro.getProductPrice();
		}
		return total;
	}

}
