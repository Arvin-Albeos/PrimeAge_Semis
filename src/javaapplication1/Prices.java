/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.awt.Color;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author arvsa
 */
public class Prices extends javax.swing.JFrame {
    Transactions transact = new Transactions();
    /**
     * Creates new form Interface
     */
    public Prices() {
        initComponents();
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
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        fButton1 = new javaapplication1.FButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        task = new javax.swing.JLabel();
        prof = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        act = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        transactions = new javaapplication1.FButton();
        purchase = new javaapplication1.FButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        fButton1.setBackground(new java.awt.Color(92, 113, 94));
        fButton1.setText("Accept");
        fButton1.setFillClick(new java.awt.Color(153, 153, 153));
        fButton1.setFillOriginal(new java.awt.Color(92, 113, 94));
        fButton1.setFillOver(new java.awt.Color(92, 113, 94));
        fButton1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        fButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(242, 249, 241));
        jPanel1.setForeground(new java.awt.Color(242, 249, 241));

        jPanel2.setBackground(new java.awt.Color(182, 205, 189));
        jPanel2.setForeground(new java.awt.Color(182, 205, 189));
        jPanel2.setPreferredSize(new java.awt.Dimension(416, 114));

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\arvsa\\Documents\\NetBeansProjects\\JavaApplication1\\src\\java_images\\Tablet_Capsule_optimized.png")); // NOI18N
        jLabel1.setOpaque(true);

        task.setBackground(new java.awt.Color(182, 205, 189));
        task.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        task.setIcon(new javax.swing.ImageIcon("C:\\Users\\arvsa\\Documents\\NetBeansProjects\\JavaApplication1\\src\\java_images\\Task_List_optimized.png")); // NOI18N
        task.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        task.setOpaque(true);
        task.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taskMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                taskMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                taskMouseExited(evt);
            }
        });

        prof.setBackground(new java.awt.Color(182, 205, 189));
        prof.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prof.setIcon(new javax.swing.ImageIcon("C:\\Users\\arvsa\\Documents\\NetBeansProjects\\JavaApplication1\\src\\java_images\\person_optimized.png")); // NOI18N
        prof.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prof.setOpaque(true);
        prof.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(93, 115, 95));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Home");

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(93, 115, 95));
        jLabel7.setText("Activities");

        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(93, 115, 95));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tasks");

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(93, 115, 95));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Profile");

        home.setBackground(new java.awt.Color(182, 205, 189));
        home.setForeground(new java.awt.Color(255, 153, 51));
        home.setIcon(new javax.swing.ImageIcon("C:\\Users\\arvsa\\Documents\\NetBeansProjects\\JavaApplication1\\src\\java_images\\Home_1_optimized.png")); // NOI18N
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setOpaque(true);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(93, 115, 95));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Prices");

        act.setBackground(new java.awt.Color(182, 205, 189));
        act.setForeground(new java.awt.Color(254, 254, 254));
        act.setIcon(new javax.swing.ImageIcon("C:\\Users\\arvsa\\Documents\\NetBeansProjects\\JavaApplication1\\src\\java_images\\directions_walk_optimized.png")); // NOI18N
        act.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        act.setOpaque(true);
        act.setPreferredSize(new java.awt.Dimension(45, 45));
        act.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(task, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prof, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(task, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(home)
                    .addComponent(act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(182, 205, 189));
        jPanel3.setForeground(new java.awt.Color(182, 205, 189));

        jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\arvsa\\Documents\\NetBeansProjects\\JavaApplication1\\src\\java_images\\PrimeAgeLogo-1_optimized-removebg-preview.png")); // NOI18N
        jLabel32.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel32AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel40.setFont(new java.awt.Font("Ebrima", 1, 40)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(93, 115, 95));
        jLabel40.setText("PrimeAge");

        jLabel13.setFont(new java.awt.Font("Ebrima", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(93, 115, 95));
        jLabel13.setText("Where We Take You Back To Your Prime");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel11))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel27.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(93, 115, 95));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Prices");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel27.setIconTextGap(5);

        search.setForeground(new java.awt.Color(153, 153, 153));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jTable3.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"AMOXICILLIN", "Rose Pharmacy", "67.00"},
                {"AMOXICILLIN", "Mercury Drug Store", "69.50"},
                {"AMOXICILLIN", "ThreeSixty Pharmacy", "69.00"},
                {"ATORVASTATIN", "Mercury Drug Store", "17.25"},
                {"ATORVASTATIN", "Rose Pharmacy", "16.50"},
                {"ATORVASTATIN", "Watsons", "18.00"},
                {"BIOGESIC - 10 Tabs", "La Nueva Pharmacy", "42.50"},
                {"BIOGESIC - 10 Tabs", "Mercury Drug Store", "44.50"},
                {"BIOGESIC - 10 Tabs", "Queen's Pharmacy", "45.10"},
                {"CEFALEXIN", "Med Solution Pharmacy", "5.50"},
                {"CEFALEXIN", "Rose Pharmacy", "4.75"},
                {"CEFALEXIN", "La Nueva Pharmacy", "5.25"},
                {"CETIRIZINE - 10 Tabs", "Rose Pharmacy", "95.00"},
                {"CETIRIZINE - 10 Tabs", "Med Solutions Pharmacy", "99.50"},
                {"CETIRIZINE - 10 Tabs", "Watsons ", "154.99"},
                {"DECOLGEN", "ThreeSixty Pharmacy", "7.50"},
                {"DECOLGEN", "Watsons", "8.00"},
                {"DECOLGEN", "Queen's Pharmacy", "7.75"},
                {"MULTIVITAMINS", "ThreeSixty Pharmacy", "57.25"},
                {"MULTIVITAMINS", "Rose Pharmacy", "55.00"},
                {"MULTIVITAMINS", "Generika Pharmacy", "56.75"},
                {"NEOZEP", "La Nueva Pharmacy", "10.00"},
                {"NEOZEP", "Rose Pharmacy", "10.50"},
                {"NEOZEP", "ThreeSixty Pharmacy", "10.25"},
                {"TEMPRA", "Watsons", "4.25"},
                {"TEMPRA ", "Mercury Drug Store", "6.00"},
                {"TEMPRA", "Med Solutions Pharmacy", "5.50"}
            },
            new String [] {
                "Medicine", "Store", "Price"
            }
        ));
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable3.setShowGrid(true);
        jScrollPane3.setViewportView(jTable3);

        transactions.setBackground(new java.awt.Color(92, 113, 94));
        transactions.setText("Transactions");
        transactions.setFillClick(new java.awt.Color(153, 153, 153));
        transactions.setFillOriginal(new java.awt.Color(92, 113, 94));
        transactions.setFillOver(new java.awt.Color(92, 113, 94));
        transactions.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        transactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsActionPerformed(evt);
            }
        });

        purchase.setBackground(new java.awt.Color(92, 113, 94));
        purchase.setText("Purchase");
        purchase.setFillClick(new java.awt.Color(153, 153, 153));
        purchase.setFillOriginal(new java.awt.Color(92, 113, 94));
        purchase.setFillOver(new java.awt.Color(92, 113, 94));
        purchase.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(search)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void profMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profMouseEntered
        prof.setForeground(Color.WHITE);
        prof.setBackground(Color.WHITE);
    }//GEN-LAST:event_profMouseEntered

    private void profMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profMouseExited
        prof.setForeground(Color.decode("#B6CDBD"));
        prof.setBackground(Color.decode("#B6CDBD"));
    }//GEN-LAST:event_profMouseExited

    private void profMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profMouseClicked
        Profile profile = new Profile();
        profile.setVisible(true);
        profile.pack();
        profile.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_profMouseClicked

    private void taskMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskMouseEntered
        task.setForeground(Color.WHITE);
        task.setBackground(Color.WHITE);
    }//GEN-LAST:event_taskMouseEntered

    private void taskMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskMouseExited
        task.setForeground(Color.decode("#B6CDBD"));
        task.setBackground(Color.decode("#B6CDBD"));
    }//GEN-LAST:event_taskMouseExited

    private void taskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskMouseClicked
        Tasks tasking = new Tasks();
        tasking.setVisible(true);
        tasking.pack();
        tasking.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_taskMouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        home.setForeground(Color.WHITE);
        home.setBackground(Color.WHITE);// TODO add your handling code here:
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        home.setForeground(Color.decode("#B6CDBD"));
        home.setBackground(Color.decode("#B6CDBD"));// TODO add your handling code here:
    }//GEN-LAST:event_homeMouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        Home homeP = new Home();
        homeP.setVisible(true);
        homeP.pack();
        homeP.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_homeMouseClicked

    private void actMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actMouseEntered
        act.setForeground(Color.WHITE);
        act.setBackground(Color.WHITE);// TODO add your handling code here:
    }//GEN-LAST:event_actMouseEntered

    private void actMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actMouseExited
        act.setForeground(Color.decode("#B6CDBD"));
        act.setBackground(Color.decode("#B6CDBD"));// TODO add your handling code here:
    }//GEN-LAST:event_actMouseExited

    private void actMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actMouseClicked
        Activities acts = new Activities();
        acts.setVisible(true);
        acts.pack();
        acts.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_actMouseClicked

    private void jLabel32AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel32AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel32AncestorAdded

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
       DefaultTableModel ob = (DefaultTableModel) jTable3.getModel();
       TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
       jTable3.setRowSorter(obj);
       obj.setRowFilter(RowFilter.regexFilter(search.getText()));
    }//GEN-LAST:event_searchKeyReleased

    private void fButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButton1ActionPerformed

    }//GEN-LAST:event_fButton1ActionPerformed

    private void transactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsActionPerformed
        transact.setVisible(true);
        transact.pack();
        transact.setLocationRelativeTo(null);
    }//GEN-LAST:event_transactionsActionPerformed

    private void purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseActionPerformed
        transact.setVisible(false);
        transact.pack();
        transact.setLocationRelativeTo(null);
        
        overlay over = new overlay();
        over.setVisible(true);
        over.pack();
        over.setLocationRelativeTo(null);
        

        int index = jTable3.getSelectedRow();
        TableModel model = jTable3.getModel();
        
        String medicine = model.getValueAt(index, 0).toString();
        String store = model.getValueAt(index, 1).toString();
        String price = model.getValueAt(index, 2).toString();        
        
        Purchase purchase = new Purchase(over, transact);
        purchase.setVisible(true);
        purchase.pack();
        purchase.setLocationRelativeTo(null);
        
        purchase.fMed.setText(medicine);
        purchase.fStore.setText(store);
        purchase.fPrice.setText(price);
    }//GEN-LAST:event_purchaseActionPerformed

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
            java.util.logging.Logger.getLogger(Prices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel act;
    private javaapplication1.FButton fButton1;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel prof;
    private javaapplication1.FButton purchase;
    private javax.swing.JTextField search;
    private javax.swing.JLabel task;
    private javaapplication1.FButton transactions;
    // End of variables declaration//GEN-END:variables
}
