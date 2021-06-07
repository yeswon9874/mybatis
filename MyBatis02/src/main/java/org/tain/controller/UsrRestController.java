package org.tain.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tain.mappers.UsrMapper;

@RestController
@RequestMapping("/usr")
public class UsrRestController {

	@Autowired
	private UsrMapper usrMapper;
	
	@GetMapping(value = {"", "/list"})
	public List<Map<String,Object>> list() {
		return this.usrMapper.selectAll(null);
	}
	
	@GetMapping("/{id}")
	public Map<String,Object> one(@PathVariable("id") Long id) {
		Map<String,Object> mapIn = new HashMap<>();
		mapIn.put("id", id);
		mapIn.put("imsi", "Hello");
		System.out.println("SELECT_ONE");
		return this.usrMapper.selectOne(mapIn);
	}
	
	@GetMapping("/{id}/create")
	public String createOne(@PathVariable("id") Long id) {
		Map<String,Object> mapIn = new HashMap<>();
		mapIn.put("id", id);
		mapIn.put("userId", "kang");
		mapIn.put("passWd", "seok");
		mapIn.put("desc", "Hello Desc");
		this.usrMapper.createOne(mapIn);
		return "success";
	}
	
	@GetMapping("/{id}/update")
	public String updateOne(@PathVariable("id") Long id) {
		Map<String,Object> mapIn = new HashMap<>();
		mapIn.put("id", id);
		mapIn.put("desc", "hello");
		this.usrMapper.updateOne(mapIn);
		System.out.println("UPDATE");
		return "success";
	}
	
	@GetMapping("/{id}/delete")
	public String deleteOne(@PathVariable("id") Long id) {
		Map<String,Object> mapIn = new HashMap<>();
		mapIn.put("id", id);
		this.usrMapper.deleteOne(mapIn);
		return "success";
	}
}
