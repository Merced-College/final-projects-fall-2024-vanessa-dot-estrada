// Vanessa Estrada
// Work Order Test
// Final Project
// Main method for testing
// December 6, 2024


package workOrder;


public class Main {
    
    public static void main(String[] args) {

        // Create a new restaurant (assuming it's a returning customer)
        Restaurant restaurant = new Restaurant("La Plaza Bakery", "999 Story Rd, San Jose", "555-1234", true);

        // Create a WorkOrderDetails object for this restaurant
        WorkOrderDetails workOrder = new WorkOrderDetails(restaurant);  // Using the new class name

        // Set a service request for grease trap cleaning (emergency)
        workOrder.setServiceRequest("Grease Trap Cleaning", "Emergency");

        // Display the work order information
        workOrder.displayWorkOrderInfo();

        // Create a new restaurant (new customer)
        Restaurant newRestaurant = new Restaurant("Wendy's", "180 Healthy Ave, Watsonville", "555-5678", false);
        WorkOrderDetails newWorkOrder = new WorkOrderDetails(newRestaurant);  // Using the new class name
        
        // Set a service request for maintenance repairs (requested)
        newWorkOrder.setServiceRequest("Maintenance Repairs", "Requested");

        // Display the work order information
        newWorkOrder.displayWorkOrderInfo();
    }
}
