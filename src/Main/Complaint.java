package Main;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mubee
 */
public class Complaint implements IComplaints{
   int ID;
   String text;
   String reply;
   Customer customer;
   
    public Complaint(int ID, String text, Customer customer) {
        this.ID = ID;
        this.text = text;
        this.customer = customer;
    }
     public Complaint(int ID, String text,String reply, Customer customer) {
        this.ID = ID;
        this.reply=reply;
        this.text = text;
        this.customer = customer;
    }

    public Complaint(String text) {
        this.text = text;
    }

    public Complaint() {   }

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    void postComplaint()
    {
    new ComplaintDAO().insertComplaintTxt(this);
    }
    void replyComplaint(int id,String reply)
    {
    new ComplaintDAO().replyCmplnt(id,reply);
    }

    @Override
    public List<Complaint> GetComplaints() {
        ComplaintDAO complaint=new ComplaintDAO();
       try {
           complaint.LoadAllComplaints();
       } catch (SQLException ex) {
           Logger.getLogger(Complaint.class.getName()).log(Level.SEVERE, null, ex);
       }
        return complaint.getComplaints();
        
     }
    
}
