package Utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {

    public static List<List<String>> getListData( String query) {

        String URL = "jdbc:mysql://test.medis.mersys.io:33306/ts_arslan";
        // Veritabanına ulaşabilmek için JDBC ye : db nini tipi (mysql), db nin yolu (test.medis.mersys.io)
        // db nin bulunduğu bilgisayarın içindeki mysql db nin port numarası (33306) ve db nin adı(sakila) verildi.
        String username = "technostudy";
        String password = "zhTPis0l9#$&";


        List<List<String>> donecekList = new ArrayList<>();

        try {
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            List<String> rowList;

            while (rs.next()) {
                rowList = new ArrayList<>();
                for (int i = 1; i <= columnCount; i++) {

                    rowList.add(rs.getString(i));
                }
                donecekList.add(rowList);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return donecekList;
    }

    public static void main(String[] args) {

        List<List<String>> gelenList = getListData("SELECT * FROM language");
        System.out.println(gelenList);
    }

}
