/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2;


import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ABC
 */
public class NewClass {
    public static void main(String[] args) {
        JFrame j=new JFrame();
        JButton b1=new JButton("submit");
        b1.setBounds(20, 20, 120, 30);
        j.add(b1);
        
      
        j.setSize(500,500);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
