package com.Student.Manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
    public static boolean InsrtStuToDB(StuJDBC st){
        boolean flg = false;
        try {
            //JDBC code for data insert
            Connection con = ConnectionProvider.CreateConn();
            String query = "insert into students(sname,sphone,scity) values(?,?,?)";

            //prepared Statement
            PreparedStatement pst = con.prepareStatement(query);
            //set value of parameter
            pst.setString(1,st.getSname());
            pst.setString(2,st.getSphone());
            pst.setString(3,st.getScity());

            //execute Query
            pst.executeUpdate();
            flg = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flg;
    }

    public static boolean deleteStu(int id) {
        boolean flg = false;
        try {
            Connection con = ConnectionProvider.CreateConn();
            String query = "delete from students where sid=?";

            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);

            //execute Query
            pst.executeUpdate();
            flg = true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return flg;
    }

    public static void showAllStu() {
        try {
            Connection con = ConnectionProvider.CreateConn();
            String query = "select * from students";

            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(query);

            while(set.next()){
                int id = set.getInt(1);
                String name = set.getString("sname");
                String phone = set.getString("sphone");
                String city = set.getString(4);

                System.out.println("ID : "+id);
                System.out.println("name : "+name);
                System.out.println("phone.No : "+phone);
                System.out.println("city : "+city);
                System.out.println("_________________________");
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static boolean updateStu(int id, StuJDBC st) {
        boolean flg = false;
        try {
            //JDBC code for data insert
            Connection con = ConnectionProvider.CreateConn();
            String query = "update students set sname=?, sphone=?, scity=? where sid = ?";

            //prepared Statement
            PreparedStatement pst = con.prepareStatement(query);
            //set value of parameter
            pst.setString(1,st.getSname());
            pst.setString(2,st.getSphone());
            pst.setString(3,st.getScity());
            pst.setInt(4,id);

            //execute Query
            pst.executeUpdate();
            flg = true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return flg;
    }
}
