// Vanessa Estrada
// Work Order Test
// Final Project
// Main method for testing
// December 6, 2024


package workOrder;


import java.util.HashMap;
import java.util.Map;

public class Restaurant {

    private String restaurantName;
    private String address;
    private String contactNumber;
    private boolean isReturningCustomer; // New or returning customer
    private String lastServiceType; // Store the type of last service for returning customers
    private int lastGreaseTrapSize; // Store last grease trap size for returning customers

    // Constructor
    public Restaurant(String restaurantName, String address, String contactNumber, boolean isReturningCustomer) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.isReturningCustomer = isReturningCustomer;

        // If it's a returning customer, we need to load last service details
        if (isReturningCustomer) {
            this.lastServiceType = "Grease Trap Cleaning";  // Example last service type
            this.lastGreaseTrapSize = 5000;  // Example last grease trap size (in gallons)
        }
    }

    // Method to display restaurant info
    public void displayRestaurantInfo() {
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Customer Status: " + (isReturningCustomer ? "Returning" : "New"));

        if (isReturningCustomer) {
            System.out.println("Last Service Type: " + lastServiceType);
            System.out.println("Last Grease Trap Size: " + lastGreaseTrapSize + " gallons");
        } else {
            System.out.println("No previous service data (New customer).");
        }
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isReturningCustomer() {
        return isReturningCustomer;
    }

    public void setReturningCustomer(boolean returningCustomer) {
        isReturningCustomer = returningCustomer;
    }

    public int getLastGreaseTrapSize() {
        return lastGreaseTrapSize;
    }

    public void setLastGreaseTrapSize(int lastGreaseTrapSize) {
        this.lastGreaseTrapSize = lastGreaseTrapSize;
    }

    public String getLastServiceType() {
        return lastServiceType;
    }

    public void setLastServiceType(String lastServiceType) {
        this.lastServiceType = lastServiceType;
    }
}