package org.tain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tain.jpa.domain.TbUser;
import org.tain.jpa.repository.TbUserRepository;
import org.tain.mybatis.mappers.UsrMapper;
import org.tain.mybatis.models.Usr;

@RestController
@RequestMapping("/usr")
public class UsrController {

	@Autowired
	private TbUserRepository tbUserRepository;
	
	@GetMapping("/list2")
	public List<TbUser> list2() {
		return this.tbUserRepository.findAll();
	}
	////////////////////////////////////////////////////////////
	
	@Autowired
	private UsrMapper usrMapper;
	
	@GetMapping("/list")
	public List<Usr> list() {
		return this.usrMapper.selectAllUsr();
	}
	
}
