/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Scanner;

/**
 *
 * @author irzir
 */
public class ATM {
    int saldo = 1000000;
    Scanner input = new Scanner(System.in);

    public void cekSaldo() {
        System.out.println("Saldo Anda: Rp " + saldo);
        input.nextLine();
    }

    public void setor(int jumlah) {
        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo sekarang: Rp " + saldo);
        input.nextLine();
    }

    public void tarik(int jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup!");
            input.nextLine();
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo sekarang: Rp " + saldo);
            input.nextLine();
        }
    }
}
