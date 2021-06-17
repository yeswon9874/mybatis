package org.tain.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tain.jpa.domain.TbCustProd;
import org.tain.jpa.repository.TbCustProdRepository;
import org.tain.mybatis.mappers.CustProdMapper;

@RestController
@RequestMapping("/cp")
public class CustProdRestController {

	@Autowired
	private TbCustProdRepository tbCustProdRepository;
	
	@GetMapping("/list")
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
	
	@GetMapping("/{id}/create")
	public String createOne(@PathVariable("id") Long id) {
		Map<String, Object> mapIn = new HashMap<>();
		mapIn.put("id", id);
		mapIn.put("custCode", "A11");
		mapIn.put("prodCode", "H04");
		mapIn.put("count", 10);
		this.custProdMapper.createOne(mapIn);
		return "success!!!!";
	}
	
	@GetMapping("/{id}/update")
	public String updateOne(@PathVariable("id") Long id) {
		Map<String, Object> mapIn = new HashMap<>();
		mapIn.put("id", id);
		mapIn.put("count", 8);
		this.custProdMapper.updateOne(mapIn);
		return "success";
	}
	
	@GetMapping("/{id}/delete")
	public String deleteOne(@PathVariable("id") Long id) {
		Map<String, Object> mapIn = new HashMap<>();
		mapIn.put("id", id);
		this.custProdMapper.deleteOne(mapIn);
		return "success";
	}
	
}
