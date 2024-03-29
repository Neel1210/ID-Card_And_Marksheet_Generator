/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Neel_Esh
 */
public class OptionFrame extends javax.swing.JFrame {

    /**
     * Creates new form ParticipantsOptionFrame
     */
    public OptionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
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
        jSeparator1 = new javax.swing.JSeparator();
        cllgTitleLbl = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cllgDiscLbl = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        viewAllUsers = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        createMarksheet = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        registerUser1 = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(127, 157, 185));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1050, 10));

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

        viewAllUsers.setBackground(new java.awt.Color(173, 192, 234));
        viewAllUsers.setText("View All Student");
        viewAllUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllUsersActionPerformed(evt);
            }
        });
        jPanel1.add(viewAllUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 230, 40));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jobParticipant.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1050, 360));

        createMarksheet.setBackground(new java.awt.Color(173, 192, 234));
        createMarksheet.setText("Generate Marksheet");
        createMarksheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMarksheetActionPerformed(evt);
            }
        });
        jPanel1.add(createMarksheet, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 230, 40));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 1050, 20));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 1050, 20));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Manage Students -");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 1050, 20));

        registerUser1.setBackground(new java.awt.Color(173, 192, 234));
        registerUser1.setText("Register Student");
        registerUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUser1ActionPerformed(evt);
            }
        });
        jPanel1.add(registerUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 230, 40));

        logOutBtn.setBackground(new java.awt.Color(173, 192, 234));
        logOutBtn.setText("LogOut");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 300, 40));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 1050, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewAllUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllUsersActionPerformed
        // TODO add your handling code here:
        new ViewAllStudentsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewAllUsersActionPerformed

    private void createMarksheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMarksheetActionPerformed
        // TODO add your handling code here:
        new ResultFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createMarksheetActionPerformed

    private void registerUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerUser1ActionPerformed
        // TODO add your handling code here:
        new StudentRegistrationFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerUser1ActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new OptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cllgDiscLbl;
    private javax.swing.JLabel cllgTitleLbl;
    private javax.swing.JButton createMarksheet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton registerUser1;
    private javax.swing.JButton viewAllUsers;
    // End of variables declaration//GEN-END:variables
}
