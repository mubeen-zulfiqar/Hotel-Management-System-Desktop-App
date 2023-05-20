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
public class PostDAO {

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
    List<Post> posts;
    
    public void Load()
    {
    posts = new ArrayList<Post>();
        SQL obj=new SQL();
            try(ResultSet rs=obj.getPosts();){
            while(rs.next()){
                
                posts.add(new Post(rs.getInt(1),rs.getString(2),rs.getInt(3)));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public   List<Post> getNRPosts()
    {
        posts = new ArrayList<Post>();
        SQL obj=new SQL();
            try(ResultSet rs=obj.getNRPosts();){
            while(rs.next()){
                
                posts.add(new Post(rs.getInt(1),rs.getString(2),rs.getInt(3)));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
            return posts;
    }
}
