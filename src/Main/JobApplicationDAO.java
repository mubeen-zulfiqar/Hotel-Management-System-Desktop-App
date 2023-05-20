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
public class JobApplicationDAO {
     static List<Job_Application> jobsapp;

    public static List<Job_Application> getJobsapp() {
        return jobsapp;
    }

        public static void setJobsapp(List<Job_Application> jobsapp) {
        JobApplicationDAO.jobsapp = jobsapp;
    }
    
     void Load(){
        jobsapp = new ArrayList<Job_Application>();
        SQL obj=new SQL();
            try(ResultSet rs=obj.GetAllJobApp();){
            while(rs.next()){
                int appID=rs.getInt(2);
                int postID=rs.getInt(3);
                ResultSet rs2=obj.getAppicant(appID);
                rs2.next();
                Applicant applicant=new Applicant(rs2.getInt(1),rs2.getString(2),rs2.getString(3),rs2.getString(4),rs2.getString(5),rs2.getString(6));
                rs2=obj.getPost(postID);
                rs2.next();
                Post post=new Post(rs2.getInt(1),rs2.getString(2),rs2.getInt(3));
                jobsapp.add(new Job_Application(rs.getInt(1),applicant,post,rs.getString(4)));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
     void apply(Job_Application aplyjob)
     {
         SQL obj=new SQL();
         try{
             obj.Insert_Job_App(aplyjob.getPost().getID(),aplyjob.getApplicant().getID());
       }
        catch (Exception e){
            e.printStackTrace();
        }
     }
     void acceptJobApplication(int id)
     {
     SQL obj=new SQL();
         try{
             obj.Update_Job_App(id,"Accepted");
             ResultSet rs=obj.JobAppGetPostID(id);
             rs.next();
             obj.Update_Post(rs.getInt(1), 1);
       }
        catch (Exception e){
            e.printStackTrace();
        }
     }
     void rejectJobApplication(int id)
     {
     SQL obj=new SQL();
         try{
             obj.Update_Job_App(id,"Rejected");
               ResultSet rs=obj.JobAppGetPostID(id);
             rs.next();
             obj.Update_Post(rs.getInt(1), 0);
       }
        catch (Exception e){
            e.printStackTrace();
        }
     }
     void LoadApplicantJob(Applicant applicant){
        jobsapp = new ArrayList<Job_Application>();
        SQL obj=new SQL();
            try(ResultSet rs=obj.GetSpecificJobApp(applicant.getID());){
            while(rs.next()){
                int postID=rs.getInt(3);
                ResultSet rs2=obj.getPost(postID);
                rs2.next();
                Post post=new Post(rs2.getInt(1),rs2.getString(2),rs2.getInt(3));
                jobsapp.add(new Job_Application(rs.getInt(1),applicant,post,rs.getString(4)));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
