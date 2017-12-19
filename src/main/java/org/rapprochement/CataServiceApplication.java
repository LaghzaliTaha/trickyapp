package org.rapprochement;

import java.util.List;

import org.rapprochement.dao.BanqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.rapprochement")
@EnableAutoConfiguration
public class CataServiceApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(CataServiceApplication.class, args);
	
	
	}
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
