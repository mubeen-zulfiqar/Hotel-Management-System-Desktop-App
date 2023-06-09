package Forms;








import Forms.*;
import Forms.*;
import Forms.*;
import Main.FoodManager;
import Main.ICustomer;
import Main.IPost;
import Main.IQuery;
import Main.Post;
import Main.Query;
import Main.RoomQuery;
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
public class SentQueries extends javax.swing.JFrame {
    List<Query>queries;
    ICustomer customer;
    /**
     * Creates new form ReservationPage
     */
    public SentQueries() {
       initComponents();       
       // LoadData();
    }
    public SentQueries(ICustomer customer)
    {
    this.customer=customer;
    initComponents();
    LoadData();
    }
    void LoadData()
    {
    
    queries=customer.viewQueries();
     DefaultTableModel tablelist=(DefaultTableModel)jTable1.getModel();
      for(int i=0;i<queries.size();i++)
      {      
          String data[]={String.valueOf(queries.get(i).getID()),queries.get(i).getText(),queries.get(i).getReply()};
          tablelist.addRow(data);}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bcd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setMinimumSize(new java.awt.Dimension(1020, 620));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Text", "Reply"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 210, 450, 160);

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Sent Queries");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 140, 220, 44);

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 10, 59, 23);

        bcd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reservation-background-image.jpg"))); // NOI18N
        bcd.setText("jLabel2");
        getContentPane().add(bcd);
        bcd.setBounds(0, 1, 990, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Home(customer).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//   
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SentQueries().setVisible(true);
//                
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bcd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
