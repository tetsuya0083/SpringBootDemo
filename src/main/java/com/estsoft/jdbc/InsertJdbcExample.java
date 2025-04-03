package com.estsoft.jdbc;

import java.sql.*;

public class InsertJdbcExample {
    private static final String url = "jdbc:mysql://localhost:3306/test_db";
    private static final String username = "root";
    private static final String password = "0000";
    private static final String query = "INSERT INTO students (name, age, address) VALUES(?, ?, ?)";


    public static void main(String[] args) {
        try(
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = conn.prepareStatement(query);){
            pstmt.setString(1, "insertedName");
            pstmt.setInt(2, 333);
            pstmt.setString(3, "NewYork");

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0){
                System.out.println("inserted new data");
            }
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
