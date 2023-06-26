package in.formidoboi.home_bakery;

import in.formidoboi.home_bakery.service.UserService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserService();
		userService.create();
		userService.getAll();
	}

}
