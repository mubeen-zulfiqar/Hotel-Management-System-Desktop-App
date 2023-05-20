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
public class Post implements IPost{
    int ID;
    String name;
    int reserved;

    public Post(int ID, String name, int reserved) {
        this.ID = ID;
        this.name = name;
        this.reserved = reserved;
    }

    public Post() {
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

    public int isReserved() {
        return reserved;
    }

    public void setReserved(int reserved) {
        this.reserved = reserved;
    }

    @Override
    public List<Post> getNonReservedPosts() {
     // PostDAO postDAO=new PostDAO();
      return new PostDAO().getNRPosts();
    }
    
}
