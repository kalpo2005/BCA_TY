/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kite;

import java.awt.*;

public class Kite extends Frame {

    public Kite() {

        setSize(800, 1000);
        setName("Kite");
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {

        int[] x = {100, 200, 300, 200, 100, 300, 200, 200, 150, 250, 200};
        int[] y = {200, 300, 200, 100, 200, 200, 100, 300, 350, 350, 300};
        g.drawPolygon(x, y, 11);

        // firki handale
        g.drawOval(500, 500, 25, 80);
        g.drawOval(600, 500, 25, 80);
       
        // handle
        g.drawRect(450, 535, 50, 10);
        g.drawRect(625, 535, 50, 10);
        
        g.drawLine(525, 520, 600, 520);
        g.drawLine(525, 560, 600, 560);
        
        // thrad
        g.drawLine(200, 200, 580, 520);

    }

    public static void main(String[] args) {
        new Kite();
    }

}
