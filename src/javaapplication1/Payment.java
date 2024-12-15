/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import static java.awt.PageAttributes.MediaType.C;
import java.awt.event.KeyEvent;
import javaapplication1.Accept;
import javaapplication1.overlay;

public class Payment extends javax.swing.JFrame {
    
    
    overlay over = new overlay();
    Accept accept = new Accept(over);
    String med, store, price, num, total;
    public Payment() {
        initComponents();
    }
    overlay overN;
    public Payment (overlay overN, String med, String store, String price, String num, String total) {
        initComponents();
        this.overN=overN;
        this.med = med;
        this.store = store;
        this.price = price;
        this.num = num;
        this.total = total;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gCash = new javax.swing.JCheckBox();
        cashOn = new javax.swing.JCheckBox();
        payMaya = new javax.swing.JCheckBox();
        acc = new javaapplication1.FButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(340, 385));

        jPanel2.setBackground(new java.awt.Color(242, 249, 241));
        jPanel2.setForeground(new java.awt.Color(242, 249, 241));
        jPanel2.setPreferredSize(new java.awt.Dimension(340, 385));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment");

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\arvsa\\Documents\\NetBeansProjects\\JavaApplication1\\src\\java_images\\gcash_1_99x80.jpg")); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(97, 90));

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\arvsa\\Documents\\NetBeansProjects\\JavaApplication1\\src\\java_images\\maya_99x80.jpg")); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(97, 90));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\arvsa\\Documents\\NetBeansProjects\\JavaApplication1\\src\\java_images\\cash-on-delivery-badge-ilustration-free-vector_1_99x80.jpg")); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(97, 90));

        gCash.setBackground(new java.awt.Color(255, 255, 255));
        gCash.setText("GCash");
        gCash.setContentAreaFilled(false);
        gCash.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gCash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gCashActionPerformed(evt);
            }
        });

        cashOn.setBackground(new java.awt.Color(255, 255, 255));
        cashOn.setText("COD");
        cashOn.setContentAreaFilled(false);
        cashOn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cashOn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cashOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashOnActionPerformed(evt);
            }
        });

        payMaya.setBackground(new java.awt.Color(255, 255, 255));
        payMaya.setText("PayMaya");
        payMaya.setContentAreaFilled(false);
        payMaya.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payMaya.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payMaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payMayaActionPerformed(evt);
            }
        });

        acc.setBackground(new java.awt.Color(92, 113, 94));
        acc.setText("Accept");
        acc.setFillClick(new java.awt.Color(153, 153, 153));
        acc.setFillOriginal(new java.awt.Color(92, 113, 94));
        acc.setFillOver(new java.awt.Color(92, 113, 94));
        acc.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(payMaya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(gCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cashOn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gCash)
                    .addComponent(cashOn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(payMaya))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.setVisible(false);
        overN.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void cashOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashOnActionPerformed
        if (cashOn.isSelected()){
            accept.paidThru.setText("Cash On Delivery");
            accept.paidPrice.setText("0");
            accept.TotPrice.setText(total);
            Transactions.AddRowToJTable(new Object[]{ 
                                            med,
                                            store,
                                            num,
                                            total,
                                            "COD"
                                        });
        } 
    }//GEN-LAST:event_cashOnActionPerformed

    private void gCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gCashActionPerformed

        if (gCash.isSelected()){
            accept.paidThru.setText("GCash Payment Method");
            accept.paidPrice.setText("-"+total);
            accept.TotPrice.setText("0.00");
            Transactions.AddRowToJTable(new Object[]{ 
                                            med,
                                            store,
                                            num,
                                            total,
                                            "Gcash"
                                        });
        } 
    }//GEN-LAST:event_gCashActionPerformed

    private void payMayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payMayaActionPerformed
        if (payMaya.isSelected()){
            accept.paidThru.setText("PayMaya Payment Method");
            accept.paidPrice.setText("-"+total);
            accept.TotPrice.setText("0.00");
            Transactions.AddRowToJTable(new Object[]{ 
                                            med,
                                            store,
                                            num,
                                            total,
                                            "PayMaya"
                                        });
        } 
    }//GEN-LAST:event_payMayaActionPerformed

    private void accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accActionPerformed
        overN.setVisible(false);
        accept.item.setText(med);
        accept.price.setText(total);
        accept.quan.setText(num);
                
        
        over.setVisible(true);
        over.pack();
        over.setLocationRelativeTo(null);
        
        
        accept.setVisible(true);
        accept.pack();
        accept.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_accActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaapplication1.FButton acc;
    private javax.swing.JCheckBox cashOn;
    private javax.swing.JCheckBox gCash;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox payMaya;
    // End of variables declaration//GEN-END:variables
}
