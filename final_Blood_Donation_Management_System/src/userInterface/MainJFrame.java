/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import Business.Account.Account;
import Business.DB4OUtil.DB4OUtil;
import Business.ECOSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userInterface.HospitalVisitors.NewVisitorSignUpJPanel;

/**
 *
 * @author manita
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private ECOSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
       
       initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
      
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textUserName = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        textPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email  :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 100, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 110, -1));

        textUserName.setBackground(new java.awt.Color(102, 0, 0));
        textUserName.setForeground(new java.awt.Color(204, 204, 204));
        textUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(textUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 161, 33));

        btnLogin.setBackground(new java.awt.Color(51, 0, 0));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.setBorderPainted(false);
        btnLogin.setPreferredSize(new java.awt.Dimension(600, 249));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 161, 46));

        btnLogout.setBackground(new java.awt.Color(120, 0, 0));
        btnLogout.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.setBorderPainted(false);
        btnLogout.setEnabled(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 161, 44));

        textPassword.setBackground(new java.awt.Color(102, 0, 0));
        textPassword.setForeground(new java.awt.Color(204, 204, 204));
        textPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(textPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 167, 33));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome !");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login to your account");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 170, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/manitapasi/Downloads/Untitled-removebg-preview.png")); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setMaximumSize(new java.awt.Dimension(4, 4));
        jLabel6.setMinimumSize(new java.awt.Dimension(4, 4));
        jLabel6.setPreferredSize(new java.awt.Dimension(5, 5));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 80, 90));

        jSplitPane1.setLeftComponent(jPanel1);

        rightPanel.setBackground(new java.awt.Color(102, 0, 0));
        rightPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rightPanel.setLayout(new java.awt.CardLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/manitapasi/Desktop/d1-removebg-preview.png")); // NOI18N
        rightPanel.add(jLabel4, "card2");

        jSplitPane1.setRightComponent(rightPanel);

        getContentPane().add(jSplitPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        btnLogout.setEnabled(false);
        textUserName.setEnabled(true);
        textPassword.setEnabled(true);
        btnLogin.setEnabled(true);

        textUserName.setText("");
        textPassword.setText("");

        rightPanel.removeAll();//clearing all the stacked cards after logout
        JPanel emptyPanel = new JPanel();
        rightPanel.add("empty", emptyPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);

        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = textUserName.getText();
        String password = String.valueOf(textPassword.getPassword());
        //comboBox.getSelectedItem();

        Account userAccount = system.getUserAccountDirectory().authenticateUser(username, password);

        Enterprise inEnterprise = null;
        Organization inOrganization = null;

        if (userAccount == null) {
            //Step 2: Go inside each network and check each enterprise
            for (Network network : system.getNetworkList()) {
                //Step 2.a: check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(username, password);
                    if (userAccount == null) {
                        //Step 3:check against each organization for each enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(username, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }

                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Wrong credentials");
            return;
        } else {
            CardLayout layout = (CardLayout) rightPanel.getLayout();
            rightPanel.add("workArea", userAccount.getRole().createWorkArea(rightPanel, userAccount, inOrganization, inEnterprise, system));
            layout.next(rightPanel);
        }

        btnLogin.setEnabled(false);
        btnLogout.setEnabled(true);
        textUserName.setEnabled(false);
        textPassword.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void textUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUserNameActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUserName;
    // End of variables declaration//GEN-END:variables
}