

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Homepage3 extends JFrame
{
    private Color clrBlue = new Color(0,102,204);
    private Color clrOrange = new Color(255,137,20);
    private Color clrGray = new Color(200,200,200);
    private Color clrLightGray = new Color(245,245,245);
    private Border border = BorderFactory.createLineBorder(clrGray);
    
    Homepage3()
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