package com.luxuryshop.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_blocked_id")
public class BlockedIP {
	
	@Id
	@Column(name = "ip")
	private String ip;
	
	@Column(name = "last_login_failed")
	private Long lastLogin;
	
	@Column(name = "num_wrong")
	private Integer numWrong; 
}
