package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection(){

        Connection conn = null;
        // dang ki driver
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Tạo URL kết nối và thông tin đăng nhập

            String url = "jdbc:sqlserver://localhost:1433;databaseName=DemoJDBC";
            String username = "sa";
            String password = "@37Nholldz";

            // Lấy kết nối
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void closeConnection(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}