package in.formidoboi.home_bakery.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getConnection() {
		Connection connection = null;
		String url = null;
		String userName = null;
		String password = null;

		try {
//			Class.forName("com.mysql.cj.jdbc.Drivers");
//			connection = DriverManager.getConnection(url,userName,password);
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://aws.connect.psdb.cloud/formido_project?sslMode=VERIFY_IDENTITY",
					"hsgbtis5tdnbwibuvy6g", "pscale_pw_NgsA1iFq5aCKqCGFboTU7XRRFviH3gFqmAHZtckE7oj");

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return connection;
	}

	public static void close(Connection connection, PreparedStatement ps) {
		try {
			if (ps != null) {
				ps.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection connection, PreparedStatement ps, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
