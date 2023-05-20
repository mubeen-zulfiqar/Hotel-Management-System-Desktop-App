package Main;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import sq.SQL;

public class RoomDAO {
    static List<Room> rooms;

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
    
    void Load(){
        rooms = new ArrayList<Room>();
        SQL obj=new SQL();
            try(ResultSet rs=obj.GetAllRooms();){
            while(rs.next()){
                rooms.add(new Room(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4)));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
     void getNRRooms(){
        rooms = new ArrayList<Room>();
        SQL obj=new SQL();
            try(ResultSet rs=obj.getNRRooms();){
            while(rs.next()){
                rooms.add(new Room(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4)));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    void updateReserved(int roomID) {
         SQL obj = new SQL();
        try {
            obj.updateRoomStatustoReserved(roomID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
        Room getSoecificRoom(int roomID){
        rooms = new ArrayList<Room>();
        SQL obj=new SQL();
            try(ResultSet rs=obj.GetSpecificRoom(roomID);){
            while(rs.next()){
                return (new Room(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4)));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
