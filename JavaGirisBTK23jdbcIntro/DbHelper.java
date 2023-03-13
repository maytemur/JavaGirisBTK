package JavaGirisBTK23jdbcIntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private static final String userName = "root";
    private static final String password = "mysql1234";
    private static final String dbUrl = "jdbc:mysql://localhost:3306/world";
    //burada localhost yerine url adresi world yerine de
    //çalışılacak tablo ismi gelecek- mysql driver timezone issue çıkarsa dbUrl'ye eklenecek ayrıca ssl bağlantı
    //hatası çıkarsa(SSL exception) /world?useSSL=false& olarak ekliyoruz

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);
    }

    public void showErrorMessage(SQLException exception) {
        //exception.printStackTrace();
        System.out.println("Error message " + exception.getMessage());
        System.out.println("Error code " + exception.getErrorCode());

    }
}