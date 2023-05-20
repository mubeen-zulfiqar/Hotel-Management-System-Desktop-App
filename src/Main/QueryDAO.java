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
public class QueryDAO {
     List<Query>queries;

    public List<Query> getQueries() {
        return queries;
    }

    public void setQueries(List<Query> queries) {
        this.queries = queries;
    }
    
 public void LoadQueris(String Type)
 {
 SQL obj=new SQL();
 queries=new ArrayList<Query>();
 if("Room".equals(Type))
 {        
            try(ResultSet rs=obj.GetRoomQueries()){
            while(rs.next()){
            int id=rs.getInt(1);
            String txt=rs.getString(2);
            String rply=rs.getString(3);
            int cid=rs.getInt(4);
            ResultSet rs1=obj.Specific_User(cid);
            
             while(rs1.next()){
             queries.add(new RoomQuery(id,txt,rply,new Customer(rs1.getInt(1),rs1.getString(2),rs1.getString(3),rs1.getString(4),rs1.getString(5),rs1.getString(6))));
             }
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }}
            else
            if("Staff".equals(Type))
           {
            try(ResultSet rs=obj.GetStaffQueries()){
            while(rs.next()){
            int id=rs.getInt(1);
            String txt=rs.getString(2);
            String rply=rs.getString(3);
            int cid=rs.getInt(4);
            ResultSet rs1=obj.Specific_User(cid);
            
             while(rs1.next()){
             queries.add(new StaffQuery(id,txt,rply,new Customer(rs1.getInt(1),rs1.getString(2),rs1.getString(3),rs1.getString(4),rs1.getString(5),rs1.getString(6))));
             }
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }}
            else
                if("Food".equals(Type))
                {
                 try(ResultSet rs=obj.GetFoodQueries()){
            while(rs.next()){
            int id=rs.getInt(1);
            String txt=rs.getString(2);
            String rply=rs.getString(3);
            int cid=rs.getInt(4);
            ResultSet rs1=obj.Specific_User(cid);
            
             while(rs1.next()){
             queries.add(new FoodQuery(id,txt,rply,new Customer(rs1.getInt(1),rs1.getString(2),rs1.getString(3),rs1.getString(4),rs1.getString(5),rs1.getString(6))));
             }
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }}
                
                 
                 
                
 }
        void LoadCustomerQueries(int cid) throws SQLException
        {
        SQL obj=new SQL();
        queries=new ArrayList<Query>();
           ResultSet rs1=obj.Specific_User(cid);
           rs1.next();
           System.out.print(rs1.getString(2));
            try(ResultSet rs=obj.GetCustomerRoomQueries(cid)){
            while(rs.next()){
            int id=rs.getInt(1);
            String txt=rs.getString(2);
            String rply=rs.getString(3);
            System.out.print(id);
            //while(rs1.next()){
            queries.add(new RoomQuery(id,txt,rply,new Customer(rs1.getInt(1),rs1.getString(2),rs1.getString(3),rs1.getString(4),rs1.getString(5),rs1.getString(6))));
           //  }
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
                     
            try(ResultSet rs=obj.GetCustomerFoodQueries(cid)){
            while(rs.next()){
            int id=rs.getInt(1);
            String txt=rs.getString(2);
            String rply=rs.getString(3);
           // ResultSet rs1=obj.Specific_User(cid);
           //  while(rs1.next()){
             queries.add(new FoodQuery(id,txt,rply,new Customer(rs1.getInt(1),rs1.getString(2),rs1.getString(3),rs1.getString(4),rs1.getString(5),rs1.getString(6))));
             //}
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
          try(ResultSet rs=obj.GetCustomerStaffQueries(cid)){
            while(rs.next()){
            int id=rs.getInt(1);
            String txt=rs.getString(2);
            String rply=rs.getString(3);
           // ResultSet rs1=obj.Specific_User(cid);
           //  while(rs1.next()){
             queries.add(new StaffQuery(id,txt,rply,new Customer(rs1.getInt(1),rs1.getString(2),rs1.getString(3),rs1.getString(4),rs1.getString(5),rs1.getString(6))));
             //}
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } 
        }
        
        
     
         void insertRoomQuery(RoomQuery rq)
     {
         sq.SQL obj=new sq.SQL();
         try{
          obj.insertRoomQueries(rq.getText(),rq.getId().getID());
       }
        catch (Exception e){
            e.printStackTrace();
        }
     }
            void insertStaffQuery(StaffQuery sq)
     {
         sq.SQL obj=new sq.SQL();
         try{
          obj.insertStaffQueries(sq.getText(),sq.getId().getID());
       }
        catch (Exception e){
            e.printStackTrace();
        }
     }
               void insertFoodQuery(FoodQuery fq)
     {
         sq.SQL obj=new sq.SQL();
         try{
          obj.insertFoodQueries(fq.getText(),fq.getId().getID());
       }
        catch (Exception e){
            e.printStackTrace();
        }
     }
               void replystaffQueries(int id,String reply)
               {
               SQL obj =new SQL();
               try{
               obj.replyStaffQuery(reply,id);
               }
               catch(Exception e)
               {
               e.printStackTrace();
               }             
               }
                void replyRoomQueries(int id,String reply)
               {
               SQL obj =new SQL();
               try{
               obj.replyRoomQuery(reply,id);
               }
               catch(Exception e)
               {
               e.printStackTrace();
               }             
               }
                 void replyfoodQueries(int id,String reply)
               {
               SQL obj =new SQL();
               try{
               obj.replyFoodQuery(reply,id);
               }
               catch(Exception e)
               {
               e.printStackTrace();
               }             
               }
}
