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
public class Query implements IQuery{

    int ID;
    String text;
    String reply;
    Customer customer;
    
    public Query(){}
    
    public Query(int ID, String text, String reply, Customer id) {
        this.ID = ID;
        this.text = text;
        this.reply = reply;
        this.customer = id;
    }
    
    public Query(int ID, String text, String reply) {
        this.ID = ID;
        this.text = text;
        this.reply = reply;
    }
    
   public Query(String text) {
        this.text = text;
    }
   
    public Query(String text, String reply) {
        this.text = text;
        this.reply = reply;
    }
    
    public int getID() {
        return ID;
   }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public Customer getId() {
        return customer;
    }

    public void setId(Customer id) {
        this.customer = id;
    }
   
    
 public  void  postQuery()
 {
 
 }

    @Override
    public List<Query> GetQueries() {
        return null;
    }
}
