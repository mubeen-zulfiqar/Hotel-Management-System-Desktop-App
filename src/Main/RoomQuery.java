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
public class RoomQuery extends Query  {

    public RoomQuery(){ }
      
    public RoomQuery(int ID, String text, String reply, Customer id) {
        super(ID, text, reply, id);
    }
          
    public RoomQuery(int ID, String text, String reply) {
        super(ID, text, reply);
    }

    public RoomQuery(String text) {
        super(text);
    }

    public RoomQuery(String text, String reply) {
        super(text, reply);
    }

      public Customer getId() {
        return customer;
    }

    public void setId(Customer id) {
        this.customer = id;
    }
    
//
    @Override
    public void postQuery() {
        new QueryDAO().insertRoomQuery(this);
    }

   

    @Override
    public List<Query> GetQueries() {
         QueryDAO roomqueryDAO = new QueryDAO();
         roomqueryDAO.LoadQueris("Room");
         return roomqueryDAO.getQueries();
                
   }
    
    void replyQueries(int id,String reply)
    {
    new QueryDAO().replyRoomQueries(id, reply);
    }
    
}
