package org.tain.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tain.jpa.domain.TbCust;
import org.tain.jpa.repository.TbCustRepository;
import org.tain.mybatis.mappers.CustMapper;

@RestController
@RequestMapping("/cust")
public class CustRestController {

	@Autowired
	private TbCustRepository tbCustRepository;
	
	@GetMapping("/list")
	public List<TbCust> list() throws Exception{
		return this.tbCustRepository.findAll();
	}
	
	@Autowired
	private CustMapper custMapper;
	
	@GetMapping({"/all"})
	public List<Map<String,Object>> all() throws Exception {
		return this.custMapper.selectAll(null);
	}
	
	@GetMapping("/{id}/create")
	public String createOne(@PathVariable("id") Long id) {
		Map<String, Object> mapIn =  new HashMap<>();
		mapIn.put("id", id);
		mapIn.put("name", "yewon");
		mapIn.put("code", "F001");
		mapIn.put("gender", "women");
		mapIn.put("address", "Gimpo");
		this.custMapper.createOne(mapIn);
		return "success";
	}
	
	@GetMapping("/{id}/update")
	public String updateOne(@PathVariable("id") Long id) {
		Map<String,Object> mapIn = new HashMap<>();
		mapIn.put("id", id);
		mapIn.put("name", "hey");
		this.custMapper.updateOne(mapIn);
		System.out.println("UPDATE");
		return "success";
	}
	
	@GetMapping("/{id}/delete")
	public String deleteOne(@PathVariable("id") Long id) {
		Map<String, Object> mapIn = new HashMap<>();
		mapIn.put("id", id);
		this.custMapper.deleteOne(mapIn);
		return "success";
	}
	
}
