package co.harry.Dao;


import java.sql.Connection;
import java.sql.Date;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.time.LocalDate;
import java.time.LocalDate;

public class JDBCCommon{

  public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/harry", "root", "1234567Q");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    public static void printSQLException(SQLException e) {
        e.printStackTrace();
        }
    

    public static Date getSQLDate(LocalDate date) {
        return java.sql.Date.valueOf(date);
    }

    public static LocalDate getUtilDate(Date sqlDate) {
        return sqlDate.toLocalDate();
    }
}
