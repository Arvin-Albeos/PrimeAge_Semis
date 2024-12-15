/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.awt.event.KeyEvent;

import javaapplication1.overlay;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UpdateGuardian extends javax.swing.JFrame {
    overlay over;
    public UpdateGuardian() {
        initComponents();
    }

    public UpdateGuardian (overlay over) {
        initComponents();
        this.over=over;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fullN = new javax.swing.JTextField();
        ageR = new javax.swing.JTextField();
        rltsp = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        nxtButton = new javaapplication1.FButton();
        contacT = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        addrs = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(242, 249, 241));
        jPanel2.setForeground(new java.awt.Color(242, 249, 241));
        jPanel2.setPreferredSize(new java.awt.Dimension(380, 450));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(93, 115, 95));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\arvsa\\Documents\\NetBeansProjects\\JavaApplication1\\src\\java_images\\PrimeAgeLogo-1_optimized-removebg-preview.png")); // NOI18N
        jLabel1.setText("PrimeAge");

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setText("Update Guardian's Information");

        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel9.setText("Full Name:");

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel11.setText("Age:");

        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel12.setText("Relationship");

        jLabel13.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel13.setText("Email:");

        jLabel14.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel14.setText("Contact #:");

        rltsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rltspActionPerformed(evt);
            }
        });

        nxtButton.setBackground(new java.awt.Color(92, 113, 94));
        nxtButton.setText("Next");
        nxtButton.setFillClick(new java.awt.Color(153, 153, 153));
        nxtButton.setFillOriginal(new java.awt.Color(92, 113, 94));
        nxtButton.setFillOver(new java.awt.Color(92, 113, 94));
        nxtButton.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        nxtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtButtonActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel15.setText("Address:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nxtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fullN)
                                        .addComponent(ageR)
                                        .addComponent(rltsp)
                                        .addComponent(em)
                                        .addComponent(addrs)
                                        .addComponent(contacT, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGap(39, 39, 39)
                            .addComponent(jLabel8))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fullN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rltsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(contacT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(addrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(nxtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
       
        
        this.setVisible(false);
        over.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void rltspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rltspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rltspActionPerformed

    private void nxtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtButtonActionPerformed
        String guardian, ageG, relationshiP, email, conNum, houseAdd;


        guardian = fullN.getText();
        ageG = ageR.getText();
        relationshiP = rltsp.getText();
        email = em.getText();
        conNum = contacT.getText();
        houseAdd = addrs.getText();

        if ("".equals(guardian)) {
            JOptionPane.showMessageDialog(new JFrame(), "Full name is required!", "Username Error", JOptionPane.ERROR_MESSAGE);
        } else if (ageG.equals("")) {
            JOptionPane.showMessageDialog(new JFrame(), "Age is required!", "Age Error", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(relationshiP)) {
            JOptionPane.showMessageDialog(new JFrame(), "Relationship is required!", "Relationship Error", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(email)) {
            JOptionPane.showMessageDialog(new JFrame(), "Email Address is required!", "Email Address Error", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(conNum)) {
            JOptionPane.showMessageDialog(new JFrame(), "Contact Number is required", "Contact Number Error", JOptionPane.ERROR_MESSAGE);
        } else if (!conNum.matches("[0-9/]+")) {
            JOptionPane.showMessageDialog(new JFrame(), "Contact number must only contain numbers!", "Contact # Error", JOptionPane.ERROR_MESSAGE);
        }  else if ("".equals(houseAdd)) {
            JOptionPane.showMessageDialog(new JFrame(), "Address is required", "Address Error", JOptionPane.ERROR_MESSAGE);
        } else if (!guardian.matches("[a-zA-Z\\s,]+")) {
            JOptionPane.showMessageDialog(new JFrame(), "No special characters and numbers", "Username Error", JOptionPane.ERROR_MESSAGE);
        } else if (ageG.length() > 3) {
            JOptionPane.showMessageDialog(new JFrame(), "Age exceeds human capacity!", "Age Error", JOptionPane.ERROR_MESSAGE);
        } else if (conNum.length() > 11 && conNum.length() < 11)  {
            JOptionPane.showMessageDialog(new JFrame(), "Number is not 11 digits!", "Number Error", JOptionPane.ERROR_MESSAGE);
        } else {
            
            Profile profile = new Profile();
            profile.guardianName.setText(guardian);
            profile.age.setText(ageG);
            profile.relationship.setText(relationshiP);
            profile.email.setText(email);
            profile.contact.setText(conNum);
            profile.address.setText(houseAdd);
            profile.pack();
            profile.setVisible(true);
            profile.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        /*

        String SUrl, SUser, SPass;

        SUrl = "jdbc:mysql://localhost:3306/java_user_database";
        SUser = "root";
        SPass = "";

        try (Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            PreparedStatement ps = con.prepareStatement("INSERT INTO guardian(guardianName, guardianAge, relationship, email, number, address) VALUES (?, ?, ?, ?, ?, ?)")) {
            Class.forName("com.mysql.cj.jdbc.Driver");

            if ("".equals(name.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Full name is required!", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ("".equals(age.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Age is required!", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ("".equals(relationship.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Relationship with the elderly is required!", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ("".equals(email.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Email is highly required!", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ("".equals(num.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Contact Number is highly required!", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ("".equals(add.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Address is highly required!", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                userN = name.getText();
                ageD = age.getText();
                relate = relationship.getText();
                emailAdd = email.getText();
                number = num.getText();
                address = add.getText();

                ps.setString(1, userN);
                ps.setString(2, ageD);
                ps.setString(3, relate);
                ps.setString(4, emailAdd);
                ps.setString(5, number);
                ps.setString(6, address);

                // Execute query
                ps.executeUpdate();

                // Clear fields
                name.setText("");
                age.setText("");
                relationship.setText("");
                email.setText("");
                num.setText("");
                add.setText("");

                FinalReg fin = new FinalReg ();
                fin.setVisible(true);
                fin.pack();
                fin.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } */
    }//GEN-LAST:event_nxtButtonActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(UpdateGuardian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateGuardian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateGuardian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateGuardian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateGuardian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addrs;
    private javax.swing.JTextField ageR;
    private javax.swing.JTextField contacT;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fullN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javaapplication1.FButton nxtButton;
    private javax.swing.JTextField rltsp;
    // End of variables declaration//GEN-END:variables
}
