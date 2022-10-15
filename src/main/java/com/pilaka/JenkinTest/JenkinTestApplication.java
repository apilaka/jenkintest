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
		log.info("executing test class9999999999");
		log.info("executing test 101010");
		log.info("executing test class9999999999");
		log.info("executing test 101010");
		log.info("executing test 33333");
		SpringApplication.run(JenkinTestApplication.class, args);
		init();
	}

}
