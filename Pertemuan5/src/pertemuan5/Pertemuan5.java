/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;
import models.Mahasiswa;
import java.util.Scanner;
import models.ATM;

public class Pertemuan5 {

    public static void main(String[] args) {
        
//        System.out.print("Masukkan nama anda: ");
//        String name = input.nextLine();
//        System.out.print("\nMasukkan NPM anda: ");
//        String npm = input.nextLine();
//        System.out.print("\nMasukkan jurusan anda: ");
//        String jurusan = input.nextLine();
//        
//        Mahasiswa mh1 = new Mahasiswa(name, npm, jurusan);
//        mh1.perkenalan();
        
        ATM atm = new ATM();
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\n=== Menu ATM ===");
            System.out.println("1. Cek saldo");
            System.out.println("2. Setor");
            System.out.println("3. Tarik");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    atm.cekSaldo();
                    break;
                case 2:
                    System.out.print("Masukkan jumlah setor: ");
                    int jumlahSetor = input.nextInt();
                    atm.setor(jumlahSetor);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah tarik: ");
                    int jumlahTarik = input.nextInt();
                    atm.tarik(jumlahTarik);
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while(pilihan != 4);
    }
}
