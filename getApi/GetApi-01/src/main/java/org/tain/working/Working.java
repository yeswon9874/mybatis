package org.tain.working;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tain.working.http.HttpWorking;

@Component
public class Working {

	@Autowired
	private HttpWorking httpWorking;
	
	public void test() throws Exception {
		this.httpWorking.test();
	}
}
