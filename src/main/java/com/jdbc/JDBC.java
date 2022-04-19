package com.jdbc;

import java.sql.*;

/**
 * @author liwei
 * @create 2022-04-15-15:15
 *
 **/
public class JDBC {
    public static String url;
    public static String username;
    public static String password;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        url = "jdbc:mysql://localhost:3306/cgb2202";
        username = "root";
        password = "root";
    }
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement st = conn.createStatement();
            ResultSet set = st.executeQuery("select * from teachers");
            int i = 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
