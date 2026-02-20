/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingpannel;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.*;


public class BoxLayoutDemo extends JFrame {

    public BoxLayoutDemo() {
        
        JPanel panel = new JPanel();
        
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button2");
        JButton btn3 = new JButton("Button 3");
        
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        
        add(panel);

        setSize(500, 800);
        setTitle("Box Layout Demo !!!");
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        setLayout(new FlowLayout());
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new BoxLayoutDemo();
    }
    
}
