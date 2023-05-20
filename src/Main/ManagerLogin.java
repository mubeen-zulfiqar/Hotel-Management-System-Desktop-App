/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author mubee
 */
public class ManagerLogin {

    Manager Login(String Email, String Pass) {
        ManagerDAO managerDAO = new ManagerDAO();
        return managerDAO.Load(Email, Pass);
    }
}
