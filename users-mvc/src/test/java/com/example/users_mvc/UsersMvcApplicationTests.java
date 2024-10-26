package com.example.users_mvc;

import com.example.users_mvc.entities.User;
import com.example.users_mvc.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class UsersMvcApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private UserRepository userRepository;

	@Test
	void testAddUser() {
		User user = new User();
		user.setName("Test User");
		user.setEmail("test@example.com");
		userRepository.save(user);
		assertNotNull(userRepository.findById(user.getId()));
	}

}
