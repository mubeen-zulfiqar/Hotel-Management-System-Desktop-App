package Main;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mubee
 */
public class FoodManager extends Manager {
    FoodMenu foodMenu;

public FoodManager(int ID, String name, String email, String pass, int salary, String address, String phone, String type) {
        super(ID, name, email, pass, salary, address, phone, type);
        
  //      FoodMenuDAO foodMenuDAO = new FoodMenuDAO();
//        foodMenu.setItems(foodMenuDAO.getItems());
        
    }
    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }
           @Override
    public void accept(int ID)
    {
        updateFoodOrder uFoodOrder = new updateFoodOrder(ID);
        uFoodOrder.acceptFoodOrder();
    }

     @Override
    public void reject(int ID)
    {
        updateFoodOrder uFoodOrder = new updateFoodOrder(ID);
        uFoodOrder.rejectFoodOrder();
    }
     @Override
    public void replyQueries(int id,String reply) {
        new QueryDAO().replyfoodQueries(id, reply);
    }
    
}
