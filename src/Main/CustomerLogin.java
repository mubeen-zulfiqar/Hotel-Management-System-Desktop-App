/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.*;

/**
 *
 * @author mubee
 */
public class CustomerLogin {
     boolean Login(Customer customer){    
        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.Load();
        List<Customer> customers = new ArrayList<Customer>();
        customers = customerDAO.getCustomers();
         for (int i = 0; i < customers.size(); i++) {
             if(customers.get(i).getEmail().equalsIgnoreCase(customer.getEmail()) && customers.get(i).getPass().equals(customer.getPass()))
             {
                 customer.setID(customers.get(i).getID());
                 customer.setAddress(customers.get(i).getAddress());
                 customer.setName(customers.get(i).getName());
                 customer.setPhone(customers.get(i).getPhone());
                 return true;
             }
         }
         return false;
     }
}
