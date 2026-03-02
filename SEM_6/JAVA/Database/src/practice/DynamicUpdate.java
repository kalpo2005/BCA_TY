/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.awt.event.*;
import javax.swing.*;


public class DynamicUpdate extends JFrame implements ActionListener{

    JLabel idLabe,nameLabel,courseLable,rollLable;
    JTextField id,name,rollNumber;
    JComboBox<String> comboBox;
    
    public DynamicUpdate() {
        
        idLabe = new JLabel("ID :");
        rollLable = new JLabel("Roll Number :");
        nameLabel = new JLabel("Name :");
        courseLable = new JLabel("Course :");
        
        String[] courseList = {"BCA","MCA","B.TECH"};
        
        id = new JTextField();
        name = new JTextField();
        rollNumber = new JTextField();
        
        
        idLabe.setBounds(30, 20,50, 20);
        rollLable.setBounds(30, 50,50, 20);
        nameLabel.setBounds(30, 80,50, 20);
        courseLable.setBounds(30, 110,50, 20);
        
        
        add(idLabe);
        add(rollLable);
        add(nameLabel);
        add(courseLable);
        
        setSize(500, 500);
        setTitle("Update Student !!!");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void databaseConnection(){
        
    }
    
    
    public static void main(String[] args) {
        new DynamicUpdate();
    }
}
