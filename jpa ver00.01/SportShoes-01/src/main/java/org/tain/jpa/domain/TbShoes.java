package org.tain.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TbShoes {

	@Id
	private Long id;
	
	private String code;
	
	private String model;
	
	private String desc;
	
	private String price;
	
	private String color;
	
}
