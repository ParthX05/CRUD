package employees;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp_db", "root", "your_mysql_password");
        } catch (Exception e) {
            System.out.println("DB Error: " + e.getMessage());
        }
        return con;
    }
}
