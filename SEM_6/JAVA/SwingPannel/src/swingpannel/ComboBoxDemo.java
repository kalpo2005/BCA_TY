/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingpannel;

//import java.awt.event.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ComboBoxDemo extends JFrame {

    public ComboBoxDemo() {

        String[] color = {"Select", "red", "blue", "magenta", "yellow"};
        JComboBox<String> comboBox = new JComboBox<>(color);
        comboBox.setBounds(30, 30, 150, 25);
        add(comboBox);

        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(50, 70, 100, 25);
        add(submitBtn);

        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = comboBox.getSelectedItem().toString();
                
                if(selectedColor == "red")
                    getContentPane().setBackground(Color.red);
                
                if(selectedColor == "blue")
                    getContentPane().setBackground(Color.blue);
                
                if(selectedColor == "magenta")
                    getContentPane().setBackground(Color.magenta);
                
                 if(selectedColor == "yellow")
                    getContentPane().setBackground(Color.yellow);
                 
                 if(selectedColor == "Select")
                    JOptionPane.showMessageDialog(null, "Please Select Any Color","Error",JOptionPane.ERROR_MESSAGE);
            }
        });

        setSize(500, 800);
        setTitle("combo box");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxDemo();
    }
}
