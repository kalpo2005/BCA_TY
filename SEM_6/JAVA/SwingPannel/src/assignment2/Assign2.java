/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Assign2 extends JFrame implements ActionListener {

    JCheckBox bca, bcom, bsc, ba;

    public Assign2() {

        JLabel courseLabel = new JLabel("Course : ");
        courseLabel.setBounds(30, 20, 50, 20);
        add(courseLabel);

        bca = new JCheckBox("BCA");
        bcom = new JCheckBox("BCOM");
        bsc = new JCheckBox("BSC");
        ba = new JCheckBox("BA");

        bca.setBounds(100, 20, 50, 20);
        bcom.setBounds(150, 20, 70, 20);
        bsc.setBounds(220, 20, 50, 20);
        ba.setBounds(270, 20, 50, 20);

        add(bca);
        add(bcom);
        add(bsc);
        add(ba);

        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(120, 70, 100, 25);
        add(submitBtn);

        submitBtn.addActionListener(this);

        setSize(500, 800);
        setTitle("Assignment 2");
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selected = '';
        
        if (bca.isSelected()) {
            
        }
    }

    public static void main(String[] args) {
        new Assign2();
    }
}
