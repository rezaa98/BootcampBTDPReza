package Assesment1_RezaYusufMaulana_JVSB001ONL015;
import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("===== MENGHITUNG LUAS LINGKARAN =====");
        System.out.println("=====================================");
        Scanner scan = new Scanner(System.in);
        double Luas, P1;
        int r;

        P1 = 3.14 ;
        System.out.println("Input nilai Jari - Jari : ");
        r = scan.nextInt();

        //proses
        Luas = P1 * r * r;

        //hasil
        System.out.println("Diketahui : ");
        System.out.println("Jari - Jari = "+r);
        System.out.println("Konstanta Phi = "+ P1);
        System.out.println("Maka Luas Lingkaran = "+ Luas);
    }
}
