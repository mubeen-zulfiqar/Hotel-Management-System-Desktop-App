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
public class FoodQuery extends Query  {

    public FoodQuery(int ID, String text, String reply, Customer id) {
        super(ID, text, reply, id);
    }

    public FoodQuery(String text) {
        super(text);
    }

    public FoodQuery(String text, String reply) {
        super(text, reply);
    }

    public FoodQuery(int ID, String text, String reply) {
        super(ID, text, reply);
    }

    public FoodQuery() {  }

    

    @Override
     public void postQuery() {
        new QueryDAO().insertFoodQuery(this);
    }

   

    @Override
    public List<Query> GetQueries() {
         QueryDAO roomqueryDAO = new QueryDAO();
         roomqueryDAO.LoadQueris("Food");
         return roomqueryDAO.getQueries();
}
    void replyQueries(int id,String reply)
    {
    new QueryDAO().replyfoodQueries(id, reply);
    }

}
