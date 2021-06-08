package org.tain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tain.jpa.domain.TbShoes;
import org.tain.jpa.repository.TbShoesRepository;

@RestController
@RequestMapping("/shoes")
public class TbShoesRestController {

	@Autowired
	private TbShoesRepository tbShoesRepository;
	
	@GetMapping("/list")
	public List<TbShoes> list() {
		return this.tbShoesRepository.findAll();
	}
	
}
