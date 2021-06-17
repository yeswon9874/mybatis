package org.tain.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_prod")
@Data
public class TbProd {

	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "kinds")
	private String kinds;
	
	@Column(name = "price")
	private int price;
	
}
