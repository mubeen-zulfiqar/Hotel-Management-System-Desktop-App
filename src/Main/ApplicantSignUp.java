/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author mubee
 */
public class ApplicantSignUp {
     void SignUp(String name, String email, String pass, String address, String phone){
        ApplicantDAO applicantDAO = new ApplicantDAO();
        applicantDAO.signUp(name, email, pass, address, phone);
    }
}
