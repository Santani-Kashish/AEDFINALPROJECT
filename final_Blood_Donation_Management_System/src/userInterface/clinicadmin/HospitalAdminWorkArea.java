/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.clinicadmin;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author manita
 */
public class HospitalAdminWorkArea extends javax.swing.JPanel {

    JPanel container;
    Enterprise enterprise;
    /**
     * Creates new form HospitalAdminWorkArea
     */
    public HospitalAdminWorkArea(JPanel container, Enterprise enterprise) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        enterpriseValue.setText(enterprise.getName());
        welcomeLbl.setText("Welcome "+enterprise.getName()+" admin");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLbl = new javax.swing.JLabel();
        btnManageOrganization = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        enterpriseValue = new javax.swing.JLabel();
        btnManageUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(120, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add(welcomeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 450, 50));

        btnManageOrganization.setBackground(new java.awt.Color(0, 0, 0));
        btnManageOrganization.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnManageOrganization.setForeground(new java.awt.Color(255, 255, 255));
        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageOrganization.setBorderPainted(false);
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });
        add(btnManageOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 570, 40));

        btnManageEmployee.setBackground(new java.awt.Color(0, 0, 0));
        btnManageEmployee.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnManageEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEmployee.setText("Manage People");
        btnManageEmployee.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageEmployee.setBorderPainted(false);
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });
        add(btnManageEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 570, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel2.setText("Admin :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        enterpriseValue.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        enterpriseValue.setText("<value>");
        add(enterpriseValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 160, -1));

        btnManageUser.setBackground(new java.awt.Color(0, 0, 0));
        btnManageUser.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnManageUser.setForeground(new java.awt.Color(255, 255, 255));
        btnManageUser.setText("Manage User");
        btnManageUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageUser.setBorderPainted(false);
        btnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserActionPerformed(evt);
            }
        });
        add(btnManageUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 570, 40));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed

        ManageOrganizationJPanel manageOrganizationJpanel = new ManageOrganizationJPanel(container, enterprise.getOrganizationDirectory(),enterprise);
        container.add("manageOrganizationJpanel", manageOrganizationJpanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed
        if(enterprise.getOrganizationDirectory().getOrganizationList().size()==0){
            JOptionPane.showMessageDialog(null, "There are no organizations. Create organization first.");
            return;
        }

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(container, enterprise.getOrganizationDirectory());
        container.add("manageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserActionPerformed
         boolean flag = false;
        int size = enterprise.getOrganizationDirectory().getOrganizationList().size();
        if(size == 0){
            JOptionPane.showMessageDialog(null, "There are no organizations. Create organization first.");
            return;
        }
        else if (size > 0){
            for(int i = 0; i < size; i++){
                if(enterprise.getOrganizationDirectory().getOrganizationList().get(i).getEmployeeDirectory().getEmployeeList().size() > 0)
                    flag = true;
            }
        }
        if(flag){
            ManageUserAccountJPanel manageUserAccountJPanel = new ManageUserAccountJPanel(container, enterprise);
            container.add("manageUserAccountJPanel", manageUserAccountJPanel);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        }else {
            JOptionPane.showMessageDialog(null, "To manage user, you need an employee. Create an employee first.");
        }
    }//GEN-LAST:event_btnManageUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManageUser;
    private javax.swing.JLabel enterpriseValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}
