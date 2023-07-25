package in.formidoboi.home_bakery.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class TaskEntity {
	private int id;
	private String task_name;
	private String due_date;
	private boolean is_active;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return task_name;
	}
	public void setName(String name) {
		this.task_name = name;
	}
	public String getDueDate() {
		return due_date;
	}
	public void setDueDate(String dueDate) {
		this.due_date = dueDate;
	}
	public boolean isActive() {
		return is_active;
	}
	public void setActive(boolean isActive) {
		this.is_active = isActive;
	}
	
	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + task_name + ", dueDate=" + due_date + ", isActive=" + is_active + "]";
	}
	
}
