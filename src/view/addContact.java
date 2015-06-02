/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.contact_controler;
import javax.swing.JOptionPane;
import model.contact_model;
import validation.AutoGenerate;
import validation.Validate;

/**
 *
 * @author Kasun
 */
public class addContact extends javax.swing.JDialog {

    /**
     * Creates new form addContact
     */
    String id;
    public addContact(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        id = AutoGenerate.getNextID("contact", "id", "CO");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        wor_mobile = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtHome = new javax.swing.JTextField();
        wor_home = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOther = new javax.swing.JTextArea();
        btnCreate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Create Contact");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-add-icon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, -1));

        jLabel3.setText("* Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 88, -1, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 85, 330, -1));

        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 330, 110));

        jLabel5.setText("* Mobile");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        txtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileActionPerformed(evt);
            }
        });
        txtMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileKeyReleased(evt);
            }
        });
        jPanel1.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 360, -1));

        wor_mobile.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(wor_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 180, 20));

        jLabel6.setText("Home No");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        txtHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHomeActionPerformed(evt);
            }
        });
        txtHome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHomeKeyReleased(evt);
            }
        });
        jPanel1.add(txtHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 360, -1));

        wor_home.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(wor_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 180, 20));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 360, -1));

        jLabel7.setText("Other");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        txtOther.setColumns(20);
        txtOther.setRows(5);
        jScrollPane2.setViewportView(txtOther);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 360, 100));

        btnCreate.setText("Create Contact");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, -1, -1));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 80, -1));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 80, -1));

        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home_green.png"))); // NOI18N
        lblHome.setToolTipText("Go to home page");
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });
        jPanel1.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileActionPerformed

    private void txtHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHomeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtName.setText(null);
        txtAddress.setText(null);
        txtMobile.setText(null);
        txtHome.setText(null);
        txtEmail.setText(null);
        txtOther.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtMobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileKeyReleased
        // TODO add your handling code here:
        Validate.ValidateTP(txtMobile, wor_mobile);
    }//GEN-LAST:event_txtMobileKeyReleased

    private void txtHomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHomeKeyReleased
        // TODO add your handling code here:
        Validate.ValidateTP(txtHome, wor_home);
    }//GEN-LAST:event_txtHomeKeyReleased

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new mainWindow(null, true).setVisible(true);
    }//GEN-LAST:event_lblHomeMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        contact_model c_model=new contact_model();
        c_model.setId(id);
        c_model.setName(txtName.getText());
        c_model.setAddress(txtAddress.getText());
        c_model.setMobile(txtMobile.getText());
        c_model.setHome(txtHome.getText());
        c_model.setEmail(txtEmail.getText());
        c_model.setOther(txtOther.getText());
        
        if(txtName.getText().equals("") || txtMobile.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Fill Requred fields.");
        }else{
            contact_controler.add_contact(c_model);
            this.dispose();
            new addContact(null, true).setVisible(true);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

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
            java.util.logging.Logger.getLogger(addContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addContact dialog = new addContact(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHome;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHome;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtOther;
    private javax.swing.JLabel wor_home;
    private javax.swing.JLabel wor_mobile;
    // End of variables declaration//GEN-END:variables
}