package Forms;






import Forms.*;
import Forms.*;
import Main.FoodManager;
import Main.FoodQuery;
import Main.IApplicant;
import Main.IManager;
import Main.IPost;
import Main.IQuery;
import Main.Post;
import Main.Query;
import Main.RoomQuery;
import Main.StaffQuery;
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
public class QueriesReply extends javax.swing.JFrame {
    List<Query>queries;
    IManager manager;
    /**
     * Creates new form ReservationPage
     */
    public QueriesReply() {
       initComponents();       
        //LoadData();
    }
    public QueriesReply(IManager manager) {
        this.manager=manager;
       initComponents();       
        LoadData();
    }
    void LoadData()
    {
    if(manager.getType().equals("Staff Manager"))
    {
    Query q=new StaffQuery();
    IQuery q1=(IQuery) q;
    List<Query>r1=q1.GetQueries();
    DefaultTableModel tablelist=(DefaultTableModel)jTable1.getModel();
    tablelist.setRowCount(0);
    for(int i=0;i<r1.size();i++)
      {      
          String data[]={String.valueOf(r1.get(i).getID()),r1.get(i).getText(),r1.get(i).getId().getName(),r1.get(i).getReply()};
          tablelist.addRow(data);}
    }
    else  if(manager.getType().equals("Room Manager"))
    {
    Query q=new RoomQuery();
    IQuery q1=(IQuery) q;
    List<Query>r1=q1.GetQueries();
    DefaultTableModel tablelist=(DefaultTableModel)jTable1.getModel();
    tablelist.setRowCount(0);
    for(int i=0;i<r1.size();i++)
      {      
          String data[]={String.valueOf(r1.get(i).getID()),r1.get(i).getText(),r1.get(i).getId().getName(),r1.get(i).getReply()};
          tablelist.addRow(data);}
    }
    else  if(manager.getType().equals("Food Manager"))
    {
    Query q=new FoodQuery();
    IQuery q1=(IQuery) q;
    List<Query>r1=q1.GetQueries();
    DefaultTableModel tablelist=(DefaultTableModel)jTable1.getModel();
    tablelist.setRowCount(0);
    for(int i=0;i<r1.size();i++)
      {      
          String data[]={String.valueOf(r1.get(i).getID()),r1.get(i).getText(),r1.get(i).getId().getName(),r1.get(i).getReply()};
          tablelist.addRow(data);}
    }
    }
     
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accept = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        qid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reply = new javax.swing.JTextArea();
        bcd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setMinimumSize(new java.awt.Dimension(1020, 620));
        getContentPane().setLayout(null);

        accept.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        accept.setText("Send");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });
        getContentPane().add(accept);
        accept.setBounds(760, 510, 80, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Text", "Customer", "Reply"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 210, 450, 160);

        logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logout.setText("Home");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(10, 510, 120, 40);

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Queries");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 120, 130, 44);

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 390, 90, 40);
        getContentPane().add(qid);
        qid.setBounds(400, 390, 150, 40);

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Reply:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 460, 130, 40);

        reply.setColumns(20);
        reply.setRows(5);
        jScrollPane2.setViewportView(reply);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(400, 440, 300, 130);

        bcd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reservation-background-image.jpg"))); // NOI18N
        bcd.setText("jLabel2");
        getContentPane().add(bcd);
        bcd.setBounds(0, 1, 990, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
          int id=Integer.parseInt(qid.getText());
        String freply=reply.getText();
        manager.replyQueries(id, freply);
        JOptionPane.showMessageDialog(null,"Reply Sent");
        LoadData();
    }//GEN-LAST:event_acceptActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        if("Room Manager".equals(manager.getType()))
            new RoomManagerHome(manager).setVisible(true);
            else
            if("Staff Manager".equals(manager.getType()))
        new StaffManagerHome(manager).setVisible(true);
        else
            if("Food Manager".equals(manager.getType()))
        new FoodManagerHome(manager).setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//   
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new QueriesReply().setVisible(true);
//                
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept;
    private javax.swing.JLabel bcd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField qid;
    private javax.swing.JTextArea reply;
    // End of variables declaration//GEN-END:variables
}
