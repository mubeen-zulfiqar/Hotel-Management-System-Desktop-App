/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import static Main.RoomReservationRequestDAO.rrrs;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sq.SQL;

/**
 *
 * @author huzai
 */
public class StaffDAO {
    List<Staff>staff;

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }
    void LoadStaff()
    {
    staff=new ArrayList<Staff>();
    SQL obj=new SQL();
    try(ResultSet rs=obj.GetStaff()){
            while(rs.next()){
                int roomid=rs.getInt(8);
                ResultSet rs2=obj.GetSpecificPost(roomid);
                rs2.next();
              Post post=new Post(rs2.getInt(1),rs2.getString(2),rs2.getInt(3));
                staff.add(new Staff(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),post));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
