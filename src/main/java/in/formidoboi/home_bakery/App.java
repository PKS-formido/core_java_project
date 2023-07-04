package in.formidoboi.home_bakery;

import java.time.LocalDate;

import in.formidoboi.home_bakery.model.Task;
import in.formidoboi.home_bakery.model.User;
import in.formidoboi.home_bakery.service.TaskService;
import in.formidoboi.home_bakery.service.UserService;

public class App {

	public static void main(String[] args){
		try {
			UserService userService = new UserService();
			User newUser = new User();

			newUser.setId(1234);
			newUser.setfName("Formido");
			newUser.setsName("Boi");
			newUser.setEmail("formidoboi67@gmail.com");
			newUser.setPassword("Aspirin2004");
			newUser.setActive(true);

			userService.create(newUser);
//			userService.getAll(); 
			
			TaskService taskService = new TaskService();
			Task newTask = new Task();
			
			newTask.setActive(true);
			newTask.setId(3);
			newTask.setName("Wash cloths Maruthan");
			String userInput = "23/07/2023";
		    LocalDate convertedDate = TaskService.convertToDate(userInput);
		    newTask.setDueDate(convertedDate);
			
			taskService.create(newTask);
			
			taskService.getAll();
			taskService.update(newTask);
			taskService.getAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
