package JDBC.Gun02;

import JDBC._Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_SqlExample extends _Parent {


    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("SELECT * FROM city");

        rs.relative(5);
        String cityName = rs.getString(2);
        System.out.println(cityName);

        rs.relative(6);                 // Bulundugu yerin uzerine ekleyerek ilerliyor
        cityName = rs.getString(2);
        System.out.println(cityName);

    }
    @Test
    public void lastFirstKeyword() throws SQLException {

        ResultSet rs = statement.executeQuery("SELECT * FROM city");

        rs.last();        // en son row  a gidiyor
        String cityName = rs.getString("city");
        Integer countryId = rs.getInt("country_id");

        System.out.println(cityName+ " -- " + countryId);

        rs.first();        // ilk row  a gidiyor
        cityName = rs.getString("city");
        countryId = rs.getInt("country_id");

        System.out.println(cityName+ " -- " + countryId);

    }

    @Test
    public void test() throws SQLException {

        ResultSet rs = statement.executeQuery("SELECT * FROM address");         // todo bu kisma SELECT district FROM address bu sekilde yazsaydik
                                                                                   // todo district = rs.getString("district");  bu kisma 1 yazmamiz yeterli olurdu
        rs.absolute(10);
        String district = rs.getString("district");     // todo district = rs.getString(1)  seklinde
        System.out.println(district);

        rs.absolute(22);
        district = rs.getString("district");            // todo district = rs.getString(1)  seklinde
        System.out.println(district);

        rs.last();
        district = rs.getString("district");            // todo district = rs.getString(1)  seklinde
        System.out.println(district);

    }
}
