package Main;
import java.sql.SQLException;
import java.util.*;
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

public class Customer implements ICustomer {
   int ID;
   String name;
   String email;
   String pass;
   String address;
   String phone;

    public Customer(int ID, String name, String email, String pass, String address, String phone) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.address = address;
        this.phone = phone;
    }
     public Customer(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    public Customer() {
        }
    
   @Override
    public boolean Login() 
    {
        CustomerLogin customerLogin = new CustomerLogin();
        return customerLogin.Login(this);
    }
    
   
    
   @Override
    public void reserveRoom(Room room){
        RoomReservationRequest rrq = new RoomReservationRequest(this, room);
    }
@Override
    public void postRoomQuery(Query query) {
        query.setId(this);
        query.postQuery();
     }
      @Override
    public void poststaffQuery(Query query) {
        query.setId(this);
         query.postQuery();
    }

    @Override
    public void postfoodQuery(Query query) {
        query.setId(this);
         query.postQuery();
    }

      @Override
    public List<Query> viewQueries() {
       QueryDAO cquery=new QueryDAO();
       System.out.print(this.getID());
       try {
           cquery.LoadCustomerQueries(this.getID());
       } catch (SQLException ex) {
           Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
       }
        return cquery.getQueries();
    }
    
   @Override
    public void postComplaint(Complaint complaint) {
        complaint.setCustomer(this);
        complaint.postComplaint();
    }
     @Override
    public List<Complaint> viewComplaints() {
         ComplaintDAO ccomplaint=new ComplaintDAO();
       System.out.print(this.getID());
       try {
           ccomplaint.LoadCustomerComplaints(this.getID());
       } catch (SQLException ex) {
           Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
       }
        return ccomplaint.getComplaints();
    }
    @Override
    public List<RoomReservationRequest> checkRRS() {
        return new RoomReservationRequest(this).getRRS();
    }
   @Override
    public void orderFood(List<Integer> foodOrderItems) {
        FoodOrder foodOrder = new FoodOrder(foodOrderItems, this);
    }
      @Override
    public void SignUp(String name, String email, String pass, String address, String phone) {
        CustomerSignUp customerSignUp = new CustomerSignUp();
        customerSignUp.SignUp(name, email, pass, address, phone);
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    

   

    

  

  
    
   
   
    
}
