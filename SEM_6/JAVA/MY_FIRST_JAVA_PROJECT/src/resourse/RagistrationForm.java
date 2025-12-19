/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resourse;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

/**
 *
 * @author ABC
 */
public class RagistrationForm extends Frame{
    
    public RagistrationForm(){
        
        Label firstNameLable = new Label("First Name a : ");
        firstNameLable.setBounds(20, 30, 100, 30);
        add(firstNameLable);
        
        TextField firstNameInput = new TextField();
        firstNameInput.setBounds(120, 35, 120, 20);
        add(firstNameInput);
        
         Label middleNameLable = new Label("Middle Name a : ");
        middleNameLable.setBounds(20, 60, 100, 30);
        add(middleNameLable);
        
        TextField middleNameInput = new TextField();
        middleNameInput.setBounds(120, 65, 120, 20);
        add(middleNameInput);
        
        Label surnameNameInput = new Label("Surname Name : ");
        surnameNameInput.setBounds(20, 90, 100, 30);
        add(surnameNameInput);
        
        TextField surNameInput = new TextField();
        surNameInput.setBounds(120, 95, 120, 20);
        add(surNameInput);
        
        Label emailLable = new Label("Email : ");
        emailLable.setBounds(20, 120, 100, 30);
        add(emailLable);
        
        TextField emailInput = new TextField();
        emailInput.setBounds(120, 125, 120, 20);
        add(emailInput);
        
        Label mobileLable = new Label("Mobile Number: ");
        mobileLable.setBounds(20, 150, 100, 30);
        add(mobileLable);
        
        TextField mobileInput = new TextField();
        mobileInput.setBounds(120, 155, 120, 20);
        add(mobileInput);
        
        Label genderLable = new Label("Gender : ");
        genderLable.setBounds(20, 180, 100, 30);
        add(genderLable);
        
        Checkbox maleRadio = new Checkbox("male");
        maleRadio.setBounds(120, 180, 50, 30);
        add(maleRadio);
        
        Checkbox FemaleRadio = new Checkbox("Female");
        FemaleRadio.setBounds(180, 180, 50, 30);
        add(FemaleRadio);
        
        
        Label languageLable = new Label("Lanaguage ");
        languageLable.setBounds(20, 210, 100, 30);
        add(languageLable);
        
        Checkbox cRadio = new Checkbox("C");
        cRadio.setBounds(120, 210, 50, 30);
        add(cRadio);
        
        Checkbox cPRadio = new Checkbox("C++");
        cPRadio.setBounds(180, 210, 50, 30);
        add(cPRadio);
        
        Checkbox nodeJSRadio = new Checkbox("nodeJs");
        nodeJSRadio.setBounds(240, 210, 50, 30);
        add(nodeJSRadio);
        
        Button submitButton = new Button("Submit");
        submitButton.setBounds(90, 240, 70, 30);
        add(submitButton);
        
        setSize(500, 800);
        setTitle("Ragistation Form");
        setLayout(null);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new RagistrationForm();
    }

    private void add(RadioButton maleRadio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add(CheckBox maleRadio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
