package in.formidoboi.home_bakery.Interfaces;

import in.formidoboi.home_bakery.model.User;
import in.formidoboi.home_bakery.model.UserEntity;

public interface Base<T> {
	public abstract <T> T findAll();
	public abstract void create();
	public abstract void update();
	public abstract void delete();
	public abstract <T> T findById(int id);
}
