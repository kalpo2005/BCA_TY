/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.awt.event.*;
import javax.swing.*;

public class Assign5 extends JFrame implements ActionListener {

    JMenuBar menu;
    JMenu file;
    JMenuItem ex;

    public Assign5() {

        menu = new JMenuBar();
        file = new JMenu("File");
        ex = new JMenuItem("Exit");

        menu.add(file);
        file.add(ex);

        ex.addActionListener(this);

        setSize(500, 500);
        setJMenuBar(menu);
        setTitle("Menubar");
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ex) {
            int choice = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure you want to exit?",
                    "Confirm Exit",
                    JOptionPane.YES_NO_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new Assign5();
    }
}
