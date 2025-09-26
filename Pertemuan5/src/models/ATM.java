package models;

public class ATM {
    private int saldo = 0;
    
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int newSaldo) {
        saldo = newSaldo;
    }
    
    public void cekSaldo(){
        System.out.println("Saldo anda: RP " + saldo);
    }
    public void setor(int jumlah) {
        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo sekarang: Rp " + saldo);
    }
    public void tarik(int jumlah) {
        if(jumlah > saldo) {
            System.out.println("Saldo anda tidak cukup");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo sekarang: Rp " + saldo);
        }
    }
}   
