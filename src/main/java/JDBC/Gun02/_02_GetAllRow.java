package JDBC.Gun02;

import JDBC._Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_GetAllRow extends _Parent {

    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("SELECT * FROM customer");

        int rowCount = 0;

        while (rs.next()) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");

            // System.out.println(firstName + " -- " + lastName + " -- " + rs.getRow());
            System.out.printf("%-15s %-15s %-4d\n", firstName, lastName, rs.getRow());  // todo duzgun gorunmesi icin
            rowCount++;
        }

        System.out.println("Kayit sayisi : " + rowCount);

        rs.last();
        System.out.println(rs.getRow());
    }


    // Task :  test1 deki  ornegi for dongusu ile yapiniz    1.Yöntem
    @Test
    public void test2() throws SQLException {

        ResultSet rs = statement.executeQuery("SELECT * FROM customer");

        rs.last();
        int lastRow = rs.getRow();

        for (int i = 1; i <= lastRow; i++) {

            rs.absolute(i);
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");

            // System.out.println(firstName + " -- " + lastName + " -- " + rs.getRow());
            System.out.printf("%-15s %-15s %-4d\n", firstName, lastName, rs.getRow());  // todo duzgun gorunmesi icin

        }
    }

    // Task :  test1 deki  ornegi for dongusu ile yapiniz    2.Yöntem
    @Test
    public void test3() throws SQLException {
        ResultSet rs = statement.executeQuery("SELECT * FROM customer");

        System.out.printf("%-4s%-15s%-15s%-4s\n", "id", "first_name", "last_name", "rs.getRow()"); // bu kisim basliklarida veriyor
        int i = 0;
        for (; rs.next(); i++) {
            int id = rs.getInt("customer_id");
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");

            System.out.printf("%-4s%-15s%-15s%-4s\n", id, firstName, lastName, rs.getRow());

        }
        System.out.println("number of row: " + i);
        rs.last();
        System.out.println("getRow: " + rs.getRow());
    }

    // Task :  test1 deki  ornegi for dongusu ile yapiniz    3.Yöntem
    @Test
    public void test4() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from customer ");
        rs.last();
        int rowCount = rs.getRow();

        rs.first();
//        for (int i = 1; i <= rowCount; i++) {
//            String firstName = rs.getString("first_name");
//            String lastName = rs.getString("last_name");
//
//            //System.out.println(firstName + " -- " + lastName + " -- "+ rs.getRow());
//            System.out.printf("%-15s %-15s %-4d\n", firstName, lastName, rs.getRow());
//
//            rs.next();
//        }

        for (int i = rowCount; i > 0; i--) { // sondan başa doğru
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");

            //System.out.println(firstName + " -- " + lastName + " -- "+ rs.getRow());
            System.out.printf("%-15s %-15s %-4d\n", firstName, lastName, rs.getRow());

            rs.next();
        }
    }
}
