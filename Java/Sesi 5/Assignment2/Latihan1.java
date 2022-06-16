package Assignment2;
import java.util.Scanner;

public class Latihan1 {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] array = new Integer[3];
       
        System.out.println("====================================================");
        System.out.println("Menentukan Bilangan Terbesar, Terkecil dan Rata-Rata");
        System.out.println("====================================================");

        System.out.println("====================================================");
        // System.out.println("Masukkan Bilangan Pertama");
        // array[0] = scan.nextInt();
        // System.out.println("Masukkan Bilangan kedua");
        // array[1] = scan.nextInt();
        // System.out.println("Masukkan Bilangan ketiga");
        // array[2] = scan.nextInt();
        for (int i = 0; i< array.length; i++){
            System.out.println("Masukan Bilangan ke-"+i+": ");
            array[i] = scan.nextInt();}
        System.out.println("====================================================");
        System.out.println("");
        int indexTerbesar = array[0];
        int indexTerkecil = array[0];
        int ratarata=0;
        for (int i = 0; i < array.length; i++) {
            if (indexTerbesar < array[i]) {
                indexTerbesar = array[i];
            }
            if (indexTerkecil > array[i]) {
                indexTerkecil = array[i];
            }
            if (i < array.length){
                ratarata = ratarata+array[i];
            }
        }
        int rata = ratarata / array.length;
        System.out.println("====================================================");
        System.out.println("Nilai Terbesar : " + indexTerbesar);
        System.out.println("Nilai Terkecil : " + indexTerkecil);
        System.out.println("Nilai Rata - Rata : " + rata);
        System.out.println("====================================================");
        System.out.println("");
        scan.close();

    }

}
