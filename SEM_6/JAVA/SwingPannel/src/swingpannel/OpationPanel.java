/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingpannel;

import java.awt.AWTEventMulticaster;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;


public class OpationPanel extends JFrame{
    
    JButton b;
    public OpationPanel(){
        
        b = new JButton("click here");
        add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              JOptionPane.showMessageDialog(null, "This is a dialog box !!!");
            
            }
        });
        
        
        
        
        setSize(500, 800);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new OpationPanel();
    }
    
}
