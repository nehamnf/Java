package com.neha.jdbc;

import org.sqlite.*;

import java.sql.*;

public class SqliteDatabase {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\NehaMN\\Downloads\\sqlite-tools-win-x64-3510300\\University.db");
            Statement statement = connection.createStatement();
//            ResultSet rs= statement.executeQuery("select * from dept");
//            statement.executeUpdate("insert into dept values(60,'IS')");
//            statement.executeUpdate("delete from dept where deptno>50");
//            statement.executeUpdate("update dept set deptname='IS' where deptno=50");

//            int deptNo;
//            String deptName;

//            PreparedStatement preparedStatement = connection.prepareStatement("select * from dept where deptno=?");
//            preparedStatement.setString(1,"10");
//            ResultSet rs= preparedStatement.executeQuery();
//            while (rs.next()){
//                deptNo=rs.getInt("deptno");
//                deptName=rs.getString("deptname");
//                System.out.println("Department number: "+deptNo+" Department Name: "+deptName);
//            }

            PreparedStatement preparedStatement= connection.prepareStatement("insert into dept values(?,?)");
            preparedStatement.setInt(1,80);
            preparedStatement.setString(2,"ML");
            preparedStatement.executeUpdate();

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
