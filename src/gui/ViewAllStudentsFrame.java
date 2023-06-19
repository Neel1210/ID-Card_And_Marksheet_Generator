package gui;

import dao.StudentsDao;
import dao.UsersDao;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.LoginPojo;
import pojo.StudentPojo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ViewAllStudentsFrame extends javax.swing.JFrame {

    private DefaultTableModel model;
    public ViewAllStudentsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        model=(DefaultTableModel)tblAllStudents.getModel();
        loadTable();
        this.setVisible(true);
    }
    
    private void loadTable() {
        try{
            List<StudentPojo> allStudentsList=StudentsDao.getAllStudents();
            for(StudentPojo sp:allStudentsList){
                Vector <String> row=new Vector<>();
                row.add(sp.getRollNo());
                row.add(sp.getName());
                row.add(sp.getEmail());
                row.add(sp.getPhone());
                row.add(sp.getCourse());
                row.add(sp.getBranch());
                row.add(sp.getSem());
                model.addRow(row);
            }
            if(allStudentsList.isEmpty()){
                JOptionPane.showMessageDialog(null,"No Students Present!","No Record Found !",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"DB Error","Error",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();
         } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        cllgTitleLbl = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cllgDiscLbl = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAllStudents = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(127, 157, 185));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setBackground(new java.awt.Color(173, 192, 234));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 680, 390, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, 940, 10));

        cllgTitleLbl.setFont(new java.awt.Font("Times New Roman", 1, 65)); // NOI18N
        cllgTitleLbl.setText("N R I GROUP OF INSTITUTE ");
        jPanel1.add(cllgTitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 1050, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/collegeproject/Logo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        cllgDiscLbl.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        cllgDiscLbl.setText("APPROVED BY AICTE, PCI, BCI & INC NEW DELHI, AFFILIATED TO RGPV, BU, BHOPAL, MPMSU || GOPAL NAGAR, BHOPAL, MADHYA PRADESH 462022");
        jPanel1.add(cllgDiscLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 910, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 900, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 1050, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1050, 10));

        tblAllStudents.setBackground(new java.awt.Color(173, 192, 234));
        tblAllStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll No", "Name", "Email", "Mobile No", "Course", "Branch", "Semester"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAllStudents.setShowGrid(true);
        tblAllStudents.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblAllStudents);
        if (tblAllStudents.getColumnModel().getColumnCount() > 0) {
            tblAllStudents.getColumnModel().getColumn(0).setResizable(false);
            tblAllStudents.getColumnModel().getColumn(0).setPreferredWidth(130);
            tblAllStudents.getColumnModel().getColumn(1).setResizable(false);
            tblAllStudents.getColumnModel().getColumn(1).setPreferredWidth(130);
            tblAllStudents.getColumnModel().getColumn(2).setResizable(false);
            tblAllStudents.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblAllStudents.getColumnModel().getColumn(3).setResizable(false);
            tblAllStudents.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblAllStudents.getColumnModel().getColumn(4).setResizable(false);
            tblAllStudents.getColumnModel().getColumn(5).setResizable(false);
            tblAllStudents.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblAllStudents.getColumnModel().getColumn(6).setResizable(false);
            tblAllStudents.getColumnModel().getColumn(6).setPreferredWidth(40);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 940, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        if(LoginFrame.userType=="Admin")
        {
            new AdminOptionFrame().setVisible(true);
            this.dispose();
        }
        else
        {
            new OptionFrame().setVisible(true);
            this.dispose();
        }   
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAllStudentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllStudentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllStudentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllStudentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllStudentsFrame().setVisible(true);
            }
        });
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cllgDiscLbl;
    private javax.swing.JLabel cllgTitleLbl;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable tblAllStudents;
    // End of variables declaration//GEN-END:variables

    
}
