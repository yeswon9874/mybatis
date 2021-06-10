package org.tain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tain.domain.TbCustProd;
import org.tain.repository.TbCustomerProductRepository;

@RestController
@RequestMapping(value = {"/custProd"})
public class TbCustomerProductController {

	@Autowired
	private TbCustomerProductRepository tbCustomerProductRepository;
	
	@GetMapping("/list")
	public List<TbCustProd> list() {
		return this.tbCustomerProductRepository.findAll();
	}
}
