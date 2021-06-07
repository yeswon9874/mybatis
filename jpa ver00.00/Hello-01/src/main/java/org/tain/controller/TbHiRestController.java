package org.tain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tain.jpa.domain.TbHi;
import org.tain.jpa.repository.TbHiRepository;

@RestController
@RequestMapping("/hi")
public class TbHiRestController {

	@Autowired
	private TbHiRepository tbHiRepository;
	
	@GetMapping("/list")
	public List<TbHi> list() {
		return this.tbHiRepository.findAll();
	}
}
