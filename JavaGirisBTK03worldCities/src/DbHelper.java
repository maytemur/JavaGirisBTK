
import java.sql.*;

public class DbHelper {

    private String userName = "root";
    private String password = "mysql1234";
    private String dbUrl = "jdbc:mysql://localhost:3306/world";  //istenirse ekleme ?useSSL=false&serverTimezone=UTC yapılabilir

    public Connection getConnection() throws SQLException { //Connection import ederken alt-enter ile geleni almıyoruz yukarı elle yazdık
        return DriverManager.getConnection(dbUrl, userName, password);

    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Error :"+exception.getMessage());
        System.out.println("Error Code :"+exception.getErrorCode());
    }
}
