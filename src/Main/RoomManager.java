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
public class RoomManager extends Manager {
    List<Room> rooms;
    List<RoomReservationRequest> roomReservationRequests;
    
  public RoomManager(int ID, String name, String email, String pass, int salary, String address, String phone, String type) {
        super(ID, name, email, pass, salary, address, phone, type);
        
         RoomDAO roomDAO = new RoomDAO();
         rooms = roomDAO.getRooms();
        
         RoomReservationRequest rrrDAO = new RoomReservationRequest();
         roomReservationRequests = rrrDAO.getAllReservations();
        
    }
    public RoomManager(){    }
    
 @Override
    public void accept(int ID)
    {
        updatetRoomReservation uReservation = new updatetRoomReservation(ID);
        uReservation.acceptReservation(roomReservationRequests);
           
    }
     @Override
    public void reject(int ID)
    {
        updatetRoomReservation uReservation = new updatetRoomReservation(ID);
        uReservation.rejectReservation();
    }
   
    
    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
      @Override
    public void replyQueries(int id,String reply) {
        new QueryDAO().replyRoomQueries(id, reply);
    }
}
