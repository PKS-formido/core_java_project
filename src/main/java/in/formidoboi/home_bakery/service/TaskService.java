package in.formidoboi.home_bakery.service;

import java.time.LocalDate;

import in.formidoboi.home_bakery.dao.TaskDAO;
import in.formidoboi.home_bakery.model.Task;

public class TaskService {
	
	public Task[] getAll() {
		TaskDAO taskDAO = new TaskDAO();
		Task[] taskList = taskDAO.findAll();
		
		for (int i = 0; i < taskList.length; i++) {
			System.out.println(taskList[i]);
		}
		
		return taskList;
	}
	
	public void create(Task newTask) {
		TaskDAO taskDao = new TaskDAO();
		taskDao.create(newTask);
	}
	
	public void update() {
		Task updatedTask = new Task();
		
		updatedTask.setDueDate(LocalDate.of(2023, 10, 31));
		updatedTask.setName("Wash Clothes");
		
		TaskDAO taskDao = new TaskDAO();
		taskDao.update(updatedTask);
		
	}
	
	public void delete(int taskId) {
		
		TaskDAO taskDao = new TaskDAO();
		taskDao.delete(taskId);
		
	}
	
}
