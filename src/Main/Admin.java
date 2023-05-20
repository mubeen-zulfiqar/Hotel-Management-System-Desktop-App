package Main;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mubee
 */
public class Admin implements IAdmin {
   String name;
   String email;
   String pass;

    public Admin(String name, String email, String pass) {
        this.name = name;
        this.email = email;
        this.pass = pass;
    }

    public Admin(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }
    
    void Login(String email, String Pass){
        
    }
    
            
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
     @Override
    public boolean Login() 
    {
        AdminLogin adminLogin = new AdminLogin();
        return adminLogin.Login(this.getEmail(),this.getPass());
    }

    @Override
    public void replyComplaints(int id,String reply){
    Complaint complaint=new Complaint();
    complaint.replyComplaint(id,reply);
    }
}
