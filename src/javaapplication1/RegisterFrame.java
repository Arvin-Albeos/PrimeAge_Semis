/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.sql.PreparedStatement;
import java.awt.Color;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class RegisterFrame extends javax.swing.JFrame {


    public RegisterFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        signUp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        birth = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        gen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        condi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        medi = new javax.swing.JTextField();
        bckButton = new javaapplication1.FButton();
        nxtButton = new javaapplication1.FButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 51));
        setSize(new java.awt.Dimension(416, 697));

        jPanel1.setBackground(new java.awt.Color(242, 249, 241));
        jPanel1.setForeground(new java.awt.Color(242, 249, 241));
        jPanel1.setMaximumSize(new java.awt.Dimension(416, 642));
        jPanel1.setMinimumSize(new java.awt.Dimension(416, 642));

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

        signUp.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        signUp.setForeground(new java.awt.Color(92, 113, 94));
        signUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUp.setText("Register");
        signUp.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(92, 113, 94));
        jLabel1.setText("Elderly's Profile:");

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel2.setText("Full Name (Last Name, First Name):");

        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel3.setText("Birthdate (mm/dd/yyyy):");

        birth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                birthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                birthFocusLost(evt);
            }
        });
        birth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel4.setText("Age:");

        age.setText(" ");
        age.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel5.setText("Gender:");

        gen.setToolTipText("");
        gen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                genFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                genFocusLost(evt);
            }
        });
        gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel6.setText("Current Medical Condition/s:");

        condi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                condiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                condiFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel7.setText("Current Medication/s:");

        medi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mediFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mediFocusLost(evt);
            }
        });
        medi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediActionPerformed(evt);
            }
        });

        bckButton.setBackground(new java.awt.Color(92, 113, 94));
        bckButton.setText("Back");
        bckButton.setFillClick(new java.awt.Color(153, 153, 153));
        bckButton.setFillOriginal(new java.awt.Color(92, 113, 94));
        bckButton.setFillOver(new java.awt.Color(92, 113, 94));
        bckButton.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        bckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckButtonActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(birth, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(condi, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medi, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nxtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(signUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(condi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nxtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genActionPerformed

    private void mediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediActionPerformed

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
//        if (name.getText().equals("Enter name here")) {
//            name.setText("");
//            name.setForeground(Color.BLACK); // Normal input style
//        }
    }//GEN-LAST:event_nameFocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
//        if (name.getText().isEmpty()) {
//            name.setText("Enter name here");
//            name.setForeground(Color.GRAY);
//        }     
    }//GEN-LAST:event_nameFocusLost

    private void birthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_birthFocusGained
//        if (birth.getText().equals("Enter birthdate here")) {
//            birth.setText("");
//            birth.setForeground(Color.BLACK); // Normal input style
//        }
    }//GEN-LAST:event_birthFocusGained

    private void birthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_birthFocusLost
//        if (birth.getText().isEmpty()) {
//            birth.setText("Enter birthdate here");
//            birth.setForeground(Color.GRAY);
//        }
    }//GEN-LAST:event_birthFocusLost

    private void ageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFocusGained
//        if (age.getText().equals("Enter age here")) {
//            age.setText("");
//            age.setForeground(Color.BLACK); 
//        }
    }//GEN-LAST:event_ageFocusGained

    private void ageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFocusLost
//        if (age.getText().isEmpty()) {
//            age.setText("Enter age here");
//            age.setForeground(Color.GRAY);
//        }
    }//GEN-LAST:event_ageFocusLost

    private void genFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genFocusGained
//        if (gen.getText().equals("Enter gender here")) {
//            gen.setText("");
//            gen.setForeground(Color.BLACK); // Normal input style
//        }// TODO add your handling code here:
    }//GEN-LAST:event_genFocusGained

    private void genFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genFocusLost
//        if (gen.getText().isEmpty()) {
//            gen.setText("Enter gender here");
//            gen.setForeground(Color.GRAY);
//        }
    }//GEN-LAST:event_genFocusLost

    private void condiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_condiFocusGained
//        if (condi.getText().equals("Enter health conditions here")) {
//            condi.setText("");
//            condi.setForeground(Color.BLACK); // Normal input style
//        }
    }//GEN-LAST:event_condiFocusGained

    private void condiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_condiFocusLost
//        if (condi.getText().isEmpty()) {
//            condi.setText("Enter health conditions here");
//            condi.setForeground(Color.GRAY);
//        }
    }//GEN-LAST:event_condiFocusLost

    private void mediFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mediFocusGained
//        if (medi.getText().equals("Enter medications here")) {
//            medi.setText("");
//            medi.setForeground(Color.BLACK); // Normal input style
//        }
    }//GEN-LAST:event_mediFocusGained

    private void mediFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mediFocusLost
//        if (medi.getText().isEmpty()) {
//            medi.setText("Enter medications here");
//            medi.setForeground(Color.GRAY);
//        }
    }//GEN-LAST:event_mediFocusLost

    private void birthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthActionPerformed

    private void bckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckButtonActionPerformed
        Login sec = new Login();
        sec.setVisible(true);
        sec.pack();
        sec.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_bckButtonActionPerformed

    private void nxtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtButtonActionPerformed
        String userN, birthD, ageD, gender, medC, med;
        
        
        System.out.println("CLICKED!");
        userN = name.getText();
        birthD = birth.getText();
        ageD = age.getText();
        gender = gen.getText();
        medC = condi.getText();
        med = medi.getText();
        
        
        if ("".equals(userN)) {
            JOptionPane.showMessageDialog(new JFrame(), "Full name is required!", "Full Name Error", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(birthD)) {
            JOptionPane.showMessageDialog(new JFrame(), "Birthdate is required!", "Birthdate Error", JOptionPane.ERROR_MESSAGE);
        } else if (ageD.equals("")) {
            JOptionPane.showMessageDialog(new JFrame(), "Age is required!", "Age Error", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(gender)) {
            JOptionPane.showMessageDialog(new JFrame(), "Gender is required!", "Gender Error", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(medC)) {
            JOptionPane.showMessageDialog(new JFrame(), "Write N/A if none", "Medical Condition Error", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(med)) {
            JOptionPane.showMessageDialog(new JFrame(), "Write N/A if none", "Medication Error", JOptionPane.ERROR_MESSAGE);
        } else if (!userN.matches("[a-zA-Z\\s,]+")) {
            JOptionPane.showMessageDialog(new JFrame(), "No special characters and numbers", "Full Name Error", JOptionPane.ERROR_MESSAGE);
        } else if (!birthD.matches("[0-9/]+")) {
            JOptionPane.showMessageDialog(new JFrame(), "Birthdate must only contain numbers and '/'!", "Birthdate Error", JOptionPane.ERROR_MESSAGE);
        } else if (ageD.length() > 3) {
            JOptionPane.showMessageDialog(new JFrame(), "Age exceeds human capacity!", "Age Error", JOptionPane.ERROR_MESSAGE);
        } else {           
            RegisterFrame1 reg2 = new RegisterFrame1();
            reg2.setVisible(true);
            reg2.pack();
            reg2.setLocationRelativeTo(null);
            this.setVisible(false);
            
        }
        
        
        
        /*
        
        String SUrl, SUser, SPass;
        SUrl = "jdbc:mysql://localhost:3306/java_user_database";
        SUser = "root";
        SPass = "";
        

        try (Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            PreparedStatement ps = con.prepareStatement("INSERT INTO user(fullName, birthDate, age, gender, medCon, med) VALUES (?, ?, ?, ?, ?, ?)")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if ("".equals(name.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Full name is required!", "ERROR", JOptionPane.ERROR_MESSAGE);
            
            } else if ("".equals(birth.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Birth Date is required!", "ERROR", JOptionPane.ERROR_MESSAGE);
                
            } else if ("".equals(age.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Age is required!", "ERROR", JOptionPane.ERROR_MESSAGE);
                
            } else if ("".equals(gen.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Gender is required!", "ERROR", JOptionPane.ERROR_MESSAGE);
                
            } else if ("".equals(condi.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Medical Condition is required!", "ERROR", JOptionPane.ERROR_MESSAGE);
                
            } else if ("".equals(medi.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Medication is required!", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                userN = name.getText();
                birthD = birth.getText();
                ageD = age.getText();
                gender = gen.getText();
                medC = condi.getText();
                med = medi.getText();


                ps.setString(1, userN);
                ps.setString(2, birthD);
                ps.setString(3, ageD);
                ps.setString(4, gender);
                ps.setString(5, medC);
                ps.setString(6, med);

                // Execute query
                ps.executeUpdate();

                // Clear fields
                name.setText("");
                birth.setText("");
                age.setText("");
                gen.setText("");
                condi.setText("");
                medi.setText("");


                RegisterFrame1 reg2 = new RegisterFrame1();
                reg2.setVisible(true);
                reg2.pack();
                reg2.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage() + "\nPlease follow indicated fields", "ERROR", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javaapplication1.FButton bckButton;
    private javax.swing.JTextField birth;
    private javax.swing.JTextField condi;
    private javax.swing.JTextField gen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField medi;
    private javax.swing.JTextField name;
    private javaapplication1.FButton nxtButton;
    private javax.swing.JLabel signUp;
    // End of variables declaration//GEN-END:variables

    private void showMessageDialog(Object object, String account_Created_Successfully) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
