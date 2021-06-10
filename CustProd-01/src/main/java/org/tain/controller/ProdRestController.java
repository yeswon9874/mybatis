package org.tain.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tain.jpa.domain.TbProd;
import org.tain.jpa.repository.TbProdRepository;
import org.tain.mybatis.mappers.ProdMapper;

@RestController
@RequestMapping({"/prod"})
public class ProdRestController {

	@Autowired
	private TbProdRepository tbProdRepository;
	
	@GetMapping({"/list"})
	public List<TbProd> list() throws Exception {
		return this.tbProdRepository.findAll();
	}
	
	@Autowired
	private ProdMapper prodMapper;
	
	@GetMapping({"/all"})
	public List<Map<String,Object>> all() throws Exception {
		return this.prodMapper.selectAll(null);
	}
}
