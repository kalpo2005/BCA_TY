/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;

public class DynamicDatabase extends JFrame implements ActionListener {

    JLabel studentNameLable, rollNumberLabel, courseLable;
    JTextField studentName, rollNumber;
    JComboBox<String> comboBox;
    JButton submitBtn;
    int rollNumberInsert;
    String StudentNameInsert, courseInsert;

    public DynamicDatabase() {

        rollNumberLabel = new JLabel("Roll Number      : ");
        studentNameLable = new JLabel("Student Name   : ");
        courseLable = new JLabel("Course Name    : ");

        studentName = new JTextField();
        rollNumber = new JTextField();

        submitBtn = new JButton("Submit");

        String[] couresCombo = {"Select", "BCA", "B.COM", "B.TECH", "MCA"};
        comboBox = new JComboBox<>(couresCombo);

        rollNumberLabel.setBounds(30, 20, 100, 30);
        studentNameLable.setBounds(30, 60, 100, 30);
        courseLable.setBounds(30, 100, 110, 30);

        studentName.setBounds(130, 20, 200, 30);
        rollNumber.setBounds(130, 60, 200, 30);

        comboBox.setBounds(130, 100, 150, 25);

        submitBtn.setBounds(110, 140, 100, 25);

        add(rollNumberLabel);
        add(studentNameLable);
        add(courseLable);

        add(rollNumber);
        add(studentName);

        add(comboBox);
        add(submitBtn);

        submitBtn.addActionListener(this);

        setSize(500, 800);
        setTitle("Student Data inserted !!!");
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String errorShow = "";
        boolean isError = false;
        rollNumberInsert = Integer.parseInt(rollNumber.getText());
        StudentNameInsert = studentName.getText();
        courseInsert = comboBox.getSelectedItem().toString();

        if (courseInsert == "Select" || courseInsert.isEmpty()) {
            errorShow = "Select Valid Course !!!!";
            isError = true;
        }

        if(isError)
            JOptionPane.showMessageDialog(null, errorShow, "Error", JOptionPane.ERROR_MESSAGE);
        else
            DatabaseConnection();
    }

    void DatabaseConnection() {
        try {
            String dbPath = "jdbc:ucanaccess://D:/KALPESH_BAVALIYA/SEM_6/JAVA/Database/src/database/studentstatic.accdb";
            Connection conn = DriverManager.getConnection(dbPath);
            System.out.println("Database succesfully connected !!!");

            String insertQuery = "INSERT INTO studentDetail(rollNumber,studentName,course) VALUES (?,?,?)";

            PreparedStatement query = conn.prepareStatement(insertQuery);
            query.setInt(1, rollNumberInsert);
            query.setString(2, StudentNameInsert);
            query.setString(3, courseInsert);
            int rows = query.executeUpdate();

            if (rows > 0) {
                System.out.println("Data succesfully inserted !!!");
            } else {
                System.out.println("Data doesn't inserted !!!");
            }

        } catch (Exception e) {
            e.printStackTrace(); // show line which in error
            System.out.println("Error : " + e.getMessage()); // show the error 
        }
    }

    public static void main(String[] args) {
        new DynamicDatabase();
    }
}
