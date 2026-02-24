/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Assign3 extends JFrame implements ActionListener {

    JRadioButton male, female, other;
    JButton submitBtn;

    public Assign3() {

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");

        JLabel genderLable = new JLabel("Select Gender : ");
        genderLable.setBounds(30, 20, 100, 30);
        add(genderLable);

        ButtonGroup gender = new ButtonGroup();

        male.setBounds(130, 20, 70, 30);
        female.setBounds(200, 20, 70, 30);
        other.setBounds(270, 20, 70, 30);

        gender.add(male);
        gender.add(female);
        gender.add(other);

        add(male);
        add(female);
        add(other);

        submitBtn = new JButton("Submit");
        submitBtn.setBounds(120, 70, 100, 30);
        add(submitBtn);
        submitBtn.addActionListener(this);

        setSize(500, 800);
        setTitle("Radio Button Demo");
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String selected = "";

        if (male.isSelected()) {
            selected = "Male Is Selected";
        }

        if (female.isSelected()) {
            selected = " Female Is Selected";
        }

        if (other.isSelected()) {
            selected += " Other Is Selected";
        }
       
        if (selected.isEmpty()) {
            selected = "Gender Required !!!";
        }
        
        JOptionPane.showMessageDialog(null, selected, "Message", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void main(String[] args) {
        new Assign3();
    }
}
