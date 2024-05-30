package belardosanjuan;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import javax.swing.*;

public class Homepage {

    private JLayeredPane layeredPane;
    private JLabel lblHome;
    private JTextField txtName;
    private JTextField txtDay;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    public JFrame homepageFrame;
    private JComboBox<Integer> bedNum;
    private JComboBox<Integer> pillowNum;
    private JComboBox<Integer> towelNum;
    private JComboBox<Integer> lightNum;
    private JComboBox<Integer> booksNum;
    private JComboBox<Integer> toiletNum;
    private JComboBox<Integer> luggageNum;
    private JComboBox<Integer> breakfastNum;
    private JComboBox<Integer> lunchNum;
    private JComboBox<Integer> dinnerNum;
    private JComboBox<Integer> drinkNum;
    private JComboBox<Integer> snackNum;
    private JButton btnHover;

    public Homepage() {
        layeredPane = new JLayeredPane();

        lblHome = new JLabel(new ImageIcon("resources/homepage.png"));
        lblHome.setBounds(0, 0, 800, 500);

        txtName = new JTextField();
        txtName.setFont(new Font("Segoe UI", Font.BOLD, 14));
        txtName.setBounds(25, 90, 200, 35);
        txtName.setBorder(BorderFactory.createLineBorder(Color.decode("#c5c5c5")));

        txtDay = new JTextField();
        txtDay.setFont(new Font("Segoe UI", Font.BOLD, 14));
        txtDay.setBounds(270, 90, 200, 35);
        txtDay.setBorder(BorderFactory.createLineBorder(Color.decode("#c5c5c5")));

        checkBox1 = new JCheckBox(); //tourist
        checkBox1.setBounds(27, 187, 19, 19);
        checkBox2 = new JCheckBox(); //deluxe
        checkBox2.setBounds(27, 217, 19, 19);
        checkBox3 = new JCheckBox(); //ambassador
        checkBox3.setBounds(27, 247, 19, 19);
        checkBox4 = new JCheckBox(); //corporate
        checkBox4.setBounds(27, 277, 19, 19);
        checkBox5 = new JCheckBox(); //5 person
        checkBox5.setBounds(55, 347, 19, 19);
        checkBox6 = new JCheckBox(); //3 person
        checkBox6.setBounds(55, 377, 19, 19);

        Integer[] quantities = {0, 1, 2, 3, 4, 5};
        bedNum = new JComboBox<>(quantities);
        bedNum.setBounds(730, 64, 40, 22);
        pillowNum = new JComboBox<>(quantities);
        pillowNum.setBounds(730, 94, 40, 22);
        towelNum = new JComboBox<>(quantities);
        towelNum.setBounds(730, 124, 40, 22);
        lightNum = new JComboBox<>(quantities);
        lightNum.setBounds(730, 154, 40, 22);
        booksNum = new JComboBox<>(quantities);
        booksNum.setBounds(730, 184, 40, 22);
        toiletNum = new JComboBox<>(quantities);
        toiletNum.setBounds(730, 214, 40, 22);
        luggageNum = new JComboBox<>(quantities);
        luggageNum.setBounds(730, 244, 40, 22);
        breakfastNum = new JComboBox<>(quantities);
        breakfastNum.setBounds(730, 302, 40, 22);
        lunchNum = new JComboBox<>(quantities);
        lunchNum.setBounds(730, 328, 40, 22);
        dinnerNum = new JComboBox<>(quantities);
        dinnerNum.setBounds(730, 354, 40, 22);
        drinkNum = new JComboBox<>(quantities);
        drinkNum.setBounds(730, 380, 40, 22);
        snackNum = new JComboBox<>(quantities);
        snackNum.setBounds(730, 406, 40, 22);

        btnHover = new JButton(new ImageIcon("resources/button.png"));
        btnHover.setBounds(400, 400, 200, 50);
        btnHover.setBorderPainted(false);
        btnHover.setFocusPainted(false);
        btnHover.setContentAreaFilled(false);
        btnHover.setRolloverIcon(new ImageIcon("resources/button_hover.png"));
        btnHover.addActionListener(e -> processReservation());

        layeredPane.add(lblHome, new Integer(0));
        layeredPane.add(txtName, new Integer(1));
        layeredPane.add(txtDay, new Integer(1));
        layeredPane.add(checkBox1, new Integer(1));
        layeredPane.add(checkBox2, new Integer(1));
        layeredPane.add(checkBox3, new Integer(1));
        layeredPane.add(checkBox4, new Integer(1));
        layeredPane.add(checkBox5, new Integer(1));
        layeredPane.add(checkBox6, new Integer(1));
        layeredPane.add(bedNum, new Integer(1));
        layeredPane.add(pillowNum, new Integer(1));
        layeredPane.add(towelNum, new Integer(1));
        layeredPane.add(lightNum, new Integer(1));
        layeredPane.add(booksNum, new Integer(1));
        layeredPane.add(toiletNum, new Integer(1));
        layeredPane.add(luggageNum, new Integer(1));
        layeredPane.add(breakfastNum, new Integer(1));
        layeredPane.add(lunchNum, new Integer(1));
        layeredPane.add(dinnerNum, new Integer(1));
        layeredPane.add(snackNum, new Integer(1));
        layeredPane.add(drinkNum, new Integer(1));
        layeredPane.add(btnHover, new Integer(1));

        homepageFrame = new JFrame("Homepage");
        homepageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homepageFrame.setSize(800, 500);
        homepageFrame.setLocationRelativeTo(null);
        homepageFrame.setResizable(false);
        homepageFrame.setContentPane(layeredPane);
        homepageFrame.setVisible(true);
    }

    private void processReservation() {
        String name = txtName.getText();
        LocalDate checkInDate = LocalDate.now(); // Replace with actual check-in date logic

        // Validate and parse check-out date
        int checkoutDays = parseQuantityValue(txtDay.getText());
        if (checkoutDays == -1) {
            JOptionPane.showMessageDialog(homepageFrame, "Invalid number of days entered!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        LocalDate checkOutDate = checkInDate.plusDays(checkoutDays); // Replace with actual check-out date logic

        // Get selected room options
        boolean hasTouristRoom = checkBox1.isSelected();
        boolean hasDeluxeRoom = checkBox2.isSelected();
        boolean hasAmbassadorRoom = checkBox3.isSelected();
        boolean hasCorporateRoom = checkBox4.isSelected();
        boolean hasFivePersonRoom = checkBox5.isSelected();
        boolean hasThreePersonRoom = checkBox6.isSelected();

        // Get quantity of additional services
        int bedQuantity = parseQuantityValue(bedNum.getSelectedItem());
        int pillowQuantity = parseQuantityValue(pillowNum.getSelectedItem());
        int towelQuantity = parseQuantityValue(towelNum.getSelectedItem());
        int lightQuantity = parseQuantityValue(lightNum.getSelectedItem());
        int booksQuantity = parseQuantityValue(booksNum.getSelectedItem());
        int toiletQuantity = parseQuantityValue(toiletNum.getSelectedItem());
        int luggageQuantity = parseQuantityValue(luggageNum.getSelectedItem());
        int breakfastQuantity = parseQuantityValue(breakfastNum.getSelectedItem());
        int lunchQuantity = parseQuantityValue(lunchNum.getSelectedItem());
        int dinnerQuantity = parseQuantityValue(dinnerNum.getSelectedItem());
        int drinkQuantity = parseQuantityValue(drinkNum.getSelectedItem());
        int snackQuantity = parseQuantityValue(snackNum.getSelectedItem());

        // Validate input quantity values
        if (bedQuantity == -1 || pillowQuantity == -1 || towelQuantity == -1 || lightQuantity == -1 ||
            booksQuantity == -1 || toiletQuantity == -1 || luggageQuantity == -1 || breakfastQuantity == -1 ||
            lunchQuantity == -1 || dinnerQuantity == -1 || drinkQuantity == -1 || snackQuantity == -1) {
            JOptionPane.showMessageDialog(homepageFrame, "Invalid quantity value entered!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Room rates
        double touristClassRate = 1000.00;
        double deluxeClassRate = 1200.00;
        double ambassadorClassRate = 1300.00;
        double corporateClassRate = 1500.00;
        double annexRoomRate = 300.00;

        // Calculate total amount based on room class
        int numberOfDays = parseQuantityValue(txtDay.getText());
        if (numberOfDays == -1) {
            JOptionPane.showMessageDialog(homepageFrame, "Invalid number of days entered!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double totalAmount = 0.0;

        if (hasTouristRoom) {
            totalAmount += touristClassRate * numberOfDays;
        }
        if (hasDeluxeRoom) {
            totalAmount += deluxeClassRate * numberOfDays;
        }
        if (hasAmbassadorRoom) {
            totalAmount += ambassadorClassRate * numberOfDays;
        }
        if (hasCorporateRoom) {
            totalAmount += corporateClassRate * numberOfDays;
        }
        if (hasFivePersonRoom) {
            totalAmount += annexRoomRate * numberOfDays;
        }
        if (hasThreePersonRoom) {
            totalAmount += annexRoomRate * numberOfDays;
        }

        // Calculate total amount based on additional services
        totalAmount += bedQuantity * 300.00;
        totalAmount += pillowQuantity * 150.00;
        totalAmount += towelQuantity * 150.00;
        totalAmount += lightQuantity * 200.00;
        totalAmount += booksQuantity * 100.00;
        totalAmount += toiletQuantity * 300.00;
        totalAmount += luggageQuantity * 300.00;
        totalAmount += breakfastQuantity * 400.00;
        totalAmount += lunchQuantity * 600.00;
        totalAmount += dinnerQuantity * 600.00;
        totalAmount += drinkQuantity * 100.00;
        totalAmount += snackQuantity * 300.00;

        // Apply discounts
        boolean pwdDiscount = false; // Replace with actual PWD discount logic
        boolean seniorDiscount = false; // Replace with actual senior citizen discount logic
        if (pwdDiscount) {
            totalAmount -= 0.1 * totalAmount; // 10% PWD Discount
        }
        if (seniorDiscount) {
            totalAmount -= 0.2 * totalAmount; // 20% Senior Citizen Discount
        }

        // Calculate VAT
        double vatAmount = calculateVAT(totalAmount);
        double totalAmountWithVAT = totalAmount + vatAmount;
        
        // Generate confirmation message
        StringBuilder confirmationMessageBuilder = new StringBuilder("Reservation processed successfully!\n")
                .append("Name: ").append(name).append("\n")
                .append("Check-in Date: ").append(checkInDate).append("\n")
                .append("Check-out Date: ").append(checkOutDate).append("\n");

        if (hasTouristRoom) {
            confirmationMessageBuilder.append("Room Type: Tourist Room\n");
        } else if (hasDeluxeRoom) {
            confirmationMessageBuilder.append("Room Type: Deluxe Room\n");
        } else if (hasAmbassadorRoom) {
            confirmationMessageBuilder.append("Room Type: Ambassador Room\n");
        } else if (hasCorporateRoom) {
            confirmationMessageBuilder.append("Room Type: Corporate Room\n");
        } else if (hasFivePersonRoom) {
            confirmationMessageBuilder.append("Room Type: 5-Person Room\n");
        } else if (hasThreePersonRoom) {
            confirmationMessageBuilder.append("Room Type: 3-Person Room\n");
        }
        confirmationMessageBuilder.append("Bed Quantity: ").append(bedQuantity).append("\n")
                .append("Pillow Quantity: ").append(pillowQuantity).append("\n")
                .append("Towel Quantity: ").append(towelQuantity).append("\n")
                .append("Light Quantity: ").append(lightQuantity).append("\n")
                .append("Books Quantity: ").append(booksQuantity).append("\n")
                .append("Toilet Quantity: ").append(toiletQuantity).append("\n")
                .append("Luggage Quantity: ").append(luggageQuantity).append("\n")
                .append("Breakfast Quantity: ").append(breakfastQuantity).append("\n")
                .append("Lunch Quantity: ").append(lunchQuantity).append("\n")
                .append("Dinner Quantity: ").append(dinnerQuantity).append("\n")
                .append("Drink Quantity: ").append(drinkQuantity).append("\n")
                .append("Snack Quantity: ").append(snackQuantity).append("\n")
                .append("Total Amount: ").append(totalAmount).append("\n")
                .append("VAT (12%): ").append(vatAmount).append("\n")
                .append("Total Amount (incl. VAT): ").append(totalAmountWithVAT);

        JOptionPane.showMessageDialog(homepageFrame, confirmationMessageBuilder.toString(), "Reservation Confirmation", JOptionPane.INFORMATION_MESSAGE);
        
        // Reset radio buttons
        checkBox1.setSelected(false);
        checkBox2.setSelected(false);
        checkBox3.setSelected(false);
        checkBox4.setSelected(false);
        checkBox5.setSelected(false);
        checkBox6.setSelected(false);

        // Reset text fields
        txtName.setText("");
        txtDay.setText("");

        // Reset combo boxes
        bedNum.setSelectedIndex(0);
        pillowNum.setSelectedIndex(0);
        towelNum.setSelectedIndex(0);
        lightNum.setSelectedIndex(0);
        booksNum.setSelectedIndex(0);
        toiletNum.setSelectedIndex(0);
        luggageNum.setSelectedIndex(0);
        breakfastNum.setSelectedIndex(0);
        lunchNum.setSelectedIndex(0);
        dinnerNum.setSelectedIndex(0);
        drinkNum.setSelectedIndex(0);
        snackNum.setSelectedIndex(0);
    }
    
    private double calculateVAT(double amount) {
        // Calculate VAT (12%)
        double vatPercentage = 0.12;
        return amount * vatPercentage;
    } 

    private int parseQuantityValue(Object selectedItem) {
        String quantityString = selectedItem.toString();
        if (quantityString.isEmpty()) {
            return -1; // Return -1 for invalid input
        }
        try {
            return Integer.parseInt(quantityString);
        } catch (NumberFormatException e) {
            return -1; // Return -1 for invalid input
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Homepage::new);
    }
}