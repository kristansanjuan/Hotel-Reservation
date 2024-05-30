

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Homepage2 extends JFrame
{
    private Color clrBlue = new Color(0,102,204);
    private Color clrOrange = new Color(255,137,20);
    private Color clrGray = new Color(200,200,200);
    private Color clrLightGray = new Color(245,245,245);
    private Border border = BorderFactory.createLineBorder(clrGray);
    
    Homepage2()
    {
        super("Black Bean Company");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground((Color.WHITE));
            
        JButton btnBack = new JButton("Back");
            btnBack.setFont(new Font("Segoe UI", Font.BOLD, 14));
            btnBack.setForeground(Color.WHITE);
            btnBack.setBackground(clrBlue);
            btnBack.setBorderPainted(false);
            btnBack.setBounds(700,10,70,25);
            
        //Choose your room Text
        JLabel lblChoose = new JLabel("Choose your room");
            lblChoose.setForeground(clrBlue);
            lblChoose.setFont(new Font("Segoe UI", Font.BOLD, 24));
            lblChoose.setBounds(20,10,280,35);
        
        //Blue panel
        JPanel panelSouth = new JPanel();
            panelSouth.setBackground(clrBlue);
            panelSouth.setBounds(0,391,800,70);
        
        //Company logo and design
        JLabel lblLogo = new JLabel(new ImageIcon("resources/logo_white.png"));
            lblLogo.setBounds(730,410,35,35);
        JLabel lblDot = new JLabel(new ImageIcon("resources/dot.png"));
            lblDot.setBounds(0,410,100,105);
        JLabel lblDot1 = new JLabel(new ImageIcon("resources/dot.png"));
            lblDot1.setBounds(400,340,100,105);
        JLabel lblRoom = new JLabel(new ImageIcon("resources/roombg.png"));
            lblRoom.setBounds(400,0,400,500);
        
        //Company name
        JLabel lblCompanyName = new JLabel("Black Bean Company");
            lblCompanyName.setFont(new Font("Segoe UI", Font.BOLD, 16));
            lblCompanyName.setForeground(Color.WHITE);
            lblCompanyName.setBounds(560,410,160,35);
            
        //Proceed button
        JButton btnProceed = new JButton("Proceed");
            btnProceed.setFont(new Font("Segoe UI", Font.BOLD, 14));
            btnProceed.setForeground(Color.WHITE);
            btnProceed.setBackground(clrOrange);
            btnProceed.setBorderPainted(false);
            btnProceed.setBounds(17,340,90,35);
        
        //Room class
        JLabel lblRClass = new JLabel("Room Class");
            lblRClass.setFont(new Font("Segoe UI", Font.BOLD, 16));
            lblRClass.setBounds(20,50,160,35);
            
        //Tourist Class
        JRadioButton rdoTourist = new JRadioButton("Tourist Class");
            rdoTourist.setBackground(Color.WHITE);
            rdoTourist.setFont(new Font("Segoe UI", Font.BOLD, 14));
            rdoTourist.setBounds(20,80,110,35);
        JLabel lblTDesc = new JLabel("Regular rate per day: P1,000.00");
            lblTDesc.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            lblTDesc.setBounds(40,105,305,35);
        JLabel lblTDesc1 = new JLabel("Promo rate per day: P900.00");
            lblTDesc1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            lblTDesc1.setBounds(40,130,305,35);
            
        //Deluxe Class
        JRadioButton rdoDeluxe = new JRadioButton("Deluxe Class");
            rdoDeluxe.setBackground(Color.WHITE);
            rdoDeluxe.setFont(new Font("Segoe UI", Font.BOLD, 14));
            rdoDeluxe.setBounds(20,155,110,35);
        JLabel lblDDesc = new JLabel("Regular rate per day: P1,000.00");
            lblDDesc.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            lblDDesc.setBounds(40,180,305,35);
        JLabel lblDDesc1 = new JLabel("Promo rate per day: P900.00");
            lblDDesc1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            lblDDesc1.setBounds(40,205,305,35);
            
        //Ambassador Class
        JRadioButton rdoAmbassador = new JRadioButton("Ambassador Class");
            rdoAmbassador.setBackground(Color.WHITE);
            rdoAmbassador.setFont(new Font("Segoe UI", Font.BOLD, 14));
            rdoAmbassador.setBounds(250,80,150,35);
        JLabel lblADesc = new JLabel("Regular rate per day: P1,000.00");
            lblADesc.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            lblADesc.setBounds(270,105,305,35);
        JLabel lblADesc1 = new JLabel("Promo rate per day: P900.00");
            lblADesc1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            lblADesc1.setBounds(270,130,305,35);
            
        //Corporate Class
        JRadioButton rdoCorporate = new JRadioButton("Ambassador Class");
            rdoCorporate.setBackground(Color.WHITE);
            rdoCorporate.setFont(new Font("Segoe UI", Font.BOLD, 14));
            rdoCorporate.setBounds(250,155,150,35);
        JLabel lblCDesc = new JLabel("Regular rate per day: P1,000.00");
            lblCDesc.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            lblCDesc.setBounds(270,180,305,35);
        JLabel lblCDesc1 = new JLabel("Promo rate per day: P900.00");
            lblCDesc1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            lblCDesc1.setBounds(270,205,305,35);
            
        //Annex Room
        JLabel lblAnnex = new JLabel("Annex Room");
            lblAnnex.setFont(new Font("Segoe UI", Font.BOLD, 14));
            lblAnnex.setBounds(20,240,160,35);
        JRadioButton rdoAnnex = new JRadioButton("Good for 5 persons (P300.00 per person)");
            rdoAnnex.setBackground(Color.WHITE);
            rdoAnnex.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            rdoAnnex.setBounds(40,265,240,35);
        JRadioButton rdoAnnex1 = new JRadioButton("Good for 3 persons (P300.00 per person)");
            rdoAnnex1.setBackground(Color.WHITE);
            rdoAnnex1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            rdoAnnex1.setBounds(40,290,240,35);
            
        ButtonGroup btngrp = new ButtonGroup();
            btngrp.add(rdoTourist);
            btngrp.add(rdoDeluxe);
            btngrp.add(rdoAmbassador);
            btngrp.add(rdoCorporate);
            btngrp.add(rdoAnnex);
            btngrp.add(rdoAnnex1);
        
        panel.add(lblChoose);
        panel.add(btnBack);
        panel.add(lblLogo);
        panel.add(lblDot);
        panel.add(lblDot1);
        panel.add(lblCompanyName);
        panel.add(panelSouth);
        panel.add(lblRoom);
        panel.add(lblRClass);
        panel.add(rdoTourist);
        panel.add(lblTDesc);
        panel.add(lblTDesc1);
        panel.add(rdoDeluxe);
        panel.add(lblDDesc);
        panel.add(lblDDesc1);
        panel.add(rdoAmbassador);
        panel.add(lblADesc);
        panel.add(lblADesc1);
        panel.add(rdoCorporate);
        panel.add(lblCDesc);
        panel.add(lblCDesc1);
        panel.add(lblAnnex);
        panel.add(rdoAnnex);
        panel.add(rdoAnnex1);
        panel.add(btnProceed);
        
        add(panel);
        setVisible(true);
        
        // Proceed button
        btnProceed.addActionListener(e -> {
            String selectedRoom = null;

            // Determine the selected room
            if (rdoTourist.isSelected()) {
                selectedRoom = "Tourist Class";
            } else if (rdoDeluxe.isSelected()) {
                selectedRoom = "Deluxe Class";
            } else if (rdoAmbassador.isSelected()) {
                selectedRoom = "Ambassador Class";
            } else if (rdoCorporate.isSelected()) {
                selectedRoom = "Corporate Class";
            } else if (rdoAnnex.isSelected()) {
                selectedRoom = "Annex Room (Good for 5 persons)";
            } else if (rdoAnnex1.isSelected()) {
                selectedRoom = "Annex Room (Good for 3 persons)";
            }

            // Save or use the selected room as needed
            if (selectedRoom != null) {
                ReservationData reservationData = new ReservationData(selectedRoom);
                String room = reservationData.getSelectedRoom(); // Get the selected room from ReservationData
                // You can save the reservation data to another class or perform any other necessary actions here
            } else {
                JOptionPane.showMessageDialog(null, "Please select a room.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });


        panel.add(btnProceed);
    }
    
    public static void main(String[] args) {
        Homepage2 window = new Homepage2();
    }
    
}