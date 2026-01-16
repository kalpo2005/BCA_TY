/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ABC
 */
public class FirstPannel extends JFrame {

    public FirstPannel() {

        JPanel jframe = new JPanel();
        jframe.setLayout(null);

//        first name
        JLabel nameLable = new JLabel("First Name");
        nameLable.setBounds(20, 20, 130, 35);
        j

//        JButton button = new JButton("Click Here ");
//        button.setBounds(30, 30, 130, 35);
//        jframe.add(button);
        add(jframe);
        jframe.setBackground(Color.gray);

        setSize(600, 600);
        setTitle("Pannel");
        setVisible(true);

    }

    public static void main(String[] args) {

        new FirstPannel();

    }
}
