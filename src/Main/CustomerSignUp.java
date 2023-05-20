/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author mubee
 */
public class CustomerSignUp {
    
    void SignUp(String name, String email, String pass, String address, String phone){
        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.signUp(name, email, pass, address, phone);
    }
}
