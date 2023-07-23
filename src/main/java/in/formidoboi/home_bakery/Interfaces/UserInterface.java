package in.formidoboi.home_bakery.Interfaces;

import java.util.Set;

import in.formidoboi.home_bakery.model.User;

public interface UserInterface extends Base<User>{
	
	public abstract	Set<User> findAll();
	public abstract User findById(int id);
}
