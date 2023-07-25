package in.formidoboi.home_bakery.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class TaskEntity {
	private int id;
	private String name;
	private LocalDate dueDate;
	private boolean isActive;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", dueDate=" + dueDate + ", isActive=" + isActive + "]";
	}
	
}