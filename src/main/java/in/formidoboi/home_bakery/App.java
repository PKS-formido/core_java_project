package in.formidoboi.home_bakery;

import in.formidoboi.home_bakery.model.User;
import in.formidoboi.home_bakery.service.UserService;

public class App {

	public static void main(String[] args){
		try {
			UserService userService = new UserService();
			User newUser = new User();

			newUser.setId(1234);
			newUser.setfName("Formido");
			newUser.setsName("Boi");
			newUser.setEmail("formidoboi67@gmail.com");
			newUser.setPassword("Aspirin2004");
			newUser.setActive(true);

			userService.create(newUser);
			userService.getAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
