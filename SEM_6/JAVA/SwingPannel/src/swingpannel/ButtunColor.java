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

    JButton red, blue, green;

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

    }

    public static void main(String[] args) {
        new ButtunColor();
    }
}
