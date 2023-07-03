package in.formidoboi.home_bakery.dao;

import in.formidoboi.home_bakery.model.User;

public class UserDAO {

	public User[] findAll() {
		User[] userList = UserList.listOfUsers;
		return userList;
	}

	/**
	 * 
	 * @param newUser
	 */
	public void create(User newUser) {
		// TODO Auto-generated method stub
		User[] arr = UserList.listOfUsers;
		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			if (user == null) {
				arr[i] = newUser;
				break;
			}
		}
	}

	/**
	 * 
	 * @param id
	 * @param updatedUser
	 */
	public void update(User updatedUser) {
		User[] arr = UserList.listOfUsers;
		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			if (user == null) {
				continue;
			}
			if (user.getId() == updatedUser.getId()) {
				user.setfName(updatedUser.getfName());
				user.setsName(updatedUser.getsName());
				user.setPassword(updatedUser.getPassword());

				break;
			}
		}
	}

	/**
	 * 
	 * @param userId
	 */
	public void delete(int userId) {
		User[] arr = UserList.listOfUsers;
		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			if (user == null) {
				continue;
			}
			if (user.getId() == userId) {
				user.setActive(false);
				break;
			}
		}
	}

	public User findById(int userId) {
		User[] userList = UserList.listOfUsers;
		User userMatch = null;

		for (int i = 0; i < userList.length; i++) {
			User user = userList[i];
			if (user.getId() == userId) {
				userMatch = user;
				break;
			}
		}
		return userMatch;
	}
	
	public User findByEmail(String userEmail) {
		User[] userList = UserList.listOfUsers;
		User userMatch = null;
		
		for (int i = 0; i < userList.length; i++) {
			User user = userList[i];
			if(user.getEmail() == userEmail) {
				userMatch = user;
				break;
			}
		}
		return userMatch;
	}

}
