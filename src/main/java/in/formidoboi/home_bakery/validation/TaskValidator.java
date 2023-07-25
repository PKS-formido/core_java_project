package in.formidoboi.home_bakery.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import in.formidoboi.home_bakery.exception.ValidationException;
import in.formidoboi.home_bakery.model.TaskEntity;
import in.formidoboi.home_bakery.util.StringUtil;

public class TaskValidator {

	public static void validate(TaskEntity task) throws ValidationException {

		if (task == null) {
			throw new ValidationException("Invalid task input");
		}

		if (task.getDueDate() == null) {
			throw new ValidationException("Date cannot be null or empty");
		}

		LocalDate localDate = LocalDate.parse(task.getDueDate());
		if (localDate.isBefore(LocalDate.now())) {
			throw new ValidationException("Invalid due date");
		}

		StringUtil.rejectIfInvalidString(task.getName(), "Name");
	}
}
