package org.tain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tain.domain.TbCustomer;
import org.tain.repository.TbCustomerRepository;

@RestController
@RequestMapping(value = {"/cust"})
public class TbCustomerController {
	
	@Autowired
	private TbCustomerRepository tbCustomerRepository;
	
	@GetMapping("/list")
	public List<TbCustomer> list() {
		return this.tbCustomerRepository.findAll();
	}
}
