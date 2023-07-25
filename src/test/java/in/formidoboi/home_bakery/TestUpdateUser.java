package in.formidoboi.home_bakery;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import in.formidoboi.home_bakery.model.User;
import in.formidoboi.home_bakery.service.UserService;

public class TestUpdateUser {

	@Test
	public void testUpdateUserWithValidData() {
		UserService userService = new UserService();
		User updatedUser = new User();
		
		updatedUser.setfName("Deepika");
		updatedUser.setsName("Sriram");

		assertDoesNotThrow(() -> {
			userService.update(2, updatedUser);
		});
	}
	
}
