package org.tain.working.loading;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tain.domain.TbCustProd;
import org.tain.domain.TbCustomer;
import org.tain.domain.TbProduct;
import org.tain.repository.TbCustomerProductRepository;
import org.tain.repository.TbCustomerRepository;
import org.tain.repository.TbProdRepository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class LoadingWork {
	@Autowired
	private TbProdRepository tbProdRepository;
	@Autowired
	private TbCustomerRepository tbCustomerRepository;
	@Autowired
	private TbCustomerProductRepository tbCustomerProductRepository;
	
	private Long idx = 0L;
	
	public void loading1() throws Exception {
		List<TbProduct> lstTbProd = new ObjectMapper().readValue(new File("/Users/limyewon/_YESWON/product.json"), new TypeReference<List<TbProduct>>() {});
		System.out.println(lstTbProd);
		
		lstTbProd.forEach(itm -> {
			itm.setId(this.idx);
			this.tbProdRepository.save(itm);
			this.idx++;
		});
	}
	
	public void loading2() throws Exception {
		List<TbCustomer> lstTbCustomer = new ObjectMapper().readValue(new File("/Users/limyewon/_YESWON/customer.json"), new TypeReference<List<TbCustomer>>() {});
		System.out.println(lstTbCustomer);
		
		lstTbCustomer.forEach(itm -> {
			itm.setId(this.idx);
			this.tbCustomerRepository.save(itm);
			this.idx++;
		});
	}
	
	public void loading3() throws Exception {
		List<TbCustProd> lstTbCustProd = new ObjectMapper().readValue(new File("/Users/limyewon/_YESWON/cust_prod.json"), new TypeReference<List<TbCustProd>>() {});
		System.out.println(lstTbCustProd);
		
		lstTbCustProd.forEach(itm -> {
			itm.setId(this.idx);
			this.tbCustomerProductRepository.save(itm);
			this.idx++;
		});
	}
}
