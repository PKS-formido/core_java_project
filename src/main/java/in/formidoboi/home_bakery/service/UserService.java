package in.formidoboi.home_bakery.service;

import in.formidoboi.home_bakery.dao.UserDAO;
import in.formidoboi.home_bakery.model.User;

public class UserService {

	public User[] getAll () {
		
		UserDAO userDao = new UserDAO();
		
		User[] userList =  userDao.findAll();
		
		for (int i = 0; i < userList.length; i++) {
			System.out.println(userList[i]);
		}
		
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
		
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);
		
		
	}
	
}
