package com.neha.has.a.relationship.association;

class Room{
    private String roomType;

    public Room(String roomType){
        this.roomType=roomType;
    }

    public String getRoomType() {
        return roomType;
    }
}

class House{
    private Room room;
    private int numberOfRooms;
    public  House(int numberOfRooms){
        this.room=new Room("Single sharing");
        this.numberOfRooms=numberOfRooms;
    }

    public void printHouseDetails(){
        System.out.println("House has "+this.numberOfRooms+" rooms of type "+this.room.getRoomType());
    }


}
public class CompositionExample {
    public static void main(String[] args) {
        House house = new House(3);

        house.printHouseDetails();
    }
}
