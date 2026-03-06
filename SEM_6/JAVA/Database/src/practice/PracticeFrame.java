/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;


import javax.swing.JFrame;

/**
 *
 * @author ABC
 */
public class PracticeFrame extends JFrame{

    public PracticeFrame() {

        paint(g);
        
        setSize(500, 800);
        setTitle("Practice frame !!!");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PracticeFrame();
    }
    
}
