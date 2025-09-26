/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class Animal {
    private int jumlahKaki;
    private boolean isMamal;
    
    public Animal(int jumlahKaki, boolean isMamal) {
        this.jumlahKaki = jumlahKaki;
        this.isMamal = isMamal;
    }
    
    public void makeAMove() {
        
        
        System.out.println("Animal bergerak...");
    }
    public void makeASound() {
        System.out.println("Animal bersuara...");
    }
}
