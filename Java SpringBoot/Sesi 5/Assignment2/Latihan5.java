package Assignment2;
import java.util.Scanner;

    public class Latihan5{
        public static void main(String[] args) {
            //inisialisasi variabel
            int barangIn;
            int kodeBarang;

            //inisialisasi array 1 dimensi dengan isi data 5 array
            int [] qty = new int[5] ;
            int [] subTotal = new int[5] ;
            int total=0;

            //inisialisasi scanner
            Scanner scan = new Scanner(System.in);

            //cetak tampilan program java
            System.out.println("==================================");
            System.out.println("==Program Java Tentang Penjualan==");
            System.out.println("==================================");

            //input jumlah beli
            System.out.print("Masukan Jumlah Beli : ");
            barangIn = scan.nextInt();

            //perulangan untuk menampilkan dan input kode barang
            for (int i=1; i<=barangIn; i++){
                System.out.print("Masukan Kode Barang ke-"+i+": ");
                kodeBarang = scan.nextInt();
                System.out.print("Masukan QTY Barang ke-"+i+": ");
                qty [i] = scan.nextInt();
            }

            //proses untuk menghitung harga barang+diskon
            subTotal [1] = (899000+(899000*10/100))*qty[1];
            subTotal [2] = (246000+(246000*5/100))*qty[2];
            subTotal [3] = (136000+(136000*0/100))*qty[3];
            subTotal [4] = (267999+(267999*20/100))*qty[4];

            //ini untuk menghitung subtotal belanjaan dengan cara menambahkan seluruh 
            //subtotal [1] hingga subtotal [4] hingga menjadi total
            for (int o=1; o<5; o++){
                total = total + subTotal[o];
            }

            //cetak hasil
            System.out.println("========================================");

            System.out.println("No |     Nama Barang    |     Harga   | QTY | DISKON | Sub Total");
            System.out.println("1  | Smartwatch Xiaomi  | Rp.899.000  | "+qty[1]+"  |   10%   | Rp."+subTotal[1]+" ");
            System.out.println("2  | Headphone External | Rp.246.000  | "+qty[2]+"  |   5%    | Rp."+subTotal[2]+" ");
            System.out.println("3  |Powerbank 10.000mAh | Rp.136.000  | "+qty[3]+"  |   0%    | Rp."+subTotal[3]+" ");
            System.out.println("4  |    Tripod Kamera   | Rp.267.999  | "+qty[4]+"  |   20%   | Rp."+subTotal[4]+" ");
            System.out.println("Total Bayar : "+total);;
          
            System.out.println("========================================");
        }
    }

