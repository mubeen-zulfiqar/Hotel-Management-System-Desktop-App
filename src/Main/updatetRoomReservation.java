/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.List;

/**
 *
 * @author mubee
 */
public class updatetRoomReservation {

    int reservationID;

    public updatetRoomReservation(int reservationID) {
        this.reservationID = reservationID;
    }

    void acceptReservation(List<RoomReservationRequest> roomReservationRequests) {
        RoomReservationRequestDAO rrrDAO = new RoomReservationRequestDAO();
        rrrDAO.updateAccept(reservationID);
        
        int roomID = 0;
        for (int i = 0; i < roomReservationRequests.size(); i++) {
             if(roomReservationRequests.get(i).getID() == reservationID)
                 roomID = roomReservationRequests.get(i).getRoom().getID();
        }
      
        
        RoomDAO roomDAO = new RoomDAO();
        roomDAO.updateReserved(roomID);
    }

    void rejectReservation() {
        RoomReservationRequestDAO rrrDAO = new RoomReservationRequestDAO();
        rrrDAO.updateReject(reservationID);
    }

}
