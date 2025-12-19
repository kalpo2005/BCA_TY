/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resourse;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author ABC
 */
public class FrameDesign2 extends Frame{
    
    public FrameDesign2(){
        
        Label nameLable = new Label("Enter your first name : ");
        nameLable.setBounds(30, 40, 150, 30);
        add(nameLable);
        
        TextField nameInput = new TextField(20);
        nameInput.setBounds(30, 70, 150, 30);
        add(nameInput);
        
        Label middleLable = new Label("Enter your middle name : ");
        middleLable.setBounds(30, 110, 150, 20);
        add(middleLable);
        
        TextField middleInput = new TextField(20);
        middleInput.setBounds(30, 140, 150, 30);
        add(middleInput);
        
        Label surnameLable = new Label("Enter your surname : ");
        surnameLable.setBounds(30, 180, 130, 30);
        add(surnameLable);
          
        TextField surnameInput = new TextField(20);
        surnameInput.setBounds(30, 210, 150, 30);
        add(surnameInput);
        
        Button submitButton = new Button("Submit");
        submitButton.setBounds(60, 250, 50, 20);
        add(submitButton);
        
        setSize(400,800);
        setTitle("Second Frame Design");
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new FrameDesign2();
    }
}
