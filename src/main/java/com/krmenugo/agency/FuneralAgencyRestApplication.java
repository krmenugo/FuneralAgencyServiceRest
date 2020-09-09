package com.krmenugo.agency;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class FuneralAgencyRestApplication implements WebApplicationInitializer{
    
	public static void main(String[] args) {
		SpringApplication.run(FuneralAgencyRestApplication.class, args);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
	}

}
