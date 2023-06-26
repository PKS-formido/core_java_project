package in.formidoboi.home_bakery.dao;

import in.formidoboi.home_bakery.model.User;

public class UserDAO {
	
	public User[] findAll() {
		User[] userList = UserList.listOfUsers;
		return userList;
	}
	
	public void create() {
		User newUser = new User();
		
		newUser.setId(1234);
		newUser.setfName("Formido");
		newUser.setsName("Boi");
		newUser.setEmail("formidoboi67@gmail.com");
		newUser.setPassword("Aspirin2004");
		newUser.setActive(true);
		
		UserList.listOfUsers[0] = newUser;
		
	}
	
}
