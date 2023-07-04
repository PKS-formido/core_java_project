package in.formidoboi.home_bakery.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import in.formidoboi.home_bakery.dao.TaskDAO;
import in.formidoboi.home_bakery.exception.ValidationException;
import in.formidoboi.home_bakery.model.Task;
import in.formidoboi.home_bakery.validation.TaskValidator;

public class TaskService {
	
	public Task[] getAll() {
		TaskDAO taskDAO = new TaskDAO();
		Task[] taskList = taskDAO.findAll();
		
		for (int i = 0; i < taskList.length; i++) {
			System.out.println(taskList[i]);
		}
		
		return taskList;
	}
	
	public void create(Task newTask) throws ValidationException {
		
		TaskValidator.validate(newTask);
		TaskDAO taskDao = new TaskDAO();
		taskDao.create(newTask);
	}
	
	public static LocalDate convertToDate(String dateString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			LocalDate localDate = LocalDate.parse(dateString, formatter);
			return localDate;
		} catch (Exception e) {
			System.out.println("Invalid date format!");
			return null;
		}
	}
	
	public void update(Task updatedTask1) {
//		Task updatedTask = new Task();
//		
//		updatedTask.setDueDate(LocalDate.of(2023, 10, 31));
//		updatedTask.setName("Wash Clothes");
		
		TaskDAO taskDao = new TaskDAO();
		taskDao.update(updatedTask1);
		
	}
	
	public void delete(int taskId) {
		
		TaskDAO taskDao = new TaskDAO();
		taskDao.delete(taskId);
		
	}
	
}
