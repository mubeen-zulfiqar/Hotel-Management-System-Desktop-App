/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Main;

/**
 *
 * @author mubee
 */
public interface IManager {
    Manager SignIn(String Email,String Pass);
    String getType();
    void replyQueries(int id,String reply);
    void accept(int id);
    void reject(int id);

}
