/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author mubee
 */
public class updateFoodOrder {
     int foodOrderD;

    public updateFoodOrder(int foodOrderD) {
        this.foodOrderD = foodOrderD;
    }

    

    void acceptFoodOrder() {
        FoodOrderDAO foodOrderDAO = new FoodOrderDAO();
        foodOrderDAO.updateAccept(foodOrderD);
    }

    void rejectFoodOrder() {
        FoodOrderDAO foodOrderDAO = new FoodOrderDAO();
        foodOrderDAO.updateReject(foodOrderD);
    }
}
