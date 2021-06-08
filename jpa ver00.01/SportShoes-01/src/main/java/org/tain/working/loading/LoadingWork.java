package org.tain.working.loading;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tain.jpa.domain.TbShoes;
import org.tain.jpa.repository.TbShoesRepository;

import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class LoadingWork {

	@Autowired
	private TbShoesRepository tbShoesRepository;
	
	private long idx = 0L;
	
	public void loading() throws Exception {
		List<TbShoes> lstTbShoes = new ObjectMapper().readValue(new File("/Users/limyewon/_YESWON/shoes.json"), new com.fasterxml.jackson.core.type.TypeReference<List<TbShoes>>() {
		});
		System.out.println(">>>>>" + lstTbShoes);
		
		if (Boolean.TRUE) {
			for (int i =0; i < lstTbShoes.size(); i++) {
				TbShoes itm = lstTbShoes.get(i);
				itm.setId((long) i);
				this.tbShoesRepository.save(itm);
			}
		} else {
			lstTbShoes.forEach(itm -> {
				itm.setId(this.idx);
				this.tbShoesRepository.save(itm);
				this.idx++;
			});
		}
	}
}
