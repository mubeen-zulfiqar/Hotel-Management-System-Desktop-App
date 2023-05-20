package Main;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mubee
 */
public class Manager implements IManager{
   int ID;
   String name;
   String email;
   String pass;
   int salary;
   String address;
   String phone;
   String type;
public Manager(int ID, String name, String email, String pass, int salary, String address, String phone, String type) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.salary = salary;
        this.address = address;
        this.phone = phone;
        this.type = type;
    }

    public Manager() {

    }

    public Manager(String email, String pass) {
        this.email = email;
        this.pass = pass;

    }
    
    public Manager SignIn(String Email,String Pass){
       
         ManagerLogin managerLogin = new ManagerLogin();
         return managerLogin.Login(Email,Pass);
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
     @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void replyQueries(int id,String reply) {
    }

    @Override
    public void accept(int id) {
    }

    @Override
    public void reject(int id) {
    }
}
