package practice;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;

public class DynamicDatabase extends JFrame implements ActionListener {

    JLabel studentNameLabel, rollNumberLabel, courseLabel;
    JTextField studentName, rollNumber;
    JComboBox<String> comboBox;
    JButton submitBtn;

    public DynamicDatabase() {

        rollNumberLabel = new JLabel("Roll Number : ");
        studentNameLabel = new JLabel("Student Name : ");
        courseLabel = new JLabel("Course Name : ");

        rollNumber = new JTextField();
        studentName = new JTextField();

        submitBtn = new JButton("Submit");

        String[] coursesCombo = {"Select", "BCA", "B.COM", "B.TECH", "MCA"};
        comboBox = new JComboBox<>(coursesCombo);

        // Set Bounds
        rollNumberLabel.setBounds(30, 20, 120, 30);
        studentNameLabel.setBounds(30, 60, 120, 30);
        courseLabel.setBounds(30, 100, 120, 30);

        rollNumber.setBounds(160, 20, 200, 30);
        studentName.setBounds(160, 60, 200, 30);
        comboBox.setBounds(160, 100, 200, 30);

        submitBtn.setBounds(160, 150, 100, 30);

        // Add Components
        add(rollNumberLabel);
        add(studentNameLabel);
        add(courseLabel);
        add(rollNumber);
        add(studentName);
        add(comboBox);
        add(submitBtn);

        submitBtn.addActionListener(this);

        setSize(450, 300);
        setTitle("Student Data Insert");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rollText = rollNumber.getText().trim();
        String studentNameInsert = studentName.getText().trim();
        String courseInsert = comboBox.getSelectedItem().toString();

        // Validate Roll Number
        if (!rollText.matches("\\d+")) {
            JOptionPane.showMessageDialog(this,
                    "Roll Number must be numeric!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate Name
        if (studentNameInsert.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Student Name cannot be empty!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate Course
        if (courseInsert.equals("Select")) {
            JOptionPane.showMessageDialog(this,
                    "Please select a valid course!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        int rollNumberInsert = Integer.parseInt(rollText);

        insertIntoDatabase(rollNumberInsert, studentNameInsert, courseInsert);
    }

    void insertIntoDatabase(int roll, String name, String course) {

        String dbPath = "jdbc:ucanaccess://D:/KALPESH_BAVALIYA/SEM_6/JAVA/Database/src/database/studentstatic.accdb";

        try (Connection conn = DriverManager.getConnection(dbPath);
                PreparedStatement query = conn.prepareStatement(
                        "INSERT INTO studentDetail (rollNumber, studentName, course) VALUES (?, ?, ?)")) {

            query.setInt(1, roll);
            query.setString(2, name);
            query.setString(3, course);

            int rows = query.executeUpdate();

            if (rows > 0) {
                JOptionPane.showMessageDialog(this,
                        "Data Successfully Inserted!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);

                // Clear fields after insert
                rollNumber.setText("");
                studentName.setText("");
                comboBox.setSelectedIndex(0);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Database Error: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new DynamicDatabase();
    }
}
