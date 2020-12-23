package JDBC.Gun01;

import org.testng.annotations.Test;
import java.sql.*;



public class _01_Giris {


    @Test
    public void test1() throws SQLException {
        String URL = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
        // Veritabanına ulaşabilmek için JDBC ye : db nini tipi (mysql), db nin yolu (test.medis.mersys.io)
        // db nin bulunduğu bilgisayarın içindeki mysql db nin port numarası (33306) ve db nin adı verildi.
        String username = "technostudy";
        String password = "zhTPis0l9#$&";

        Connection connection = DriverManager.getConnection(URL, username, password);    // baglanti saglandi
        Statement statement = connection.createStatement();  // sorgularimizi calistirmak icin bir yol olusturduk
        ResultSet rs = statement.executeQuery("SELECT * FROM actor");  // calistirildi sonuclar rs degiskenine set edildi
        // fakat performans icin butun sonuclar bir anda rs ye aktarilmiyor.
        // Biz komut verdikce satir satir gelecek

        // todo 1.satir icin
        rs.next();   // gostergeyi sonraki adima getir orada satir varsa butun satiri rs ye at

        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        System.out.println(firstName+ " " + lastName);


        // todo 2.satir icin

        rs.next();   // gostergeyi sonraki adima getir orada satir varsa butun satiri rs ye at

        firstName = rs.getString("first_name");
        lastName = rs.getString("last_name");
        System.out.println(firstName+ " " + lastName);

        connection.close();

    }

}
