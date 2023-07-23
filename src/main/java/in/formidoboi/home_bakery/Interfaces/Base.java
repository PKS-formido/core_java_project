package in.formidoboi.home_bakery.Interfaces;

import in.formidoboi.home_bakery.model.User;
import in.formidoboi.home_bakery.model.UserEntity;

public interface Base<T> {
	public abstract <T> T findAll();
	public abstract void create(T newT);
	public abstract void update(T newT);
	public abstract void delete(int id);
	public abstract <T> T findById(int id);
}
