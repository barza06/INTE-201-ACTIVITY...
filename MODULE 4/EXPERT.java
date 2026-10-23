import java.util.Scanner;
/*
@Author: Jheric S. Barza
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Represent a warehouse as a 2D array of item counts, using -1 to mean a damaged shelf
        int[][] warehouse = {
            {1, 2, 3},
            {4, -1, 5},
            {6, 7, -1}
        };

        int choice;

        // Use a do-while for menu that runs until the user chooses to exit
        do {
            System.out.println("\n--- WAREHOUSE INVENTORY SCANNER MENU ---");
            System.out.println("1. Total Inventory (Skipping Damaged Shelves)");
            System.out.println("2. Find First Critically Low Shelf");
            System.out.println("3.  Restocking the shelves");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            choice = scanner.nextInt();

            // Using if-else
            if (choice == 1) {
                // Use a for loop with continue to total inventory while skipping damaged shelves
                int totalItems = 0;
                for (int i = 0; i < warehouse.length; i++) {
                    for (int j = 0; j < warehouse[i].length; j++) {
                        if (warehouse[i][j] == -1) {
                            continue; // Skip damaged shelf
                        }
                        totalItems += warehouse[i][j];
                    }
                }
                System.out.println("Total Inventory Count (Excluding Damaged Shelves): " + totalItems);
            } 
            else if (choice == 2) {
                // Use nested loops with break to find the first critically low shelf
                boolean foundLow = false;
                for (int i = 0; i < warehouse.length; i++) {
                    for (int j = 0; j < warehouse[i].length; j++) {
                        if (warehouse[i][j] != -1 && warehouse[i][j] < 3) {
                            System.out.println("Critically low shelf found at Row " + i + ", Col " + j + " with " + warehouse[i][j] + " items.");
                            foundLow = true;
                            break; // Break out of inner loop
                        }
                    }
                    if (foundLow) {
                        break; // Break out of outer loop
                    }
                }
                if (!foundLow) {
                    System.out.println("No critically low shelves found.");
                }
            } 
            else if (choice == 3) {
                // ask user for restock amount using the scanner
                System.out.print("Enter restock amount to add (0 - 100): ");
                int restockInput = scanner.nextInt();
                simulateRestocking(5, restockInput);
            } 
            else if (choice == 4) {
                System.out.println("Exiting Warehouse System");
            } 
            else {
                System.out.println("Invalid option. Please choose between 1 and 4.");
            }

        } while (choice != 4);
        
        scanner.close();
    }

    // Use a while loop plus return to simulate restocking with input validation
    public static void simulateRestocking(int currentStock, int restockAmount) {
        System.out.println("--- RESTOCKING SHELVES ---");
        System.out.println("Target Shelf Current Stock: " + currentStock);

        // Validation loop
        while (restockAmount < 0 || restockAmount > 100) {
            System.out.println("Error: Restock quantity out of acceptable bounds (must be between 0 and 100).");
            return; // Exit method immediately on invalid validation state
        }

        currentStock += restockAmount;
        System.out.println("Restock successful! Updated stock count: " + currentStock);
    }
}
