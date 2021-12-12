/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HospitalAdminWorkSpace;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Person.Donor;
import Business.Person.Recipient;
import Business.RegularExpressionCheck;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srikar
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    JPanel container;
    private OrganizationDirectory organizationDir;
    private Enterprise.EnterpriseType enterpriseType;
    /**
     * Creates new form ManageEmployeeJPanel
     */
    public ManageEmployeeJPanel(JPanel container, OrganizationDirectory organizationDir ) {
        initComponents();
        this.container = container;
        this.organizationDir = organizationDir;
        organizationJTable.getTableHeader().setFont(new Font("Times New Roman" , Font.ITALIC,23));
        
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
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
        JComboBoxOrganization = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        JComboBoxOrganizationEmp = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        JTextFieldName = new javax.swing.JTextField();
        btnCreateEmployee = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Arrange by");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        JComboBoxOrganization.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        JComboBoxOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JComboBoxOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxOrganizationActionPerformed(evt);
            }
        });
        add(JComboBoxOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 380, -1));

        organizationJTable.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 980, 170));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Organization");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        JComboBoxOrganizationEmp.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        JComboBoxOrganizationEmp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JComboBoxOrganizationEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JComboBoxOrganizationEmpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JComboBoxOrganizationEmpMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JComboBoxOrganizationEmpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JComboBoxOrganizationEmpMouseReleased(evt);
            }
        });
        JComboBoxOrganizationEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxOrganizationEmpActionPerformed(evt);
            }
        });
        add(JComboBoxOrganizationEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 270, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, -1, -1));

        JTextFieldName.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        add(JTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 270, 40));

        btnCreateEmployee.setBackground(new java.awt.Color(0, 0, 0));
        btnCreateEmployee.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnCreateEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateEmployee.setText("Add ");
        btnCreateEmployee.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateEmployee.setBorderPainted(false);
        btnCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmployeeActionPerformed(evt);
            }
        });
        add(btnCreateEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 640, 180, 50));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\TEJAL\\Downloads\\emploee.jpg")); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 580, 240));
    }// </editor-fold>//GEN-END:initComponents

    private void JComboBoxOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxOrganizationActionPerformed
        Organization organization = (Organization) JComboBoxOrganization.getSelectedItem();
        if (organization != null){
            
            
            populateTable(organization);
        }
    }//GEN-LAST:event_JComboBoxOrganizationActionPerformed

    private void btnCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmployeeActionPerformed
       if(JTextFieldName.getText().equals("") && !String.valueOf(JComboBoxOrganizationEmp.getItemAt(JComboBoxOrganizationEmp.getSelectedIndex())).equals("Visitor Organization")){
           JOptionPane.showMessageDialog(null, "Please enter the name.");
           return;
         }
       if(!RegularExpressionCheck.findRE(JTextFieldName.getText())){
             JOptionPane.showMessageDialog(null, "Please enter valid name.");
            return;
       }
        Organization organization = (Organization) JComboBoxOrganizationEmp.getSelectedItem();
        String name = JTextFieldName.getText();
        
        
            organization.getEmployeeDirectory().createEmployee(name);
            populateTable(organization);
            JOptionPane.showMessageDialog(null, "Added successfully!");
        
        JTextFieldName.setText("");

    }//GEN-LAST:event_btnCreateEmployeeActionPerformed

    private void JComboBoxOrganizationEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxOrganizationEmpMouseClicked
    }//GEN-LAST:event_JComboBoxOrganizationEmpMouseClicked

    private void JComboBoxOrganizationEmpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxOrganizationEmpMousePressed
    }//GEN-LAST:event_JComboBoxOrganizationEmpMousePressed

    private void JComboBoxOrganizationEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxOrganizationEmpMouseEntered
    }//GEN-LAST:event_JComboBoxOrganizationEmpMouseEntered

    private void JComboBoxOrganizationEmpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxOrganizationEmpMouseReleased
    }//GEN-LAST:event_JComboBoxOrganizationEmpMouseReleased

    private void JComboBoxOrganizationEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxOrganizationEmpActionPerformed
        /*if(String.valueOf(organizationEmpJComboBox.getItemAt(organizationEmpJComboBox.getSelectedIndex())).equals("Visitor Organization")){
        nameJTextField.setEnabled(false);
        nameJTextField.setEditable(false);
        }
        else{
        nameJTextField.setEnabled(true);
        nameJTextField.setEditable(true);
        }*/

    }//GEN-LAST:event_JComboBoxOrganizationEmpActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    private void populateTable(Organization organization){
        
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        //System.out.println(organization.equals(Organization.Type.Visitor.getValue()));
       
 
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
        }
        
            //System.out.println("ELSE LOOP" + organization);
            
         
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JComboBoxOrganization;
    private javax.swing.JComboBox JComboBoxOrganizationEmp;
    private javax.swing.JTextField JTextFieldName;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables

    private void populateOrganizationComboBox() {
        JComboBoxOrganization.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            JComboBoxOrganization.addItem(organization);
            
        }
    }

    private void populateOrganizationEmpComboBox() {
        JComboBoxOrganizationEmp.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            JComboBoxOrganizationEmp.addItem(organization);
        }
    }
}
