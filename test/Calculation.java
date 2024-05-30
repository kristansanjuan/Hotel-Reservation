

public class Calculation {
    private double totalCostWithVat;
    private String checkInDate;
    private String checkOutDate;
    private String name;

    public Calculation(double totalCostWithVat, String checkInDate, String checkOutDate, String name) {
        this.totalCostWithVat = totalCostWithVat;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.name = name;
    }

    // Add any additional methods or logic for calculations in this class
    // ...

    // Example method to display the information
    public void displayInfo() {
        System.out.println("Total Cost: " + totalCostWithVat);
        System.out.println("Check-in Date: " + checkInDate);
        System.out.println("Check-out Date: " + checkOutDate);
        System.out.println("Name: " + name);
    }
}