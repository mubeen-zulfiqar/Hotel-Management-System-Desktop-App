/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import sq.SQL;

/**
 *
 * @author mubee
 */
public class ManagerDAO {

    Manager Load(String Email, String Pass) {
        SQL obj = new SQL();
        try ( ResultSet rs = obj.getManager();) {
            while (rs.next()) {
                if (Email.equals(rs.getString(3)) && Pass.equals(rs.getString(4))) {
                    switch (rs.getString(8)) {
                        case "Room Manager": {
                            return new RoomManager(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8));
                        }
                        case "Staff Manager":{
                            return new StaffManager(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8));
                        }
                        case "Food Manager": {
                            return new FoodManager(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8));
                        }
                        default:{
                        }
                    }
//                    else if(rs.getString(8).equals("Event Manager"))
//                        return new EventManager(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6),rs.getString(7), rs.getString(8));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
  
}