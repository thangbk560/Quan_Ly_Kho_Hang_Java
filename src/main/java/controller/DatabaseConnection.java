/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package controller;

import java.sql.*;
/**
 *
 * @author chanh
 */
public class DatabaseConnection {
    public Connection getConnection() throws Exception {
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=BTL_QuanLyKhoHang;encrypt=false;";
        String user = "sa";
        String password = "1234567890";
        conn = DriverManager.getConnection(dbURL, user, password);
        return conn;
    }
}
