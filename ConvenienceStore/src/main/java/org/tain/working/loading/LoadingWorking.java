package org.tain.working.loading;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tain.jpa.domain.TbCust;
import org.tain.jpa.domain.TbCustProd;
import org.tain.jpa.domain.TbProd;
import org.tain.jpa.repository.TbCustProdRepository;
import org.tain.jpa.repository.TbCustRepository;
import org.tain.jpa.repository.TbProdRepository;
import org.tain.working.properties.ProjEnvParam;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class LoadingWorking {

	@Autowired
	private ProjEnvParam projEnvParam;
	
	public void load() throws Exception {
		loadCust();
		loadProd();
		loadCustProd();
	}
	
	private Long id = 0L;
	
	@Autowired
	private TbCustRepository tbCustRepository;
	
	public void loadCust() throws Exception{
		
		String fileName = this.projEnvParam.getBasePath() + File.separator + this.projEnvParam.getCustFile();
		List<TbCust> lst = new ObjectMapper().readValue(new File(fileName), new TypeReference <List<TbCust>>() {});
		lst.forEach(item -> {
			item.setId(this.id);
			this.tbCustRepository.save(item);
			this.id++;
		});
	}
	
	@Autowired
	private TbProdRepository tbProdRepository;
	
	public void loadProd() throws Exception {
		String fileName = this.projEnvParam.getBasePath() + File.separator + this.projEnvParam.getProdFile();
		List<TbProd> lst = new ObjectMapper().readValue(new File(fileName), new TypeReference <List<TbProd>>() {});
		lst.forEach(item -> {
			item.setId(this.id);
			this.tbProdRepository.save(item);
			this.id++;
		});
	}
	
	@Autowired
	private TbCustProdRepository tbCustProdRepository;
	
	public void loadCustProd() throws Exception {
		String fileName = this.projEnvParam.getBasePath() + File.separator + this.projEnvParam.getCustProdFile();
		List<TbCustProd> lst = new ObjectMapper().readValue(new File(fileName), new TypeReference <List<TbCustProd>>() {});
		lst.forEach(item -> {
			item.setId(this.id);
			this.tbCustProdRepository.save(item);
			this.id++;
		});
	}
}
