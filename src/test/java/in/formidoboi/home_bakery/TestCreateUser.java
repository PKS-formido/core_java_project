package in.formidoboi.home_bakery;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.formidoboi.home_bakery.model.User;
import in.formidoboi.home_bakery.service.UserService;

public class TestCreateUser {

	@Test
	public void testCreateUserWithValidData() {
		UserService userService = new UserService();
		User newUser = new User();

		newUser.setId(1234);
		newUser.setfName("Formido");
		newUser.setsName("Boi");
		newUser.setEmail("formidoboi67@gmail.com");
		newUser.setPassword("Aspirin2004");
		newUser.setActive(true);

		assertDoesNotThrow(() -> {
			userService.create(newUser);
		});
	}

	@Test
	public void testCreateUserWithInvalidData() {
		UserService userService = new UserService();

		Exception exception = assertThrows(Exception.class, () -> {
			userService.create(null);
		});

		String expectedMessage = "Invalid user input";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test
	public void testCreateUserWithEmailNull() {
		UserService userService = new UserService();
		
		User newUser = new User();

		newUser.setId(1234);
		newUser.setfName("Formido");
		newUser.setsName("Boi");
		newUser.setEmail(null);
		newUser.setPassword("Aspirin2004");
		newUser.setActive(true);


		Exception exception = assertThrows(Exception.class, () -> {
			userService.create(newUser);
		});

		String expectedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	@Test
	public void testCreateUserWithEmailEmpty() {
		UserService userService = new UserService();
		
		User newUser = new User();

		newUser.setId(1234);
		newUser.setfName("Formido");
		newUser.setsName("Boi");
		newUser.setEmail("");
		newUser.setPassword("Aspirin2004");
		newUser.setActive(true);


		Exception exception = assertThrows(Exception.class, () -> {
			userService.create(newUser);
		});

		String expectedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}

}
