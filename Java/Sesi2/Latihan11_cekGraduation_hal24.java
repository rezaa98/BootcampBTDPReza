import java.util.Scanner;

public class Latihan11_cekGraduation_hal24 {
    public static void main(String[] args) {
        int nilai;
        String nama;
        Scanner scan = new Scanner (System.in);

        //get input
        System.out.println("Nama : ");
        nama = scan.nextLine();

        System.out.println("Nilai: ");
        nilai = scan.nextInt();

        //cek if lulus or not
        if(nilai >= 70){
            System.out.println(" Selamat "+ nama + ", anda lulus!!! Manttapu Jiwa");
        }
        else{
            System.out.println("Maaf "+ nama + ", anda gagal");
        }
    }
}
