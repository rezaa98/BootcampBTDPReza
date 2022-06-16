package Assignment2;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {

        // Membuat Array dan Scanner
        String[][] meja = new String[2][3];
        Scanner scan = new Scanner(System.in);

        // mengisi setiap meja
        for (int baris = 0; baris < meja.length; baris++) {
            for (int kolom = 0; kolom < meja[baris].length; kolom++) {
                System.out.format("Siapa yang akan duduk di meja (%d,%d): ", baris, kolom);
                meja[baris][kolom] = scan.nextLine();
            }
        }

        // menampilkan isi Array
        System.out.println("=======================================");
        for (int baris = 0; baris < meja.length; baris++) {
            for (int kolom = 0; kolom < meja[baris].length; kolom++) {
                System.out.format("| %s | \t", meja[baris][kolom]);
            }
            System.out.println("");
        }
        System.out.println("========================================");
    }
}