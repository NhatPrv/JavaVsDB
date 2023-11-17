package Test;

import java.sql.Connection;
import database.JDBCUtil;

public class TestJDBCUtil {
    public static void main(String[] args) {
        try {
            Connection connection = JDBCUtil.getConnection();

            if (connection != null) {
                System.out.println("Connected successfully!");
                
                // Sử dụng kết nối ở đây...

                // Đóng kết nối sau khi sử dụng.
                JDBCUtil.closeConnection(connection);
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
