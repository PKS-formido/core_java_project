package in.formidoboi.home_bakery;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.formidoboi.home_bakery.exception.ValidationException;
import in.formidoboi.home_bakery.model.User;
import in.formidoboi.home_bakery.service.UserService;

public class TestCreateUser {

	@Test
	public void testCreateUserWithValidData() {
		UserService userService = new UserService();
		User newUser = new User();
		
		newUser.setfName("Formido");
		newUser.setsName("Boi");
		newUser.setEmail("formido123@gmail.com");
		newUser.setPassword("Aspirin2004");

		assertDoesNotThrow(() -> {
			userService.create(newUser);
		});
	}

	@Test
	public void testCreateUserWithInvalidData() {
		UserService userService = new UserService();

		Exception exception = assertThrows(ValidationException.class, () -> {
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

//		newUser.setId(1234);
		newUser.setfName("Formido");
		newUser.setsName("Boi");
		newUser.setEmail(null);
		newUser.setPassword("Aspirin2004");
//		newUser.setActive(true);


		Exception exception = assertThrows(ValidationException.class, () -> {
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


		Exception exception = assertThrows(ValidationException.class, () -> {
			userService.create(newUser);
		});

		String expectedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	@Test
	public void testCreateUserWithPasswordNull() {
		UserService userService = new UserService();
		
		User newUser = new User();

		newUser.setId(1234);
		newUser.setfName("Formido");
		newUser.setsName("Boi");
		newUser.setEmail("formidoboi67@gmail.com");
		newUser.setPassword(null);
		newUser.setActive(true);


		Exception exception = assertThrows(ValidationException.class, () -> {
			userService.create(newUser);
		});

		String expectedMessage = "Password cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	@Test
	public void testCreateUserWithPasswordEmpty() {
		UserService userService = new UserService();
		
		User newUser = new User();

		newUser.setId(1234);
		newUser.setfName("Formido");
		newUser.setsName("Boi");
		newUser.setEmail("formidoboi67@gmail.com");
		newUser.setPassword("");
		newUser.setActive(true);


		Exception exception = assertThrows(ValidationException.class, () -> {
			userService.create(newUser);
		});

		String expectedMessage = "Password cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	@Test
	public void testCreateUserWithFirstNameNull() {
		UserService userService = new UserService();
		
		User newUser = new User();

		newUser.setId(1234);
		newUser.setfName(null);
		newUser.setsName("Boi");
		newUser.setEmail("formidoboi67@gmail.com");
		newUser.setPassword("Aspirin2004");
		newUser.setActive(true);


		Exception exception = assertThrows(ValidationException.class, () -> {
			userService.create(newUser);
		});

		String expectedMessage = "First Name cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	@Test
	public void testCreateUserWithFirstNameEmpty() {
		UserService userService = new UserService();
		
		User newUser = new User();

		newUser.setId(1234);
		newUser.setfName("");
		newUser.setsName("Boi");
		newUser.setEmail("formidoboi67@gmail.com");
		newUser.setPassword("Aspirin2004");
		newUser.setActive(true);


		Exception exception = assertThrows(ValidationException.class, () -> {
			userService.create(newUser);
		});

		String expectedMessage = "First Name cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}

}
