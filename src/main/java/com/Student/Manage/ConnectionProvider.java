package com.Student.Manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    static Connection con;
   public static Connection CreateConn() {
      try {
          //Load Driver
          Class.forName("com.mysql.jdbc.Driver");

          //Create Connection
          String user ="root";
          String pw ="******";
          String url ="jdbc:mysql://localhost:3306/student_manage";

          con=DriverManager.getConnection(url,user,pw);

      } catch (Exception e) {
          e.printStackTrace();

      }
      return con;
   }
}
