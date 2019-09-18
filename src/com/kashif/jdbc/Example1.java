package com.kashif.jdbc;

import java.sql.Connection;
import java.sql.*;

public class Example1 {

    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://192.168.3.231:6432/public_kashif";

    //  Database credentials
    static final String USER = "majordomo";
    static final String PASS = "sa";
    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement stmt = conn.createStatement();){
            conn.setAutoCommit(false);

            String sql = "insert into employees(first, last, age) values('kashif', 'imran', 31)";
            stmt.executeUpdate(sql);

            conn.commit();

            sql = "insert into employees(first, last, age) values('sumit', 'kumar', 28)";
            stmt.executeUpdate(sql);



        } catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }
    }
}
