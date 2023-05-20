package Main;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huzai
 */
public class FoodMenu implements IFood{
    List<FoodItem> items;
    
    public List<FoodItem> displayFoodMenu() {
     FoodMenuDAO foodMenuDAO = new FoodMenuDAO();
     foodMenuDAO.Load();
     return foodMenuDAO.getItems();
    }
    public FoodItem getSpecificFoodItem(int foodItemID) {
        FoodMenuDAO foodMenuDAO = new FoodMenuDAO();
        return foodMenuDAO.getSpecificItem(foodItemID);
    }
    
    public FoodMenu(List<FoodItem> items) {
        this.items = items;
    }
    public FoodMenu() {
    }

    public List<FoodItem> getItems() {
        return items;
    }

    public void setItems(List<FoodItem> items) {
        this.items = items;
    }
    

}
