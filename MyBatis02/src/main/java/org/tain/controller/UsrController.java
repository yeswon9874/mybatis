package org.tain.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tain.mappers.UsrMapper;

@RestController
@RequestMapping("/usr")
public class UsrController {

	@Autowired
	private UsrMapper usrMapper;
	
	@GetMapping("/list")
	public List<Map<String,Object>> list() {
		return this.usrMapper.selectAllUsr();
	}
}
