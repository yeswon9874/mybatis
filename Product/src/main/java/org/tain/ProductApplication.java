package org.tain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tain.working.loading.LoadingWork;

@SpringBootApplication
public class ProductApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	@Autowired
	private LoadingWork loadingWork;
	
	@Override
	public void run(String... args) throws Exception {
		this.loadingWork.loading1();
		this.loadingWork.loading2();
		this.loadingWork.loading3();
	}

}
