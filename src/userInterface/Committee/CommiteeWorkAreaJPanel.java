/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Committee;


import Business.Account.Account;
import Business.ECOSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CommitteeAdminOrganization;

import Business.Organization.Organization;
import Business.Organization.PlasmaBankOrganization;

import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patol
 */
public class CommiteeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommiteeWorkAreaJPanel
     */
    JPanel rightPanel;
    Account account;
    Organization organization;
    ECOSystem business;
    Enterprise enterprise;
    public CommiteeWorkAreaJPanel(JPanel rightPanel, Account account, Organization organization, ECOSystem business) {
        initComponents();
        this.rightPanel = rightPanel;
        this.account = account;
        this.business = business;
        this.organization = (CommitteeAdminOrganization)organization;
        //refreshJButton.setVisible(false);
        populateTable();
        tblWorkRequest.getTableHeader().setFont(new Font("Times New Roman" , Font.ITALIC,23));

    }
   
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblWorkRequest.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : business.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
             row[2] = request.getPatientBloodGroup();
             row[3] = ((LabTestWorkRequest)request).getPatientName();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[5] = request.getStatus();
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnSendTransportReq = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblWorkRequest.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Blood Group", "Patient Name", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 1090, 180));

        btnAssign.setBackground(new java.awt.Color(0, 0, 0));
        btnAssign.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Request Plasma Bank");
        btnAssign.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssign.setBorderPainted(false);
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 300, 40));

        btnSendTransportReq.setBackground(new java.awt.Color(0, 0, 0));
        btnSendTransportReq.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnSendTransportReq.setForeground(new java.awt.Color(255, 255, 255));
        btnSendTransportReq.setText("Request Transportation");
        btnSendTransportReq.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSendTransportReq.setBorderPainted(false);
        btnSendTransportReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendTransportReqActionPerformed(evt);
            }
        });
        add(btnSendTransportReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 300, 40));

        btnRefresh.setBackground(new java.awt.Color(0, 0, 0));
        btnRefresh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.setBorderPainted(false);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 150, 150, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendTransportReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendTransportReqActionPerformed
        int selectedRow = tblWorkRequest.getSelectedRow();

        if(tblWorkRequest.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "No rows present to select.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        LabTestWorkRequest request = (LabTestWorkRequest)tblWorkRequest.getValueAt(selectedRow, 0);

       if(!request.getStatus().equals("Available"))
       {
            JOptionPane.showMessageDialog(null, "Plasma not available to proceed", "Warning", JOptionPane.WARNING_MESSAGE);
       }
       else
       {
           request.setStatus("Transport");
           request.setReceiver(account);
           JOptionPane.showMessageDialog(null, "Request has been sent to transportation", "Warning", JOptionPane.WARNING_MESSAGE);
       }
        
    }//GEN-LAST:event_btnSendTransportReqActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        int selectedRow = tblWorkRequest.getSelectedRow();

        if(tblWorkRequest.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "No rows present to select.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest request = (WorkRequest)tblWorkRequest.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Processing");
        JOptionPane.showMessageDialog(null, "Assigned successfully", "Warning", JOptionPane.WARNING_MESSAGE);

        populateTable();
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSendTransportReq;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}
