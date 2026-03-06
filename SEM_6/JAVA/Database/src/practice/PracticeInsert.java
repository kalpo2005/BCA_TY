/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.awt.event.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class PracticeInsert {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JLabel idLable = new JLabel("Id :");
        JLabel rollLable = new JLabel("RollNumber :");
        JLabel nameLable = new JLabel("Name  :");

        JTextField idInput = new JTextField();
        JTextField rollInput = new JTextField();
        JTextField nameInput = new JTextField();

        JButton submitBtn = new JButton("Submit");

        idLable.setBounds(20, 20, 100, 20);
        rollLable.setBounds(20, 50, 100, 20);
        nameLable.setBounds(20, 80, 100, 20);

        idInput.setBounds(120, 20, 200, 25);
        rollInput.setBounds(120, 50, 200, 25);
        nameInput.setBounds(120, 80, 200, 25);

        submitBtn.setBounds(120, 120, 100, 30);

        frame.add(idLable);
        frame.add(rollLable);
        frame.add(nameLable);

        frame.add(idInput);
        frame.add(rollInput);
        frame.add(nameInput);

        frame.add(submitBtn);

        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = nameInput.getText();

                if (name.isEmpty() || idInput.getText().isEmpty() || rollInput.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All Fields Are Required !!! ", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int id = Integer.parseInt(idInput.getText());
                int rollNumber = Integer.parseInt(rollInput.getText());
                
                try {

                    String dbPath = "jdbc:ucanaccess://D:/KALPESH_BAVALIYA/SEM_6/JAVA/Database/src/database/dynamicinsert.accdb";
                    Connection conn = DriverManager.getConnection(dbPath);

                    String sql = "INSERT INTO studentdata(ID,rollnumber,name) VALUES (?,?,?)";

                    PreparedStatement per = conn.prepareCall(sql);
                    per.setInt(1, id);
                    per.setInt(2, rollNumber);
                    per.setString(3, name);
                    
                    int rowInsert = per.executeUpdate();
                    
                    if(rowInsert > 0){
                         JOptionPane.showMessageDialog(null, "Data succesfully inserted !!!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                        idInput.setText("");
                        rollInput.setText("");
                        nameInput.setText("");
                         return;
                    }
                    
                     JOptionPane.showMessageDialog(null, "Data can't inserted !!! ", "Error", JOptionPane.ERROR_MESSAGE);

                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("Error : " + ex.getMessage());
                }
            }
        });

        frame.setSize(400, 200);
        frame.setTitle("Dynamic Insert !!!");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
