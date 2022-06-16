package Assignment2;

import java.util.Scanner;

public class Latihan4 {
  public static void main(String[] args) {
    int tahun;
    Scanner scan = new Scanner(System.in);

    System.out.println("==================================");
    System.out.println("======PERAMAL TAHUN KABISAT=======");
    System.out.println("==================================");

    System.out.print("Masukkan tahun : ");
    tahun = scan.nextInt();

    if (tahun % 400 == 0) {
      System.out.print(tahun + " Merupakan Tahun Kabisat\n");
    } else if (tahun % 100 == 0) {
      System.out.println(tahun + " Bukan Tahun Kabisat\n");
    } else if (tahun % 4 == 0) {
      System.out.print(tahun + " Merupakan Tahun Kabisat\n");
    } else {
      System.out.print(tahun + " Bukan Tahun Kabisat\n");
    }
  }
}