package sq;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SQL {

    protected String url = "jdbc:sqlserver://PROFESSOR\\MSSQLSERVER;" + "databaseName=SDA_Proj;integratedSecurity=true;";

    public ResultSet getSpecificFoodMenuItem(int foodItemID) {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from [FoodMenu] where foodItemID = ?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setInt(1, foodItemID);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void insertNewCustomer(String name, String email, String pass, String address, String phone) {
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "insert into [Customer] values(?, ?, ?, ?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, pass);
            pst.setString(4, address);
            pst.setString(5, phone);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertNewApplicant(String name, String email, String pass, String address, String phone) {
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "insert into [Applicant] values(?, ?, ?, ?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, pass);
            pst.setString(4, address);
            pst.setString(5, phone);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateRoomStatustoReserved(int roomID) {
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "update [Room] set [reserved] = 1 where id = ?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setInt(1, roomID);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateAcceptReservation(int reservationID) {
        try {

            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "update [Room_Reservation_Request] set [status] = 1 where id =?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setInt(1, reservationID);
            pst.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateRejectReservation(int reservationID) {
        try {

            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "update [Room_Reservation_Request] set [status] = 0 where id =?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setInt(1, reservationID);
            pst.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet getFoodOrders() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "select * from Food_Order join [FOOD_ITEMS_ORDERED] on Food_Order.ID= FOOD_ITEMS_ORDERED.FoodOrderID";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void updateAcceptFoodOrder(int foodOrderID) {
        try {

            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "update [Food_Order] set [state] = 1 where id = ?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setInt(1, foodOrderID);
            pst.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateRejectFoodOrder(int foodOrderID) {
        try {

            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "update [Food_Order] set [state] = 0 where id = ?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setInt(1, foodOrderID);
            pst.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet getCustomers() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from [Customer]";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getAppicant() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from Applicant";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getAppicant(int id) {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from Applicant where ID=?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getAdmin() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from [Admin]";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getPosts() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from Post";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getPost(int id) {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from Post where ID=?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getNRRooms() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from Room where Reserved=-1";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getNRPosts() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from Post where Reserved=-1";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void Insert_Job_App(int pid, int aid) {

        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "insert into Job_Application values(?,?,'Pending')";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setInt(1, aid);
            pst.setInt(2, pid);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet getRoomReservationRequest() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from [Room_Reservation_Request] ";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet JobAppGetPostID(int id) {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select PostID from Job_Application where ID=" + id;
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet GetAllRooms() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from Room";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void insertRoomReservationRequest(int roomID, int customerID, int status) {

        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Insert into Room_Reservation_Request values(?,?,?)";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setInt(1, roomID);
            pst.setInt(2, customerID);
            pst.setInt(3, status);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void insertRoomQueries(String txt, int cid) {

        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Insert into ROOM_QUERY values(?,?,?)";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, txt);
            pst.setString(2, "");
            pst.setInt(3, cid);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void replyRoomQuery(String reply, int id) {

        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Update ROOM_QUERY set Reply= ? where ID=?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, reply);
            pst.setInt(2, id);
//            pst.setInt(3, cid);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ResultSet GetRoomQueries() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from ROOM_QUERY";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void insertFoodQueries(String txt, int cid) {

        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Insert into FOOD_QUERY values(?,?,?)";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, txt);
            pst.setString(2, "");
            pst.setInt(3, cid);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void replyFoodQuery(String reply, int id) {

        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Update FOOD_QUERY set Reply= ? where ID=?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, reply);
            pst.setInt(2, id);
//            pst.setInt(3, cid);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ResultSet GetFoodQueries() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from FOOD_QUERY";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void insertStaffQueries(String txt, int cid) {

        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Insert into STAFF_QUERY values(?,?,?)";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, txt);
            pst.setString(2, "");
            pst.setInt(3, cid);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void replyStaffQuery(String reply, int id) {

        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Update STAFF_QUERY set Reply= ? where ID=?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, reply);
            pst.setInt(2, id);
//            pst.setInt(3, cid);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ResultSet GetStaffQueries() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from STAFF_QUERY";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet Specific_User(int id) {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from Customer where ID=" + id;
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet GetCustomerFoodQueries(int cid) {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from FOOD_QUERY where CustomerID=" + cid;
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet GetCustomerRoomQueries(int cid) {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from ROOM_QUERY where CustomerID = " + cid;
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet GetCustomerStaffQueries(int cid) {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from STAFF_QUERY where CustomerID=" + cid;
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void insertComplaint(String txt, int cid) {

        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Insert into COMPLAINT values(?,?,?)";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, txt);
            pst.setString(2, "");
            pst.setInt(3, cid);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void replyComplaint(String reply, int id) {

        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Update COMPLAINT set Reply= ? where ID=?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, reply);
            pst.setInt(2, id);
//            pst.setInt(3, cid);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ResultSet GetCustomerComplaints(int cid) {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from COMPLAINT where CustomerID = " + cid;
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet GetAllComplaints() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from COMPLAINT";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void insertFoodOrder(List<Integer> foodOrderItems, int customerID, int status) {

        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Insert into Food_Order values(?,?)";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setInt(1, customerID);
            pst.setInt(2, status);
            pst.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }

        int orderID = 0;
        try {
            ResultSet rs = null;
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "SELECT top 1 id from  Food_Order order by id desc";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                orderID = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String sql = "Insert into FOOD_ITEMS_ORDERED values(?,?)";

            for (int i = 0; i < foodOrderItems.size(); i++) {
                PreparedStatement pst;
                pst = con.prepareStatement(sql);
                pst.setInt(1, orderID);
                pst.setInt(2, foodOrderItems.get(i));
                pst.execute();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ResultSet getFoodMenu() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from [FoodMenu]";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet GetSpecificRoom(int id) {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from Room where ID=" + id;
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getUserReservationRequest(int uid) {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from [Room_Reservation_Request] where CustomerID=" + uid;
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet GetStaff() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from Employee";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet GetSpecificPost(int sid) {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from Post where ID=" + sid;
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getManager() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from [Manager]";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void Update_Job_App(int id, String state) {

        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Update Job_Application set Status=? where ID=?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setString(1, state);
            pst.setInt(2, id);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Update_Post(int id, int state) {

        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Update Post set reserved=? where ID=?";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            pst.setInt(1, state);
            pst.setInt(2, id);

            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet GetAllJobApp() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from Job_Application";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet GetSpecificJobApp(int id) {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "Select * from Job_Application where ApplicantID=" + id;
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
