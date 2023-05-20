/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Main.FoodItem;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sq.SQL;

/**
 *
 * @author mubee
 */
public class FoodMenuDAO {

    static List<FoodItem> items;

    void Load() {
        items = new ArrayList<FoodItem>();
        SQL obj = new SQL();
        try ( ResultSet rs = obj.getFoodMenu();) {
            while (rs.next()) {
                items.add(new FoodItem(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
FoodItem getSpecificItem(int foodItemID) {
        SQL obj = new SQL();
        try ( ResultSet rs = obj.getSpecificFoodMenuItem(foodItemID);) {
            while (rs.next()) {
                return (new FoodItem(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<FoodItem> getItems() {
        return items;
    }

    public void setItems(List<FoodItem> items) {
        this.items = items;
    }

}
