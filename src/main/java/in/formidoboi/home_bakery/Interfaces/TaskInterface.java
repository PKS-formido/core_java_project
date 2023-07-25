package in.formidoboi.home_bakery.Interfaces;

import java.util.Set;

import in.formidoboi.home_bakery.model.Task;
import in.formidoboi.home_bakery.model.User;

public interface TaskInterface extends Base<Task>{
	@Override
	public abstract	Set<Task> findAll();
	@Override
	public abstract Task findById(int id);
}
