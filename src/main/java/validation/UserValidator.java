package validation;

import in.formidoboi.home_bakery.model.User;

public class UserValidator {
	
	public static void validate(User user) throws Exception {
		if(user == null) {
			throw new Exception("Invalid user input");
		}
		
		if(user.getEmail() == null || "".equals(user.getEmail().trim())) {
			throw new Exception("Email cannot be null or empty");
		}
		
		if (user.getPassword() == null || "".equals(user.getPassword().trim())) {
			throw new Exception("Password cannot be null or empty");
		}
		
		if (user.getfName() == null || "".equals(user.getfName().trim())) {
			throw new Exception("First name cannot be null or empty");
		}
		
	}
	
}
