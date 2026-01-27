/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingpannel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtunColor extends JFrame implements ActionListener {

    JButton red, green, blue, pink,magenta;

    public ButtunColor() {

        red = new JButton("Red");
        green = new JButton("Green");
        blue = new JButton("Blue");
        pink = new JButton("Pink");
        magenta = new JButton("Magenta");
        
        add(red);
        add(green);
        add(blue);
        add(pink);
        add(magenta);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        pink.addActionListener(this);
        magenta.addActionListener(this);

        setSize(600, 800);
        setTitle("color changes");
        setLayout(new FlowLayout());
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == red) {
            getContentPane().setBackground(Color.red);
        }

        if (e.getSource() == pink) {
            getContentPane().setBackground(Color.pink);
        }

        if (e.getSource() == blue) {
            getContentPane().setBackground(Color.blue);
        }

        if (e.getSource() == green) {
            getContentPane().setBackground(Color.green);
        }
        
        if (e.getSource() == magenta) {
            getContentPane().setBackground(Color.magenta);
        }
    }

    public static void main(String[] args) {
        new ButtunColor();
    }
}
