/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.awt.event.*;
import javax.swing.*;


public class DynamicUpdate extends JFrame implements ActionListener{

    public DynamicUpdate() {
        
        setSize(500, 500);
        setTitle("Update Student !!!");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public static void main(String[] args) {
        new DynamicUpdate();
    }
}
