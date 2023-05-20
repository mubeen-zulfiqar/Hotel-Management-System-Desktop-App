package Main;

import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mubee
 */
public class Room implements IRoom {
   int ID;
   int noOfBeds;
   int floor;
   int reserved;

    public Room(){}
    public Room(int ID, int noOfBeds, int floor, int reserved) {
        this.ID = ID;
        this.noOfBeds = noOfBeds;
        this.floor = floor;
        this.reserved = reserved;
    }

    
    
     public List<Room> getAvailableRooms()
     {
         RoomDAO roomDAO = new RoomDAO();
         roomDAO.getNRRooms();
         return roomDAO.getRooms();
     }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNoOfBeds() {
        return noOfBeds;
    }

    public void setNoOfBeds(int noOfBeds) {
        this.noOfBeds = noOfBeds;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getReserved() {
        return reserved;
    }

    public void setReserved(int reserved) {
        this.reserved = reserved;
    }
   
   
}
