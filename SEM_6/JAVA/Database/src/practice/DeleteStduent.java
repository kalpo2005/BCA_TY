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
public class DeleteStduent {
        public static void main(String[] args) {

        int id = 2;
        String dbPath = "jdbc:ucanaccess://D:/KALPESH_BAVALIYA/SEM_6/JAVA/Database/src/database/studentstatic.accdb";

        try {
            Connection conn = DriverManager.getConnection(dbPath);
            String sql = "DELETE FROM studentDetail WHERE ID = ? ";
            
            PreparedStatement query = conn.prepareCall(sql);
            query.setInt(1, id);
            
            int rowDeleted = query.executeUpdate();
            
            if (rowDeleted > 0) {
                System.out.println("Data succesfully Deleted !!! : " + rowDeleted);
            } else {
                System.out.println("Data doesn't Deleted !!!");
            }

        } catch (Exception e) {
            e.printStackTrace(); // show line which in error
            System.out.println("Error : " + e.getMessage()); // show the error 
        }
    }
}
