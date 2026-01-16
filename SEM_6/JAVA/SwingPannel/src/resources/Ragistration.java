/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.awt.*;
import javax.swing.*;
import javax.swing.*;

/**
 *
 * @author ABC
 */
public class Ragistration extends JFrame {

    public Ragistration() {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel firstNameLable = new JLabel("First Name : ");
        firstNameLable.setBounds(20, 20, 100, 35);
        panel.add(firstNameLable);

        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(130, 20, 150, 30);
        panel.add(firstNameField);

        JLabel lastNameLable = new JLabel("Last Name : ");
        lastNameLable.setBounds(20, 60, 100, 35);
        panel.add(lastNameLable);

        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(130, 60, 150, 30);
        panel.add(lastNameField);

//       Address
        JLabel addressLable = new JLabel("Adrees : ");
        addressLable.setBounds(20, 100, 100, 35);
        panel.add(addressLable);

        JTextArea addressField = new JTextArea(3, 100);
        addressField.setBounds(130, 100, 150, 40);
        panel.add(addressField);

        JLabel passwordLable = new JLabel("Password : ");
        passwordLable.setBounds(20, 150, 100, 35);
        panel.add(passwordLable);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(130, 150, 150, 30);
        panel.add(passwordField);

        JLabel genderLable = new JLabel("Gender : ");
        genderLable.setBounds(20, 190, 100, 35);
        panel.add(genderLable);

        JRadioButton maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(130, 190, 80, 30);
        panel.add(maleRadio);
        
        JRadioButton femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(230, 190, 80, 30);
        panel.add(femaleRadio);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        add(panel);
        panel.setBackground(Color.gray);
        setSize(800, 800);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ragistration();
    }
}
