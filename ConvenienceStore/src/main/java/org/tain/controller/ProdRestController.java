package org.tain.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tain.jpa.domain.TbProd;
import org.tain.jpa.repository.TbProdRepository;
import org.tain.mybatis.mappers.ProdMapper;

@RestController
@RequestMapping("/prod")
public class ProdRestController {

	@Autowired
	private TbProdRepository tbProdRepository;
	
	@GetMapping("/list")
	public List<TbProd> list() throws Exception {
		return this.tbProdRepository.findAll();
	}
	
	@Autowired
	private ProdMapper prodMapper;
	
	@GetMapping({"/all"})
	public List<Map<String,Object>> all() throws Exception {
		return this.prodMapper.selectAll(null);
	}
	
	@GetMapping({"/{id}/create"})
	public String create(@PathVariable("id") Long id) {
		Map<String, Object> mapIn = new HashMap<>();
		mapIn.put("id", id);
		mapIn.put("name", "chicken");
		mapIn.put("code", "G020");
		mapIn.put("kinds", "foods");
		mapIn.put("price", 8500);
		this.prodMapper.createOne(mapIn);
		return "success";
	}
	
	@GetMapping("/{id}/update")
	public String update(@PathVariable("id") Long id) {
		Map<String, Object> mapIn = new HashMap<>();
		mapIn.put("id", id);
		mapIn.put("name", "milk");
		/*
		mapIn.put("code", "F045");
		mapIn.put("kinds", "food");
		mapIn.put("price", 1400);
		*/
		this.prodMapper.updateOne(mapIn);
		return "success";
	}
	
	@GetMapping("/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		Map<String, Object> mapIn = new HashMap<>();
		mapIn.put("id", id);
		this.prodMapper.deleteOne(mapIn);
		return "success";
	}
	
	
}
