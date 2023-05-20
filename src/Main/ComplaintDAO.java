/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sq.SQL;

/**
 *
 * @author huzai
 */
public class ComplaintDAO {
         List<Complaint>complaints;

    public List<Complaint> getComplaints() {
        return complaints;
    }

    public void setComplaints(List<Complaint> complaints) {
        this.complaints = complaints;
    }

      void insertComplaintTxt(Complaint comp)
     {
         sq.SQL obj=new sq.SQL();
         try{
          obj.insertComplaint(comp.getText(),comp.getCustomer().getID());
       }
        catch (Exception e){
            e.printStackTrace();
        }
     }
      void replyCmplnt(int id,String reply)
      {
      sq.SQL obj=new sq.SQL();
         try{
          obj.replyComplaint(reply,id);
       }
        catch (Exception e){
            e.printStackTrace();
        }
      }
      void LoadCustomerComplaints(int cid) throws SQLException
        {
        SQL obj=new SQL();
        complaints=new ArrayList<Complaint>();
           ResultSet rs1=obj.Specific_User(cid);
           rs1.next();
           System.out.print(rs1.getString(2));
            try(ResultSet rs=obj.GetCustomerComplaints(cid)){
            while(rs.next()){
            int id=rs.getInt(1);
            String txt=rs.getString(2);
            String rply=rs.getString(3);
            System.out.print(id);
            //while(rs1.next()){
            complaints.add(new Complaint(id,txt,rply,new Customer(rs1.getInt(1),rs1.getString(2),rs1.getString(3),rs1.getString(4),rs1.getString(5),rs1.getString(6))));
           //  }
            }
        }
        }
      
      void LoadAllComplaints() throws SQLException
        {
        SQL obj=new SQL();
        complaints=new ArrayList<Complaint>();
            try(ResultSet rs=obj.GetAllComplaints()){
            while(rs.next()){
            int id=rs.getInt(1);
            String txt=rs.getString(2);
            String rply=rs.getString(3);
            System.out.print(id);
            ResultSet rs1=obj.Specific_User(id);
           rs1.next();
            //while(rs1.next()){
            complaints.add(new Complaint(id,txt,rply,new Customer(rs1.getInt(1),rs1.getString(2),rs1.getString(3),rs1.getString(4),rs1.getString(5),rs1.getString(6))));
           //  }
            }
        }
        }
      
}
