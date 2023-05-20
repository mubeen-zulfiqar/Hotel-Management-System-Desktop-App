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
public class StaffQuery extends Query {

    public StaffQuery(int ID, String text, String reply, Customer id) {
        super(ID, text, reply, id);
    }

    public StaffQuery(String text, String reply) {
        super(text, reply);
    }

    public StaffQuery(String text) {
        super(text);
    }

    public StaffQuery(int ID, String text, String reply) {
        super(ID, text, reply);
    }

    public StaffQuery() {
    }

   @Override
    public void postQuery() {
        new QueryDAO().insertStaffQuery(this);
    }

   

    @Override
    public List<Query> GetQueries() {
         QueryDAO staffqueryDAO = new QueryDAO();
         staffqueryDAO.LoadQueris("Staff");
         return staffqueryDAO.getQueries();
                
   }
    
} 
