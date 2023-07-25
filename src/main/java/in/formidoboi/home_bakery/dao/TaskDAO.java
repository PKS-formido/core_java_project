package in.formidoboi.home_bakery.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

import in.formidoboi.home_bakery.Interfaces.TaskInterface;
import in.formidoboi.home_bakery.model.Task;
import in.formidoboi.home_bakery.model.TaskEntity;
import in.formidoboi.home_bakery.model.User;
import in.formidoboi.home_bakery.util.ConnectionUtil;

public class TaskDAO implements TaskInterface{

	@Override
	public void create(Task newTask) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			String query = "INSERT INTO tasks (task_name, due_date) VALUES (?,?)";
			conn = ConnectionUtil.getConnection();
			ps = conn.prepareStatement(query);

			ps.setString(1, newTask.getName());
			ps.setString(2, newTask.getDueDate());

			ps.executeUpdate();

			System.out.println("Task has been successfully created");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
		} finally {
			ConnectionUtil.close(conn, ps);
		}
	}


	@Override
	public Task findById(int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		Task task = null;
		ResultSet rs = null;

		try {
			String query = "SELECT * FROM tasks WHERE is_active = 1 AND id = ?";
			conn = ConnectionUtil.getConnection();
			ps = conn.prepareStatement(query);

			ps.setInt(1, id);

			rs = ps.executeQuery();

			if (rs.next()) {
				task = new Task();
				task.setId(rs.getInt("id"));
				task.setName(rs.getString("task_name"));
				task.setDueDate("2023-10-11");
				task.setActive(rs.getBoolean("is_active"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
		} finally {
			ConnectionUtil.close(conn, ps, rs);
		}
		return task;
	}

	@Override
	public void update(int id,Task updatedTask) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			String query = "UPDATE tasks SET task_name = ? , due_date = ? WHERE is_active = 1 AND id = ?";
			conn = ConnectionUtil.getConnection();
			ps = conn.prepareStatement(query);

			ps.setString(1, updatedTask.getName());
			ps.setString(2, updatedTask.getDueDate());
			ps.setInt(3, id);
			ps.executeUpdate();

			System.out.println("User has been successfully updated");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
		} finally {
			ConnectionUtil.close(conn, ps);
		}
	}

	@Override
	public Set<Task> findAll() {
		Connection conn = null;
		PreparedStatement ps = null;
		Set<Task> setOfTask = new HashSet<>();
		ResultSet rs = null;

		try {
			String query = "SELECT * FROM tasks WHERE is_active = 1";
			conn = ConnectionUtil.getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				Task task = new Task();
				task.setId(rs.getInt("id"));
				task.setName(rs.getString("task_name"));
				task.setActive(rs.getBoolean("is_active"));
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
				String date = dateFormat.format(rs.getDate("due_date"));
				task.setDueDate(date);
				setOfTask.add(task);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
		} finally {
			ConnectionUtil.close(conn, ps, rs);
		}
		return setOfTask;
	}

	@Override
	public void delete(int TaskId) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			String query = "UPDATE tasks SET is_active = ? WHERE is_active = 1 AND id = ?";
			conn = ConnectionUtil.getConnection();
			ps = conn.prepareStatement(query);

			ps.setInt(1, 0);
			ps.setInt(2, TaskId);
			ps.executeUpdate();

			System.out.println("Task has been successfully deactivated");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
		} finally {
			ConnectionUtil.close(conn, ps);
		}
	}
}
