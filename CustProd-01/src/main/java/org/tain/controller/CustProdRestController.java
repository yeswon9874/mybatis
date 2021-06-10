package org.tain.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tain.jpa.domain.TbCustProd;
import org.tain.jpa.repository.TbCustProdRepository;
import org.tain.mybatis.mappers.CustProdMapper;

@RestController
@RequestMapping({"/custProd"})
public class CustProdRestController {

	@Autowired
	private TbCustProdRepository tbCustProdRepository;
	
	@GetMapping({"/list"})
	public List<TbCustProd> list() throws Exception {
		return this.tbCustProdRepository.findAll();
	}
	
	@Autowired
	private CustProdMapper custProdMapper;
	
	@GetMapping({"/all"})
	public List<Map<String,Object>> all() throws Exception {
		return this.custProdMapper.selectAll(null);
	}
	
	@GetMapping({"/alljoin"})
	public List<Map<String,Object>> alljoin() throws Exception {
		return this.custProdMapper.selectAllJoin(null);
	}
}
