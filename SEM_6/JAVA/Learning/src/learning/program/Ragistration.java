/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.program;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author ABC
 */
public class Ragistration extends Frame{
    
    public Ragistration(){
        
        Label  name = new Label(" Enter Name :");
        name.setBounds(20, 30, 120, 30);
        add(name);      
        
        TextField nameInput = new TextField();
        nameInput.setBounds(140, 35, 120, 25);
        add(nameInput);
        
        setSize(600, 1000);
        setTitle("Ragistation");
        setLayout(null);
//        setBackground(Color.CYAN);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new Ragistration();
    }
    
}
