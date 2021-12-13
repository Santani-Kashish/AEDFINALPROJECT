/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ReceptionWorkArea;

import Business.Organization.Organization;
import Business.RegularExpressionCheck;
import java.awt.CardLayout;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sreshtha
 */
public class PatientRegistrationForm extends javax.swing.JPanel {

    /**
     * Creates new form RecipientRegistrationForm
     */
    JPanel container;
    Organization organization;
    
    
    public PatientRegistrationForm(JPanel container, Organization organization) {
        initComponents();
        this.container = container;
        this.organization = organization;
        groupButton1();
        groupButton2();

    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        radioBtnMale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textEmailID = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAddress = new javax.swing.JTextArea();
        textContactNumber = new javax.swing.JTextField();
        jComboBoxBloodGroup = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textSignature = new javax.swing.JTextField();
        btnFemale = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(120, 0, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Baskerville", 1, 23)); // NOI18N
        jLabel10.setText("Gender :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(600, 420, 110, 30);

        jLabel1.setFont(new java.awt.Font("Baskerville", 1, 36)); // NOI18N
        jLabel1.setText("Patient Registration Form");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(177, 20, 437, 47);

        jLabel2.setFont(new java.awt.Font("Baskerville", 1, 23)); // NOI18N
        jLabel2.setText("Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(136, 99, 90, 29);

        jLabel13.setFont(new java.awt.Font("Baskerville", 1, 23)); // NOI18N
        jLabel13.setText("Email Id :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(104, 390, 110, 30);

        btnSubmit.setBackground(new java.awt.Color(0, 0, 0));
        btnSubmit.setFont(new java.awt.Font("Baskerville", 1, 23)); // NOI18N
        btnSubmit.setText("Submit ↩");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.setBorderPainted(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit);
        btnSubmit.setBounds(380, 600, 375, 39);

        jLabel14.setFont(new java.awt.Font("Baskerville", 1, 23)); // NOI18N
        jLabel14.setText("Address :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(120, 250, 110, 30);

        radioBtnMale.setBackground(new java.awt.Color(255, 255, 255));
        radioBtnMale.setFont(new java.awt.Font("Baskerville", 1, 23)); // NOI18N
        radioBtnMale.setText("Male");
        jPanel1.add(radioBtnMale);
        radioBtnMale.setBounds(750, 420, 104, 39);

        jLabel9.setFont(new java.awt.Font("Baskerville", 1, 23)); // NOI18N
        jLabel9.setText("Signature :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(85, 460, 130, 30);

        jLabel11.setFont(new java.awt.Font("Baskerville", 1, 23)); // NOI18N
        jLabel11.setText("Contact Number :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(31, 170, 200, 30);

        textEmailID.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jPanel1.add(textEmailID);
        textEmailID.setBounds(270, 390, 219, 33);

        textAddress.setColumns(20);
        textAddress.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        textAddress.setRows(5);
        jScrollPane3.setViewportView(textAddress);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(270, 240, 219, 108);

        textContactNumber.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jPanel1.add(textContactNumber);
        textContactNumber.setBounds(270, 160, 219, 33);

        jComboBoxBloodGroup.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jComboBoxBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O-positive", "O-negative ", "A-positive", "A-negative", "B-positive", "B-negative", "AB-positive", "AB-negative" }));
        jPanel1.add(jComboBoxBloodGroup);
        jComboBoxBloodGroup.setBounds(740, 360, 223, 33);

        jLabel3.setFont(new java.awt.Font("Baskerville", 1, 23)); // NOI18N
        jLabel3.setText("Age :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(640, 310, 110, 30);

        textName.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jPanel1.add(textName);
        textName.setBounds(264, 95, 222, 33);

        textSignature.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        textSignature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSignatureActionPerformed(evt);
            }
        });
        jPanel1.add(textSignature);
        textSignature.setBounds(270, 460, 219, 36);

        btnFemale.setBackground(new java.awt.Color(255, 255, 255));
        btnFemale.setFont(new java.awt.Font("Baskerville", 1, 23)); // NOI18N
        btnFemale.setText("Female");
        jPanel1.add(btnFemale);
        btnFemale.setBounds(860, 420, 105, 39);

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
        jPanel1.add(btnBack);
        btnBack.setBounds(6, 6, 165, 39);

        jLabel4.setFont(new java.awt.Font("Baskerville", 1, 23)); // NOI18N
        jLabel4.setText("Blood Group :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(540, 360, 155, 30);

        textAge.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jPanel1.add(textAge);
        textAge.setBounds(730, 310, 219, 33);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(757, 295, 0, 0);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(670, 80, 234, 0);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(962, 962, 962)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                .addGap(138, 138, 138)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String sex="";
        if(radioBtnMale.isSelected())
        sex = radioBtnMale.getText();
        if(btnFemale.isSelected())
        sex = btnFemale.getText();

        String sign = textSignature.getText();
        String name = textName.getText();
        String contactNum = textContactNumber.getText();
        String emailAdd = textEmailID.getText();

        if(name.equals("") || sex.equals("") || sign.equals("") || emailAdd.equals("") || contactNum.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all the details.");
            return;
        }

        int age;

        try
        {

            age =  Integer.parseInt(textAge.getText());

            if(age > 120 || age < 18){
                JOptionPane.showMessageDialog(null , "Please enter correct age.");
                textAge.setText("");
                return;
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null , "Age should be numeric.");
            textAge.setText("");
            return;
        }

        //check valid name
        if(!RegularExpressionCheck.findRE(name) || !RegularExpressionCheck.findRE(sign)){
            JOptionPane.showMessageDialog(null, "Please enter valid name.");
            return;
        }
        //check for valid emailId
        if(!RegularExpressionCheck.isValidEmailAddress(emailAdd)){
            JOptionPane.showMessageDialog(null, " Invalid Username." +
                "Username should be an email-ID with '_' and '@' as the only allowed special characters but should not start with '_'");
            return;
        }
        //check valid phone number
        if(!RegularExpressionCheck.isValidPhoneNum(contactNum)){
            JOptionPane.showMessageDialog(null, " Invalid phonenumber." +
                "Phone number should be 10 digit number between 0-9.");
            return;
        }

        Object bloodGroup = jComboBoxBloodGroup.getSelectedItem();

        String address = textAddress.getText();
        //String date = dateTextField.getText();
        String organ;

        if(organization != null && organization.getPatientDirectory() != null){
            organization.getPatientDirectory().addPatient(name, age, sex, (String) bloodGroup,
                contactNum, address, sign, emailAdd);
            JOptionPane.showMessageDialog(null, "You have registered successfully.");

            clearFields();
            container.remove(this);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.previous(container);
        }

        //JOptionPane.showMessageDialog(null, "Organ Recipient Form Created Successfully");
        //jTextArea1.setText("");

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void textSignatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSignatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSignatureActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        //        Component[] componentArray ;
        //        for(Component c : container.getComponents()){
            //        if(c instanceof ManageHospitalVisitors){
                //        ManageHospitalVisitors sysAdminwjp = (ManageHospitalVisitors) c;}
            //        // sysAdminwjp.populateTree();
            //        }
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void groupButton1() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioBtnMale);
        buttonGroup.add(btnFemale);
    }
    
    private void groupButton2() {
        ButtonGroup buttonGroup = new ButtonGroup();
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox jComboBoxBloodGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JRadioButton radioBtnMale;
    private javax.swing.JTextArea textAddress;
    private javax.swing.JTextField textAge;
    private javax.swing.JTextField textContactNumber;
    private javax.swing.JTextField textEmailID;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textSignature;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
            textName.setText("");
            textAge.setText("");
            textContactNumber.setText("");
            textEmailID.setText("");
            textAddress.setText("");
            textSignature.setText("");
    }
}