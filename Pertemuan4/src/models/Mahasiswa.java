/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


public class Mahasiswa {
    public String nama;
    public String npm;
    public String jurusan;
    
    public Mahasiswa() {}
    
    public Mahasiswa(String nama, String npm, String jurusan) {
        this.nama = nama;
        this.npm = npm;
        this.jurusan = jurusan;
    }
    
    
    public void perkenalan() {
        System.out.println("Halo, nama saya " + nama +
                " dari jurusan " + jurusan);
    }
    public void belajar() {
        if (jurusan.equalsIgnoreCase("Informatika")) {
            System.out.println("Saya belajar coding setiap hari!");
        } else if (jurusan.equalsIgnoreCase("Akuntansi")) {
            System.out.println("Saya belajar menghitung neraca keuangan!");
        } else {
            System.out.println("Saya belajar hal-hal umum di kampus.");
        }
    }
}
