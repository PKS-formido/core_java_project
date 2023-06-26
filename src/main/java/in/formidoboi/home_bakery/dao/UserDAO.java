package in.formidoboi.home_bakery.dao;

import in.formidoboi.home_bakery.model.User;

public class UserDAO {
	
	public User[] findAll() {
		User[] userList = UserList.listOfUsers;
		return userList;
	}

	public void create(User newUser) {
		// TODO Auto-generated method stub
		UserList.listOfUsers[0] = newUser;
	}
	
}
