package org.tain.working.loading;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tain.jpa.domain.TbHi;
import org.tain.jpa.repository.TbHiRepository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class LoadingWork {

	@Autowired
	private TbHiRepository tbHiRepository;
	
	private long idx = 0L;
	
	public void loading() throws Exception {
		List<TbHi> lstTbhi = new ObjectMapper().readValue(new File("/Users/limyewon/_YESWON/data.json"), new TypeReference<List<TbHi>>() {});
		System.out.println(">>>>> " + lstTbhi);
		
		if (Boolean.TRUE) {
			for (int i=0; i < lstTbhi.size(); i++) {
				TbHi itm = lstTbhi.get(i);
				itm.setId((long) i);
				this.tbHiRepository.save(itm);
			}
		} else {
			lstTbhi.forEach(itm -> {
				itm.setId(this.idx);
				this.tbHiRepository.save(itm);
				this.idx++;
			});
		}
	}
}
