package Main;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import sq.SQL;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mubee
 */
public class CustomerDAO {
    List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
            
void Load(){
        customers = new ArrayList<Customer>();
        SQL obj=new SQL();
            try(ResultSet rs=obj.getCustomers();){
            while(rs.next()){
                
                customers.add(new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    Customer getSpecificCustomer(int customerID){
        SQL obj=new SQL();
            try(ResultSet rs=obj.Specific_User(customerID);){
            while(rs.next()){
                
                return (new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return null;
            
    }
        void signUp(String name, String email, String pass, String address, String phone)
    {
         SQL obj = new SQL();
        try {
            obj.insertNewCustomer(name, email, pass, address, phone);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    

