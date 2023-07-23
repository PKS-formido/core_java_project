package in.formidoboi.home_bakery;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import in.formidoboi.home_bakery.exception.ValidationException;
import in.formidoboi.home_bakery.model.TaskEntity;
import in.formidoboi.home_bakery.model.Task;
import in.formidoboi.home_bakery.service.TaskService;

public class TestCreateTask {
	
	@Test
	public void testCreateTaskWithValidData() {
		TaskService taskService = new TaskService();
		Task newTask = new Task();
		
		newTask.setId(5);
		newTask.setName("Clean plates");
		newTask.setDueDate(LocalDate.of(2023, 11, 24));
		newTask.setActive(true);
		
		assertDoesNotThrow(() -> {
			taskService.create(newTask);
		});
	}
	
	@Test
	public void testCreateTaskWithInvalidData() {
		TaskService taskService = new TaskService();
		
		Exception exception = assertThrows(ValidationException.class, () -> {
			taskService.create(null);
		});
		
		String expectedMessage = "Invalid task input";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	@Test
	public void testCreateUserWithInvalidDueDate() {
		TaskService taskService = new TaskService();
		
		Task newTask = new Task();
		
		newTask.setActive(true);
		newTask.setName("Wash wash");
		newTask.setId(2);
		newTask.setDueDate(null);
		
		Exception exception = assertThrows(ValidationException.class, () -> {
			taskService.create(newTask);
		});
		
		String expectedMessage = "Date cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
		
	}
}
