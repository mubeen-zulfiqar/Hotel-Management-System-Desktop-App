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
public class StaffManager  extends Manager{
    List<Employee> employees;
    List<Post> posts;

    public StaffManager(int ID, String name, String email, String pass, int salary, String address, String phone,String type) {
        super(ID, name, email, pass, salary, address, phone, type);
  
    }
    

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
    @Override
    public void replyQueries(int id,String reply) {
        new QueryDAO().replystaffQueries(id, reply);
    }
      @Override
    public void accept(int id) {
        new JobApplicationDAO().acceptJobApplication(id);
    }

    @Override
    public void reject(int id) {
        new JobApplicationDAO().rejectJobApplication(id);
    }
}
