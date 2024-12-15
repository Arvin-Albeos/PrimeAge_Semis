/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import java.awt.Color;
import java.awt.event.KeyEvent;

import java.sql.PreparedStatement;
import java.awt.Color;
import java.awt.HeadlessException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    String userN, passW;
   public Login() {
        initComponents();
    }

    public Login(String passLength, String user) {
        initComponents();
        this.userN=user;
        this.passW=passLength;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        log = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        signUp = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        passBox = new javax.swing.JCheckBox();
        login = new javaapplication1.FButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 51));
        setSize(new java.awt.Dimension(416, 690));

        jPanel1.setBackground(new java.awt.Color(242, 249, 241));
        jPanel1.setForeground(new java.awt.Color(242, 249, 241));

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

        log.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        log.setForeground(new java.awt.Color(92, 113, 94));
        log.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        log.setText("LOGIN");

        label1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(92, 113, 94));
        label1.setText("Username:");

        user.setToolTipText("Your username");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(92, 113, 94));
        label2.setText("Password:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Don't have an account?");

        signUp.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        signUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUp.setText("Sign Up");
        signUp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpMouseExited(evt);
            }
        });

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        passBox.setBackground(new java.awt.Color(254, 254, 254));
        passBox.setText("See Password");
        passBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passBoxActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(92, 113, 94));
        login.setText("Login");
        login.setFillClick(new java.awt.Color(153, 153, 153));
        login.setFillOriginal(new java.awt.Color(92, 113, 94));
        login.setFillOver(new java.awt.Color(92, 113, 94));
        login.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pass)
                            .addComponent(passBox)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signUp)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(log)
                .addGap(30, 30, 30)
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passBox)
                .addGap(7, 7, 7)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(signUp))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\arvsa\\Documents\\NetBeansProjects\\PrimeAge_Semis\\src\\main\\java\\com\\mycompany\\primeage_semis\\PrimeAgeLogo 1 (1).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void signUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseEntered
        signUp.setForeground(Color.blue);
    }//GEN-LAST:event_signUpMouseEntered

    private void signUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseExited
        signUp.setForeground(Color.black);
    }//GEN-LAST:event_signUpMouseExited

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked
        RegisterFrame reg = new RegisterFrame();
        reg.setVisible(true);
        reg.pack();
        reg.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_signUpMouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void passBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passBoxActionPerformed
        if (passBox.isSelected()){
            pass.setEchoChar((char)0);
        } else {
            pass.setEchoChar('*');
        }
    }//GEN-LAST:event_passBoxActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        /*
        String userN, passW, query, fname = null, passDb = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
        SUser = "root";
        SPass = "";
        int notFound = 0;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(user.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Username is required", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(pass.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else {
            userN = user.getText();
            passW = pass.getText();
            
            query = "SELECT * FROM account WHERE UserName = '"+userN+"'";
       
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                passDb = rs.getString("PassWord");
                fname = rs.getString("UserName");
                notFound = 1;
            }
            if(notFound == 1 && passW.equals(passDb)){
                
                Interface inter = new Interface();
                inter.setVisible(true);
                inter.pack();
                inter.setLocationRelativeTo(null); 
                
                this.dispose();
            }else{
               JOptionPane.showMessageDialog(new JFrame(), "Incorrect email or password", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            pass.setText("");
            
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
           System.out.println("Error!" + e.getMessage()); 
        } */
        char[] passWord = pass.getPassword();
        String passwordLng = new String(passWord);
        
        if ("".equals(user.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Username is required", "Error",
                        JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(pass.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error",
                        JOptionPane.ERROR_MESSAGE);
        } else if (!(user.getText().equals(userN))) {
            JOptionPane.showMessageDialog(new JFrame(), "Incorrect Username\nPlease try again", "Error",
                        JOptionPane.ERROR_MESSAGE);
        }  else if (passwordLng.length()<8) {
            JOptionPane.showMessageDialog(new JFrame(), "Password less than 8 character\nPlease try again", "Error",
                        JOptionPane.ERROR_MESSAGE);
        }  else if (!(pass.getText().equals(passW))) {
            JOptionPane.showMessageDialog(new JFrame(), "Incorrect Password\nPlease try again", "Error",
                        JOptionPane.ERROR_MESSAGE);
        }
        
        if (user.getText().equals(userN) && pass.getText().equals(passW)) {
            Home inter = new Home();
            inter.setVisible(true);
            inter.pack();
            inter.setLocationRelativeTo(null); 
            this.setVisible(false);
        }
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel log;
    private javaapplication1.FButton login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JCheckBox passBox;
    private javax.swing.JLabel signUp;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
