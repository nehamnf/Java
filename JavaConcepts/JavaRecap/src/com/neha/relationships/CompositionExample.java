package com.neha.relationships;

import java.util.List;

/**
 * Demonstration of composition relationship in Java.
 * This class shows how a House is composed of Room objects,
 * demonstrating the "has-a" relationship.
 */
public class CompositionExample {
    /**
     * Main method to demonstrate composition.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        try {
            // Example 1: House with default room types
            System.out.println("=== Example 1: House with default rooms ===");
            House house1 = new House(3);
            house1.printHouseDetails();

            System.out.println();

            // Example 2: House with custom room types
            System.out.println("=== Example 2: House with custom rooms ===");
            List<Room> customRooms = List.of(
                new Room("Master Bedroom"),
                new Room("Kitchen"),
                new Room("Living Room")
            );
            House house2 = new House(customRooms);
            house2.printHouseDetails();

            System.out.println();

            // Example 3: Adding rooms dynamically
            System.out.println("=== Example 3: Adding rooms dynamically ===");
            House house3 = new House(1);
            house3.addRoom(new Room("Guest Room"));
            house3.addRoom(new Room("Study Room"));
            house3.printHouseDetails();

            System.out.println();

            // Example 4: Removing rooms
            System.out.println("=== Example 4: Removing rooms ===");
            Room roomToRemove = house3.getRoom(0);
            house3.removeRoom(roomToRemove);
            System.out.println("After removing room: " + roomToRemove.getRoomType());
            house3.printHouseDetails();

        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
