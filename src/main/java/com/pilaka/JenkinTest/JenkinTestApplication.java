package com.pilaka.JenkinTest;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinTestApplication {

	static org.slf4j.Logger log = LoggerFactory.getLogger(JenkinTestApplication.class);
	
	@PostConstruct
	static void init() {
		log.info("application started3333333333333333333333333333333");
	}
	public static void main(String[] args) {
		log.info("application executed1111111111111111111111111111");	
		log.info("executing test class2222222222222222222222222222");
		SpringApplication.run(JenkinTestApplication.class, args);
		init();
	}

}
