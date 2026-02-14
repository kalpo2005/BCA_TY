package exam;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class P_1 extends JFrame implements ActionListener {

    JButton red, black, blue;

    public P_1() {

        red = new JButton("Red");
        blue = new JButton("Blue");
        black = new JButton("black");
        
        add(red);
        add(blue);
        add(black);

        red.addActionListener(this);
        blue.addActionListener(this);
        black.addActionListener(this);
        
        setSize(600, 800);
        setTitle("color Transmission");
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
        
         if (e.getSource() == black) {
            getContentPane().setBackground(Color.black);
        }
    }

    public static void main(String[] args) {
        new P_1();
    }
}
