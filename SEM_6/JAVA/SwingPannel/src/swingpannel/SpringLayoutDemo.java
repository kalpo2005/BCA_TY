/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingpannel;

import javax.swing.*;
import javax.swing.SpringLayout;

public class SpringLayoutDemo {

    public SpringLayoutDemo() {

        JFrame frame = new JFrame();
        SpringLayout spring = new SpringLayout();
        frame.setLayout(spring);

        JLabel nameLabel = new JLabel("Your Name :");

        JButton submitButton = new JButton("Click here ");

        frame.add(nameLabel);
        frame.add(submitButton);

        spring.putConstraint(
                SpringLayout.NORTH,
                nameLabel,
                30,
                SpringLayout.NORTH,
                frame.getContentPane()
        );

        spring.putConstraint(
                SpringLayout.WEST,
                nameLabel,
                40,
                SpringLayout.WEST,
                frame.getContentPane()
        );

        spring.putConstraint(
                SpringLayout.NORTH,
                submitButton,
                20,
                SpringLayout.SOUTH,
                nameLabel
        );
        
        spring.putConstraint(
                SpringLayout.WEST,
                submitButton,
                10,
                SpringLayout.WEST,
                nameLabel
        );

        frame.setSize(500, 800);
        frame.setTitle("Spring Layout !!!");
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SpringLayoutDemo();
    }

}
