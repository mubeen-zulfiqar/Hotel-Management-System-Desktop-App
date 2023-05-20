/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Main.RoomReservationRequest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static Main.RoomDAO.rooms;
import sq.SQL;

/**
 *
 * @author mubee
 */
public class RoomReservationRequestDAO {
    static List<RoomReservationRequest> rrrs;

    public static List<RoomReservationRequest> getRrrs() {
        return rrrs;
    }

    public static void setRrrs(List<RoomReservationRequest> rrrs) {
        RoomReservationRequestDAO.rrrs = rrrs;
    }
    
     List<RoomReservationRequest> Load() {
        rrrs = new ArrayList<RoomReservationRequest>();
        SQL obj = new SQL();
        try ( ResultSet rs = obj.getRoomReservationRequest();) {
            while (rs.next()) {

                CustomerDAO customerDAO = new CustomerDAO();
                Customer customer = customerDAO.getSpecificCustomer(rs.getInt(3));

                RoomDAO roomDAO = new RoomDAO();
                Room room = roomDAO.getSoecificRoom(rs.getInt(2));

                rrrs.add(new RoomReservationRequest(rs.getInt(1), room, customer, rs.getInt(4)));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rrrs;
    }
    void LoadCustomerRooms(Customer customer)
    {
    rrrs = new ArrayList<RoomReservationRequest>();
        SQL obj=new SQL();
            try(ResultSet rs=obj.getUserReservationRequest(customer.getID())){
            while(rs.next()){
                int roomid=rs.getInt(2);
                ResultSet rs2=obj.GetSpecificRoom(roomid);  
                rs2.next();
                Room room=new Room(rs2.getInt(1),rs2.getInt(2),rs2.getInt(3),rs2.getInt(4));
                rrrs.add(new RoomReservationRequest(rs.getInt(1),room,customer,rs.getInt(4)));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
            
     void insert(RoomReservationRequest rrr)
     {
         SQL obj=new SQL();
         try{
          obj.insertRoomReservationRequest(rrr.getRoom().getID(), rrr.getCustomer().getID(),-1);
       }
        catch (Exception e){
            e.printStackTrace();
        }
     }
     
    void updateAccept(int reservationID) {
        SQL obj = new SQL();
        try {
            obj.updateAcceptReservation(reservationID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void updateReject(int reservationID) {
        SQL obj = new SQL();
        try {
            obj.updateRejectReservation(reservationID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
