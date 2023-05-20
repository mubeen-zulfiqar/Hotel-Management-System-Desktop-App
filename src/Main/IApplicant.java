package Main;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huzai
 */
public interface IApplicant {
    boolean Login();
    void ApplyForJob(Post pst);
    List<Job_Application>LoadApplicantApplication();
     void SignUp(String name, String email, String pass, String address, String phone);
}
