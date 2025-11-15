/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pertemuan11_guilanjutan;

import DatabaseConnection.SessionManager;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Models.Book;
import Models.User;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import dao.BookDAO;
/**
 *
 * @author irzir
 */
public class BookPage extends javax.swing.JPanel {

    private JTable table;
    private DefaultTableModel model;
    private BookDAO dao = new BookDAO();
    private User user;

    public BookPage(MainFrame frame) {
        setLayout(null);
        
        System.out.println(SessionManager.getCurrentUser());
       
        // ####### Ini tampilan saja
        JLabel title = new JLabel("Daftar Buku");
        title.setFont(new Font("Segoe UI", Font.BOLD, 18));
        title.setBounds(260, 20, 200, 30);
        add(title);

        model = new DefaultTableModel(new Object[]{"id", "Judul", "Penulis", "Tahun", "Status"}, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(100, 70, 500, 200);
        add(scrollPane);

        JButton btnAdd = new JButton("Tambah");
        JButton btnEdit = new JButton("Edit");
        JButton btnDelete = new JButton("Hapus");
        JButton btnBack = new JButton("Kembali");

        btnAdd.setBounds(100, 290, 100, 30);
        btnEdit.setBounds(210, 290, 100, 30);
        btnDelete.setBounds(320, 290, 100, 30);
        btnBack.setBounds(500, 290, 100, 30);

        add(btnAdd);
        add(btnEdit);
        add(btnDelete);
        add(btnBack);
        
        /// ##############

//        btnAdd.setEnabled(frame.isAdmin());
//        btnEdit.setEnabled(frame.isAdmin());
//        btnDelete.setEnabled(frame.isAdmin());
        
        btnBack.addActionListener(e -> {
            frame.showPage("home");
        });

        btnAdd.addActionListener(e -> {
           JTextField judul = new JTextField();
           JTextField penulis = new JTextField();
           JTextField tahun = new JTextField();

           Object[] input = {
               "Judul", judul,
               "Penulis", penulis,
               "Tahun", tahun
           };
           int result = JOptionPane.showConfirmDialog(this, input, "Tambah Buku", 
                   JOptionPane.OK_CANCEL_OPTION);
           if(result == JOptionPane.OK_OPTION) {
                Book b = new Book(0, judul.getText(), penulis.getText(), Integer.parseInt(tahun.getText()), false);
                dao.addBook(b);
                loadData();
           };

        });

        btnEdit.addActionListener(e -> {
            int row = table.getSelectedRow();
            
            if(row >= 0) {
                int id = (Integer) model.getValueAt(row, 0);
                String judul = (String) model.getValueAt(row, 1);
                String penulis = (String) model.getValueAt(row, 2);
                int tahun = (Integer) model.getValueAt(row, 3);
                Boolean status = (Boolean) model.getValueAt(row, 4);
                
                JTextField judulField = new JTextField(judul);
                JTextField penulisField = new JTextField(penulis);
                JTextField tahunField = new JTextField(Integer.toString(tahun));
                
                Object[] input = {
                    "Judul", judulField,
                    "Penulis", penulisField,
                    "Tahun", tahunField
                };
                
                int result = JOptionPane.showConfirmDialog(this, input, "Tambah Buku", 
                        JOptionPane.OK_CANCEL_OPTION);
                
                if(result == JOptionPane.OK_OPTION) {
                    dao.updateBook(new Book(id, judulField.getText(), penulisField.getText(), Integer.parseInt(tahunField.getText()), status));
                    loadData();
                };
            } else { 
                JOptionPane.showMessageDialog(this, "Pilih data dulu kcoak.");
            }
        });

        btnDelete.addActionListener(e -> {
            int row = table.getSelectedRow();
            if(row == -1) return;
            int id = (int) model.getValueAt(row, 0);
            dao.deleteBook(id);
            loadData();
        });
        
        loadData();
    }
    
    private void loadData() {
        model.setRowCount(0);
        List<Book> list = dao.getAllBooks();
        for (Book b : list) {
            model.addRow(new Object[]{b.getId(), b.getJudul(), b.getPenulis(), b.getTahun(), b.getStatus()});
        }
    }
    
    private void refreshTable(ArrayList<Book> books) {
        model.setRowCount(0);
        for (Book b : books) {
            model.addRow(new Object[]{b.getJudul(), b.getPenulis(), b.getTahun()});
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
