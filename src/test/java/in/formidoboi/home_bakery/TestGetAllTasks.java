package in.formidoboi.home_bakery;

import java.util.Set;

import org.junit.jupiter.api.Test;

import in.formidoboi.home_bakery.model.Task;
import in.formidoboi.home_bakery.model.User;
import in.formidoboi.home_bakery.service.TaskService;
import in.formidoboi.home_bakery.service.UserService;

public class TestGetAllTasks {

	@Test
	public void getAllTasks() {
		TaskService taskService = new TaskService();
		Set<Task> tasks = taskService.getAll();

		System.out.println(tasks);
	}

	@Test
	public void getTaskById() {
		TaskService taskService = new TaskService();
		Task task = taskService.findById(4);
		System.out.println(task);
	}
}
