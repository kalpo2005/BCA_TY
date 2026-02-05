/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.awt.*;

class Ragistration extends Frame {

    public Ragistration() {

        setSize(500, 800);
        setTitle("Ragistration Fom");
        setLayout(null);
        setVisible(true);

        Label nameLable = new Label("Student Name : ");
        nameLable.setBounds(30, 50, 100, 30);
        add(nameLable);

        TextField nameInput = new TextField(" Enter Name  ");
        nameInput.setBounds(130, 50, 150, 30);
        add(nameInput);

        Label choiceLable = new Label("Language : ");
        choiceLable.setBounds(30, 80, 100, 30);
        add(choiceLable);

        Checkbox javaCheck = new Checkbox("Java");
        javaCheck.setBounds(140, 80, 80, 30);
        add(javaCheck);

        Checkbox pyCheck = new Checkbox("Python");
        pyCheck.setBounds(220, 80, 80, 30);
        add(pyCheck);

        Label addressLable = new Label("Address : ");
        addressLable.setBounds(30, 110, 100, 30);
        add(addressLable);

        TextArea addressInput = new TextArea("Address : ", 3, 30);
        addressInput.setBounds(130, 110, 180, 80);
        add(addressInput);
        
        Button submitButton = new Button(" Submit ");
        submitButton.setBounds(130, 220, 90, 30);
        add(submitButton);

    }

}

public class Assign5 {

    public static void main(String[] args) {
        new Ragistration();
    }
}
