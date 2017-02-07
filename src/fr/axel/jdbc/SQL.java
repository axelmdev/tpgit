package fr.axel.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL {

		Connection connection = null;
		public Connection getConnection() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				if (connection == null)
					connection = DriverManager
							.getConnection("jdbc:mysql://localhost/tpgit?user=root&password=");
					System.out.println("Connexion réussi " + connection);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();

			} catch (SQLException e) {

				e.printStackTrace();

			}
			return connection;
		}
		public void closeConnection() {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				// do nothing
			}
		}
}
