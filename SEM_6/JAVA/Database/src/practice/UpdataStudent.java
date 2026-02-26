/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.sql.*;

/**
 *
 * @author ABC
 */
public class UpdataStudent {

    public static void main(String[] args) {

        int newRollNumber = 32, id = 3;
        String newName = "Anil Baraiya";
        String newCourse = "B.TECH";
        String dbPath = "jdbc:ucanaccess://D:/KALPESH_BAVALIYA/SEM_6/JAVA/Database/src/database/studentstatic.accdb";

        try {
            Connection conn = DriverManager.getConnection(dbPath);
            String sql = "UPDATE studentDetail SET rollNumber = ? , studentName = ? , course = ? WHERE ID = ? ";
            
            PreparedStatement query = conn.prepareCall(sql);
            query.setInt(1, newRollNumber);
            query.setInt(4, id);
            query.setString(2, newName);
            query.setString(3, newCourse);
            
            int rowUpdated = query.executeUpdate();
            
            if (rowUpdated > 0) {
                System.out.println("Data succesfully Updated !!!");
            } else {
                System.out.println("Data doesn't Updated !!!");
            }

        } catch (Exception e) {
            e.printStackTrace(); // show line which in error
            System.out.println("Error : " + e.getMessage()); // show the error 
        }
    }
}
