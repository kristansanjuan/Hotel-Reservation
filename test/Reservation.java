

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;
import org.jdatepicker.*;

public class ReservationSystem extends JFrame {
    private JTextField nameField;
    private JCheckBox fullPaymentCheckBox;
    private JCheckBox downPaymentCheckBox;
    private JCheckBox pwdDiscountCheckBox;
    private JCheckBox seniorDiscountCheckBox;
    private JCheckBox hasExtraBedCheckBox;
    private JCheckBox hasPillowCheckBox;
    private JCheckBox hasTowelCheckBox;
    private JCheckBox hasReadingLightCheckBox;
    private JCheckBox hasBooksMagazinesCheckBox;
    private JCheckBox hasToiletriesCheckBox;
    private JCheckBox hasLuggageRackCheckBox;
    private JCheckBox hasBreakfastCheckBox;
    private JCheckBox hasLunchCheckBox;
    private JCheckBox hasDinnerCheckBox;
    private JCheckBox hasDrinkCheckBox;
    private JCheckBox hasSnackCheckBox;
    private JButton reserveButton;
    private JLabel checkInLabel;
    private JLabel checkOutLabel;
    private JDatePickerImpl checkInDatePicker;
    private JDatePickerImpl checkOutDatePicker;

    public ReservationSystem() {
        setTitle("Reservation Form");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Initialize components
        nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 30);
        add(nameField);

        // Create the date picker for check-in date
        UtilDateModel checkInModel = new UtilDateModel();
        Properties checkInProperties = new Properties();
        checkInDatePicker = new JDatePickerImpl(new JDatePanelImpl(checkInModel, checkInProperties), new DateLabelFormatter());
        checkInDatePicker.setBounds(150, 100, 200, 30);
        add(checkInDatePicker);

        // Create the date picker for check-out date
        UtilDateModel checkOutModel = new UtilDateModel();
        Properties checkOutProperties = new Properties();
        checkOutDatePicker = new JDatePickerImpl(new JDatePanelImpl(checkOutModel, checkOutProperties), new DateLabelFormatter());
        checkOutDatePicker.setBounds(150, 150, 200, 30);
        add(checkOutDatePicker);

        fullPaymentCheckBox = new JCheckBox("Full Payment");
        fullPaymentCheckBox.setBounds(150, 200, 200, 30);
        add(fullPaymentCheckBox);

        downPaymentCheckBox = new JCheckBox("Down Payment");
        downPaymentCheckBox.setBounds(150, 250, 200, 30);
        add(downPaymentCheckBox);

        pwdDiscountCheckBox = new JCheckBox("PWD Discount");
        pwdDiscountCheckBox.setBounds(150, 300, 200, 30);
        add(pwdDiscountCheckBox);

        seniorDiscountCheckBox = new JCheckBox("Senior Discount");
        seniorDiscountCheckBox.setBounds(150, 350, 200, 30);
        add(seniorDiscountCheckBox);

        hasExtraBedCheckBox = new JCheckBox("Extra Bed");
        hasExtraBedCheckBox.setBounds(150, 400, 200, 30);
        add(hasExtraBedCheckBox);

        reserveButton = new JButton("Reserve");
        reserveButton.setBounds(150, 450, 200, 30);
        reserveButton.addActionListener(e -> {
            String name = nameField.getText();
            LocalDate checkInDate = (LocalDate) checkInDatePicker.getModel().getValue();
            LocalDate checkOutDate = (LocalDate) checkOutDatePicker.getModel().getValue();
            boolean fullPayment = fullPaymentCheckBox.isSelected();
            boolean downPayment = downPaymentCheckBox.isSelected();
            boolean pwdDiscount = pwdDiscountCheckBox.isSelected();
            boolean seniorDiscount = seniorDiscountCheckBox.isSelected();
            boolean hasExtraBed = hasExtraBedCheckBox.isSelected();
            boolean hasPillow = hasPillowCheckBox.isSelected();
            boolean hasTowel = hasTowelCheckBox.isSelected();
            boolean hasReadingLight = hasReadingLightCheckBox.isSelected();
            boolean hasBooksMagazines = hasBooksMagazinesCheckBox.isSelected();
            boolean hasToiletries = hasToiletriesCheckBox.isSelected();
            boolean hasLuggageRack = hasLuggageRackCheckBox.isSelected();
            boolean hasBreakfast = hasBreakfastCheckBox.isSelected();
            boolean hasLunch = hasLunchCheckBox.isSelected();
            boolean hasDinner = hasDinnerCheckBox.isSelected();
            boolean hasDrink = hasDrinkCheckBox.isSelected();
            boolean hasSnack = hasSnackCheckBox.isSelected();

            processReservation(name, checkInDate, checkOutDate, fullPayment, downPayment, pwdDiscount, seniorDiscount,
                    hasExtraBed, hasPillow, hasTowel, hasReadingLight, hasBooksMagazines, hasToiletries,
                    hasLuggageRack, hasBreakfast, hasLunch, hasDinner, hasDrink, hasSnack);
        });
        add(reserveButton);

        setVisible(true);
    }

    private void processReservation(String name, LocalDate checkInDate, LocalDate checkOutDate, boolean fullPayment,
                                    boolean downPayment, boolean pwdDiscount, boolean seniorDiscount,
                                    boolean hasExtraBed, boolean hasPillow, boolean hasTowel, boolean hasReadingLight,
                                    boolean hasBooksMagazines, boolean hasToiletries, boolean hasLuggageRack,
                                    boolean hasBreakfast, boolean hasLunch, boolean hasDinner, boolean hasDrink,
                                    boolean hasSnack) {
        // Room rates
        double touristClassRate = 1000.00;
        double deluxeClassRate = 1200.00;
        double ambassadorClassRate = 1300.00;
        double corporateClassRate = 1500.00;
        double annexRoomRate = 300.00;

        // Promo rates
        double touristClassPromoRate = 900.00;
        double deluxeClassPromoRate = 930.00;
        double ambassadorClassPromoRate = 1030.00;
        double corporateClassPromoRate = 1300.00;

        // Apply promo rate if full payment
        if (fullPayment) {
            touristClassRate = touristClassPromoRate;
            deluxeClassRate = deluxeClassPromoRate;
            ambassadorClassRate = ambassadorClassPromoRate;
            corporateClassRate = corporateClassPromoRate;
        }

        // Calculate total amount based on room class
        double totalAmount = 0.0;
        if (hasExtraBed) {
            totalAmount += 300.00;
        }
        if (hasPillow) {
            totalAmount += 150.00;
        }
        if (hasTowel) {
            totalAmount += 150.00;
        }
        if (hasReadingLight) {
            totalAmount += 200.00;
        }
        if (hasBooksMagazines) {
            totalAmount += 100.00;
        }
        if (hasToiletries) {
            totalAmount += 300.00;
        }
        if (hasLuggageRack) {
            totalAmount += 300.00;
        }
        if (hasBreakfast) {
            totalAmount += 400.00;
        }
        if (hasLunch) {
            totalAmount += 600.00;
        }
        if (hasDinner) {
            totalAmount += 600.00;
        }
        if (hasDrink) {
        totalAmount += 100.00;
        }
        if (hasSnack) {
        totalAmount += 300.00;
        }
        
        // Apply discounts
        if (pwdDiscount) {
            totalAmount -= 0.1 * totalAmount; // 10% PWD Discount
        }
        if (seniorDiscount) {
            totalAmount -= 0.2 * totalAmount; // 20% Senior Citizen Discount
        }

        // Generate receipt
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = sdf.format(new Date());
        String receipt = "=== Receipt ===\n";
        receipt += "Customer Name: " + name + "\n";
        receipt += "Check-in Date: " + checkInDate + "\n";
        receipt += "Check-out Date: " + checkOutDate + "\n";
        receipt += "Payment Option: " + (fullPayment ? "Full Payment" : "50% Down Payment") + "\n";
        receipt += "Total Amount: " + totalAmount + "\n";
        receipt += "Reservation Date: " + currentDate + "\n";

        JOptionPane.showMessageDialog(this, receipt, "Reservation Receipt", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ReservationSystem();
        });
    }

    private static class DateLabelFormatter extends JFormattedTextField.AbstractFormatter {
        private final String datePattern = "yyyy-MM-dd";
        private final SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

        @Override
        public Object stringToValue(String text) throws java.text.ParseException {
            return dateFormatter.parseObject(text);
        }

        @Override
        public String valueToString(Object value) throws java.text.ParseException {
            if (value != null) {
                Calendar cal = (Calendar) value;
                return dateFormatter.format(cal.getTime());
            }

            return "";
        }
    }
    }