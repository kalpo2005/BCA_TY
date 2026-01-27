/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingpannel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtunColor extends JFrame implements ActionListener {

    JButton red, blue, green, pink, cyne, orange, magenta;

    public ButtunColor() {

        red = new JButton("Red");
        add(red);
        red.addActionListener(this);

        blue = new JButton("Blue");
        add(blue);
        blue.addActionListener(this);

        green = new JButton("Green");
        add(green);
        green.addActionListener(this);

        pink = new JButton("Pink");
        add(pink);
        pink.addActionListener(this);
        
        cyne = new JButton("Cyne");
        add(cyne);
        cyne.addActionListener(this);

        magenta = new JButton("Magenta");
        add(magenta);
        magenta.addActionListener(this);

        orange = new JButton("Orange");
        add(orange);
        orange.addActionListener(this);

        setSize(500, 800);
        setTitle("button Color");
        setLayout(new FlowLayout());
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == red) {
            getContentPane().setBackground(Color.red);
        }

        if (e.getSource() == blue) {
            getContentPane().setBackground(Color.blue);
        }

        if (e.getSource() == green) {
            getContentPane().setBackground(Color.green);
        }

        if (e.getSource() == pink) {
            getContentPane().setBackground(Color.pink);
        }
        
        if (e.getSource() == magenta) {
            getContentPane().setBackground(Color.magenta);
        }
        
        if (e.getSource() == cyne) {
            getContentPane().setBackground(Color.CYAN);
        }
        
        if (e.getSource() == orange) {
            getContentPane().setBackground(Color.orange);
        }

    }

    public static void main(String[] args) {
        new ButtunColor();
    }
}
