package org.tain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tain.working.loading.LoadingWork;

@SpringBootApplication
public class SportShoes01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SportShoes01Application.class, args);
	}
	
	@Autowired
	private LoadingWork loadingWork;

	@Override
	public void run(String... args) throws Exception {
		this.loadingWork.loading();
	}

}
