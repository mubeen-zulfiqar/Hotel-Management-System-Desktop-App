package Forms;

import Main.Applicant;
import Main.Customer;
import Main.IApplicant;
import Main.ICustomer;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huzai
 */
public class Create_Account extends javax.swing.JFrame {

    /**
     * Creates new form Create_Account
     */
    public Create_Account() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        pno = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        Enteruser5 = new javax.swing.JLabel();
        Enteruser4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        Enteruser1 = new javax.swing.JLabel();
        Enteruser6 = new javax.swing.JLabel();
        Enteruser7 = new javax.swing.JLabel();
        createdetail = new javax.swing.JLabel();
        create = new javax.swing.JLabel();
        applcrtacnt = new javax.swing.JButton();
        login = new javax.swing.JToggleButton();
        notreg = new javax.swing.JLabel();
        cstmricrtacnt2 = new javax.swing.JButton();
        Image = new javax.swing.JLabel();
        pswrd = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        name.setToolTipText("");
        name.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(410, 60, 210, 30);

        email.setToolTipText("");
        email.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(410, 110, 210, 30);

        pno.setToolTipText("");
        pno.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        pno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnoActionPerformed(evt);
            }
        });
        getContentPane().add(pno);
        pno.setBounds(410, 160, 210, 30);

        add.setToolTipText("");
        add.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(410, 210, 210, 30);

        Enteruser5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Enteruser5.setText("PhoneNo");
        getContentPane().add(Enteruser5);
        Enteruser5.setBounds(320, 140, 80, 70);

        Enteruser4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Enteruser4.setText("Email");
        getContentPane().add(Enteruser4);
        Enteruser4.setBounds(320, 90, 80, 70);

        jPasswordField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(410, 250, 210, 40);

        Enteruser1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Enteruser1.setText("Password");
        getContentPane().add(Enteruser1);
        Enteruser1.setBounds(320, 240, 80, 70);

        Enteruser6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Enteruser6.setText("Name");
        getContentPane().add(Enteruser6);
        Enteruser6.setBounds(320, 40, 80, 70);

        Enteruser7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Enteruser7.setText("Address");
        getContentPane().add(Enteruser7);
        Enteruser7.setBounds(320, 190, 80, 70);

        createdetail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 12)); // NOI18N
        createdetail.setForeground(new java.awt.Color(0, 102, 102));
        createdetail.setText("Create account by entering following information.  ");
        getContentPane().add(createdetail);
        createdetail.setBounds(60, 340, 270, 30);

        create.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        create.setText("Create an Account ");
        getContentPane().add(create);
        create.setBounds(70, 310, 230, 30);

        applcrtacnt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        applcrtacnt.setForeground(new java.awt.Color(0, 153, 204));
        applcrtacnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/createacnt.png"))); // NOI18N
        applcrtacnt.setText("Applicant");
        applcrtacnt.setContentAreaFilled(false);
        applcrtacnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applcrtacntMouseClicked(evt);
            }
        });
        applcrtacnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applcrtacntActionPerformed(evt);
            }
        });
        getContentPane().add(applcrtacnt);
        applcrtacnt.setBounds(360, 300, 140, 50);

        login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        login.setForeground(new java.awt.Color(0, 102, 255));
        login.setText("Login");
        login.setContentAreaFilled(false);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(510, 410, 110, 30);

        notreg.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 12)); // NOI18N
        notreg.setForeground(new java.awt.Color(0, 102, 102));
        notreg.setText("Already registered?");
        getContentPane().add(notreg);
        notreg.setBounds(420, 410, 140, 30);

        cstmricrtacnt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cstmricrtacnt2.setForeground(new java.awt.Color(0, 153, 204));
        cstmricrtacnt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/createacnt.png"))); // NOI18N
        cstmricrtacnt2.setText("Customer");
        cstmricrtacnt2.setContentAreaFilled(false);
        cstmricrtacnt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cstmricrtacnt2MouseClicked(evt);
            }
        });
        cstmricrtacnt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstmricrtacnt2ActionPerformed(evt);
            }
        });
        getContentPane().add(cstmricrtacnt2);
        cstmricrtacnt2.setBounds(500, 300, 140, 50);

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3create.jpg"))); // NOI18N
        getContentPane().add(Image);
        Image.setBounds(20, -40, 300, 470);

        pswrd.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pswrd);
        pswrd.setBounds(0, 0, 670, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void pnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnoActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
         Login login=new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginMouseClicked

    private void applcrtacntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applcrtacntMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_applcrtacntMouseClicked

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void applcrtacntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applcrtacntActionPerformed
        // TODO add your handling code here:
       String name1=name.getText();
       String pno1=pno.getText();
       String add1=add.getText();
       String email1=email.getText();
       String pswrd=new String(jPasswordField1.getPassword());
       IApplicant a = new Applicant();
        a.SignUp(name1, email1, pswrd ,add1, pno1);
        JOptionPane.showMessageDialog(null,"Account Created");
        this.setVisible(false);
        new Login().setVisible(true);
       
    }//GEN-LAST:event_applcrtacntActionPerformed

    private void cstmricrtacnt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cstmricrtacnt2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cstmricrtacnt2MouseClicked

    private void cstmricrtacnt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstmricrtacnt2ActionPerformed
        // TODO add your handling code here:
        String name1=name.getText();
       String pno1=pno.getText();
       String add1=add.getText();
       String email1=email.getText();
       String pswrd=new String(jPasswordField1.getPassword());
       ICustomer c = new Customer();
        c.SignUp(name1, email1, pswrd ,add1, pno1);
        JOptionPane.showMessageDialog(null,"Account Created");
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_cstmricrtacnt2ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Enteruser1;
    private javax.swing.JLabel Enteruser4;
    private javax.swing.JLabel Enteruser5;
    private javax.swing.JLabel Enteruser6;
    private javax.swing.JLabel Enteruser7;
    private javax.swing.JLabel Image;
    private javax.swing.JTextField add;
    private javax.swing.JButton applcrtacnt;
    private javax.swing.JLabel create;
    private javax.swing.JLabel createdetail;
    private javax.swing.JButton cstmricrtacnt2;
    private javax.swing.JTextField email;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JToggleButton login;
    private javax.swing.JTextField name;
    private javax.swing.JLabel notreg;
    private javax.swing.JTextField pno;
    private javax.swing.JPanel pswrd;
    // End of variables declaration//GEN-END:variables
}
