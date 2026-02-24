/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.*;

public class StaticDataInsert {
//D:\KALPESH_BAVALIYA\SEM_6\JAVA\Database\src\database

    String studentName, course;
    int rollNumber;

    public StaticDataInsert() {
        rollNumber = 23;
        studentName = "Kalpesh Bavaliya";
        course = "BCA";

        try {
            String dbPath = "jdbc:ucanaccess//D:/KALPESH_BAVALIYA/SEM_6/JAVA/Database/src/database/studentstatic.accdb";
            Connection conn = DriverManager.getConnection(dbPath);

            System.out.println("Database succesfully connected !!!");
        } catch (Exception e) {
            e.printStackTrace(); // show line which in error
            System.out.println("Error : " + e.getMessage()); // show the error 
        }
    }

    public static void main(String[] args) {
        new StaticDataInsert();
    }
}
