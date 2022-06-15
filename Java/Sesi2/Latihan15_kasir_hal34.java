import java.util.Scanner;
public class Latihan15_kasir_hal34 {
    public static void main(String[] args) {
        
        //deklarasi variabel
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner scan = new Scanner(System.in);

        //get input
        System.out.println("Welcome to Rezamart");
        System.out.println("Apakah ada kartu member gaes?: ");
        kartu = scan.nextLine();
        System.out.println("Total Belanjaan: ");
        belanjaan = scan.nextInt();

        //proses nested if
        if( kartu.equalsIgnoreCase("ya")){
            if(belanjaan > 500000){
                diskon = 50000;
            }
            else if (belanjaan > 100000){
                diskon = 15000;
            }else {
                diskon = 0;
            }
        }
        else {
            if (belanjaan > 100000){
                diskon = 5000;
            }
            else {
                diskon = 0;
            }
        }
        //total bayar
        bayar = belanjaan - diskon;

        //output
        System.out.println("Total Bayar : Rp " + bayar);
    }
}
