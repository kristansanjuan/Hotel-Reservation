package belardosanjuan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class LoginFrame extends JFrame implements ActionListener {

    private JPanel panelCenter;
    private JPanel panelBlue;
    private JLabel lblIcon1;
    private JLabel lblIcon2;
    private JLabel lblIcon3;
    private JLabel lblWelcome;
    private JLabel lblWelcome1;
    private JLabel lblIcon;
    private JLabel lblCompany;
    private JLabel lblHeader;
    private JLabel lblsubHeader;
    private JLabel lblUser;
    private JLabel lblPass;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JButton btnLogin;
    private JSeparator sprt;
    /*private JButton btnSignUp;*/
    private JButton btnAbout;
    private Color clrBlue;
    private Color clrOrange;

    private int attempts;
    private ArrayList<String[]> users;

    public LoginFrame(ArrayList<String[]> users) {
        super("Black Bean Company");

        this.users = users;
        attempts = 0;

        panelBlue = new JPanel(new BorderLayout());
        lblIcon1 = new JLabel(new ImageIcon("resources/hotel.png"));
        lblIcon2 = new JLabel(new ImageIcon("resources/dot.png"));
        lblIcon3 = new JLabel(new ImageIcon("resources/dot.png"));
        lblWelcome = new JLabel("Welcome to");
        lblWelcome1 = new JLabel("Black Bean Company");
        lblIcon = new JLabel(new ImageIcon("resources/logo.png"));
        lblCompany = new JLabel("Black Bean Company");
        lblHeader = new JLabel("Login to Your Account");
        lblsubHeader = new JLabel("Hotel and Resort Reservation");
        lblUser = new JLabel("Username");
        lblPass = new JLabel("Password");
        txtUser = new JTextField();
        txtPass = new JPasswordField();
        btnLogin = new JButton("Login");
        sprt = new JSeparator();
        /*btnSignUp = new JButton("Sign Up");*/
        btnAbout = new JButton("About Us");
        clrBlue = new Color(0, 102, 204);
        clrOrange = new Color(255, 137, 20);

        panelBlue.setLayout(null);
        panelBlue.setBackground(clrBlue);
        panelBlue.setBounds(0, 0, 400, 500);
        lblIcon1.setBounds(0, 0, 400, 421);
        lblWelcome.setBounds(130, 50, 137, 32);
        lblWelcome.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblWelcome.setForeground(Color.WHITE);
        lblWelcome1.setBounds(80, 80, 238, 32);
        lblWelcome1.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblWelcome1.setForeground(Color.WHITE);
        lblIcon2.setBounds(300, -20, 100, 105);
        lblIcon3.setBounds(20, 300, 100, 105);
        JLabel lblFooter = new JLabel("Are you dreaming of a place to stay?");
        lblFooter.setBounds(140, 350, 400, 35);
        lblFooter.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lblFooter.setForeground(Color.WHITE);
        JLabel lblFooter1 = new JLabel("We are here!");
        lblFooter1.setBounds(243, 375, 400, 35);
        lblFooter1.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblFooter1.setForeground(Color.WHITE);

        panelBlue.add(lblIcon1);
        panelBlue.add(lblIcon2);
        panelBlue.add(lblIcon3);
        panelBlue.add(lblWelcome);
        panelBlue.add(lblWelcome1);
        panelBlue.add(lblFooter);
        panelBlue.add(lblFooter1);

        panelCenter = new JPanel(null);
        panelCenter.setBackground(Color.WHITE);
        lblIcon.setBounds(565, 5, 50, 35);
        lblCompany.setBounds(530, 30, 259, 35);
        lblCompany.setFont(new Font("Segoe UI", Font.BOLD, 12));
        lblCompany.setForeground(clrBlue);
        lblHeader.setBounds(460, 80, 259, 35);
        lblHeader.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblsubHeader.setBounds(460, 115, 200, 20);
        lblsubHeader.setFont(new Font("Segoe UI", Font.BOLD, 12));
        lblsubHeader.setForeground(Color.GRAY);
        lblUser.setBounds(460, 160, 70, 20);
        lblUser.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblUser.setForeground(Color.GRAY);
        txtUser.setBounds(460, 185, 259, 35);
        txtUser.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        txtUser.setBorder(BorderFactory.createLineBorder(Color.decode("#c5c5c5")));
        lblPass.setBounds(460, 225, 70, 20);
        lblPass.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblPass.setForeground(Color.GRAY);
        txtPass.setBounds(460, 250, 259, 35);
        txtPass.setBorder(BorderFactory.createLineBorder(Color.decode("#c5c5c5")));
        btnLogin.setBounds(460, 300, 259, 35);
        btnLogin.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setBackground(clrBlue);
        btnLogin.setBorderPainted(false);
        sprt.setBounds(460, 348, 259, 35);
        sprt.setForeground(new Color(200, 200, 200));
        /*btnSignUp.setBounds(460, 360, 259, 35);
        btnSignUp.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnSignUp.setForeground(Color.WHITE);
        btnSignUp.setBackground(clrOrange);
        btnSignUp.setBorderPainted(false);*/
        btnAbout.setBounds(545, 420, 90, 25);
        btnAbout.setBorderPainted(false);
        btnAbout.setForeground(Color.GRAY);
        btnAbout.setBackground(Color.WHITE);

        panelCenter.add(lblIcon);
        panelCenter.add(lblCompany);
        panelCenter.add(lblHeader);
        panelCenter.add(lblsubHeader);
        panelCenter.add(lblUser);
        panelCenter.add(txtUser);
        panelCenter.add(lblPass);
        panelCenter.add(txtPass);
        panelCenter.add(btnLogin);
        panelCenter.add(sprt);
        /*panelCenter.add(btnSignUp);*/
        panelCenter.add(btnAbout);

        btnLogin.addActionListener(this);
        /*btnSignUp.addActionListener(this);*/
        btnAbout.addActionListener(this);

        getContentPane().add(panelBlue);
        getContentPane().add(panelCenter);

        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = txtUser.getText();
        char[] passwordChars = txtPass.getPassword();
        String password = new String(passwordChars);

        if (e.getSource() == btnAbout) {
            setVisible(false);
            AboutUs aboutUsFrame = new AboutUs();
            aboutUsFrame.setVisible(true);
        } /*else if (e.getSource() == btnSignUp) {
            setVisible(false);
            SignUpFrame signUpFrame = new SignUpFrame(users);
            signUpFrame.setVisible(true);
        }*/ else{
            if (username.isEmpty()) {
                JOptionPane.showMessageDialog(panelCenter, "Username is required.");
                // Clear the username and password fields
                txtUser.setText("");
                txtPass.setText("");
            } else if (password.isEmpty()) {
                JOptionPane.showMessageDialog(panelCenter, "Password is required.");
                // Clear the username and password fields
                txtUser.setText("");
                txtPass.setText("");
            } else if (username.equals("admin") && password.equals("admin123")) {
                setVisible(false);
                AdminClass adminFrame = new AdminClass(users);
                adminFrame.setVisible(true);
            } else if (username.equals("staff") && password.equals("staff123")) {
                setVisible(false);
                dispose();
                SplashScreen1.showAndOpenHomepage();
            } else if (username.equals("user") && password.equals("user123")) {
                JOptionPane.showMessageDialog(panelCenter, "System is under maintenance...");
                txtUser.setText("");
                txtPass.setText("");
            }
                else {
                // Perform login authentication here
                boolean loginSuccessful = false; // Initialize to false

                for (String[] user : users) {
                    if (user[0].equals(username)) {
                        if (user[1].equals(password)) {
                            loginSuccessful = true;
                            break;
                        } else {
                            JOptionPane.showMessageDialog(panelCenter, "Incorrect username or password.");
                            txtPass.setText("");
                            return;
                        }
                    }
                }

                if (loginSuccessful) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    // Clear the username and password fields
                    txtUser.setText("");
                    txtPass.setText("");
                    setVisible(false);

                    boolean isStaff = false;
                    for (String[] user : users) {
                        if (user[0].equals(username) && user[1].equals(password) && user[2].equals("staff")) {
                            isStaff = true;
                            break;
                        }
                    }

                    if (isStaff) {
                        dispose();
                        Homepage homepage = new Homepage();
                        homepage.homepageFrame.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(panelCenter, "System is under maintenance...");
                    }
                } else {
                    attempts++; // Increment the counter for failed attempts
                    if (attempts < 3) {
                        JOptionPane.showMessageDialog(panelCenter, "Invalid username or password. (Attempt/s: " + attempts + ")");
                        // Clear the username and password fields
                        txtUser.setText("");
                        txtPass.setText("");
                    } else {
                        JOptionPane.showMessageDialog(panelCenter, "Maximum login attempts reached.");
                        System.exit(0);
                    }

                    boolean isNormalAccount = false;
                    for (String[] user : users) {
                        if (user[0].equals(username) && user[1].equals(password) && user[2].equals("normal")) {
                            isNormalAccount = true;
                            break;
                        }
                    }

                    if (isNormalAccount) {
                        JOptionPane.showMessageDialog(panelCenter, "UI under development for normal accounts.");
                    }
                }
            }
        }
    }
}