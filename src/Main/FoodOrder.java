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
public class FoodOrder implements IFoodOrder {
    int ID;
    List<Integer> items;
    Customer customer;
    int state;

    public FoodOrder(){}
    
    public FoodOrder(List<Integer> items, Customer customer) {
        this.items = items;
        this.customer = customer;
        
        FoodOrderDAO foodOrder = new FoodOrderDAO();
        foodOrder.insertFoodOrder(items, customer.getID());
        
    }

    public FoodOrder(int ID, List<Integer> items, Customer customer, int state) {
        this.ID = ID;
        this.items = items;
        this.customer = customer;
        this.state = state;
    }

    
    
    
     @Override
    public List<FoodOrder> getAllFoodOrder() {
        
         FoodOrderDAO foodOrderDAO = new FoodOrderDAO();
         return foodOrderDAO.Load();
     
    }
    
    public List<Integer> getItems() {
        return items;
    }

    public void setItems(List<Integer> items) {
        this.items = items;
    }

    

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
        
}
