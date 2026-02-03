/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.awt.*;

class GraphicsAssign extends Frame {

    public GraphicsAssign() {
        setSize(500, 800);
        setTitle("Assignment 3");
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {

        g.drawRect(30, 80, 100, 50);
        g.setColor(Color.red);
        g.fillRect(30, 80, 100, 50);

        g.drawOval(30, 150, 100, 100);
        g.setColor(Color.BLUE);
        g.fillOval(30, 150, 100, 100);
        
        g.setColor(Color.MAGENTA);
        g.drawString("kalpesh", 200, 250);

    }

}

public class Assign4 {

    public static void main(String[] args) {
        new GraphicsAssign();
    }
}
