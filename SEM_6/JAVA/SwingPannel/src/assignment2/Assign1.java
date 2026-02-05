/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Assign1 extends JFrame {
    public Assign1() {

        JLabel nameLable = new JLabel("Name :  ");
        add(nameLable);

        JTextField nameInput = new JTextField(10);
        add(nameInput);

        JButton submitButton = new JButton("Submit");
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String emptyMessage = nameInput.getText() ;
                if(emptyMessage.isEmpty())
                   emptyMessage = "No any Input !!!";
                else
                   emptyMessage = "Your Name : " + emptyMessage;
                    
                    JOptionPane.showMessageDialog(null, emptyMessage);
            }
        });

        setSize(500, 800);
        setTitle("DialogBox panel");
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Assign1();
    }
}
