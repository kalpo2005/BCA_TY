package resources;

import java.awt.*;
import javax.swing.*;

public class FirstPannel extends JFrame {

    public FirstPannel() {

        JPanel jframe = new JPanel();
        jframe.setLayout(null);

//        first name
        JLabel nameLable = new JLabel("First Name");
        nameLable.setBounds(20, 20, 130, 35);
        jframe.add(nameLable);

        JButton button = new JButton("Click Here ");
        button.setBounds(30, 30, 130, 35);
        jframe.add(button);
        jframe.add(button);
        jframe.setBackground(Color.gray);

        setSize(600, 600);
        setTitle("Pannel");
        setVisible(true);

    }

    public static void main(String[] args) {

        new FirstPannel();

    }
}
