package in.formidoboi.home_bakery;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import in.formidoboi.home_bakery.model.User;
import in.formidoboi.home_bakery.service.UserService;

public class TestGetAllUsers {
	
	@Test
	public void getAllUsers() {
		UserService userService = new UserService();
		Set<User> users = userService.getAll();
		
		System.out.println(users);
	}
	
	@Test
	public void getUserById() {
		UserService userService = new UserService();
		User user = userService.findById(2);
		System.out.println(user);
	}

}