package belardosanjuan;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Receipt extends JFrame {
    private JPanel footerPanel;
    private LocalDate date;
    private String name;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private boolean hasTouristRoom;
    private boolean hasDeluxeRoom;
    private boolean hasAmbassadorRoom;
    private boolean hasCorporateRoom;
    private boolean hasFivePersonRoom;
    private boolean hasThreePersonRoom;
    private int bedQuantity;
    private int pillowQuantity;
    private int towelQuantity;
    private int lightQuantity;
    private int booksQuantity;
    private int toiletriesQuantity;
    private int luggageQuantity;
    private int breakfastQuantity;
    private int lunchQuantity;
    private int dinnerQuantity;
    private int drinkQuantity;
    private int snackQuantity;
    private double totalAmount;

    private JLabel lblDate;
    private JLabel lblTotal;
    private JLabel lblCheckInDate;
    private JLabel lblCheckOutDate;
    private JLabel lblRoomDetails;
    private JLabel lblAdditionalServices;
    private JTextArea txtReceipt;

    public Receipt() {
        footerPanel = new JPanel();
        lblTotal = new JLabel();        
        setTitle("Receipt");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BorderLayout());

        JLabel lblTitle = new JLabel("Receipt");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        headerPanel.add(lblTitle, BorderLayout.CENTER);

        lblDate = new JLabel();
        lblDate.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
        headerPanel.add(lblDate, BorderLayout.EAST);

        mainPanel.add(headerPanel, BorderLayout.NORTH);

        txtReceipt = new JTextArea();
        txtReceipt.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        txtReceipt.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtReceipt);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel footerPanel = new JPanel();
        footerPanel.setLayout(new BorderLayout());
                footerPanel.setLayout(new GridLayout(6, 1));
        footerPanel.add(lblTotal);

        lblTotal = new JLabel();
        lblTotal.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        footerPanel.add(lblTotal, BorderLayout.EAST);

        mainPanel.add(footerPanel, BorderLayout.SOUTH);

        lblCheckInDate = new JLabel();
        lblCheckOutDate = new JLabel();
        lblRoomDetails = new JLabel();
        lblAdditionalServices = new JLabel();

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(4, 1));
        contentPanel.add(lblCheckInDate);
        contentPanel.add(lblCheckOutDate);
        contentPanel.add(lblRoomDetails);
        contentPanel.add(lblAdditionalServices);

        mainPanel.add(contentPanel, BorderLayout.WEST);

        add(mainPanel);
    }

    public void setDate(LocalDate date) {
        this.date = date;
        lblDate.setText("Date: " + date.format(DateTimeFormatter.ofPattern("MMM d, yyyy")));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
        lblCheckInDate.setText("Check-in Date: " + checkInDate.format(DateTimeFormatter.ofPattern("MMM d, yyyy")));
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
        lblCheckOutDate.setText("Check-out Date: " + checkOutDate.format(DateTimeFormatter.ofPattern("MMM d, yyyy")));
    }

    public void setRoomDetails(boolean hasTouristRoom, boolean hasDeluxeRoom, boolean hasAmbassadorRoom,
                               boolean hasCorporateRoom, boolean hasFivePersonRoom, boolean hasThreePersonRoom) {
        this.hasTouristRoom = hasTouristRoom;
        this.hasDeluxeRoom = hasDeluxeRoom;
        this.hasAmbassadorRoom = hasAmbassadorRoom;
        this.hasCorporateRoom = hasCorporateRoom;
        this.hasFivePersonRoom = hasFivePersonRoom;
        this.hasThreePersonRoom = hasThreePersonRoom;

        StringBuilder roomDetails = new StringBuilder("Room Details: ");
        if (hasTouristRoom) {
            roomDetails.append("Tourist, ");
        }
        if (hasDeluxeRoom) {
            roomDetails.append("Deluxe, ");
        }
        if (hasAmbassadorRoom) {
            roomDetails.append("Ambassador, ");
        }
        if (hasCorporateRoom) {
            roomDetails.append("Corporate, ");
        }
        if (hasFivePersonRoom) {
            roomDetails.append("Five Person, ");
        }
        if (hasThreePersonRoom) {
            roomDetails.append("Three Person, ");
        }

        String roomDetailsString = roomDetails.toString().trim();
        if (roomDetailsString.endsWith(",")) {
            roomDetailsString = roomDetailsString.substring(0, roomDetailsString.length() - 1);
        }

        lblRoomDetails.setText(roomDetailsString);
    }

    public void setAdditionalServices(int bedQuantity, int pillowQuantity, int towelQuantity, int lightQuantity,
                                      int booksQuantity, int toiletriesQuantity, int luggageQuantity,
                                      int breakfastQuantity, int lunchQuantity, int dinnerQuantity,
                                      int drinkQuantity, int snackQuantity) {
        this.bedQuantity = bedQuantity;
        this.pillowQuantity = pillowQuantity;
        this.towelQuantity = towelQuantity;
        this.lightQuantity = lightQuantity;
        this.booksQuantity = booksQuantity;
        this.toiletriesQuantity = toiletriesQuantity;
        this.luggageQuantity = luggageQuantity;
        this.breakfastQuantity = breakfastQuantity;
        this.lunchQuantity = lunchQuantity;
        this.dinnerQuantity = dinnerQuantity;
        this.drinkQuantity = drinkQuantity;
        this.snackQuantity = snackQuantity;

        StringBuilder services = new StringBuilder("Additional Services: ");
        if (bedQuantity > 0) {
            services.append("Bed: ").append(bedQuantity).append(", ");
        }
        if (pillowQuantity > 0) {
            services.append("Pillow: ").append(pillowQuantity).append(", ");
        }
        if (towelQuantity > 0) {
            services.append("Towel: ").append(towelQuantity).append(", ");
        }
        if (lightQuantity > 0) {
            services.append("Light: ").append(lightQuantity).append(", ");
        }
        if (booksQuantity > 0) {
            services.append("Books: ").append(booksQuantity).append(", ");
        }
        if (toiletriesQuantity > 0) {
            services.append("Toiletries: ").append(toiletriesQuantity).append(", ");
        }
        if (luggageQuantity > 0) {
            services.append("Luggage: ").append(luggageQuantity).append(", ");
        }
        if (breakfastQuantity > 0) {
            services.append("Breakfast: ").append(breakfastQuantity).append(", ");
        }
        if (lunchQuantity > 0) {
            services.append("Lunch: ").append(lunchQuantity).append(", ");
        }
        if (dinnerQuantity > 0) {
            services.append("Dinner: ").append(dinnerQuantity).append(", ");
        }
        if (drinkQuantity > 0) {
            services.append("Drink: ").append(drinkQuantity).append(", ");
        }
        if (snackQuantity > 0) {
            services.append("Snack: ").append(snackQuantity).append(", ");
        }
        String servicesString = services.toString().trim();
        if (servicesString.endsWith(",")) {
            servicesString = servicesString.substring(0, servicesString.length() - 1);
        }

        lblAdditionalServices.setText(servicesString);
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
        lblTotal.setText("Total: ₱" + String.format("%.2f", totalAmount));

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Receipt receipt = new Receipt();
            receipt.setVisible(true);
        });
    }
}