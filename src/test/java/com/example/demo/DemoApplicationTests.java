package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@DisplayName("Demo tests")
class DemoApplicationTests {

	@Test
	@DisplayName("Sum of two numbers")
	void contextLoads() {
		Assertions.assertEquals(3, sum(1, 2));
	}

	private int sum(int a, int b) {
		return a + b;
	}

}
