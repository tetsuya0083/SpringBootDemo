package com.estsoft.jdbc;

import java.sql.*;

public class DeleteJdbcExample {
    private static final String url = "jdbc:mysql://localhost:3306/test_db";
    private static final String username = "root";
    private static final String password = "0000";
    private static final String query = "DELETE FROM students WHERE id = ?";


    public static void main(String[] args) {
        try(
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = conn.prepareStatement(query);) {
            pstmt.setInt(1, 4);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0){
                System.out.println("delete complete");
            }else{
                System.out.println("delete failed");
            }
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
