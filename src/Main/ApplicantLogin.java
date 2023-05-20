/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huzai
 */
public class ApplicantLogin {
     boolean Login(Applicant customer){    
        ApplicantDAO applicantDAO = new ApplicantDAO();
        applicantDAO.Load();
        List<Applicant> applicant = new ArrayList<Applicant>();
        applicant = applicantDAO.getApplicant();
         for (int i = 0; i < applicant.size(); i++) {
             if(applicant.get(i).getEmail().equalsIgnoreCase(customer.getEmail()) && applicant.get(i).getPass().equals(customer.getPass()))
             {
                 customer.setID(applicant.get(i).getID());
                 customer.setAddress(applicant.get(i).getAddress());
                 customer.setName(applicant.get(i).getName());
                 customer.setPhone(applicant.get(i).getPhone());
                 return true;
             }
         }
         return false;
     }
}
