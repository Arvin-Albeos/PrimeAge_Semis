/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.awt.Color;

/**
 *
 * @author arvsa
 */
public class Home extends javax.swing.JFrame {
    RegisterFrame fname;
    RegisterFrame fbirth;
    RegisterFrame fage;
    RegisterFrame fgen;
    RegisterFrame fcondi;
    RegisterFrame fmedi;
    
    public Home() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        med = new javax.swing.JLabel();
        task = new javax.swing.JLabel();
        prof = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        act = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medCon = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        healthCon = new javax.swing.JTextArea();
        nameLabel = new javax.swing.JLabel();
        bDate = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        genD = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        service = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(242, 249, 241));
        jPanel1.setForeground(new java.awt.Color(242, 249, 241));

        jPanel2.setBackground(new java.awt.Color(182, 205, 189));
        jPanel2.setForeground(new java.awt.Color(182, 205, 189));
        jPanel2.setPreferredSize(new java.awt.Dimension(416, 114));

        med.setBackground(new java.awt.Color(182, 205, 189));
        med.setIcon(new javax.swing.ImageIcon("C:\\Users\\arvsa\\Documents\\NetBeansProjects\\JavaApplication1\\src\\java_images\\Tablet_Capsule_optimized.png")); // NOI18N
        med.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        med.setOpaque(true);
        med.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                medMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                medMouseExited(evt);
            }
        });

        task.setBackground(new java.awt.Color(182, 205, 189));
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

        homeLabel.setBackground(new java.awt.Color(255, 255, 255));
        homeLabel.setForeground(new java.awt.Color(182, 205, 189));
        homeLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\arvsa\\Documents\\NetBeansProjects\\JavaApplication1\\src\\java_images\\Home_1_optimized.png")); // NOI18N
        homeLabel.setToolTipText("Home");
        homeLabel.setOpaque(true);
        homeLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                homeLabelMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                homeLabelMouseMoved(evt);
            }
        });
        homeLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                homeLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                homeLabelFocusLost(evt);
            }
        });
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelMouseExited(evt);
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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(med)
                        .addGap(36, 36, 36)
                        .addComponent(act)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeLabel)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(task)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prof)
                    .addComponent(jLabel10))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prof, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(task, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(med)
                    .addComponent(act, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeLabel))
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

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\arvsa\\Documents\\NetBeansProjects\\JavaApplication1\\src\\java_images\\PrimeAgeLogo-1_optimized-removebg-preview.png")); // NOI18N
        jLabel11.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel11AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 40)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(93, 115, 95));
        jLabel12.setText("PrimeAge");

        jLabel13.setFont(new java.awt.Font("Ebrima", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(93, 115, 95));
        jLabel13.setText("Where We Take You Back To Your Prime");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel13))
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(92, 113, 94));
        jLabel15.setText("Name: ");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(92, 113, 94));
        jLabel16.setText("Birthdate:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(92, 113, 94));
        jLabel17.setText("Age:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(92, 113, 94));
        jLabel18.setText("Gender:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(92, 113, 94));
        jLabel19.setText("Current Health Conditions/s: ");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(92, 113, 94));
        jLabel20.setText("Current Medication/s: ");

        medCon.setColumns(20);
        medCon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        medCon.setRows(5);
        medCon.setText("Amoxicillin; Tempra");
        jScrollPane1.setViewportView(medCon);

        healthCon.setColumns(20);
        healthCon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        healthCon.setRows(5);
        healthCon.setText("Pneumonia; Arthritis; High Blood; Fever");
        jScrollPane2.setViewportView(healthCon);

        nameLabel.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        nameLabel.setText("Albeos, Juan G Sr");

        bDate.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        bDate.setText("03/31/1934");

        age.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        age.setText("76");

        genD.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        genD.setText("Male");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addComponent(jLabel19)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addGap(37, 37, 37)
                            .addComponent(genD, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bDate, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(bDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(age))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(genD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel21.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(93, 115, 95));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Daily Health Tips and Reminders");

        jPanel5.setBackground(new java.awt.Color(254, 254, 254));

        jLabel22.setBackground(new java.awt.Color(254, 254, 254));
        jLabel22.setFont(new java.awt.Font("Ebrima", 3, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(93, 115, 95));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Don't forget to take medications");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel27.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(92, 113, 94));
        jLabel27.setText("Elderly's Profile:");

        service.setBackground(new java.awt.Color(242, 249, 241));
        service.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        service.setForeground(new java.awt.Color(92, 113, 94));
        service.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        service.setIcon(new javax.swing.ImageIcon("C:\\Users\\arvsa\\Documents\\NetBeansProjects\\JavaApplication1\\src\\java_images\\person_optimized.png")); // NOI18N
        service.setText("Professional Services");
        service.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        service.setOpaque(true);
        service.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                serviceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                serviceMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
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

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        homeLabel.setForeground(Color.WHITE);
        homeLabel.setBackground(Color.WHITE);
    }//GEN-LAST:event_homeLabelMouseClicked

    private void homeLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseMoved

    }//GEN-LAST:event_homeLabelMouseMoved

    private void homeLabelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseDragged

    }//GEN-LAST:event_homeLabelMouseDragged

    private void homeLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_homeLabelFocusGained

    }//GEN-LAST:event_homeLabelFocusGained

    private void homeLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_homeLabelFocusLost

    }//GEN-LAST:event_homeLabelFocusLost

    private void homeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseEntered

    }//GEN-LAST:event_homeLabelMouseEntered

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseExited

    }//GEN-LAST:event_homeLabelMouseExited

    private void taskMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskMouseEntered
        task.setForeground(Color.WHITE);
        task.setBackground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_taskMouseEntered

    private void taskMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskMouseExited
        task.setForeground(Color.decode("#B6CDBD"));
        task.setBackground(Color.decode("#B6CDBD"));        // TODO add your handling code here:
    }//GEN-LAST:event_taskMouseExited

    private void taskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskMouseClicked
        Tasks tasking = new Tasks();
        tasking.setVisible(true);
        tasking.pack();
        tasking.setLocationRelativeTo(null);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_taskMouseClicked

    private void profMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profMouseEntered
        prof.setForeground(Color.WHITE);
        prof.setBackground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_profMouseEntered

    private void profMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profMouseExited
        prof.setForeground(Color.decode("#B6CDBD"));
        prof.setBackground(Color.decode("#B6CDBD"));        // TODO add your handling code here:
    }//GEN-LAST:event_profMouseExited

    private void profMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profMouseClicked
        Profile profile = new Profile();
        profile.setVisible(true);
        profile.pack();
        profile.setLocationRelativeTo(null);
        this.setVisible(false);        
    }//GEN-LAST:event_profMouseClicked

    private void actMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actMouseEntered
        act.setForeground(Color.WHITE);
        act.setBackground(Color.WHITE);       
    }//GEN-LAST:event_actMouseEntered

    private void actMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actMouseExited
        act.setForeground(Color.decode("#B6CDBD"));
        act.setBackground(Color.decode("#B6CDBD"));        // TODO add your handling code here:
    }//GEN-LAST:event_actMouseExited

    private void actMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actMouseClicked
        Activities acts = new Activities();
        acts.setVisible(true);
        acts.pack();
        acts.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }//GEN-LAST:event_actMouseClicked

    private void medMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMouseEntered
        med.setForeground(Color.WHITE);
        med.setBackground(Color.WHITE);         
    }//GEN-LAST:event_medMouseEntered

    private void medMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMouseExited
        med.setForeground(Color.decode("#B6CDBD"));
        med.setBackground(Color.decode("#B6CDBD"));
    }//GEN-LAST:event_medMouseExited

    private void medMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMouseClicked
        Prices meds = new Prices();
        meds.setVisible(true);
        meds.pack();
        meds.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_medMouseClicked

    private void jLabel11AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel11AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11AncestorAdded

    private void serviceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceMouseClicked
        overlay over = new overlay();
        over.setVisible(true);
        over.pack();
        over.setLocationRelativeTo(null);
        
        Service services = new Service(over);
        services.setVisible(true);
        services.pack();
        services.setLocationRelativeTo(null);
    }//GEN-LAST:event_serviceMouseClicked

    private void serviceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceMouseEntered
        service.setBackground(Color.decode("#B6CDBD"));
        service.setForeground(Color.decode("#5C715E"));
    }//GEN-LAST:event_serviceMouseEntered

    private void serviceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceMouseExited
        service.setBackground(Color.decode("#FFFFFF"));
        service.setForeground(Color.decode("#5C715E"));
    }//GEN-LAST:event_serviceMouseExited

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel act;
    public javax.swing.JLabel age;
    public javax.swing.JLabel bDate;
    public javax.swing.JLabel genD;
    public javax.swing.JTextArea healthCon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel med;
    public javax.swing.JTextArea medCon;
    public javax.swing.JLabel nameLabel;
    private javax.swing.JLabel prof;
    private javax.swing.JLabel service;
    private javax.swing.JLabel task;
    // End of variables declaration//GEN-END:variables
}
