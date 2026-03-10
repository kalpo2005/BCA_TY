/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class Ragister extends JFrame implements ActionListener {

    JLabel idLable, fullnameLable, ageLabel, genderLable, courseLabel, emailLabel, phoneLabel, addressLabel, heading;
    JTextField id, fullname, age, gender, email, phone;
    JButton insertBtn, clearBtn, updateBtn, deleteBtn, showBtn;
    JRadioButton male, female;
    JTextArea address;

    String fullnameValue, genderValue, emailValue;
    int idValue, ageValue, phoneValue;

    final String DB_PATH = "jdbc:ucanaccess://D:/KALPESH_BAVALIYA/SEM_6/JAVA/Database/src/database/dynamicinsert.accdb";

    public Ragister() {

        String[] color = {"Select", "bca", "mca", "mscId", "yellow"};
        JComboBox<String> comboBox = new JComboBox<>(color);
        add(comboBox);
        Connection conn = this.getConnection();

        idLable = new JLabel("Student Id :");
        fullnameLable = new JLabel("Full Name :");
        ageLabel = new JLabel("Age :");
        genderLable = new JLabel("gender :");
        courseLabel = new JLabel("course :");
        emailLabel = new JLabel("Email :");
        phoneLabel = new JLabel("Phone Number :");
        addressLabel = new JLabel("Address :");

        id = new JTextField();
        fullname = new JTextField();
        age = new JTextField();
        gender = new JTextField();
        email = new JTextField();
        phone = new JTextField();

        address = new JTextArea();

        male = new JRadioButton("male");
        female = new JRadioButton("female");

        insertBtn = new JButton("Insert");
        clearBtn = new JButton("Clear");
        updateBtn = new JButton("Update");
        deleteBtn = new JButton("Delete");
        showBtn = new JButton("Show");

        ButtonGroup genderGroup = new ButtonGroup();

        idLable.setBounds(20, 50, 100, 30);
        fullnameLable.setBounds(20, 80, 100, 30);
        ageLabel.setBounds(20, 110, 100, 30);
        genderLable.setBounds(20, 140, 100, 30);
        courseLabel.setBounds(20, 170, 100, 30);
        emailLabel.setBounds(20, 210, 100, 30);
        phoneLabel.setBounds(20, 240, 100, 30);
        addressLabel.setBounds(20, 270, 100, 50);

        id.setBounds(130, 50, 200, 25);
        fullname.setBounds(130, 80, 200, 25);
        age.setBounds(130, 110, 200, 25);
        male.setBounds(130, 140, 90, 25);
        female.setBounds(230, 140, 90, 25);
        comboBox.setBounds(130, 170, 200, 20);
        email.setBounds(130, 210, 200, 25);
        phone.setBounds(130, 240, 200, 25);

        address.setBounds(130, 270, 200, 50);

        insertBtn.setBounds(20, 330, 100, 30);
        clearBtn.setBounds(130, 330, 100, 30);
        updateBtn.setBounds(240, 330, 100, 30);
        deleteBtn.setBounds(350, 330, 100, 30);
        showBtn.setBounds(460, 330, 100, 30);

        genderGroup.add(male);
        genderGroup.add(female);

        Panel pn = new Panel();
        heading = new JLabel("Student Ragistration Form ");
        pn.add(heading);

        pn.setBounds(20, 5, 310, 30);
        pn.setBackground(Color.cyan);
        add(pn);

        add(idLable);
        add(fullnameLable);
        add(ageLabel);
        add(genderLable);
        add(courseLabel);
        add(emailLabel);
        add(phoneLabel);
        add(addressLabel);

        add(id);
        add(fullname);
        add(age);
        add(male);
        add(female);
        add(comboBox);
        add(email);
        add(phone);
        add(address);

        add(insertBtn);
        add(clearBtn);
        add(updateBtn);
        add(deleteBtn);
        add(showBtn);

        insertBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        updateBtn.addActionListener(this);
        deleteBtn.addActionListener(this);
        showBtn.addActionListener(this);

        setSize(500, 500);
        setTitle("Ragister Form");
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//         System.out.println(e.getSource());
        if (e.getActionCommand() == "Insert") {
            if (validateData()) {
                insertData();
            }
            return;

        }

        if (e.getActionCommand() == "Update") {
            updateData();
        }

        if (e.getActionCommand() == "Delete") {
            deletetData();
        }

        if (e.getActionCommand() == "Show") {
            showData();
        }
        if (e.getActionCommand() == "Clear") {
            showData();
        }
    }

    private boolean validateData() {

        try {
            idValue = Integer.parseInt(id.getText());
            ageValue = Integer.parseInt(age.getText());
            phoneValue = Integer.parseInt(phone.getText());

        } catch (NumberFormatException num) {
            errorDialog();
            return false;
        }

        return true;
    }

    private void errorDialog(String error) {
        JOptionPane.showMessageDialog(null, error, "error", JOptionPane.ERROR_MESSAGE);
    }

    private void confirmDialog(String message) {
        JOptionPane.showMessageDialog(null, message, "error", JOptionPane.INFORMATION_MESSAGE);
    }

    private void insertData() {
        System.out.println("Insert function call ");
    }

    private void deletetData() {
        System.out.println("Insert function call ");
    }

    private void updateData() {
        System.out.println("Insert function call ");
    }

    private void showData() {
        System.out.println("Insert function call ");
    }

    private void clearData() {
        System.out.println("Clear function call ");
    }

    private Connection getConnection() {

        try {
            return DriverManager.getConnection(DB_PATH);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

    public static void main(String[] args) {
        new Ragister();
    }

}
