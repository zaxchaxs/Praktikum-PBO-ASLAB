/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_8.array;

import java.util.ArrayList;
import java.util.Scanner;
import models.Book;

/**
 *
 * @author irzir
 */
public class Pertemuan_8Array {
    
    public static void main(String[] args) {
        
//        int[] myInteger = new int[5];
//        myInteger[0] = 1;
////        myInteger[0] = 1;
////        myInteger[0] = 1;
////        myInteger[0] = 1;
//
//        String[] myString = new String[5];
//        myString[0] = "Bayu";
//        myString[1] = "Bayu1";
//        myString[2] = "Bayu2";
//        myString[3] = "Bayu3";
//        myString[4] = "Bayu4";
//        System.out.println(myString[3]);
//
//        String[][] nama = 
//        {
//            {"Bayu", "Ismail", "Joko"},
//            {"Ismi", "Renata", "Hena"},
//        };
//          
//        System.out.println(nama[1][1]);

        ArrayList<String> myArrList = new ArrayList<String>();
        myArrList.add("String1");
        myArrList.add("String4");
        myArrList.add("String3");
        myArrList.add("String2");
        
//        ArrayList<String> sortedArrList = new ArrayList<>();
        myArrList.sort(null);
        System.out.println(myArrList.get(0));
        myArrList.add(2, "String tiga");
        System.out.println(myArrList.get(2));
        
        
        // Data Buku
        Book[] koleksi = new Book[5];
        koleksi[0] = new Book("Harry Potter", "J.K. Rouling", 1991, false);
        koleksi[1] = new Book("Bumi", "Tere Liye", 1231, false);
        koleksi[2] = new Book("Hujan", "Tere Liye", 2004, false);
        koleksi[3] = new Book("Seminggu sebelum aku mati", "Gatau", 2025, false);
        koleksi[4] = new Book("Laskar Pelangi", "Andrea Hirata", 2005, false);
        
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\n===== SISTEM PERPUSTAKAAN =====");
            System.out.println("1. Lihat semua Book");
            System.out.println("2. Cari Book berdasarkan judul");
            System.out.println("3. Pinjam Book");
            System.out.println("4. Kembalikan Book");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Daftar Book ---");
                    // Lakukan perulangan untuk tampilkan info buku disini
                    for(Book b : koleksi) {
                        b.getDetailBook();
                    }
                    
                    System.out.println("Tekan enter untuk melanjutkan...");
                    input.nextLine();
                    break;

                case 2:
                    System.out.print("Masukkan judul buku yang dicari: ");
                    String cari = input.nextLine();
                    boolean ditemukan = false;
                    
                    // Lakukan logika untuk mencari buku disini
                    for(Book b : koleksi) {
                        if(b.judul.equalsIgnoreCase(cari)) {
                            System.out.println("Buku ditemukan:");
                            b.getDetailBook();
                            ditemukan = true;
                            break;
                        };
                    }
                    
                    if(!ditemukan) {
                        System.out.println("Buku tidak ditemukan:");
                    }
		    break;

                case 3:
                    System.out.print("Masukkan judul Book yang ingin dipinjam: ");
                    String pinjam = input.nextLine();
                    boolean ada = false;
                    
                    // Lakukan logika untuk meminjam buku disini
                    
                    
                    break;
                case 4:
                    System.out.print("Masukkan judul Book yang dikembalikan: ");
                    String kembali = input.nextLine();
                    boolean ditemukanKembali = false;
                    
                    // Silakan masukan logika untuk mengembalikan buku disini
                    
                    
                    break;

                case 0:
                    System.out.println("Keluar dari sistem...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
        
        
        input.close();
    }
    
}
