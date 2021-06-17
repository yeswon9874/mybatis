package org.tain.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_cust")
@Data
public class TbCust {

	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "phone_number")
	private int phoneNumber;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "address")
	private String address;
	
}
