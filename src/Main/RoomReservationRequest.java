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
public class RoomReservationRequest implements IRoomReservationRequest{
    int ID;
    Room room;
    Customer customer;
    int status;

    public RoomReservationRequest(int ID, Room room, Customer customer, int status) {
        this.ID = ID;
        this.room = room;
        this.customer = customer;
        this.status = status;
    }
    public RoomReservationRequest(){
        
    }


    public RoomReservationRequest(Customer customer, Room room) {
        this.room = room;
        this.customer = customer;
        this.status = -1;
        
        RoomReservationRequestDAO rrrDAO = new RoomReservationRequestDAO();
        rrrDAO.insert(this);
    }

    RoomReservationRequest(Customer customer) {
        this.customer = customer;
     
    }
       
    public List<RoomReservationRequest> getAllReservations() {
        RoomReservationRequestDAO rrrDAO = new RoomReservationRequestDAO();
        return rrrDAO.Load();
    }

  
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

     public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
   public List<RoomReservationRequest> getRRS()
   {
   RoomReservationRequestDAO RRS=new RoomReservationRequestDAO();
   RRS.LoadCustomerRooms(customer);
   return RRS.getRrrs();
   }
}
