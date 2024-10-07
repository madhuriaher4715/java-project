import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class patient {
    private String name;
    private int age;
    private String address;

    public patient(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

class doctor {
    private String name;
    private String speciality;
    private String address;

    public doctor(String name, String speciality, String address) {
        this.name = name;
        this.speciality = speciality;
        this.address = address;
    }
}

class appointment {
    private String date;
    private String schedule;

    public appointment(String date, String schedule) {
        this.date = date;
        this.schedule = schedule;
    }
}

public class Hospital {
    public static void main(String[] args) {

        JFrame frame = new JFrame("hospital management system");
        frame.setBounds(150, 100, 400, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // patient details
        JTextField patientNameField = new JTextField("enter the patient name");
        patientNameField.setBounds(50, 30, 300, 30);
        frame.add(patientNameField);

        JTextField patientAgeField = new JTextField("enter the patient age");
        patientAgeField.setBounds(50, 70, 300, 30);
        frame.add(patientAgeField);

        JTextArea patientAddressArea = new JTextArea("enter the patient address");
        patientAddressArea.setBounds(50, 110, 300, 60);
        frame.add(patientAddressArea);

        // Doctor Details
        JTextField doctorNameField = new JTextField("enter the doctor name");
        doctorNameField.setBounds(50, 180, 300, 30);
        frame.add(doctorNameField);

        JTextField doctorSpecialityField = new JTextField("enter the doctor speciality");
        doctorSpecialityField.setBounds(50, 220, 300, 30);
        frame.add(doctorSpecialityField);

        JTextArea doctorAddressArea = new JTextArea("enter the doctor address");
        doctorAddressArea.setBounds(50, 260, 300, 60);
        frame.add(doctorAddressArea);

        // Appointment Details
        JTextField appointmentDateField = new JTextField("enter appointment date");
        appointmentDateField.setBounds(50, 330, 300, 30);
        frame.add(appointmentDateField);

        // Schedule Options
        String[] appointmentOptions = {
                "Select schedule",
                "morning",
                "afternoon",
                "evening",
                "midnight for critical operation"
        };
        JComboBox<String> appointmentBox = new JComboBox<>(appointmentOptions);
        appointmentBox.setBounds(50, 380, 300, 30);
        frame.add(appointmentBox);

        JButton submitButton = new JButton("submit");
        submitButton.setBounds(50, 430, 300, 30);
        frame.add(submitButton);

        // Display Area
        JTextArea displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setBounds(50, 470, 300, 150);
        frame.add(scrollPane);

        // Action Listener for Submit Button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String patientName = patientNameField.getText().trim();
                String patientAge = patientAgeField.getText().trim();
                String doctorName = doctorNameField.getText().trim();
                String doctorSpeciality = doctorSpecialityField.getText().trim();
                String appointmentDate = appointmentDateField.getText().trim();
                String patientAddress = patientAddressArea.getText().trim();
                String doctorAddress = doctorAddressArea.getText().trim();
                String selectedSchedule = (String) appointmentBox.getSelectedItem();

                // Clear previous display
                displayArea.setText("");

                // Display the details
                displayArea.append("Patient Name" + patientName + "\n");
                displayArea.append("Patient Age" + patientAge + "\n");
                displayArea.append("Patient Address" + patientAddress + "\n\n");
                displayArea.append("Doctor Name" + doctorName + "\n");
                displayArea.append("Doctor Speciality" + doctorSpeciality + "\n");
                displayArea.append("Doctor Address" + doctorAddress + "\n");
                displayArea.append("Appointment Date" + appointmentDate + "\n");
                displayArea.append("Selected Schedule" + selectedSchedule + "\n");
            }
        });

        frame.setVisible(true);
    }
}
