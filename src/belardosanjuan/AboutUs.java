package belardosanjuan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class AboutUs extends JFrame {

    public AboutUs() {
        // AboutUsPanel
        JPanel panelAbout = new JPanel();
        panelAbout.setLayout(null);
        Color clrOrange = new Color(255, 137, 20);

        JLabel lblAbout = new JLabel(new ImageIcon("resources/AboutUs.png"));
        lblAbout.setBounds(0, 0, 800, 500);

        JButton btnBack = new JButton("Back to Login");
                btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                ArrayList<String[]> users = new ArrayList<>();
                LoginFrame loginFrame = new LoginFrame(users);
                loginFrame.setVisible(true);
            }
        });
        btnBack.setFont(new Font("Segoe UI", Font.BOLD, 12));
        btnBack.setBounds(615, 440, 110, 35);
        btnBack.setBorderPainted(false);
        btnBack.setForeground(clrOrange);
        btnBack.setBackground(Color.WHITE);

        panelAbout.add(lblAbout);
        panelAbout.add(btnBack);

        this.add(panelAbout);
        this.setSize(800, 530);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("About Us");
    }
    
    public void setVisible(boolean isVisible) {
        super.setVisible(isVisible);
    }
}