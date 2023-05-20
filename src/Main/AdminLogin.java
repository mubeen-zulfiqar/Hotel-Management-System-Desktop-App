/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author mubee
 */
public class AdminLogin {
    Admin admin;

    public AdminLogin(Admin admin) {
        this.admin = admin;
    }

    AdminLogin() { }
    boolean Login(String email, String pass){
        AdminDAO admindao=new AdminDAO();
        admindao.Load();
        admin=admindao.getAdmin();
        
        System.out.print(admin.getPass());
        System.out.print(pass);
        
        
      //  System.out.print(admin.getEmail());
        
            if(admin.getEmail().equalsIgnoreCase(email) && admin.getPass().equals(pass))
               return true;
            else return false;
     }    
}
