package JDBC.Gun02;

import JDBC._Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _03_GetAllRowColumn extends _Parent {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("SELECT * FROM language ");

        ResultSetMetaData rsmd = rs.getMetaData();   // sorgu listesine iliskin temel bilgilere ulasabiliyoruz bu fonksiyon ile
        int columnCount = rsmd.getColumnCount();     // column sayisina ulastik

        System.out.println(columnCount);

        while (rs.next()) {

            for (int i = 1; i <= columnCount; i++) {

                System.out.print(rs.getString(i) + " ");
            }
            System.out.println();
        }
    }

    // Task1 : film tablosundaku butun bilgileri listeleyiniz
    @Test
    public void task1() throws SQLException {
        ResultSet rs = statement.executeQuery("SELECT * FROM film ");
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        while (rs.next()) {

            for (int i = 1; i <= columnCount; i++) {

                System.out.printf("%s ",rs.getString(i) + " ");
            }
            System.out.println();
        }


//        while (rs.next()) {
//            for (int i = 1; i < columnCount; i++) {
//                String strf = "%-" + rsmd.getColumnDisplaySize(i)+ "s" ;   //  her veriyi kendi uzunlugu kadar alana yazdirmis oldu
//                System.out.printf(strf, rs.getString(i));                 // todo kod tam dogru degil
//            }
//            System.out.println();
//        }
    }
}
