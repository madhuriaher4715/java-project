import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class invitation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Invitation Card");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(new Color(135, 206, 235));

        JPanel card = new JPanel();
        card.setBackground(Color.PINK);
        card.setLayout(new GridLayout(5, 1, 10, 10));

        JLabel title = new JLabel("You are Invited", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        card.add(title);

        JLabel event = new JLabel("Birthday Party", JLabel.CENTER);
        event.setFont(new Font("Arial", Font.BOLD, 24));
        card.add(event);

        JLabel date = new JLabel("December 10, 2024", JLabel.CENTER);
        date.setFont(new Font("Arial", Font.PLAIN, 18));
        card.add(date);

        JLabel time = new JLabel("10:00 AM - 2:00 PM", JLabel.CENTER);
        time.setFont(new Font("Arial", Font.PLAIN, 18));
        card.add(time);

        JLabel location = new JLabel("Ganore Marathi School Hall", JLabel.CENTER);
        location.setFont(new Font("Arial", Font.PLAIN, 18));
        card.add(location);

        frame.add(card, BorderLayout.CENTER);

        JPanel button = new JPanel();
        button.setBackground(Color.PINK);
        JButton close = new JButton("Close");
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                frame.dispose();
            }
        });
        button.add(close);
        frame.add(button, BorderLayout.SOUTH);
        frame.setVisible(true);

    }
}