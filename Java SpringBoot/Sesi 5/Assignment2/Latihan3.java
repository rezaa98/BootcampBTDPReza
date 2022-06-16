package Assignment2;
import java.util.Scanner;
public class Latihan3 {
    // Buat Program Diskon dan Harga Bayar dengan 
    // kondisi :   A. Pembelian = Rp. 1.000.000,-  
    //  B. Diskon = 10%  
    //   C. Harga Bayar = Rp. 900.000Assignment 2 
    public static void main(String[] args) {
        int pembelian;
        int diskon;
        int nDiskon;
        int total;
        Scanner scan = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("=========REZA MART===========");
        System.out.println("=============================");
        System.out.print("Silahkan inputkan Nominal Belanja Anda : ");
        pembelian = scan.nextInt();
        if (pembelian > 1000000){
            diskon = 10;
        }
        else{
            diskon = 0;
        }
        nDiskon = pembelian*diskon/100;
        total = pembelian - nDiskon;
        System.out.println("Diskon Belanjaan Anda : "+(diskon)+"%");
        System.out.println("Total Belanjaan Anda : Rp."+total);
       
    }

}
