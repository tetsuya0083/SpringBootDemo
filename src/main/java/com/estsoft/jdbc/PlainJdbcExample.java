package com.estsoft.jdbc;

import java.sql.*;

public class PlainJdbcExample {
    private static final String url = "jdbc:mysql://localhost:3306/test_db";
    private static final String username = "root";
    private static final String password = "0000";
    private static final String query = "SELECT * FROM students";


    public static void main(String[] args) {
        try(
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query); ) {
            while(rs.next()) {
                System.out.print("id: " + rs.getInt("id"));
                System.out.print(", name: " + rs.getString("name"));
                System.out.print(", age: " + rs.getInt("age"));
                System.out.println(", address: " + rs.getString("address"));
            }
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
