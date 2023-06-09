package Forms;

import Main.FoodItem;
import Main.FoodMenu;
import Main.ICustomer;
import Main.IFood;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huzai
 */
public class FoodMenu1 extends javax.swing.JFrame {
List<Integer>foodOrderItems;
ICustomer customer;
    /**
     * Creates new form FoodMenu
     */
    public FoodMenu1() {
        foodOrderItems = new ArrayList<Integer>();
        initComponents();
        Load();
    }
 public FoodMenu1(ICustomer customer) {
     this.customer=customer;
        initComponents();
        foodOrderItems = new ArrayList<Integer>();
        
        Load();
    }

    void Load()
    {
    IFood foodMenu = new FoodMenu();
        List<FoodItem> items = foodMenu.displayFoodMenu();
           DefaultTableModel tablelist=(DefaultTableModel)jTable1.getModel();
      for(int i=0;i<items.size();i++)
      {      
          String data[]={String.valueOf(items.get(i).getID()),(items.get(i).getName()),""};
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

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        itemid = new javax.swing.JTextField();
        book = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 620));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FOOD MENU");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 110, 220, 44);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Desription"
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
        jScrollPane1.setBounds(200, 200, 450, 160);

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Your's Order");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 360, 160, 40);
        getContentPane().add(itemid);
        itemid.setBounds(380, 430, 150, 40);

        book.setText("Add");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });
        getContentPane().add(book);
        book.setBounds(560, 433, 70, 20);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(210, 400, 80, 150);

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter ItemID:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 380, 160, 40);

        jButton2.setText("Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(560, 480, 61, 23);

        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 10, 80, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FM.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 870, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void Loadordertable()
    {
    
           DefaultTableModel tablelist=(DefaultTableModel)jTable2.getModel();
           tablelist.setRowCount(0);
      for(int i=0;i<foodOrderItems.size();i++)
      {      
          String data[]={String.valueOf(foodOrderItems.get(i))};
          tablelist.addRow(data);}
    }
    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        
        
       int id=Integer.parseInt(itemid.getText());
       foodOrderItems.add(id);
               Loadordertable();    
    }//GEN-LAST:event_bookActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        for(int i=0;i<foodOrderItems.size();i++)
//      {   
//          System.out.print(foodOrderItems.get(i));
//      }
if(!foodOrderItems.isEmpty())
      {customer.orderFood(foodOrderItems);
        JOptionPane.showMessageDialog(null,"Order Placed");}
      else
          JOptionPane.showMessageDialog(null,"Not selected");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new Home(customer).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FoodMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FoodMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FoodMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FoodMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FoodMenu1().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book;
    private javax.swing.JTextField itemid;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
