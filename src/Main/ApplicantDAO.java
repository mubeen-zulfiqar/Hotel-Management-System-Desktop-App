/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sq.SQL;

/**
 *
 * @author huzai
 */
public class ApplicantDAO {
    List<Applicant> applicant;
      public List<Applicant> getApplicant() {
        return applicant;
    }

    public void setApplicant(List<Applicant> customers) {
        this.applicant = customers;
    }
    void Load(){
        applicant = new ArrayList<Applicant>();
        SQL obj=new SQL();
            try(ResultSet rs=obj.getAppicant();){
            while(rs.next()){
                
                applicant.add(new Applicant(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    void applyforjob(int pid,int aid)
    {
    SQL obj=new SQL();
 //   try{
    obj.Insert_Job_App(pid, aid);}
        void signUp(String name, String email, String pass, String address, String phone)
    {
         SQL obj = new SQL();
        try {
            obj.insertNewApplicant(name, email, pass, address, phone);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
