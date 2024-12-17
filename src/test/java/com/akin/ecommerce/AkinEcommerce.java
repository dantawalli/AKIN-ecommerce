package com.akin.ecommerce;

import com.akin.ecommerce.controller.UserController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class AkinEcommerceTests {

	@Autowired
	UserController userController;

	@Test
	@DisplayName("First test example")
	void contextLoads() {
		assertThat(userController).isNotNull();
	}

}