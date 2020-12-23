package JDBC.Gun02;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// verilen bir sorguya ait butun bilgileri bir liste atarak geri donduren methodu yaziniz
// URL,username,password, db, sql  parametre olarak alacak

public class _04_ReusableMethods {
    static Statement statement;

    public static void connectToDataBase(String URL, String db, String username, String password) throws SQLException {
        URL = URL+db;
        Connection connection = DriverManager.getConnection(URL, username, password);   // baglanti saglandi
        statement = connection.createStatement();  // sorgularimizi cal
    }

    public static List<List<String>> getListData(String sql) throws SQLException {

        List<List<String>> result = new ArrayList<>();

        ResultSet rs = statement.executeQuery(sql);
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();


        List<String> rowList;
        while (rs.next()) {
            rowList = new ArrayList<>();
            for (int i = 1; i <= columnCount; i++) {

                rowList.add(rs.getString(i));
            }
            result.add(rowList);
        }

        return result;
    }

    public static void main(String[] args) throws SQLException {

        String URL = "jdbc:mysql://test.medis.mersys.io:33306/";
        String db = "sakila";
        // Veritabanına ulaşabilmek için JDBC ye : db nini tipi (mysql), db nin yolu (test.medis.mersys.io)
        // db nin bulunduğu bilgisayarın içindeki mysql db nin port numarası (33306) ve db nin adı(sakila) verildi.
        String username = "technostudy";
        String password = "zhTPis0l9#$&";
        String sql = "SELECT * FROM language";

        connectToDataBase(URL, db, username, password);


        List<List<String>> gelenList = getListData(sql);

        for (List<String> list: gelenList) {
            System.out.println(list);
        }


    }
}
