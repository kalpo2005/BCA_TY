/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.awt.*;
import javax.swing.*;



public class Ragister extends JFrame {

    JLabel idLable, fullnameLable, ageLabel, genderLable, courseLabel, emailLabel, phoneLabel, addressLabel, heading;
    JTextField id, fullname, age, gender, email, phone;
    JButton submitBtn, clearBtn, updateBtn, deleteBtn;
    JRadioButton male,female;
    JTextArea address;

    public Ragister() {
        
        String[] color = {"Select", "bca", "mca", "mscId", "yellow"};
        JComboBox<String> comboBox = new JComboBox<>(color);
        add(comboBox);

        idLable = new JLabel("Student Id :");
        fullnameLable = new JLabel("Full Name :");
        ageLabel = new JLabel("Student Id :");
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

        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        updateBtn = new JButton("Update");
        deleteBtn = new JButton("Delete");
        
        ButtonGroup genderGroup = new ButtonGroup();

        idLable.setBounds(20, 50, 100, 30);
        fullnameLable.setBounds(20, 80, 100, 30);
        ageLabel.setBounds(20, 50, 110, 30);
        genderLable.setBounds(20, 110, 100, 30);
        courseLabel.setBounds(20, 140, 100, 30);
        emailLabel.setBounds(20, 170, 100, 30);
        phoneLabel.setBounds(20, 200, 100, 30);
        addressLabel.setBounds(20, 230, 100, 50);
        
        id.setBounds(130, 50, 200, 25);
        fullname.setBounds(130, 80, 200, 25);
        age.setBounds(130, 50, 200, 25);
        male.setBounds(130, 110, 90, 25);
        female.setBounds(210, 110, 90, 25);
        comboBox.setBounds(130, 140, 200, 25);
        email.setBounds(130, 170, 200, 25);
        phone.setBounds(130, 200, 200, 25);
        
        address.setBounds(130, 230, 200, 50);
        
        submitBtn.setBounds(20, 290, 100, 30);
        clearBtn.setBounds(130, 290, 100, 30);
        updateBtn.setBounds(240, 290, 100, 30);
        deleteBtn.setBounds(350, 290, 100, 30);
        
        genderGroup.add(male);
        genderGroup.add(female);
        
        Panel pn = new Panel();
        heading = new JLabel("Student Ragistration Form ");
        pn.add(heading);

        pn.setBounds(20, 5, 300, 30);
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
        
        add(submitBtn);
        add(clearBtn);
        add(updateBtn);
        add(deleteBtn);

        setSize(500, 800);
        setTitle("Ragister Form");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ragister();
    }

}
