/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkbox1;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
/**
 *
 * @author ABC
 */
public class demo {
    public static void main(String[] args) {
        JFrame obj=new JFrame();
        
        JCheckBox b1=new JCheckBox("MANOJ GOHIL");
        b1.setBounds(20, 20, 120, 120);
        obj.add(b1);
       
        b1.addItemListener(new ItemListener)
        obj.setSize(500,500);
        obj.setLayout(null);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
