package org.tain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tain.working.Working;

@SpringBootApplication
public class GetApi01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GetApi01Application.class, args);
	}

	///////////////////////////////////////////////////////////////////////////
	
	@Autowired
	private Working working;
	
	@Override
	public void run(String... args) throws Exception {
		this.working.test();
		
		System.exit(0);
	}
}
