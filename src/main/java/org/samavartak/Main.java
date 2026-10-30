package org.samavartak;
import com.Student.Manage.StuJDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {

        System.out.println("Welcome to Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("PRESS 1 to ADD student");
            System.out.println("PRESS 2 to DELETE student");
            System.out.println("PRESS 3 to DISPLAY student");
            System.out.println("PRESS 4 to EXIT app");
            int c = Integer.parseInt(br.readLine());

            if(c==1){  //Add Student
                System.out.println("Enter Student's Name : ");
                String name = br.readLine();

                System.out.println("Enter Student's Phone");
                String phone = br.readLine();

                System.out.println("Enter Student's City");
                String city = br.readLine();

                //Student Obj to Store Stu
                StuJDBC st = new StuJDBC(name,phone,city);
                System.out.println(st);

            } else if(c==2){  // Delete Student

            }else if(c==3){

            }else if(c==4){  //exit
                break;
            }else{
                System.out.println("enter value / correct value");
            }
        }
        System.out.println("Thank You for using my Application...");
        System.out.println("See you soon... Bye Bye");

    }
}