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
public class AdminDAO {
 Admin admin;

public Admin getAdmin() {
    return admin;
}

public void setAdmin(Admin admin) {
    this.admin = admin;
}


void Load(){
        SQL obj=new SQL();
            try(ResultSet rs=obj.getAdmin();){
                while(rs.next())
                admin = new Admin(rs.getString(1),rs.getString(2),rs.getString(3));
            }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}

