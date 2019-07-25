package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.demo.model.CsvLoader;

@SpringBootApplication
@EnableJpaAuditing
public class CsvToDatabaseProApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CsvToDatabaseProApplication.class, args);
		CsvLoader csvLoader=new CsvLoader();
		csvLoader.run();
		
		
	}

}
