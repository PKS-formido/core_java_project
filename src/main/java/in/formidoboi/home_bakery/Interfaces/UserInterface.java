package in.formidoboi.home_bakery.Interfaces;

import java.util.Set;

import in.formidoboi.home_bakery.model.User;

public interface UserInterface extends Base<User>{
	@Override
	public abstract	Set<User> findAll();
	public abstract void create (User newUser);
	@Override
	public abstract User findById(int id);
	public abstract void update(User updatedUser);
	public abstract void delete(int userId);
}
