/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.DoctorWorkArea;

import Business.Account.MainAcc;
import Business.Environment;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Patient;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kashish
 */
public class PatientTestRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    JPanel container;
    Enterprise enterprise;
    private MainAcc account;
    Environment business;
    String patient = null;

    public PatientTestRequestJPanel(JPanel container, Enterprise enterprise, MainAcc account, Environment business) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        populateDropdown();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        PatientName = new javax.swing.JComboBox();
        btnResultStatus = new javax.swing.JButton();
        btnAdviceTest = new javax.swing.JButton();
        jRadiobtnYes = new javax.swing.JRadioButton();
        jRadioBtnNo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(120, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Patient");

        btnResultStatus.setBackground(new java.awt.Color(0, 0, 0));
        btnResultStatus.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        btnResultStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnResultStatus.setText("Plasma Request Status");
        btnResultStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResultStatus.setBorderPainted(false);
        btnResultStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultStatusActionPerformed(evt);
            }
        });

        btnAdviceTest.setBackground(new java.awt.Color(0, 0, 0));
        btnAdviceTest.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        btnAdviceTest.setForeground(new java.awt.Color(255, 255, 255));
        btnAdviceTest.setText("Request Plasma");
        btnAdviceTest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdviceTest.setBorderPainted(false);
        btnAdviceTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdviceTestActionPerformed(evt);
            }
        });

        jRadiobtnYes.setText("Plasma Required");
        jRadiobtnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadiobtnYesActionPerformed(evt);
            }
        });

        jRadioBtnNo.setText("Plasma Not Required");
        jRadioBtnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2))
                    .addComponent(btnAdviceTest, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadiobtnYes)
                        .addGap(74, 74, 74)
                        .addComponent(jRadioBtnNo))
                    .addComponent(btnResultStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(542, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadiobtnYes)
                    .addComponent(jRadioBtnNo))
                .addGap(73, 73, 73)
                .addComponent(btnAdviceTest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btnResultStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    void populateDropdown() {
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
 
        if(enterprise.getPatientDirectory()!= null)
        {
            for (Patient d : o.getPatientDirectory().getPatientsList()) {
                PatientName.addItem(d.getEmailAdd().trim()+"--"+d.getBloodGroup());
               
            }
        }
        
        }

    }

   
    private void btnResultStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultStatusActionPerformed
        List<String> tests = new ArrayList<>();

        DoctorActivityJPanel patientTestRequestJPanel = new DoctorActivityJPanel(container, enterprise, account, (String) PatientName.getItemAt(PatientName.getSelectedIndex()), tests, patient);
        container.add("DoctorActivityJPanel", patientTestRequestJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnResultStatusActionPerformed

    private void btnAdviceTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdviceTestActionPerformed
      if (jRadiobtnYes.isSelected() == false && jRadioBtnNo.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Select an Option");
            return;
        }
        if (jRadiobtnYes.isSelected()) {
            LabTestWorkRequest request = new LabTestWorkRequest();
            request.setMessage("Blood Sample Required");
            request.setSender(account);
            request.setStatus("Sent");
           
            String patientSelected = (String)PatientName.getItemAt(PatientName.getSelectedIndex());
           String[] data = patientSelected.split("--");
           
           request.setPatientName(data[0]);
           request.setPatientBloodGroup(data[1]);

            
            if (business != null) {
                business.getWorkQueue().getWorkRequestList().add(request);
                account.getWorkQueue().getWorkRequestList().add(request);
            }
            JOptionPane.showMessageDialog(null, "Blood Request has been sent");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No blood tranfusion required");
        }
    }//GEN-LAST:event_btnAdviceTestActionPerformed

    private void jRadiobtnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadiobtnYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadiobtnYesActionPerformed

    private void jRadioBtnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBtnNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox PatientName;
    private javax.swing.JButton btnAdviceTest;
    private javax.swing.JButton btnResultStatus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioBtnNo;
    private javax.swing.JRadioButton jRadiobtnYes;
    // End of variables declaration//GEN-END:variables
}
