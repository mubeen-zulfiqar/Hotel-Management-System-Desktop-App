package Main;

import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mubee
 */
public class Applicant implements IApplicant{
   int ID;
   String name;
   String email;
   String pass;
   String address;
   String phone;

    public Applicant(int ID, String name, String email, String pass, String address, String phone) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.address = address;
        this.phone = phone;
    }
           public Applicant(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    public Applicant() {
    }
   @Override
        public boolean Login()
        {
        return new ApplicantLogin().Login(this);
        }
 @Override
    public void ApplyForJob(Post pst) {
        new Job_Application(this,pst);
    }
   @Override
    public List<Job_Application>LoadApplicantApplication()
    {
        JobApplicationDAO jobApplicationDAOnew=new JobApplicationDAO();
    jobApplicationDAOnew.LoadApplicantJob(this);
    return jobApplicationDAOnew.getJobsapp();
    }
    @Override
    public void SignUp(String name, String email, String pass, String address, String phone) {
        ApplicantSignUp applicantSignUp = new ApplicantSignUp();
        applicantSignUp.SignUp(name, email, pass, address, phone);
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

   
   
}
