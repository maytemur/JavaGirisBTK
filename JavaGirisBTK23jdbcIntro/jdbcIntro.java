package JavaGirisBTK23jdbcIntro;
//sıralama şöyle -> JavaApp ->JDBC -> Driver(Oracle,MySql,SqlServer vs için ayrı ayrı.Aynı anda birdem fazla driver
// olabilir)-DB(Database)
//MySql- open source'du Oracle satın aldı ücretli ve ücretsiz versiyonu var- mySql kurucaz diğerleri içinde
//Oracle vs işlemler aynı
//Temel olarak bize lazım olan şeyler -
// ->MySql Server-Veritabanı motoru-arka planda bir servis olarak çalışır
// ->MySql Workbench-Bizim için bir arayüz görevi görür-hem kendi hem uzak server'a bağlanmamız için bir arayüzdür
// ->MySql Connectors-C/C++,ODBC,Java,Connector/NET için -bize java için olan lazım -> JConnector onu external
// libraries olarak ekliyoruz - File-Project Structure-Modules-Dependencies altından ekliyoruz
//-->C:\Program Files (x86)\MySQL\Connector J 8.0\mysql-connector-java-8.0.27.jar paketi
//Küçük büyük harf duyarsızdır

import java.sql.*;
import java.util.ArrayList;

public class jdbcIntro {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null; //Sql cümleciği Sql sorgusu hazırla -genelde değerler bu insert için
        // kullanıcıdan istenir
        ResultSet resultSet = null;


        try {
            connection = helper.getConnection();
            String sql= "delete from city where id=?";
           statement = connection.prepareStatement(sql);
           statement.setInt(1,4081);//1nci soru işareti,2nci soru işareti şeklinde gidiyor
            int result = statement.executeUpdate();  //bunun sonucunda genelde şu kadar rows effected gibi bir bilgi döner

            System.out.println("Kayıt Silindi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
            //exception.printStackTrace();
        } finally {
            statement.close();
            connection.close();
        }


    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null; //Sql cümleciği Sql sorgusu
        ResultSet resultSet = null;


        try {
            connection = helper.getConnection();
            //System.out.println("Bağlantı Oluştu");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country ");
            ArrayList<Country> countries = new ArrayList<Country>();


            while (resultSet.next()) {
                //System.out.println(resultSet.getString("Name"));
                countries.add(new Country(resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size());

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
            //exception.printStackTrace();
        } finally {
            connection.close();
        }

    }
    public static void insertDemo() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null; //Sql cümleciği Sql sorgusu hazırla -genelde değerler bu insert için
        // kullanıcıdan istenir
        ResultSet resultSet = null;


        try {
            connection = helper.getConnection();
            //String sql= "insert into city (Name,CountryCode,District,Population) values (?,?,?,?)"; kullanıcıdan
            // verileri istersek böyle istiyoruz-ileride arayüz ile isteyeceğiz
            statement = connection.prepareStatement
                    ("insert into city (Name,CountryCode,District,Population) values ('Düzce','TUR','Düzce','50000')");
            /*statement.setString(1,"Düzce2");
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt (4,70000);*/

            //System.out.println("Bağlantı Oluştu");
            int result = statement.executeUpdate();  //bunun sonucunda genelde şu kadar rows effected gibi bir bilgi döner

            System.out.println("Kayıt Eklendi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
            //exception.printStackTrace();
        } finally {
            statement.close();
            connection.close();
        }

    }
    public static void updateDemo() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null; //Sql cümleciği Sql sorgusu hazırla -genelde değerler bu insert için
        // kullanıcıdan istenir
        ResultSet resultSet = null;


        try {
            connection = helper.getConnection();
            String sql= "update city set Population=45000,district='Düzce',name='Düzce2' where id=4081";
            statement = connection.prepareStatement(sql);
            int result = statement.executeUpdate();  //bunun sonucunda genelde şu kadar rows effected gibi bir bilgi döner

            System.out.println("Kayıt Güncellendi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
            //exception.printStackTrace();
        } finally {
            statement.close();
            connection.close();
        }


    }
}
