package org.tain.working;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tain.working.loading.LoadingWorking;

@Component
public class Working {

	@Autowired
	private LoadingWorking loadingWorking;
	
	public void work() throws Exception {
		this.loadingWorking.load();
	}
}
