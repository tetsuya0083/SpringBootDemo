package com.estsoft.jdbc;

import java.sql.*;

public class UpdateJdbcExample {
    private static final String url = "jdbc:mysql://localhost:3306/test_db";
    private static final String username = "root";
    private static final String password = "0000";
    private static final String query = "UPDATE students SET age = ? WHERE id = ?";


    public static void main(String[] args) {
        try(
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = conn.prepareStatement(query);) {
            pstmt.setInt(1, 999);
            pstmt.setInt(2, 1);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0){
                System.out.println("success update age");
            } else {
                System.out.println("execute failed");
            }
        }
        catch (SQLException e){
            System.out.println(e.getErrorCode());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
