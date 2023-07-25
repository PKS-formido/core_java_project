package in.formidoboi.home_bakery;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import in.formidoboi.home_bakery.model.Task;
import in.formidoboi.home_bakery.model.User;
import in.formidoboi.home_bakery.service.TaskService;
import in.formidoboi.home_bakery.service.UserService;

public class TestUpdatedTask {
	
	@Test
	public void testUpdateTaskWithValidData() {
		TaskService taskService = new TaskService();
		Task updatedTask = new Task();
		
		updatedTask.setName("PLay Games");
		updatedTask.setDueDate("2023-11-20");

		assertDoesNotThrow(() -> {
			taskService.update(2, updatedTask);
		});
	}
	
	@Test
	public void testDeactivatedTask() {
		TaskService taskService = new TaskService();
		Task updatedTask = new Task();
		
		assertDoesNotThrow(() -> {
			taskService.delete(2);
		});
	}
	
}
