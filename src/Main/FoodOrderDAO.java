package Main;

import java.util.*;
import java.io.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import sq.SQL;

/**
 *
 * @author mubee
 */
public class FoodOrderDAO {

    static List<FoodOrder> foodOrders;

    public void insertFoodOrder(List<Integer> foodOrderItems , int customerID) {
         SQL obj=new SQL();
         try{
          obj.insertFoodOrder(foodOrderItems , customerID,-1);
       }
        catch (Exception e){
            e.printStackTrace();
        }
     }
    
    public List<FoodOrder> Load() {
        foodOrders = new ArrayList<FoodOrder>();
        SQL obj = new SQL();
        try ( ResultSet rs = obj.getFoodOrders();) {
            while (rs.next()) {

                boolean orderExists = false;
                for (int i = 0; i < foodOrders.size(); i++) {
                    if (foodOrders.get(i).getID() == rs.getInt(1)) {
                        foodOrders.get(i).getItems().add(rs.getInt(5));
                        orderExists = true;
                    }
                }

                if (!orderExists) {
                    CustomerDAO customerDAO = new CustomerDAO();
                    Customer customer = customerDAO.getSpecificCustomer(rs.getInt(2));

                    List<Integer> foodOrderItems = new ArrayList<Integer>();
                    foodOrderItems.add(rs.getInt(5));

                    foodOrders.add(new FoodOrder(rs.getInt(1), foodOrderItems, customer, rs.getInt(3)));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return foodOrders;
    }
    
        void updateAccept(int foodOrderID) {
        SQL obj = new SQL();
        try {
            obj.updateAcceptFoodOrder(foodOrderID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void updateReject(int foodOrderID) {
        SQL obj = new SQL();
        try {
            obj.updateRejectFoodOrder(foodOrderID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
