package org.tain.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Entity
@Data
public class TbShoes {

	@Id
	private Long id;
	
	private String productName;
	
	@Lob
	private String productContent;
	
	private String productPrice;
	
	private String productLocation;
	
}
