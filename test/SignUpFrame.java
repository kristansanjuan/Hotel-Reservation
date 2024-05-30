

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class SignUpFrame extends JFrame {

    private ArrayList<String[]> users;

    public SignUpFrame(ArrayList<String[]> users) {
        this.users = users;
        
        Color clrBlue = new Color(0, 102, 204);
        Color clrOrange = new Color(255, 137, 20);
        JLabel lblIcon4 = new JLabel(new ImageIcon("resources/maldives.png"));
        lblIcon4.setBounds(0, 50, 401, 360);

        JLabel lblParadise = new JLabel("One step close to");
        lblParadise.setBounds(30, 50, 197, 32);
        lblParadise.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblParadise.setForeground(Color.WHITE);

        JLabel lblParadise1 = new JLabel("Paradise.");
        lblParadise1.setBounds(30, 80, 151, 48);
        lblParadise1.setFont(new Font("Segoe UI", Font.BOLD, 36));
        lblParadise1.setForeground(Color.WHITE);

        JPanel main = new JPanel();
        main.setLayout(null);
        main.setBackground(clrBlue);
        main.setBounds(0, 0, 400, 500);

        JLabel lblCompany1 = new JLabel("Black Bean Company");
        lblCompany1.setBounds(250, 400, 259, 35);
        lblCompany1.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lblCompany1.setForeground(Color.WHITE);

        JLabel lblIcon5 = new JLabel(new ImageIcon("resources/dot.png"));
        lblIcon5.setBounds(300, 300, 100, 105);
        JLabel lblIcon6 = new JLabel(new ImageIcon("resources/dot.png"));
        lblIcon6.setBounds(20, -20, 100, 105);

        main.add(lblParadise);
        main.add(lblParadise1);
        main.add(lblIcon4);
        main.add(lblIcon5);
        main.add(lblIcon6);
        main.add(lblCompany1);
        
        // Create a new panel for sign-up
        JPanel sub = new JPanel();
        sub.setLayout(null);
        sub.setBackground(Color.WHITE);

        JLabel lblCreate = new JLabel("Start your journey with us.");
        lblCreate.setBounds(515, 115, 200, 20);
        lblCreate.setFont(new Font("Segoe UI", Font.BOLD, 12));
        lblCreate.setForeground(Color.GRAY);

        JLabel lblNewUser = new JLabel("Let's Get Started!");
        lblNewUser.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblNewUser.setBounds(490, 90, 195, 20);
        JLabel lblIcon = new JLabel(new ImageIcon("resources/logo.png"));
        lblIcon.setBounds(565, 5, 50, 35);
        JLabel lblNewUsername = new JLabel("Username");
        lblNewUsername.setBounds(460, 160, 70, 20);
        lblNewUsername.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblNewUsername.setForeground(Color.GRAY);
        JTextField txtNewUsername = new JTextField();
        txtNewUsername.setBounds(460, 185, 259, 35);
        txtNewUsername.setFont(new Font("SegoeUI", Font.PLAIN, 12));
        txtNewUsername.setBorder(BorderFactory.createLineBorder(Color.decode("#c5c5c5")));
        JLabel lblNewPassword = new JLabel("Password");
        lblNewPassword.setBounds(460, 225, 70, 20);
        lblNewPassword.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblNewPassword.setForeground(Color.GRAY);
        JPasswordField txtNewPassword = new JPasswordField();
        txtNewPassword.setBounds(460, 250, 259, 35);
        txtNewPassword.setBorder(BorderFactory.createLineBorder(Color.decode("#c5c5c5")));

        JButton btnSignUp1 = new JButton("Sign Up");
        btnSignUp1.setBounds(460, 300, 259, 35);
        btnSignUp1.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnSignUp1.setForeground(Color.WHITE);
        btnSignUp1.setBackground(clrOrange);
        btnSignUp1.setBorderPainted(false);

        JButton btnAlready = new JButton("Already have an account?");
        btnAlready.setBounds(555, 335, 180, 35);
        btnAlready.setBorderPainted(false);
        btnAlready.setForeground(Color.GRAY);
        btnAlready.setBackground(Color.WHITE);
        btnAlready.addActionListener((ActionEvent e) -> {
            dispose();
            LoginFrame loginFrame1 = new LoginFrame(users);
            loginFrame1.setVisible(true);
        });

        JLabel lblCompany3 = new JLabel("Black Bean Company");
        lblCompany3.setBounds(530, 30, 259, 35);
        lblCompany3.setFont(new Font("Segoe UI", Font.BOLD, 12));
        lblCompany3.setForeground(clrBlue);

        sub.add(main);
        sub.add(lblIcon);
        sub.add(lblNewUser);
        sub.add(lblNewUsername);
        sub.add(txtNewUsername);
        sub.add(lblNewPassword);
        sub.add(txtNewPassword);
        sub.add(btnSignUp1);
        sub.add(lblCreate);
        sub.add(btnAlready);
        sub.add(lblCompany3);

        setTitle("Sign Up");
        add(sub);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnSignUp1.addActionListener((ActionEvent e) -> {
            String newUsername = txtNewUsername.getText();
            String newPassword = new String(txtNewPassword.getPassword());
            String userType = "Normal";

            // Check if username or password is empty
            if (newUsername.isEmpty() || newPassword.isEmpty()) {
                JOptionPane.showMessageDialog(sub, "Username or Password cannot be empty");
                return;
            }

            // Check if username already exists
            boolean usernameExists = false;
            for (String[] user : users) {
                if (user[0].equals(newUsername)) {
                    usernameExists = true;
                    break;
                }
            }

            if (usernameExists) {
                JOptionPane.showMessageDialog(sub, "Username already exists");
                txtNewUsername.setText(""); // Clear the username field
                txtNewPassword.setText(""); // Clear the password field
                return;
            }

            if (newUsername.equals("admin")) {
                JOptionPane.showMessageDialog(sub, "Username cannot be used");
                return;
            }

            String[] newUser = { newUsername, newPassword, userType };
            users.add(newUser);

            JOptionPane.showMessageDialog(sub, "Registration Successful!");
            dispose();

            // Redirect to the login frame
            LoginFrame loginFrame = new LoginFrame(users);
            loginFrame.setVisible(true);
        });

    }

    public void setVisible(boolean isVisible) {
        super.setVisible(isVisible);
    }
}