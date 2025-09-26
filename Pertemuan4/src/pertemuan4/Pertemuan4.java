
package pertemuan4;
import animals.Cat;
import animals.buaya;
import java.util.Scanner;
import models.ATM;
import models.Animal;
import models.Mahasiswa;

public class Pertemuan4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ATM atm = new ATM();

        int pilihan;
        do {
            System.out.println("\n=== Menu ATM ===");
            System.out.println("1. Cek Saldo");
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
                    int setor = input.nextInt();
                    atm.setor(setor);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah tarik: ");
                    int tarik = input.nextInt();
                    atm.tarik(tarik);
                    break;
                case 4:
                    System.out.println("Terima kasih sudah menggunakan ATM!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        input.close();

    }
}
