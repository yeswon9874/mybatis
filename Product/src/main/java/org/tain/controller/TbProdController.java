package org.tain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tain.domain.TbProduct;
import org.tain.repository.TbCustomerRepository;
import org.tain.repository.TbProdRepository;

@RestController
@RequestMapping(value = {"/prod"})
public class TbProdController {

	@Autowired
	private TbProdRepository tbProdRepository;
	
	@GetMapping("/list")
	public List<TbProduct> list() {
		return this.tbProdRepository.findAll();
	}
}
