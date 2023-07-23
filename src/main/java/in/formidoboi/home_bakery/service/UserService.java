package in.formidoboi.home_bakery.service;

import java.util.Set;

import in.formidoboi.home_bakery.dao.UserDAO;
import in.formidoboi.home_bakery.model.Task;
import in.formidoboi.home_bakery.model.User;
import in.formidoboi.home_bakery.validation.UserValidator;

public class UserService {

	public Set<User> getAll() {

		UserDAO userDao = new UserDAO();

		Set<User> userList = userDao.findAll();

		for (User user : userList) {
			System.out.println(user);
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
		
		updatedUser.setId(12);
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
	
//	public User findById(int userId) {
//		UserDAO userDao = new UserDAO();
//		userDao.findById(userId);
//		
//	}
//	
//	public User findByEmail(String userEmail) {
//		UserDAO userDao = new UserDAO();
//		userDao.findByEmail(userEmail);
//	}

}
