package org.tain.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_customer")
@Data
public class TbCustomer {
	
	@Id
	private Long id;
	
	private String code;
	
	private String name;
	
	private String desc;
}
