import java.util.Scanner;

public class Latihan10_hadiah_hal23 {
    public static void main(String[] args) {

        //membuat variabel belanja dan scanner
        int belanja = 0;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.print("Total Belanjaan : Rp");
        belanja = scan.nextInt();

        if(belanja >10000) {
            System.out.println( "selamat anda mendapatkan hadiah");
        }
        System.out.println ("terimakasih...");
    }
}
