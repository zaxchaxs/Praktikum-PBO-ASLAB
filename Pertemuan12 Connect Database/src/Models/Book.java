/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author irzir
 */
public class Book {
    private int id;
    private String judul;
    private String penulis;
    private int tahun;
    private boolean isBooked;

    public Book(int id, String judul, String penulis, int tahun, boolean isBooked) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.isBooked = isBooked;
    }

    public int getId() { return id; }
    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public int getTahun() { return tahun; }
    public boolean getStatus() { return isBooked; }

    public void setId(int id) { this.id = id; }
    public void setJudul(String judul) { this.judul = judul; }
    public void setPenulis(String penulis) { this.penulis = penulis; }
    public void setTahun(int tahun) { this.tahun = tahun; }
    public void setStatus(boolean status) { this.isBooked = status; }
    
    public String toString() {
        return judul + " - " + penulis;
    }

}
