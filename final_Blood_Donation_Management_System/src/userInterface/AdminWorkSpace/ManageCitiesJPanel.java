/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdminWorkSpace;

import Business.Environment;
import Business.Network.Network;
import Business.RegularExpressionCheck;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manita
 */
public class ManageCitiesJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Environment system;

    /**
     * Creates new form ManageCitiesJPanel
     */
    public ManageCitiesJPanel(JPanel rightPanel, Environment system) {
        initComponents();
        this.userProcessContainer = rightPanel;
        this.system = system;
        populateNetworkTable();
        networkJTable.getTableHeader().setFont(new Font("Baskerville", Font.ITALIC, 20));
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network.getName();
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
        networkJTable = new javax.swing.JTable();
        textfieldCity = new javax.swing.JTextField();
        textCity = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(120, 0, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setForeground(new java.awt.Color(120, 0, 0));
        setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        networkJTable.setAutoCreateRowSorter(true);
        networkJTable.setBackground(new java.awt.Color(120, 0, 0));
        networkJTable.setFont(new java.awt.Font("Myanmar MN", 3, 23)); // NOI18N
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "City "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        networkJTable.setGridColor(new java.awt.Color(51, 0, 51));
        networkJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(networkJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 400, 90));

        textfieldCity.setBackground(new java.awt.Color(120, 0, 0));
        textfieldCity.setForeground(new java.awt.Color(255, 255, 255));
        textfieldCity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textfieldCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldCityActionPerformed(evt);
            }
        });
        add(textfieldCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 220, 30));

        textCity.setBackground(new java.awt.Color(0, 0, 0));
        textCity.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        textCity.setForeground(new java.awt.Color(255, 255, 255));
        textCity.setText("＋ Add new City : ");
        add(textCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 270, -1));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 120, 40));

        btnSubmit.setBackground(new java.awt.Color(0, 0, 0));
        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit  ↩");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.setBorderPainted(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 120, 40));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 394, -1, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkArea sysAdminwjp = (SystemAdminWorkArea) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String name = textfieldCity.getText();

        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Field Error");
            return;
        } else {
            if (!RegularExpressionCheck.findRE(name)) {
                JOptionPane.showMessageDialog(null, "Invalid Name");
                return;
            }
        }

        int flag = 1;
        for (int i = 0; i < system.getNetworkList().size(); i++) {
            if (system.getNetworkList().get(i).getName().equalsIgnoreCase(name)) {
                flag = 0;
            }
        }
        if (flag == 1) {
            Network network = system.createAndAddNetwork();
            network.setName(name);
            textfieldCity.setText("");
            populateNetworkTable();
        } else {
            JOptionPane.showMessageDialog(null, "Pre-existing City Name");
            textfieldCity.setText("");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void textfieldCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable networkJTable;
    private javax.swing.JLabel textCity;
    private javax.swing.JTextField textfieldCity;
    // End of variables declaration//GEN-END:variables
}
