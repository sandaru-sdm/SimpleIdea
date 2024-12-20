/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sdm.simpleidea.gui;

import com.sdm.simpleidea.model.MySQL;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

/**
 *
 * @author maduh
 */
public class Sales extends javax.swing.JFrame {

    DecimalFormat df = new DecimalFormat("0.00");
    private static final Logger logger = Logger.getLogger(PaymentTypes.class.getName());

    /**
     * Creates new form Sales
     */
    public Sales() {
        initComponents();
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Home home = new Home();
                home.setVisible(true);
                dispose();
            }
        });

        loadSales();
        loadPaymentTypes();
        setLoggerFile();

        // Set the date format for JDateChooser
        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        setIconImage(new ImageIcon(getClass().getResource("/com/sdm/simpleidea/resources/icon.png")).getImage());

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
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sales");
        setPreferredSize(new java.awt.Dimension(1500, 600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Invoice ID", "Customer", "Description", "Width", "Height", "Square Feet", "Qty", "Rate", "Total", "Payment Type", "Date & Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sales");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        jLabel3.setText("Search by Date");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        jLabel4.setText("Search by Customer Name/ Mobile");

        jLabel8.setText("Search By Payment Type");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBox1PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel8)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel1.setText("Total Income Of The Day");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("0.00");

        jLabel6.setText("Sold Square Feet");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        String t = jTextField1.getText();
        String text = t + evt.getKeyChar();

        if (!Pattern.compile("^[A-Za-z0-9]+(?:[ _-][A-Za-z0-9]+)*$").matcher(text).matches()) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        String customer = jTextField1.getText().trim();

        if (customer.isEmpty()) {
            loadSales();
        } else {
            loadSales(customer);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
        if ("date".equals(evt.getPropertyName())) {
            loadSalesByDate(jDateChooser1.getDate());
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (evt.getClickCount() == 2) {
            try {
                String invoiceID = (String) jTable1.getValueAt(selectedRowIndex, 1);
                String paymentType = (String) jTable1.getValueAt(selectedRowIndex, 10);

                // Get the payment types from the database
                String[] paymentTypesOrder = getPaymentTypesFromDatabase();

                // Map the current payment type to the next payment type
                String nextPaymentType = getNextPaymentType(paymentType, paymentTypesOrder);

                if (nextPaymentType != null) {
                    // Get the ID of the next payment type from the database
                    ResultSet nextPaymentTypeRs = MySQL.search("SELECT * FROM `payment_type` WHERE LOWER(`name`) = '" + nextPaymentType.toLowerCase() + "'");
                    if (nextPaymentTypeRs.next()) {
                        String nextPaymentTypeId = nextPaymentTypeRs.getString("id");

                        // Update the payment type in the `invoice_payment` table
                        MySQL.iud("UPDATE `invoice_payment` SET `payment_type_id` = '" + nextPaymentTypeId + "' WHERE `invoice_id` = '" + invoiceID + "'");
                        loadSales();
                    }
                }
            } catch (Exception ex) {
                logger.log(Level.SEVERE, "An unexpected exception occurred when changing payment type by table double click.", ex);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBox1PropertyChange
        // TODO add your handling code here:
//        String paymentType = jComboBox1.getSelectedItem().toString();
//        System.out.println(paymentType);
//        if (!"-Select-".equals(paymentType)) {
//            try {
//                ResultSet rs = MySQL.search("SELECT * FROM `payment_type` WHERE `name` = '" + paymentType + "'");
//                if (rs != null && rs.next()) {
//                    int paymentTypeId = Integer.parseInt(rs.getString("id"));
//                    loadSales(paymentTypeId);
//                }
//            } catch (Exception e) {
//                logger.log(Level.SEVERE, "An unexpected exception occurred When getting payment type by combo box", e);
//            }
//        }

    }//GEN-LAST:event_jComboBox1PropertyChange

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String paymentType = jComboBox1.getSelectedItem().toString();
        if (!"-Select-".equals(paymentType)) {
            try {
                ResultSet rs = MySQL.search("SELECT * FROM `payment_type` WHERE `name` = '" + paymentType + "'");
                if (rs != null && rs.next()) {
                    int paymentTypeId = Integer.parseInt(rs.getString("id"));
                    loadSales(paymentTypeId);
                }
            } catch (Exception e) {
                logger.log(Level.SEVERE, "An unexpected exception occurred When getting payment type by combo box", e);
            }
        } else {
            loadSales();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void loadSales() {
        int number = 0;
        double total = 0;
        try {
            ResultSet rs = MySQL.search("SELECT DISTINCT `invoice`.`id`, `invoice`.`date_time`, `invoice`.`customer_id`, "
                    + "`invoice_payment`.`payment`,`invoice_payment`.`balance`,`payment_type`.`name`,"
                    + "`customer`.`name`, `customer`.`mobile`, `service`.`name`, `other`.`name`, "
                    + "`invoice_item`.`width`, `invoice_item`.`height`,`invoice_item`.`rate`, `invoice_item`.`qty` "
                    + "FROM `invoice` INNER JOIN `invoice_item` ON `invoice`.`id`=`invoice_item`.`invoice_id` "
                    + "INNER JOIN `invoice_payment` ON `invoice`.`id`=`invoice_payment`.`invoice_id` "
                    + "INNER JOIN  `service` ON `invoice_item`.`service_id` = `service`.`id` "
                    + "INNER JOIN `other` ON `invoice_item`.`other_id` = `other`.`id` "
                    + "INNER JOIN `customer` ON `invoice`.`customer_id`=`customer`.`id` "
                    + "INNER JOIN `payment_type` ON `invoice_payment`.`payment_type_id` = `payment_type`.`id` "
                    + "ORDER BY `invoice`.`id` ASC");

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(number += 1);
                v.add(rs.getString("invoice.id"));
                v.add(rs.getString("customer.name") + " - " + rs.getString("customer.mobile"));
                v.add(rs.getString("service.name") + " - " + rs.getString("other.name"));

                // Convert width and height to double
                double width = Double.parseDouble(rs.getString("invoice_item.width"));
                double height = Double.parseDouble(rs.getString("invoice_item.height"));

                // Calculate square feet
                double squareFeet = width * height;

                v.add(width);
                v.add(height);
                v.add(squareFeet);

                int qty = Integer.parseInt(rs.getString("invoice_item.qty"));
                double rate = Double.parseDouble(rs.getString("invoice_item.rate"));

                if (squareFeet != 0) {
                    total = qty * rate * squareFeet;
                } else {
                    total = qty * rate;
                }

                v.add(qty);
                v.add(rate);
                v.add(total);

                v.add(rs.getString("payment_type.name"));
                v.add(rs.getString("invoice.date_time"));

                dtm.addRow(v);
            }
            jTable1.setModel(dtm);
            updateTotal();
            updateSquareFeet();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An unexpected exception occurred When loading sales data.", e);
        }
    }

    private void updateTotal() {
        double total = 0;

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            String t = jTable1.getValueAt(i, 9).toString();
            total = total + Double.parseDouble(t);
        }

        jLabel5.setText(df.format(total));
    }

    private void updateSquareFeet() {
        double totalSquareFeet = 0;

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            String t = jTable1.getValueAt(i, 6).toString();
            String qty = jTable1.getValueAt(i, 7).toString();
            totalSquareFeet = totalSquareFeet + Double.parseDouble(t) * Integer.parseInt(qty);
        }

        jLabel7.setText(df.format(totalSquareFeet));
    }

    private void loadSales(String customer) {
        int number = 0;
        double total = 0;
        try {
            ResultSet rs = MySQL.search("SELECT DISTINCT `invoice`.`id`, `invoice`.`date_time`, `invoice`.`customer_id`, "
                    + "`invoice_payment`.`payment`,`invoice_payment`.`balance`,`payment_type`.`name`,"
                    + "`customer`.`name`, `customer`.`mobile`, `service`.`name`, `other`.`name`, "
                    + "`invoice_item`.`width`, `invoice_item`.`height`,`invoice_item`.`rate`, `invoice_item`.`qty` "
                    + "FROM `invoice` INNER JOIN `invoice_item` ON `invoice`.`id`=`invoice_item`.`invoice_id` "
                    + "INNER JOIN `invoice_payment` ON `invoice`.`id`=`invoice_payment`.`invoice_id` "
                    + "INNER JOIN  `service` ON `invoice_item`.`service_id` = `service`.`id` "
                    + "INNER JOIN `other` ON `invoice_item`.`other_id` = `other`.`id` "
                    + "INNER JOIN `customer` ON `invoice`.`customer_id`=`customer`.`id` "
                    + "INNER JOIN `payment_type` ON `invoice_payment`.`payment_type_id` = `payment_type`.`id` "
                    + "WHERE `customer`.`name` LIKE '" + customer + "%' OR `customer`.`mobile` LIKE '" + customer + "%' ORDER BY `invoice`.`id` ASC");

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(number += 1);
                v.add(rs.getString("invoice.id"));
                v.add(rs.getString("customer.name") + " - " + rs.getString("customer.mobile"));
                v.add(rs.getString("service.name") + " - " + rs.getString("other.name"));

                // Convert width and height to double
                double width = Double.parseDouble(rs.getString("invoice_item.width"));
                double height = Double.parseDouble(rs.getString("invoice_item.height"));

                // Calculate square feet
                double squareFeet = width * height;

                v.add(width);
                v.add(height);
                v.add(squareFeet);

                int qty = Integer.parseInt(rs.getString("invoice_item.qty"));
                double rate = Double.parseDouble(rs.getString("invoice_item.rate"));

                if (squareFeet != 0) {
                    total = qty * rate * squareFeet;
                } else {
                    total = qty * rate;
                }

                v.add(qty);
                v.add(rate);
                v.add(total);

                v.add(rs.getString("payment_type.name"));
                v.add(rs.getString("invoice.date_time"));

                dtm.addRow(v);
            }
            jTable1.setModel(dtm);
            updateTotal();
            updateSquareFeet();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An unexpected exception occurred When loading sales data acording to customer name or mobile", e);
        }
    }

    // Add this method to load sales based on selected date
    private void loadSalesByDate(java.util.Date selectedDate) {
        int number = 0;
        double total = 0;
        try {
            // Format the date to be used in the SQL query
            java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());

            ResultSet rs = MySQL.search("SELECT DISTINCT `invoice`.`id`, `invoice`.`date_time`, `invoice`.`customer_id`, "
                    + "`invoice_payment`.`payment`,`invoice_payment`.`balance`,`payment_type`.`name`,"
                    + "`customer`.`name`, `customer`.`mobile`, `service`.`name`, `other`.`name`, "
                    + "`invoice_item`.`width`, `invoice_item`.`height`,`invoice_item`.`rate`, `invoice_item`.`qty` "
                    + "FROM `invoice` INNER JOIN `invoice_item` ON `invoice`.`id`=`invoice_item`.`invoice_id` "
                    + "INNER JOIN `invoice_payment` ON `invoice`.`id`=`invoice_payment`.`invoice_id` "
                    + "INNER JOIN  `service` ON `invoice_item`.`service_id` = `service`.`id` "
                    + "INNER JOIN `other` ON `invoice_item`.`other_id` = `other`.`id` "
                    + "INNER JOIN `customer` ON `invoice`.`customer_id`=`customer`.`id` "
                    + "INNER JOIN `payment_type` ON `invoice_payment`.`payment_type_id` = `payment_type`.`id` "
                    + "WHERE DATE(`invoice`.`date_time`) = '" + sqlDate + "' ORDER BY `invoice`.`id` ASC");

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(number += 1);
                v.add(rs.getString("invoice.id"));
                v.add(rs.getString("customer.name") + " - " + rs.getString("customer.mobile"));
                v.add(rs.getString("service.name") + " - " + rs.getString("other.name"));

                double width = Double.parseDouble(rs.getString("invoice_item.width"));
                double height = Double.parseDouble(rs.getString("invoice_item.height"));
                double squareFeet = width * height;

                v.add(width);
                v.add(height);
                v.add(squareFeet);

                int qty = Integer.parseInt(rs.getString("invoice_item.qty"));
                double rate = Double.parseDouble(rs.getString("invoice_item.rate"));

                if (squareFeet != 0) {
                    total = qty * rate * squareFeet;
                } else {
                    total = qty * rate;
                }

                v.add(qty);
                v.add(rate);
                v.add(total);

                v.add(rs.getString("payment_type.name"));
                v.add(rs.getString("invoice.date_time"));

                dtm.addRow(v);
            }
            jTable1.setModel(dtm);
            updateTotal();
            updateSquareFeet();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An unexpected exception occurred When loading sales data acording to date", e);
        }
    }

    private void loadSales(int paymentTypeId) {
        int number = 0;
        double total = 0;
        try {
            ResultSet rs = MySQL.search("SELECT DISTINCT `invoice`.`id`, `invoice`.`date_time`, `invoice`.`customer_id`, "
                    + "`invoice_payment`.`payment`,`invoice_payment`.`balance`,`payment_type`.`name`,"
                    + "`customer`.`name`, `customer`.`mobile`, `service`.`name`, `other`.`name`, "
                    + "`invoice_item`.`width`, `invoice_item`.`height`,`invoice_item`.`rate`, `invoice_item`.`qty` "
                    + "FROM `invoice` INNER JOIN `invoice_item` ON `invoice`.`id`=`invoice_item`.`invoice_id` "
                    + "INNER JOIN `invoice_payment` ON `invoice`.`id`=`invoice_payment`.`invoice_id` "
                    + "INNER JOIN  `service` ON `invoice_item`.`service_id` = `service`.`id` "
                    + "INNER JOIN `other` ON `invoice_item`.`other_id` = `other`.`id` "
                    + "INNER JOIN `customer` ON `invoice`.`customer_id`=`customer`.`id` "
                    + "INNER JOIN `payment_type` ON `invoice_payment`.`payment_type_id` = `payment_type`.`id` "
                    + "WHERE `payment_type`.`id` = '" + paymentTypeId + "' ORDER BY `invoice`.`id` ASC");

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(number += 1);
                v.add(rs.getString("invoice.id"));
                v.add(rs.getString("customer.name") + " - " + rs.getString("customer.mobile"));
                v.add(rs.getString("service.name") + " - " + rs.getString("other.name"));

                // Convert width and height to double
                double width = Double.parseDouble(rs.getString("invoice_item.width"));
                double height = Double.parseDouble(rs.getString("invoice_item.height"));

                // Calculate square feet
                double squareFeet = width * height;

                v.add(width);
                v.add(height);
                v.add(squareFeet);

                int qty = Integer.parseInt(rs.getString("invoice_item.qty"));
                double rate = Double.parseDouble(rs.getString("invoice_item.rate"));

                if (squareFeet != 0) {
                    total = qty * rate * squareFeet;
                } else {
                    total = qty * rate;
                }

                v.add(qty);
                v.add(rate);
                v.add(total);

                v.add(rs.getString("payment_type.name"));
                v.add(rs.getString("invoice.date_time"));

                dtm.addRow(v);
            }
            jTable1.setModel(dtm);
            updateTotal();
            updateSquareFeet();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An unexpected exception occurred When loading sales data acording to customer name or mobile", e);
        }
    }

    private void loadPaymentTypes() {
        try {
            // Retrieve active payment types
            ResultSet rs = MySQL.search("SELECT `id`, `name` FROM `payment_type` WHERE `status_id` = 1");

            // Clear existing items in the combo box
            jComboBox1.removeAllItems();

            // Populate the combo box with payment types
            jComboBox1.addItem("-Select-");
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("name"));
            }

        } catch (Exception e) {
            logger.log(Level.SEVERE, "An unexpected exception occurred", e);
        }
    }

    private void setLoggerFile() {
        try {
            // Use the user's home directory as the base path for logfiles
            String userHome = System.getProperty("user.home");
            File logFolder = new File(userHome, "SimpleIdea/logfiles");

            // Check if the "logfiles" folder exists, and create it if not
            if (!logFolder.exists()) {
                logFolder.mkdirs();  // mkdirs() will create parent directories if they don't exist
            }

            // Set up a FileHandler to write log messages to a file named "logfiles/invoice_log.txt"
            FileHandler fileHandler = new FileHandler(logFolder.getPath() + File.separator + "sales_log.txt", true);
            fileHandler.setFormatter(new SimpleFormatter() {
                private final String format = "[%1$tF %1$tT] [%2$-7s] %3$s %n";

                @Override
                public synchronized String format(java.util.logging.LogRecord lr) {
                    Object[] params = lr.getParameters();
                    return String.format(format, new java.util.Date(lr.getMillis()), lr.getLevel(),
                            MessageFormat.format(lr.getMessage(), params));
                }
            });

            logger.addHandler(fileHandler);
        } catch (IOException | SecurityException e) {
            // If there is an issue setting up the FileHandler, log the exception to the console
            e.printStackTrace();
        }
    }

    private String getNextPaymentType(String currentPaymentType, String[] paymentTypesOrder) {
        // Find the index of the current payment type
        int currentIndex = Arrays.asList(paymentTypesOrder).indexOf(currentPaymentType);

        // Calculate the index of the next payment type in a circular manner
        int nextIndex = (currentIndex + 1) % paymentTypesOrder.length;

        return paymentTypesOrder[nextIndex];
    }

    private String[] getPaymentTypesFromDatabase() throws SQLException {
        try {
            List<String> paymentTypesList = new ArrayList<>();

            ResultSet paymentTypesRs = MySQL.search("SELECT `name` FROM `payment_type`");
            while (paymentTypesRs.next()) {
                paymentTypesList.add(paymentTypesRs.getString("name"));
            }

            return paymentTypesList.toArray(new String[0]);
        } catch (Exception ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
