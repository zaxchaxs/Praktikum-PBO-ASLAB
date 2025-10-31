/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframes;

import javax.swing.table.DefaultTableModel;
import models.Book;

public class SistemPerpustakaan extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SistemPerpustakaan.class.getName());
    
    DefaultTableModel listBookTableModel;

    // Data Buku
    Book[] koleksi = new Book[5];
    
    public SistemPerpustakaan() {
        initComponents();
        getData();
        showDataTable();
    }

    public void getData() {
        koleksi[0] = new Book("Harry Potter", "J.K. Rouling", 1991, false);
        koleksi[1] = new Book("Bumi", "Tere Liye", 1231, false);
        koleksi[2] = new Book("Hujan", "Tere Liye", 2004, false);
        koleksi[3] = new Book("Seminggu sebelum aku mati", "Gatau", 2025, false);
        koleksi[4] = new Book("Laskar Pelangi", "Andrea Hirata", 2005, false);
    };
    
    public void showDataTable() {
        String[] headerBookTable = {"Judul", "Penulis",  "Tahun", "Status"};
        Object[][] bookValue = new Object[koleksi.length][headerBookTable.length];
        
        for(int i = 0; i < koleksi.length; i++) {
            Book b = koleksi[i];
            bookValue[i][0] = b.judul;
            bookValue[i][1] = b.penulis;
            bookValue[i][2] = b.tahunTerbit;
            bookValue[i][3] = b.isBooked ? "Dipinjam" : "Tersedia";
        };
        
        listBookTableModel = new DefaultTableModel(bookValue, headerBookTable);
        
        myTable.setModel(listBookTableModel);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        myButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Judul", "Penulis", "Tahun Terbit", "Status"
            }
        ));
        jScrollPane1.setViewportView(myTable);

        myButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        myButton.setText("Pinjam/Kembalikan");
        myButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(myButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(myButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButtonActionPerformed
        int selectedIndex = myTable.getSelectedRow();
        koleksi[selectedIndex].isBooked = !koleksi[selectedIndex].isBooked;
        showDataTable();
    }//GEN-LAST:event_myButtonActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new SistemPerpustakaan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton myButton;
    private javax.swing.JTable myTable;
    // End of variables declaration//GEN-END:variables
}
