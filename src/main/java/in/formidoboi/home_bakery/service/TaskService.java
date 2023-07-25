package in.formidoboi.home_bakery.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import in.formidoboi.home_bakery.dao.TaskDAO;
import in.formidoboi.home_bakery.exception.ValidationException;
import in.formidoboi.home_bakery.model.Task;
import in.formidoboi.home_bakery.model.TaskEntity;
import in.formidoboi.home_bakery.model.User;
import in.formidoboi.home_bakery.validation.TaskValidator;

public class TaskService {
	
	public Set<Task> getAll() {
		TaskDAO taskDAO = new TaskDAO();
		
		Set<Task> taskList = taskDAO.findAll();
		
		for (Task task : taskList) {
			System.out.println(task);
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
		
		TaskDAO taskDao = new TaskDAO();
		taskDao.update(1, updatedTask1);
		
	}
	
	public void delete(int taskId) {
		
		TaskDAO taskDao = new TaskDAO();
		taskDao.delete(taskId);
		
	}
	
}
