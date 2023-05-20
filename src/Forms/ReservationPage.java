package Forms;


import Main.ICustomer;
import Main.IRoom;
import Main.Room;
import java.sql.ResultSet;
import javax.swing.ListModel;
import java.util.ArrayList; // import the ArrayList class
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hassan
 */
public class ReservationPage extends javax.swing.JFrame {
    ICustomer customer;
    /**
     * Creates new form ReservationPage
     */
    public ReservationPage() {
       initComponents();
       LoadData();
    }
    public ReservationPage(ICustomer customer) {
        this.customer=customer;
       initComponents();
       LoadData();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        book = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        roomno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bcd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        book.setText("BOOK");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });
        getContentPane().add(book);
        book.setBounds(600, 390, 70, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "No of Beds", "Floor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 210, 450, 160);

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("ROOM RESERVATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 120, 377, 44);

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter RoomNo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 380, 160, 40);
        getContentPane().add(roomno);
        roomno.setBounds(420, 380, 150, 40);

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 10, 80, 23);

        bcd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reservation-background-image.jpg"))); // NOI18N
        bcd.setText("jLabel2");
        getContentPane().add(bcd);
        bcd.setBounds(0, 1, 990, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        int roomn=Integer.parseInt(roomno.getText());
        Room room= new Room();
        room.setID(roomn);
        customer.reserveRoom(room);
     //  JOptionPane.showConfirmDialog(this, "Are you sure?");
        JOptionPane.showMessageDialog(null,"Reservation Request sent according to entered Room No");
//        System_class sys=new System_class();
//        rs=sys.getCrntUser();
//        int crnt_usr=rs.getInt(1);
//        sys.AddBookingRequest()
    }//GEN-LAST:event_bookActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Home(customer).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void LoadData()
    {
         IRoom room = new Room();
        List<Room> rooms = room.getAvailableRooms();
          DefaultTableModel tablelist=(DefaultTableModel)jTable1.getModel();
      for(int i=0;i<rooms.size();i++)
      {      
          String data[]={String.valueOf(rooms.get(i).getID()),String.valueOf(rooms.get(i).getNoOfBeds()),String.valueOf(rooms.get(i).getFloor())};
          tablelist.addRow(data);}
   

    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//   
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ReservationPage().setVisible(true);
//                
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bcd;
    private javax.swing.JButton book;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField roomno;
    // End of variables declaration//GEN-END:variables
}