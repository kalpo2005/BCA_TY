package assignment2;

import java.awt.*;
import javax.swing.*;

public class Assign4 extends JFrame {

    public Assign4() {

        setTitle("Layout Demonstration");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabs = new JTabbedPane();

        // FlowLayout
        JPanel flowPanel = new JPanel();
        flowPanel.setLayout(new FlowLayout());
        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));
        tabs.add("FlowLayout", flowPanel);

        // BoxLayout
        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        boxPanel.add(new JButton("Button 1"));
        boxPanel.add(new JButton("Button 2"));
        boxPanel.add(new JButton("Button 3"));
        tabs.add("BoxLayout", boxPanel);

        // SpringLayout
        JPanel springPanel = new JPanel();
        SpringLayout layout = new SpringLayout();
        springPanel.setLayout(layout);

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");

        springPanel.add(b1);
        springPanel.add(b2);
        springPanel.add(b3);

        // Position buttons using SpringLayout
        layout.putConstraint(SpringLayout.WEST, b1, 20, SpringLayout.WEST, springPanel);
        layout.putConstraint(SpringLayout.NORTH, b1, 20, SpringLayout.NORTH, springPanel);

        layout.putConstraint(SpringLayout.WEST, b2, 20, SpringLayout.WEST, springPanel);
        layout.putConstraint(SpringLayout.NORTH, b2, 20, SpringLayout.SOUTH, b1);

        layout.putConstraint(SpringLayout.WEST, b3, 20, SpringLayout.WEST, springPanel);
        layout.putConstraint(SpringLayout.NORTH, b3, 20, SpringLayout.SOUTH, b2);

        tabs.add("SpringLayout", springPanel);

        // Add tabbed pane to frame
        add(tabs);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Assign4();
    }
}