/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.program;

import java.awt.*;

public class Triangle extends Frame{
    
    public Triangle(){
        
        
        setSize(600, 1000);
        setTitle("Triangle Demo");
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
       
        int[] x =  {60,140,100};
        int[] y =  {135,135,60};
        g.setColor(Color.red);
        
        g.drawPolygon(x, y, 3);
        g.fillPolygon(x, y, 3);
        
    }
    
    
    public static void main(String[] args) {
        new Triangle();
    }
    
}
