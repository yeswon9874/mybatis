package org.tain.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TbHi {

	@Id
	private Long id;
	
	private String code;
	
	private String name;
	
	private String desc;
	
	private int price;
	
	private String content;
}
