package Main;

import Main.Post;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mubee
 */
public class Job_Application implements IJob_Application{
    int ID;
    Applicant applicant;
    Post post;
    String status;

    public Job_Application(Applicant applicant, Post post) {
        this.applicant = applicant;
        this.post = post;
        JobApplicationDAO aplyjobDAO = new JobApplicationDAO();
        aplyjobDAO.apply(this);
    }

    public Job_Application(int ID, Applicant applicant, Post post, String status) {
        this.ID = ID;
        this.applicant = applicant;
        this.post = post;
        this.status = status;
    }

   public Job_Application() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
   public String getStatus() {
        return status;
    }

    

    public void setStatus(String status) {
        this.status = status;
    }
  

    @Override
    public List<Job_Application> getJob_Applicationss() {
    JobApplicationDAO jobaplcnts=new JobApplicationDAO();
    jobaplcnts.Load();
    return jobaplcnts.getJobsapp();
    }
    
}
