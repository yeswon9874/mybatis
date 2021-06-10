package org.tain.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_cust_prod")
@Data
public class TbCustProd {

	@Id
	private Long id;
	
	@Column(name = "cust_code")
	private String custCode;
	
	@Column(name = "prod_code")
	private String prodCode;
	
	@Column(name = "prod_count")
	private int prodCount;
	
}
