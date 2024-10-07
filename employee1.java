import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

class employee {
    private String name; // incapsulation
    private int age;
    private String address;

    public employee(String name, int age, String address) {
        this.name = name; // this keyword
        this.age = age;
        this.address = address;
    }
}

class attendance {
    private String name; // incapsulation
    private String present;
    private String absent;

    public attendance(String name, String present, String absent) {
        this.name = name;
        this.present = present;
        this.absent = absent;
    }
}

public class employee1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("employee management system");
        frame.setBounds(150, 100, 400, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // employee detilas
        JTextField employeeNameField = new JTextField("enter the employee name");
        employeeNameField.setBounds(50, 30, 300, 30);
        frame.add(employeeNameField);

        JTextField employeeAgeField = new JTextField("enter the employee age");
        employeeAgeField.setBounds(50, 70, 300, 30);
        frame.add(employeeAgeField);

        JTextArea employeeAddressArea = new JTextArea("enter the doctor address");
        employeeAddressArea.setBounds(50, 110, 300, 60);
        frame.add(employeeAddressArea);

        // attendance option
        String[] attendanceOption = {
                "Select attendance",
                "present",
                "absent",
        };
        JComboBox<String> appointmentBox = new JComboBox<>(attendanceOption);
        appointmentBox.setBounds(50, 220, 300, 30);
        frame.add(appointmentBox);

        // mark attendance
        JButton submitButton = new JButton("Mark");
        submitButton.setBounds(50, 260, 300, 30);
        frame.add(submitButton);

        String[] columnNames = {
                "Name",
                "Age",
                "Address",
                "Attendance" };

        Object[][] data = {};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        JTable attendanceTable = new JTable(model);
        JScrollPane tableScrollPane = new JScrollPane(attendanceTable);
        tableScrollPane.setBounds(50, 260, 300, 150);
        frame.add(tableScrollPane);

        JTextArea displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setBounds(50, 330, 300, 150);
        frame.add(scrollPane);
        // action listener

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String employeename = employeeNameField.getText().trim();
                String employeeAge = employeeAgeField.getText().trim();
                String employeeAddress = employeeAddressArea.getText().trim();

                displayArea.append("Employee Name :" + employeename + "\n");
                displayArea.append("Employee Age:" + employeeAge + "\n");
                displayArea.append("Employee Address :" + employeeAddressArea + "\n\n");

            }
        });
        frame.setVisible(true);
    }
}