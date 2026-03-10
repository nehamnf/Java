package com.neha.relationships;

/**
 * Represents a room within a house.
 * This class demonstrates basic encapsulation principles.
 */
public class Room {
    private final String roomType;

    /**
     * Constructs a Room with the specified type.
     *
     * @param roomType the type of the room (e.g., "Bedroom", "Kitchen")
     * @throws IllegalArgumentException if roomType is null or empty
     */
    public Room(String roomType) {
        if (roomType == null || roomType.trim().isEmpty()) {
            throw new IllegalArgumentException("Room type cannot be null or empty");
        }
        this.roomType = roomType.trim();
    }

    /**
     * Gets the room type.
     *
     * @return the room type
     */
    public String getRoomType() {
        return roomType;
    }

    @Override
    public String toString() {
        return "Room{type='" + roomType + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomType.equals(room.roomType);
    }

    @Override
    public int hashCode() {
        return roomType.hashCode();
    }
}
