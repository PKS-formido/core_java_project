package in.formidoboi.home_bakery.Interfaces;

import java.util.Set;

import in.formidoboi.home_bakery.model.Task;
import in.formidoboi.home_bakery.model.User;

public interface TaskInterface extends Base<Task>{
	@Override
	public abstract	Set<Task> findAll();
	public abstract void create (Task newTask);
	@Override
	public abstract Task findById(int id);
	public abstract void update(Task updatedTask);
	public abstract void delete(int TaskId);
}
