package com.neha.relationships;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a house that contains multiple rooms.
 * This class demonstrates composition relationship where House has-a Room.
 */
public class House {
    private final List<Room> rooms;
    private final int numberOfRooms;

    /**
     * Constructs a House with the specified number of rooms.
     * Each room will be of "Single sharing" type by default.
     *
     * @param numberOfRooms the number of rooms in the house
     * @throws IllegalArgumentException if numberOfRooms is less than 1
     */
    public House(int numberOfRooms) {
        if (numberOfRooms < 1) {
            throw new IllegalArgumentException("Number of rooms must be at least 1");
        }
        this.numberOfRooms = numberOfRooms;
        this.rooms = new ArrayList<>();
        
        // Initialize rooms with default type
        for (int i = 0; i < numberOfRooms; i++) {
            rooms.add(new Room("Single sharing"));
        }
    }

    /**
     * Constructs a House with a list of specific rooms.
     *
     * @param rooms the list of rooms in the house
     * @throws IllegalArgumentException if rooms list is null or empty
     */
    public House(List<Room> rooms) {
        if (rooms == null || rooms.isEmpty()) {
            throw new IllegalArgumentException("Rooms list cannot be null or empty");
        }
        this.rooms = new ArrayList<>(rooms);
        this.numberOfRooms = this.rooms.size();
    }

    /**
     * Prints the details of the house including number of rooms and room types.
     */
    public void printHouseDetails() {
        System.out.println("House has " + numberOfRooms + " rooms");
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println("Room " + (i + 1) + ": " + rooms.get(i).getRoomType());
        }
    }

    /**
     * Gets the number of rooms in the house.
     *
     * @return the number of rooms
     */
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Gets the list of rooms in the house.
     *
     * @return a copy of the rooms list
     */
    public List<Room> getRooms() {
        return new ArrayList<>(rooms);
    }

    /**
     * Adds a room to the house.
     *
     * @param room the room to add
     * @throws IllegalArgumentException if room is null
     */
    public void addRoom(Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Room cannot be null");
        }
        rooms.add(room);
    }

    /**
     * Removes a room from the house.
     *
     * @param room the room to remove
     * @return true if the room was removed, false otherwise
     */
    public boolean removeRoom(Room room) {
        if (room == null) {
            return false;
        }
        return rooms.remove(room);
    }

    /**
     * Gets a room by its index.
     *
     * @param index the index of the room
     * @return the room at the specified index
     * @throws IndexOutOfBoundsException if index is invalid
     */
    public Room getRoom(int index) {
        if (index < 0 || index >= rooms.size()) {
            throw new IndexOutOfBoundsException("Invalid room index: " + index);
        }
        return rooms.get(index);
    }

    @Override
    public String toString() {
        return "House{numberOfRooms=" + numberOfRooms + ", rooms=" + rooms + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return numberOfRooms == house.numberOfRooms && Objects.equals(rooms, house.rooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfRooms, rooms);
    }
}
