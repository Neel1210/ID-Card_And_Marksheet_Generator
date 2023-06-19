/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.UsersDao;
import pojo.StudentPojo;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pojo.LoginPojo;

/**
 *
 * @author Neel_Esh
 */
public class AdminRemoveFacuiltyFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminModifyHrFrame
     */
    int flag=0;
    public AdminRemoveFacuiltyFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        removeFacuiltyBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        DipperSeperator = new javax.swing.JSeparator();
        cllgTitleLbl = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cllgDiscLbl = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        txtMob = new javax.swing.JTextField();
        UpperSeperator = new javax.swing.JSeparator();
        AddNewHrLBL = new javax.swing.JLabel();
        MobLbl = new javax.swing.JLabel();
        nameLbl2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameLbl3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        nameTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(127, 157, 185));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        removeFacuiltyBtn.setBackground(new java.awt.Color(173, 192, 234));
        removeFacuiltyBtn.setText("Remove Facuilty");
        removeFacuiltyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFacuiltyBtnActionPerformed(evt);
            }
        });
        jPanel1.add(removeFacuiltyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, 250, 30));

        backBtn.setBackground(new java.awt.Color(173, 192, 234));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 110, -1));

        logOutBtn.setBackground(new java.awt.Color(173, 192, 234));
        logOutBtn.setText("Logout");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, 110, -1));
        jPanel1.add(DipperSeperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 1030, 20));

        cllgTitleLbl.setFont(new java.awt.Font("Times New Roman", 1, 65)); // NOI18N
        cllgTitleLbl.setText("N R I GROUP OF INSTITUTE ");
        jPanel1.add(cllgTitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 1050, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/collegeproject/Logo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        cllgDiscLbl.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        cllgDiscLbl.setText("APPROVED BY AICTE, PCI, BCI & INC NEW DELHI, AFFILIATED TO RGPV, BU, BHOPAL, MPMSU || GOPAL NAGAR, BHOPAL, MADHYA PRADESH 462022");
        jPanel1.add(cllgDiscLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 910, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 900, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 1050, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1050, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 240, 10));

        txtMob.setBackground(new java.awt.Color(127, 157, 185));
        txtMob.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtMob.setBorder(null);
        txtMob.setOpaque(false);
        txtMob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobActionPerformed(evt);
            }
        });
        jPanel1.add(txtMob, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 240, 30));
        jPanel1.add(UpperSeperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 1050, 10));

        AddNewHrLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddNewHrLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Remove-Emp.png"))); // NOI18N
        AddNewHrLBL.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(AddNewHrLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 210, 190));

        MobLbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MobLbl.setText("Mobile no");
        jPanel1.add(MobLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 110, 30));

        nameLbl2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nameLbl2.setText("Remove Facuilty -");
        jPanel1.add(nameLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 260, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jobParticipant.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1050, 280));

        nameLbl3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nameLbl3.setText("Name ");
        jPanel1.add(nameLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 110, 30));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 10, 210));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 210, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 240, 10));

        nameTxt.setEditable(false);
        nameTxt.setBackground(new java.awt.Color(127, 157, 185));
        nameTxt.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        nameTxt.setBorder(null);
        nameTxt.setOpaque(false);
        jPanel1.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 240, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeFacuiltyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFacuiltyBtnActionPerformed
        // TODO add your handling code here:
        if(flag==0)
        {
            JOptionPane.showMessageDialog(null,"Please press enter\nAfter the writing mobile no","Warning",JOptionPane.WARNING_MESSAGE);
            return;            
        }
        if(!txtMob.getText().isEmpty() || !nameTxt.getText().isEmpty())
        {   
            try
            {
                int ans=JOptionPane.showConfirmDialog(null,"Are You sure to remove Facuilty ?","Confirmatation !!!",JOptionPane.OK_CANCEL_OPTION);
                if(ans!=JOptionPane.OK_OPTION)
                {
                    txtMob.setText("");
                    nameTxt.setText("");
                    return;
                }
                if(UsersDao.removeUser(txtMob.getText().trim()))
                {
                    JOptionPane.showMessageDialog(null,"Facuilty Removed successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                    txtMob.setText("");
                    nameTxt.setText("");
                    return;
                }
            }
            catch(SQLException ex)   
            {
                JOptionPane.showMessageDialog(null,"Error While Removing Facuilty","Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
        flag=0;
    }//GEN-LAST:event_removeFacuiltyBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        new AdminOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void txtMobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobActionPerformed
        // TODO add your handling code here:
        try
        {
            LoginPojo lp=UsersDao.getUserByMobileNo(txtMob.getText().trim());
            if(lp==null)
            {
                JOptionPane.showMessageDialog(null,"No Facuilty Found on the given mobile no","Success",JOptionPane.INFORMATION_MESSAGE);
                txtMob.setText("");
                nameTxt.setText("");
                return;
            }
            nameTxt.setText(lp.getName());
        }
        catch(SQLException ex)   
        {
            JOptionPane.showMessageDialog(null,"Changes Done successfully","Success",JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }
        flag=1;
    }//GEN-LAST:event_txtMobActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminRemoveFacuiltyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRemoveFacuiltyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRemoveFacuiltyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRemoveFacuiltyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRemoveFacuiltyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddNewHrLBL;
    private javax.swing.JSeparator DipperSeperator;
    private javax.swing.JLabel MobLbl;
    private javax.swing.JSeparator UpperSeperator;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel cllgDiscLbl;
    private javax.swing.JLabel cllgTitleLbl;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JLabel nameLbl2;
    private javax.swing.JLabel nameLbl3;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton removeFacuiltyBtn;
    private javax.swing.JTextField txtMob;
    // End of variables declaration//GEN-END:variables
}
