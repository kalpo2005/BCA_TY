/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.program;

import java.awt.*;

public class Shape extends Frame{
    
    public Shape(){
        
        
        setSize(600, 1000);
        setTitle("Shape Demo");
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
       
        
//        Ractanle Shape
        g.drawRect(50, 60, 100, 100);      
        g.setColor(Color.blue);
        g.fillRect(50, 60, 100, 100); 
        
        g.drawRect(60, 70, 80, 80);    
        g.setColor(Color.yellow);
        g.fillRect(60, 70, 80, 80); 
        
//      Ovel Shape
        g.drawOval(70, 80, 50, 50);
        g.setColor(Color.green);
        g.fillOval(70, 65, 80, 80);
        
       
       
        
        g.drawString("Shape Rangoli", 250, 200);
        
//        g.drawRect(60, 60, 80, 80);
    }
    
    
    public static void main(String[] args) {
        new Shape();
    }
    
}
