/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Main;

import java.util.List;

/**
 *
 * @author mubee
 */
public interface IFood {
    List<FoodItem> displayFoodMenu();
    FoodItem getSpecificFoodItem(int foodItemID);
}