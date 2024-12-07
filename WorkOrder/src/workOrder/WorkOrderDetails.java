// Vanessa Estrada
// Work Order Test
// Final Project
// Main method for testing
// December 6, 2024


package workOrder; 

import java.util.HashMap;
import java.util.Map;

public class WorkOrderDetails {  // Renamed class to avoid conflict

    private Restaurant restaurant;
    private String serviceRequest;
    private String requestStatus; // "Requested" or "Emergency"
    private Map<String, Boolean> serviceTypes = new HashMap<>();

    // Constructor
    public WorkOrderDetails(Restaurant restaurant) {  // Ensure constructor matches class name
        this.restaurant = restaurant;

        // Initialize service types available for request
        serviceTypes.put("Maintenance Repairs", false);
        serviceTypes.put("Jetting Lines", false);
        serviceTypes.put("Grease Trap Cleaning", false);
    }

    // Method to set service request type
    public void setServiceRequest(String serviceType, String requestStatus) {
        if (serviceTypes.containsKey(serviceType)) {
            serviceTypes.put(serviceType, true);
            this.serviceRequest = serviceType;
            this.requestStatus = requestStatus;
        } else {
            System.out.println("Service type not available.");
        }
    }

    // Method to display work order info
    public void displayWorkOrderInfo() {
        restaurant.displayRestaurantInfo();
        System.out.println("Service Request: " + serviceRequest);
        System.out.println("Request Status: " + requestStatus);
    }

    // Getter and Setter methods
    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(String serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }
}
