/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author irzir
 */
public class Book {
    public String judul;
    public String penulis;
    public int tahunTerbit;
    public boolean isBooked;
    
    public Book(String judul, String penulis, int th, boolean isBooked) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = th;
        this.isBooked = isBooked;
    };
    
    public void getDetailBook() {
        System.out.println("Judul:" + judul);
        System.out.println("Penulis:" + penulis);
        System.out.println("Tahun Terbit:" + tahunTerbit);
        System.out.println("Apakah tersedia:" + (isBooked ? "Ya" : "Tidak"));
        System.out.println("==============================\n");
    }
}
