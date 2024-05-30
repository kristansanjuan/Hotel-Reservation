

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Homepage extends JFrame {
    private Color clrBlue = new Color(0, 102, 204);
    private Color clrOrange = new Color(255, 137, 20);
    private Color clrGray = new Color(200, 200, 200);
    private Color clrLightGray = new Color(245, 245, 245);
    private Border border = BorderFactory.createLineBorder(clrGray);
    private JTextField txtName;
    private JTextField txtDays;
    private JCheckBox chkSenior;
    private JRadioButton rdoPM;
    private JRadioButton rdoPM1;

    Homepage() {
        super("Black Bean Company");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground((Color.WHITE));

        // Reservation Text
        JLabel lblReservation = new JLabel("Reservation Information");
        lblReservation.setForeground(clrBlue);
        lblReservation.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblReservation.setBounds(20, 10, 280, 35);

        // Blue panel
        JPanel panelSouth = new JPanel();
        panelSouth.setBackground(clrBlue);
        panelSouth.setBounds(0, 391, 800, 70);

        // Company logo and design
        JLabel lblLogo = new JLabel(new ImageIcon("resources/logo_white.png"));
        lblLogo.setBounds(730, 410, 35, 35);
        JLabel lblDot = new JLabel(new ImageIcon("resources/dot.png"));
        lblDot.setBounds(0, 410, 100, 105);
        JLabel lblDot1 = new JLabel(new ImageIcon("resources/dot.png"));
        lblDot1.setBounds(400, 340, 100, 105);
        JLabel lblRoom = new JLabel(new ImageIcon("resources/roombg.png"));
        lblRoom.setBounds(400, 0, 400, 500);

        // Company name
        JLabel lblCompanyName = new JLabel("Black Bean Company");
        lblCompanyName.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblCompanyName.setForeground(Color.WHITE);
        lblCompanyName.setBounds(560, 410, 160, 35);

        // Name with TextField
        JLabel lblName = new JLabel("NAME");
        lblName.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblName.setBounds(20, 50, 50, 35);
        txtName = new JTextField();
        txtName.setFont(new Font("Segoe UI", Font.BOLD, 14));
        txtName.setBounds(20, 80, 200, 35);
        txtName.setBorder(border);
        txtName.setBackground(clrLightGray);

        // Days with TextField
        JLabel lblDays = new JLabel("DAY/S");
        lblDays.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblDays.setBounds(250, 50, 50, 35);
        txtDays = new JTextField();
        txtDays.setFont(new Font("Segoe UI", Font.BOLD, 14));
        txtDays.setBounds(250, 80, 200, 35);
        txtDays.setBorder(border);
        txtDays.setBackground(clrLightGray);

        // For senior
        chkSenior = new JCheckBox("Are you a Senior Citizen?");
        chkSenior.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        chkSenior.setBackground(Color.WHITE);
        chkSenior.setBounds(16, 120, 160, 35);
        JLabel lblSeniorDetails = new JLabel("(20% Discount)");
        lblSeniorDetails.setFont(new Font("Segoe UI", Font.ITALIC, 12));
        lblSeniorDetails.setBounds(180, 120, 170, 35);

        // Payment Method
        JLabel lblPayment = new JLabel("Payment Option");
        lblPayment.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblPayment.setBackground(Color.WHITE);
        lblPayment.setBounds(20, 150, 170, 35);
        rdoPM = new JRadioButton("Full Payment");
        rdoPM.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        rdoPM.setBackground(Color.WHITE);
        rdoPM.setBounds(17, 180, 100, 35);
        rdoPM1 = new JRadioButton("Down Payment");
        rdoPM1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        rdoPM1.setBackground(Color.WHITE);
        rdoPM1.setBounds(120, 180, 110, 35);
        ButtonGroup btngrp = new ButtonGroup();
        btngrp.add(rdoPM);
        btngrp.add(rdoPM1);
        JLabel lblPaymentDetails = new JLabel("Promo rate is applied if full payment upon reservation.");
        lblPaymentDetails.setFont(new Font("Segoe UI", Font.ITALIC, 12));
        lblPaymentDetails.setBackground(Color.WHITE);
        lblPaymentDetails.setBounds(20, 210, 290, 35);
        JLabel lblPaymentDetails1 = new JLabel("Else 50% Down Payment for regular rate upon reservation.");
        lblPaymentDetails1.setFont(new Font("Segoe UI", Font.ITALIC, 12));
        lblPaymentDetails1.setBackground(Color.WHITE);
        lblPaymentDetails1.setBounds(20, 225, 305, 35);

        // Proceed button
        JButton btnProceed = new JButton("Proceed");
        btnProceed.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnProceed.setForeground(Color.WHITE);
        btnProceed.setBackground(clrOrange);
        btnProceed.setBorderPainted(false);
        btnProceed.setBounds(17, 280, 90, 35);
        btnProceed.addActionListener(e -> {
            String name = txtName.getText();
            boolean isSenior = chkSenior.isSelected();
            String paymentOption = rdoPM.isSelected() ? "Full Payment" : "Down Payment";
            ReservationData reservationData = new ReservationData();
            reservationData.homepage1(name, isSenior, paymentOption);
            dispose();
            Homepage2 homepage2 = new Homepage2();
            homepage2.setVisible(true);
        });

        panel.add(lblReservation);
        panel.add(lblLogo);
        panel.add(lblDot);
        panel.add(lblDot1);
        panel.add(lblCompanyName);
        panel.add(panelSouth);
        panel.add(lblRoom);
        panel.add(lblName);
        panel.add(txtName);
        panel.add(lblDays);
        panel.add(txtDays);
        panel.add(chkSenior);
        panel.add(lblSeniorDetails);
        panel.add(lblPayment);
        panel.add(lblPaymentDetails);
        panel.add(lblPaymentDetails1);
        panel.add(rdoPM);
        panel.add(rdoPM1);
        panel.add(btnProceed);

        add(panel);
        setVisible(true);
    }

	public Homepage2()
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
        
    public void Homepage3()
    {
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
        JLabel lblChoose = new JLabel("Additional options");
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
            
        //Done button
        JButton btnDone = new JButton("Done");
            btnDone.setFont(new Font("Segoe UI", Font.BOLD, 14));
            btnDone.setForeground(Color.WHITE);
            btnDone.setBackground(clrOrange);
            btnDone.setBorderPainted(false);
            btnDone.setBounds(17,340,70,35);
            
        //Quantity Text
        JLabel lblQuantity = new JLabel("Quantity");
            lblQuantity.setFont(new Font("Segoe UI", Font.BOLD, 14));
            lblQuantity.setBounds(20,50,60,20);
            
        //Bed
        JLabel lblBed = new JLabel("Extra Bed (P300.00)");
            lblBed.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblBed.setBounds(90,80,120,20);
        String[] BedQ = {"0", "1", "2", "3", "4", "5"};
        JComboBox cmbBedQ = new JComboBox(BedQ);
            cmbBedQ.setBounds(30,80,40,20);
            
        //Pillow
        JLabel lblPillow = new JLabel("Pillow (P150.00)");
            lblPillow.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblPillow.setBounds(90,110,100,20);
        String[] PillowQ = {"0", "1", "2", "3", "4", "5"};
        JComboBox cmbPillowQ = new JComboBox(PillowQ);
            cmbPillowQ.setBounds(30,110,40,20);
            
        //Towel
        JLabel lblTowel = new JLabel("Towel (P150.00)");
            lblTowel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblTowel.setBounds(90,140,100,20);
        String[] TowelQ = {"0", "1", "2", "3", "4", "5"};
        JComboBox cmbTowelQ = new JComboBox(TowelQ);
            cmbTowelQ.setBounds(30,140,40,20);
            
        //Reading Light
        JLabel lblLight = new JLabel("Reading Light (P200.00)");
            lblLight.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblLight.setBounds(90,170,150,20);
        String[] LightQ = {"0", "1", "2", "3", "4", "5"};
        JComboBox cmbLightQ = new JComboBox(LightQ);
            cmbLightQ.setBounds(30,170,40,20);
            
        //Books/Magazine
        JLabel lblBooks = new JLabel("Books/Magazine (P100.00)");
            lblBooks.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblBooks.setBounds(90,200,170,20);
        String[] BooksQ = {"0", "1", "2", "3", "4", "5"};
        JComboBox cmbBooksQ = new JComboBox(BooksQ);
            cmbBooksQ.setBounds(30,200,40,20);
            
        //Toiletries
        JLabel lblToiletries = new JLabel("Toiletries (P300.00)");
            lblToiletries.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblToiletries.setBounds(90,230,170,20);
        String[] ToiletriesQ = {"0", "1", "2", "3", "4", "5"};
        JComboBox cmbToiletriesQ = new JComboBox(ToiletriesQ);
            cmbToiletriesQ.setBounds(30,230,40,20);
            
        //Luggage Rack
        JLabel lblRack = new JLabel("Luggage Rack (P300.00)");
            lblRack.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblRack.setBounds(90,260,170,20);
        String[] RackQ = {"0", "1", "2", "3", "4", "5"};
        JComboBox cmbRackQ = new JComboBox(RackQ);
            cmbRackQ.setBounds(30,260,40,20);
            
        //Food
        JLabel lblFood = new JLabel("Food: per serving");
            lblFood.setFont(new Font("Segoe UI", Font.BOLD, 14));
            lblFood.setBounds(290,50,120,20);
            
        //Breakfast
        JLabel lblBreakfast = new JLabel("Breakfast (P400.00)");
            lblBreakfast.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblBreakfast.setBounds(330,80,170,20);
        String[] BreakfastQ = {"0", "1", "2", "3", "4", "5"};
        JComboBox cmbBreakfastQ = new JComboBox(BreakfastQ);
            cmbBreakfastQ.setBounds(270,80,40,20);
            
        //Lunch
        JLabel lblLunch = new JLabel("Lunch (P600.00)");
            lblLunch.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblLunch.setBounds(330,110,170,20);
        String[] LunchQ = {"0", "1", "2", "3", "4", "5"};
        JComboBox cmbLunchQ = new JComboBox(LunchQ);
            cmbLunchQ.setBounds(270,110,40,20);
            
        //Dinner
        JLabel lblDinner = new JLabel("Dinner (P600.00)");
            lblDinner.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblDinner.setBounds(330,140,170,20);
        String[] DinnerQ = {"0", "1", "2", "3", "4", "5"};
        JComboBox cmbDinnerQ = new JComboBox(DinnerQ);
            cmbDinnerQ.setBounds(270,140,40,20);
            
        //Drink
        JLabel lblDrink = new JLabel("Drink (P100.00)");
            lblDrink.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblDrink.setBounds(330,170,170,20);
        String[] DrinkQ = {"0", "1", "2", "3", "4", "5"};
        JComboBox cmbDrinkQ = new JComboBox(DrinkQ);
            cmbDrinkQ.setBounds(270,170,40,20);
            
        //Snack
        JLabel lblSnack = new JLabel("Snack (P300.00)");
            lblSnack.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblSnack.setBounds(330,200,170,20);
        String[] SnackQ = {"0", "1", "2", "3", "4", "5"};
        JComboBox cmbSnackQ = new JComboBox(SnackQ);
            cmbSnackQ.setBounds(270,200,40,20);
            
        //Info
        JLabel lblInfo = new JLabel("Set it to 0 if you do not require any additional.");
            lblInfo.setFont(new Font("Segoe UI", Font.ITALIC, 12));
            lblInfo.setBounds(30,300,250,20);
        
        panel.add(lblChoose);
        panel.add(btnBack);
        panel.add(lblLogo);
        panel.add(lblDot);
        panel.add(lblDot1);
        panel.add(lblCompanyName);
        panel.add(panelSouth);
        panel.add(lblRoom);
        panel.add(lblQuantity);
        panel.add(lblBed);
        panel.add(cmbBedQ);
        panel.add(lblPillow);
        panel.add(cmbPillowQ);
        panel.add(lblTowel);
        panel.add(cmbTowelQ);
        panel.add(lblLight);
        panel.add(cmbLightQ);
        panel.add(lblBooks);
        panel.add(cmbBooksQ);
        panel.add(lblToiletries);
        panel.add(cmbToiletriesQ);
        panel.add(lblRack);
        panel.add(cmbRackQ);
        panel.add(btnDone);
        panel.add(lblFood);
        panel.add(lblBreakfast);
        panel.add(cmbBreakfastQ);
        panel.add(lblLunch);
        panel.add(cmbLunchQ);
        panel.add(lblDinner);
        panel.add(cmbDinnerQ);
        panel.add(lblDrink);
        panel.add(cmbDrinkQ);
        panel.add(lblSnack);
        panel.add(cmbSnackQ);
        panel.add(lblInfo);
        
        add(panel);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Homepage window = new Homepage();
    }
    
}



    public static void main(String[] args) {
        Homepage window = new Homepage();
    }
}