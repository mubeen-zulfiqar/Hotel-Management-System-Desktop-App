/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.List;

/**
 *
 * @author huzai
 */
public class Staff implements IStaff
{
    int ID;
    String Name;
    String Email;
    String Password;
    String Address;
    String Pno;
    int salary;
    Post PID;

    public Staff(int ID, String Name, String Email, String Password, String Address, String Pno, int salary, Post PID) {
        this.ID = ID;
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
        this.Address = Address;
        this.Pno = Pno;
        this.salary = salary;
        this.PID = PID;
    }

    public Staff() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPno() {
        return Pno;
    }

    public void setPno(String Pno) {
        this.Pno = Pno;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Post getPID() {
        return PID;
    }

    public void setPID(Post PID) {
        this.PID = PID;
    }
    public List<Staff> GetAllStaff()
    {
    StaffDAO staff=new StaffDAO();
    staff.LoadStaff();
    return staff.getStaff();
    }
}
