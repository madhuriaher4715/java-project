import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class login implements ActionListener {
    JFrame f;
    JLabel username, password, title;
    JTextField tusername, tpassword;
    JButton login, reset;

    public login() {
        f = new JFrame("Login Form");
        f.setLayout(null);
        f.setSize(400, 350);

        title = new JLabel("Login Form", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(100, 50, 300, 40);
        title.setForeground(Color.BLACK);
        f.getContentPane().setBackground(new Color(135, 206, 235));
        f.add(title);

        username = new JLabel("Username:");
        username.setFont(new Font("Arial", Font.BOLD, 15));
        username.setBounds(100, 120, 120, 30);

        tusername = new JTextField();
        tusername.setFont(new Font("Arial", Font.BOLD, 15));
        tusername.setBounds(230, 120, 150, 30);
        tusername.setBorder(new LineBorder(Color.GRAY, 1, true));

        password = new JLabel("Password:");
        password.setFont(new Font("Arial", Font.BOLD, 15));
        password.setBounds(100, 170, 120, 30);

        tpassword = new JTextField();
        tpassword.setFont(new Font("Arial", Font.BOLD, 15));
        tpassword.setBounds(230, 170, 150, 30);
        tpassword.setBorder(new LineBorder(Color.GRAY, 1, true));

        login = new JButton("Login");
        login.setBounds(150, 230, 100, 40);
        login.setBackground(new Color(70, 130, 180));
        login.setForeground(Color.WHITE);

        reset = new JButton("Reset");
        reset.setBounds(270, 230, 100, 40);
        reset.setBackground(new Color(70, 130, 180));
        reset.setForeground(Color.WHITE);

        f.add(username);
        f.add(tusername);
        f.add(password);
        f.add(tpassword);

        f.add(login);
        f.add(reset);

        login.addActionListener(this);

        reset.addActionListener(this);

        f.setVisible(true);

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == login) {

                } else if (e.getSource() == reset) {
                    tusername.setText(" ");
                    tpassword.setText(" ");

                }

            }

        });

    }

    public void actionPerformed(ActionEvent e) {

        String user = tusername.getText();
        String pass = tpassword.getText();

        JDialog d = new JDialog(f, "User Details", true);
        d.setLayout(new FlowLayout());
        d.setSize(200, 200);

        d.add(new Label("Username: " + user));
        d.add(new Label("Password: " + pass));

        d.setVisible(true);

    }

    public static void main(String[] args) {
        new login();
    }
}
