package com.pilaka.JenkinTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.slf4j.LoggerFactory;
@SpringBootTest
@RunWith(SpringRunner.class)
class JenkinTestApplicationTests {

	static org.slf4j.Logger  log = LoggerFactory.getLogger(JenkinTestApplicationTests.class);
	@Test
	void contextLoads() {
	System.out.println("Test Case executing");
	
	System.out.println("Test Case testing");
	
	
		assertEquals(true, true);
	}

}
