package Control_Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private static final String URL = "jdbc:mysql://localhost:3306/optical"; // Update as needed
    private static final String USER = "root"; // Database username
    private static final String PASSWORD = ""; // Database password

    // Private constructor to prevent instantiation
    private DBConnect() {}

    /**
     * Get a new database connection.
     * 
     * @return Connection object, or null if a connection cannot be established.
     */
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace(); // Log error details for debugging
        }
        return con;
    }
}
