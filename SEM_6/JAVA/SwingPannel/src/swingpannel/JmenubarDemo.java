/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingpannel;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author ABC
 */
public class JmenubarDemo extends JFrame {

    public JmenubarDemo() {

        JMenuBar menu = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu view = new JMenu("View");
        JMenu window = new JMenu("Window");

        JMenuItem newFile = new JMenuItem("New Project");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem print = new JMenuItem("Print");
        JMenuItem exitmenu = new JMenuItem("Exit");

        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem past = new JMenuItem("Past");
        JMenuItem delete = new JMenuItem("Delete");

        JMenuItem toolbar = new JMenuItem("Toolbar");
        JMenuItem split = new JMenuItem("Split");

        JMenuItem favourite = new JMenuItem("Favourite");
        JMenuItem project = new JMenuItem("Project");
        JMenuItem editor = new JMenuItem("Editor");
        JMenuItem output = new JMenuItem("Output");

        menu.add(file);
        menu.add(edit);
        menu.add(view);
        menu.add(window);

        file.add(newFile);
        file.add(open);
        file.add(print);
        file.add(exitmenu);

        edit.add(copy);
        edit.add(cut);
        edit.add(past);
        edit.add(delete);
        
        view.add(toolbar);
        view.add(split);
        
        window.add(favourite);
        window.add(project);
        window.add(editor);
        window.add(output);

        setSize(500, 800);
        setJMenuBar(menu);
        setTitle("Jmenu Demo");
        setLayout(new FlowLayout());
        setVisible(true);

    }

    public static void main(String[] args) {
        new JmenubarDemo();
    }
}
