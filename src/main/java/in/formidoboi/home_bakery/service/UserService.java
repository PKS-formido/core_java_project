package in.formidoboi.home_bakery.service;

import in.formidoboi.home_bakery.dao.UserDAO;
import in.formidoboi.home_bakery.model.User;
import validation.UserValidator;

public class UserService {

	public User[] getAll() {

		UserDAO userDao = new UserDAO();

		User[] userList = userDao.findAll();

		for (int i = 0; i < userList.length; i++) {
			System.out.println(userList[i]);
		}

		return userList;

	}

	public void create(User newUser) throws Exception {
		
		UserValidator.validate(newUser);
		
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);

	}
	
	public void update() {
		User updatedUser = new User();
		
		updatedUser.setId(1234);
		updatedUser.setfName("Formido");
		updatedUser.setsName("Boi");
		updatedUser.setEmail("formidoboi67@gmail.com");
		updatedUser.setPassword("Aspirin2004");
		updatedUser.setActive(true);
		
		UserDAO userDao = new UserDAO();
		userDao.update(updatedUser);
		
	}
	
	public void delete(int userId) {
		UserDAO userDao = new UserDAO();
		userDao.delete(userId);
	}
	
	

}
