package JDBC.Gun01;

import JDBC._Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsoluteRelative extends _Parent {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("SELECT * FROM film");

        rs.absolute(10);   // 10.satira git
        String title = rs.getString("title");
        System.out.println(title);

        rs.absolute(15);   // absolute  = 15. index gidiyor... önceki kodu dikkate almiyor
        title = rs.getString("title");
        System.out.println(title);

        rs.relative(5);   // en son bulundugu yerden  5 ileri gider.  20. index verecek
        title = rs.getString("title");
        System.out.println(title);

        rs.relative(-5);   // en son bulundugu yerden  5 geri gider.  15. index verecek
        title = rs.getString("title");
        System.out.println(title);
    }

}
