/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.OrganMatchWorkArea;

import Business.ECOSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Donor;
import Business.Person.Recipient;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userInterface.AdminWorkSpace.SystemAdminWorkArea;

/**
 *
 * @author patol
 */
public class ManageOrganMatchJPanel extends javax.swing.JPanel {

   JPanel rightPanel;
   ECOSystem ecoSystem;
    /**
     * Creates new form OrganMatchByDonorJPanel
     */
    public ManageOrganMatchJPanel(JPanel rightPanel, ECOSystem eco) {
        initComponents();
        this.ecoSystem = eco;
        this.rightPanel = rightPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMatching = new javax.swing.JButton();
        btnReceiving = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        btnMatching.setBackground(new java.awt.Color(255, 204, 204));
        btnMatching.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnMatching.setText("Match Organ by Donor availability");
        btnMatching.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMatching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatchingActionPerformed(evt);
            }
        });

        btnReceiving.setBackground(new java.awt.Color(255, 204, 204));
        btnReceiving.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnReceiving.setText("Match Organ by Recipient severity");
        btnReceiving.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReceiving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceivingActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText(" Back");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReceiving, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMatching, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(480, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnMatching, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReceiving, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReceivingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceivingActionPerformed
      
        List<Recipient> recipientList = createListOfRecipients();
        if(recipientList.size() > 0){
            OrganMatchByRecipientJPanel organMatch = new OrganMatchByRecipientJPanel(rightPanel, ecoSystem, recipientList);
            rightPanel.add("organMatch", organMatch);
            CardLayout layout = (CardLayout) rightPanel.getLayout();
            layout.next(rightPanel);
        }else {
            JOptionPane.showMessageDialog(null, "Currently there are no recipients.");
        }
    }//GEN-LAST:event_btnReceivingActionPerformed

    private void btnMatchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatchingActionPerformed
        
        List<Donor> donorList = createListOfDonors();
        if(donorList.size() > 0){
            OrganMatchByDonorJPanel organMatch = new OrganMatchByDonorJPanel(rightPanel, ecoSystem, donorList);
            rightPanel.add("organMatch", organMatch);
            CardLayout layout = (CardLayout) rightPanel.getLayout();
            layout.next(rightPanel);
        }else {
            JOptionPane.showMessageDialog(null, "Currently there are no donors.");
        }
    }//GEN-LAST:event_btnMatchingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SystemAdminWorkArea manageCitiesJPanel = new SystemAdminWorkArea(rightPanel,ecoSystem);
        rightPanel.add("manageCitiesJPanel", manageCitiesJPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatching;
    private javax.swing.JButton btnReceiving;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

 private List<Recipient> createListOfRecipients() {
        
        List<Recipient> recipientList = new ArrayList<Recipient>();
        
        for (Network network : ecoSystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof HospitalEnterprise){
                    for(Organization or : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if(or.getName().equals("Visitor Organization")){
                            for( Recipient recipient : or.getRecipientDirectory().getRecipientList()){
                                  if(recipient.getPriority() > 0){
                                      recipient.setNetwork(network.getName());
                                      recipientList.add(recipient);
                                  }
                            }
                        }
                    }
                }
                
            }
        }
        
       // List<Map.Entry<String, Recipient>> list = new ArrayList<Map.Entry<String, Recipient>>(recipientList.entrySet());
        //sort recipient list by their sevirity
        Collections.sort(recipientList, new Comparator<Recipient>() {
            @Override
            public int compare(Recipient o1, Recipient o2) {
                return o1.compareTo(o2);
            }
        });
        
        return recipientList;
    }

    private List<Donor> createListOfDonors() {
        
         List<Donor> donorList = new ArrayList<Donor>();
         
        for (Network network : ecoSystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof HospitalEnterprise){
                    for (Organization or : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (or.getName().equalsIgnoreCase("Visitor Organization")) {
                            for (Donor donor : or.getDonorDirectory().getDonorList()) {
                                if(donor.getIsOrganAvaiNow()){

                                    donor.setNetwork(network.getName());
                                    donorList.add(donor);
                                }
                            }
                        }

                    }
                }
                
            }
        }
        
        return donorList;
    }
}
