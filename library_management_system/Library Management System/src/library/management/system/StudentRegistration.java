/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.management.system;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author MONIKA
 */
public class StudentRegistration extends javax.swing.JFrame {

    /**
     * Creates new form StudentRegistration
     */
    public StudentRegistration() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textid = new javax.swing.JTextField();
        textname = new javax.swing.JTextField();
        textcourse = new javax.swing.JTextField();
        textbranch = new javax.swing.JTextField();
        textsemister = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/isue.jpg"))); // NOI18N
        jLabel1.setText("Student Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 64, 291, 62));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 224, 122, 36));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Student Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 303, -1, 34));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Course");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 388, 83, 33));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Branch");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 462, 95, 38));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Semister");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 546, 135, 31));

        textid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textidActionPerformed(evt);
            }
        });
        getContentPane().add(textid, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 224, 361, 36));

        textname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(textname, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 303, 361, 34));

        textcourse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(textcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 386, 361, 37));

        textbranch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(textbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 462, 361, 38));

        textsemister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(textsemister, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 543, 361, 36));

        btnsave.setBackground(new java.awt.Color(204, 0, 0));
        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 660, 121, 36));

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close icon.png"))); // NOI18N
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 0, 60, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/All Page Backgraound.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1140, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btncloseActionPerformed

    private void textidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textidActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
       if(textid.getText().equals("")){
           JOptionPane.showMessageDialog(this, " All Field is required");
           textid.requestFocus();    
       }
       
       else if(textname.getText().equals("")){
           JOptionPane.showMessageDialog(this, " All Field is required");
           textname.requestFocus();    
       }
       
        else if(textcourse.getText().equals("")){
           JOptionPane.showMessageDialog(this, " All Field is required");
           textcourse.requestFocus();    
       }
       
        else if(textbranch.getText().equals("")){
           JOptionPane.showMessageDialog(this, " All Field is required");
           textbranch.requestFocus();    
       }
       
        else if(textsemister.getText().equals("")){
           JOptionPane.showMessageDialog(this, " All Field is required");
           textsemister.requestFocus();    
       }
       
        else{
          
           try {
               Connection con= Connect.Connection();
               
               
               
              PreparedStatement pst = con.prepareStatement(
                      "INSERT INTO `library`.`STUDENT` (`id`, `name`, `course`, `branch`, `semister`) VALUES (?, ?, ?, ?, ?)");
               pst.setString(1, textid.getText());
               pst.setString(2, textname.getText());
               pst.setString(3, textcourse.getText());
               pst.setString(4, textbranch.getText());
               pst.setString(5, textsemister.getText());
               pst.executeUpdate();
               JOptionPane.showMessageDialog(this, "Recored Save");
               textid.setText("");
                textname.setText("");
                 textcourse.setText("");
                  textbranch.setText("");
                 textsemister.setText("");
           } catch (SQLException ex) {
               Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
           }
                 
                   
                   
                  
          
            
        }
       
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textbranch;
    private javax.swing.JTextField textcourse;
    private javax.swing.JTextField textid;
    private javax.swing.JTextField textname;
    private javax.swing.JTextField textsemister;
    // End of variables declaration//GEN-END:variables
}
