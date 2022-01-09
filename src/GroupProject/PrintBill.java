
/*
  Advanced Java Programming (CIT-285-02)
  Instructor: Liz Miller 
  Group Project: Backery Shop Management System
  Auther: Code Learners Group
  Date: 12/01/2018
*/ 


package GroupProject;

import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrintBill extends javax.swing.JPanel {
// declare variables
    int discount = 0;
    Connection con;
    ResultSet rs;
    Statement s;
    float calculate = 0;
    int i = 1, y = 0;

    /**
     * Creates new form AddItem
     */ 
    public PrintBill() {

        initComponents();
        jtitemname.setText("");
        jtquantity.setText("");
        jtmemberid.setText("");
        jradio2.setVisible(false);
        jradio5.setVisible(false);
        jradio7.setVisible(false);
        jlmemberid.setVisible(false);
        jtmemberid.setVisible(false);
        jldiscount.setVisible(false);
        // generate random number for bill number
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        jlbillnumber.setText(randomInt + "");
        discount = 0;
        calculate = 0;
        i = 1;
        try {
            // connect to data base
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakeryshop", "baker", "bestbaker");
        } catch (SQLException ex) {
            Logger.getLogger(PrintBill.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgmembership = new javax.swing.ButtonGroup();
        bgdiscount = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jbreset = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtableprintbill = new javax.swing.JTable();
        jryes = new javax.swing.JRadioButton();
        jrno = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        jtitemname = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtquantity = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jlmemberid = new javax.swing.JLabel();
        jtmemberid = new javax.swing.JTextField();
        jbadditem = new javax.swing.JButton();
        jlbillnumber = new javax.swing.JLabel();
        jldiscount = new javax.swing.JLabel();
        jradio2 = new javax.swing.JRadioButton();
        jradio5 = new javax.swing.JRadioButton();
        jradio7 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jtgrosstotal = new javax.swing.JTextField();
        jbprint = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jbcalculate = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 102));

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        jLabel20.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 204, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroupProject/billnumber.png"))); // NOI18N
        jLabel20.setText("Bill Number:");

        jbreset.setBackground(new java.awt.Color(255, 255, 153));
        jbreset.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jbreset.setForeground(new java.awt.Color(0, 0, 102));
        jbreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroupProject/reset.png"))); // NOI18N
        jbreset.setText("Reset");
        jbreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbresetActionPerformed(evt);
            }
        });

        jtableprintbill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Unit Price", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableprintbill.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jtableprintbill);
        if (jtableprintbill.getColumnModel().getColumnCount() > 0) {
            jtableprintbill.getColumnModel().getColumn(0).setResizable(false);
            jtableprintbill.getColumnModel().getColumn(1).setResizable(false);
            jtableprintbill.getColumnModel().getColumn(2).setResizable(false);
            jtableprintbill.getColumnModel().getColumn(3).setResizable(false);
        }

        bgmembership.add(jryes);
        jryes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recource/yes.png"))); // NOI18N
        jryes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jryesActionPerformed(evt);
            }
        });

        bgmembership.add(jrno);
        jrno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recource/no.png"))); // NOI18N
        jrno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrnoActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 204, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroupProject/bakery-logo-design-bread-basket-barley-icons-decor-cover.png"))); // NOI18N
        jLabel23.setText("Product Name:");

        jtitemname.setBackground(new java.awt.Color(204, 204, 255));
        jtitemname.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jtitemname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtitemname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtitemnameActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 204, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Quantity:");

        jtquantity.setBackground(new java.awt.Color(204, 204, 255));
        jtquantity.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jtquantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtquantity.setPreferredSize(new java.awt.Dimension(3, 16));
        jtquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtquantityActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 204, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Membership:");

        jlmemberid.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        jlmemberid.setForeground(new java.awt.Color(255, 204, 255));
        jlmemberid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlmemberid.setText("Member ID:");

        jtmemberid.setBackground(new java.awt.Color(204, 204, 255));
        jtmemberid.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jtmemberid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtmemberid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtmemberidActionPerformed(evt);
            }
        });
        jtmemberid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtmemberidKeyReleased(evt);
            }
        });

        jbadditem.setBackground(new java.awt.Color(255, 255, 153));
        jbadditem.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jbadditem.setForeground(new java.awt.Color(0, 0, 153));
        jbadditem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroupProject/additem.jpg"))); // NOI18N
        jbadditem.setText("Add Item");
        jbadditem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbadditemActionPerformed(evt);
            }
        });

        jlbillnumber.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jryes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jrno)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jlmemberid, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jtmemberid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                                .addComponent(jbadditem, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbreset, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jtitemname, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbillnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtitemname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)
                        .addComponent(jtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbillnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbadditem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbreset, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlmemberid)
                                .addComponent(jtmemberid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jryes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jldiscount.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        jldiscount.setForeground(new java.awt.Color(255, 204, 255));
        jldiscount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroupProject/discount.png"))); // NOI18N
        jldiscount.setText(" Discount:");

        bgdiscount.add(jradio2);
        jradio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroupProject/2.png"))); // NOI18N
        jradio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradio2ActionPerformed(evt);
            }
        });

        bgdiscount.add(jradio5);
        jradio5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroupProject/5.png"))); // NOI18N
        jradio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradio5ActionPerformed(evt);
            }
        });

        bgdiscount.add(jradio7);
        jradio7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroupProject/7.png"))); // NOI18N
        jradio7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradio7ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroupProject/equal.png"))); // NOI18N
        jLabel2.setText("Gross Total:");

        jtgrosstotal.setBackground(new java.awt.Color(204, 204, 255));
        jtgrosstotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtgrosstotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtgrosstotalActionPerformed(evt);
            }
        });

        jbprint.setBackground(new java.awt.Color(255, 255, 153));
        jbprint.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jbprint.setForeground(new java.awt.Color(0, 0, 102));
        jbprint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroupProject/printer.png"))); // NOI18N
        jbprint.setText("Print");
        jbprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbprintActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 153));
        jButton3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroupProject/cancel.png"))); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jbcalculate.setBackground(new java.awt.Color(255, 255, 153));
        jbcalculate.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jbcalculate.setForeground(new java.awt.Color(0, 0, 102));
        jbcalculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroupProject/calculate.png"))); // NOI18N
        jbcalculate.setText("Calculate");
        jbcalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbprint, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jldiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jradio2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jradio5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jradio7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtgrosstotal)
                                    .addComponent(jbcalculate, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))))
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jradio5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jradio7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jradio2))
                        .addComponent(jbcalculate))
                    .addComponent(jldiscount, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtgrosstotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jbprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbresetActionPerformed
        // TODO add your handling code here:
        jtitemname.setText("");
        jtquantity.setText("");
        jtmemberid.setText("");
        discount = 0;
        y = 0;
        calculate = 0;
        
        jtgrosstotal.setText("");
        jradio2.setVisible(false);
        jradio5.setVisible(false);
        jradio7.setVisible(false);
        jlmemberid.setVisible(false);
        jtmemberid.setVisible(false);
        jldiscount.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) jtableprintbill.getModel();
        model.removeRow(0);
    }//GEN-LAST:event_jbresetActionPerformed

    private void jtitemnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtitemnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtitemnameActionPerformed

    private void jtquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtquantityActionPerformed

    private void jtmemberidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtmemberidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtmemberidActionPerformed

    private void jradio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradio2ActionPerformed
        // TODO add your handling code here:
        discount = 2;
    }//GEN-LAST:event_jradio2ActionPerformed

    private void jradio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradio5ActionPerformed
        // TODO add your handling code here:
        discount = 5;
    }//GEN-LAST:event_jradio5ActionPerformed

    private void jbprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbprintActionPerformed
        // TODO add your handling code here:
        jtitemname.setText("");
        jtquantity.setText("");
        jtmemberid.setText("");
        discount = 0;
        calculate = 0;
        jradio2.setVisible(false);
        jradio5.setVisible(false);
        jradio7.setVisible(false);
        jlmemberid.setVisible(false);
        jtmemberid.setVisible(false);
        jldiscount.setVisible(false);
        
        jtgrosstotal.setText("");
        y = 0;
        JOptionPane.showMessageDialog(null, "Bill Printed Successfully");
        try {
             // connect to data base
            PreparedStatement st = (PreparedStatement) 
             // insert the data to transaction table in data base
            con.prepareStatement("INSERT INTO `bakery`.`transactions`(`billnumber`, `billamount`) VALUES (?,?);");
            st.setString(1, jlbillnumber.getText());
            st.setString(2, jtgrosstotal.getText());
            st.executeUpdate();// call the function
            st.close();

        } catch (SQLException ex) {
            //Logger.getLogger(PrintBill.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbprintActionPerformed

    private void jrnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrnoActionPerformed
        // TODO add your handling code here:
        jlmemberid.setVisible(false);
        jtmemberid.setVisible(false);
        jradio2.setVisible(false);
        jradio5.setVisible(false);
        jradio7.setVisible(false);
        jldiscount.setVisible(false);
        y = 0;
    }//GEN-LAST:event_jrnoActionPerformed

    private void jbcalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcalculateActionPerformed

        //jttotal.setText(calculate+"");
        float grosstotal = calculate - calculate * discount / 100;
        jtgrosstotal.setText(grosstotal + "");
    }//GEN-LAST:event_jbcalculateActionPerformed

    private void jryesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jryesActionPerformed

        jlmemberid.setVisible(true);
        jtmemberid.setVisible(true);
        jradio2.setVisible(true);
        jradio5.setVisible(true);
        jradio7.setVisible(true);
        jldiscount.setVisible(true);
        y = 1;
    }//GEN-LAST:event_jryesActionPerformed

    private void jbadditemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbadditemActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception ex) {

        }
        try {
            PreparedStatement state = null;
            // get data
            String itemname = jtitemname.getText();
            String quantity = jtquantity.getText();

            // validat input 
            if (itemname.equals("")||quantity.equals("")||quantity.equals("")) {
                JOptionPane.showMessageDialog (this, "You have left one or more Fields BLANK", "ALERT!!!", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(this, "Please Enter the data");
          
            } else {
                // read data from the data base in table food
                String query = "SELECT sellingprice FROM `bakeryshop`.`Food` WHERE itemname='" + itemname + "';";
                state = (PreparedStatement) con.prepareStatement(query);
                rs = state.executeQuery();
                int o = 0;
                if (rs.next()) {
                    o++;
                }
                if (o == 0) {
                    JOptionPane.showMessageDialog(null, "Item out of stock");

                    jtitemname.setText("");
                } else {

                    if (quantity.equals("")) {
                        JOptionPane.showMessageDialog(null, "Enter the quantity");
                    } else {
                        
                        if (Integer.parseInt(quantity) <= 0) {
                            JOptionPane.showMessageDialog(null, "Not enough quantity available");
                        }
                        if (y == 1) {
                            if (jtmemberid.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "Enter Member Id");
                            }
                            PreparedStatement statement = null;
                            // read data from the data base in table add member
                            String query1 = "SELECT memberid FROM `bakeryshop`.`AddMember` WHERE memberid=" + jtmemberid.getText();
                            statement = (PreparedStatement) con.prepareStatement(query1);
                            rs = statement.executeQuery();
                            int x = 0;
                            if (rs.next()) {
                                x++;
                            }
                            if (x == 0) {
                                JOptionPane.showMessageDialog(null, "Not a Member");
                                jradio2.setVisible(false);
                                jradio5.setVisible(false);
                                jradio7.setVisible(false);
                                jldiscount.setVisible(false);
                            } else {
                                jradio2.setVisible(true);
                                jradio5.setVisible(true);
                                jradio7.setVisible(true);
                                jldiscount.setVisible(true);
                            }
                        }
                        PreparedStatement ps = (PreparedStatement) con.prepareStatement(query);
                        rs = ps.executeQuery();
                        float p = 0;
                        if (rs.next()) {
                            p = rs.getFloat("sellingprice");
                        }
                        int q = 1;
                        try {
                            
                            q = Integer.parseInt(quantity);
                            //set update 
                            String update = "UPDATE product set quantity=quantity-" + q + " where itemname='" + itemname + "';";
                            PreparedStatement ps1 = (PreparedStatement) con.prepareStatement(update);
                            rs = ps1.executeQuery();
                        } catch (Exception e) {
                        }
                        // calculate amount
                        float amt = p * q;
                        calculate += amt;
                        // read data from the data base in table printbill
                        PreparedStatement st = (PreparedStatement) con.prepareStatement("INSERT INTO `bakeryshop`.`printbill` (`itemename`, `quantity`, `unitprice`, `amount`) VALUES (?,?,?,?);");
                        DefaultTableModel model = (DefaultTableModel) jtableprintbill.getModel();

                        model.addRow(new Object[]{jtitemname.getText(), jtquantity.getText(), p + "", amt + ""});
                        st.setString(1, itemname);
                        st.setString(2, quantity);
                        st.setString(3, p + "");
                        st.setString(4, amt + "");
                        st.executeUpdate();
                        st.close();
                        jtitemname.setText("");
                        jtquantity.setText("");
                    }
                }
            }

        } catch (SQLException ex) {
            //Logger.getLogger(PrintBill.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbadditemActionPerformed

    private void jradio7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradio7ActionPerformed
        // TODO add your handling code here:
        discount = 7;
    }//GEN-LAST:event_jradio7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        jtitemname.setText("");
        jtquantity.setText("");
        jtmemberid.setText("");
        discount = 0;
        y = 0;
        calculate = 0;
        jtgrosstotal.setText("");
        jradio2.setVisible(false);
        jradio5.setVisible(false);
        jradio7.setVisible(false);
        jlmemberid.setVisible(false);
        jtmemberid.setVisible(false);
        jldiscount.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) jtableprintbill.getModel();

        model.removeRow(0);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jtmemberidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtmemberidKeyReleased

    }//GEN-LAST:event_jtmemberidKeyReleased

    private void jtgrosstotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtgrosstotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtgrosstotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgdiscount;
    private javax.swing.ButtonGroup bgmembership;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbadditem;
    private javax.swing.JButton jbcalculate;
    private javax.swing.JButton jbprint;
    private javax.swing.JButton jbreset;
    private javax.swing.JLabel jlbillnumber;
    private javax.swing.JLabel jldiscount;
    private javax.swing.JLabel jlmemberid;
    private javax.swing.JRadioButton jradio2;
    private javax.swing.JRadioButton jradio5;
    private javax.swing.JRadioButton jradio7;
    private javax.swing.JRadioButton jrno;
    private javax.swing.JRadioButton jryes;
    private javax.swing.JTable jtableprintbill;
    private javax.swing.JTextField jtgrosstotal;
    private javax.swing.JTextField jtitemname;
    private javax.swing.JTextField jtmemberid;
    private javax.swing.JTextField jtquantity;
    // End of variables declaration//GEN-END:variables
}
