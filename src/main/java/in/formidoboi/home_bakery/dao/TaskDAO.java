package in.formidoboi.home_bakery.dao;

import in.formidoboi.home_bakery.model.Task;

public class TaskDAO {

	public Task[] findAll() {
		Task[] taskList = TaskList.listOfTasks;
		return taskList;
	}

	public void create(Task newTask) {
		Task[] arr = TaskList.listOfTasks;
		for (int i = 0; i < arr.length; i++) {
			Task task = arr[i];
			if (task == null) {
				arr[i] = newTask;
				break;
			}

		}
	}
	
	public void update(Task updatedTask) {
		Task[] arr = TaskList.listOfTasks;
		for (int i = 0; i < arr.length; i++) {
			Task task = arr[i];
			if (task == null) {
				continue;
			}
			if (task.getId() == updatedTask.getId()) {
				task.setName(updatedTask.getName());
				task.setDueDate(updatedTask.getDueDate());

				break;
			}
		}
	}
	
	public void delete(int taskId) {
		Task[] arr = TaskList.listOfTasks;
		for (int i = 0; i < arr.length; i++) {
			Task task = arr[i];
			if (task == null) {
				continue;
			}
			if (task.getId() == taskId) {
				task.setActive(false);
				break;
			}
		}
	}
}
