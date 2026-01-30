
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABC
 */
public class DialogBox {
    
    
    public DialogBox(){
        
        JFrame obj = new JFrame();
        JButton b = new JButton("Click here to show");
        obj.add(b);
        
        b.addActionListener((e) -> {
        
            JDialog d = new JDialog(obj,"kalpesh",true);
            d.setSize(200, 200);
            d.setLayout(null);
            d.setVisible(true);
            
        });
        
        
        obj.setSize(500, 800);
        obj.setTitle("new dialog Box");
        obj.setLayout(new FlowLayout());
        obj.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new DialogBox();
    }
}
