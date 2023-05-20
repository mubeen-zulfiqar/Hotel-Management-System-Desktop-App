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
public interface  ICustomer {
    boolean Login();
    void reserveRoom(Room room);
    void postRoomQuery(Query query);
    void poststaffQuery(Query query);
    void postfoodQuery(Query query);
    List<Query> viewQueries();
    List<Complaint> viewComplaints();
    void postComplaint(Complaint complaint);
    void orderFood( List<Integer> foodOrderItems);
    List<RoomReservationRequest> checkRRS();
    void SignUp(String name, String email, String pass, String address, String phone);

}
