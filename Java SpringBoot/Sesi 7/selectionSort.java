import java.util.Scanner;

public class selectionShort {
    public static void main(String[] args) {
        //bikin objek scanner, mesti lupa syntax scanner heran dah
        Scanner scan = new Scanner (System.in);

        //input jumlah datanya
        System.out.println("Masukkan jumlah data : ");
        int jmlh_data = scan.nextInt();

        //input nilai tiap data
        int [] data = new int[jmlh_data]; //iniarray untuk tiap data ya ges yak
        System.out.println(x);
        for (int x = 0; x < jmlh_data; x++){
            System.out.println("Input nilai Data ke -"+(x+1)+" : ");
            data[x] = scan.nextInt();
        }

        //Tampilkan data sebelum di urutin atau di sorting yagesyak
        System.out.println(x);
        System.out.println("Data Sebelum di Sorting : ");
        for( int x = 0; x < jmlh_data; x++){
        System.out.println(data[x]+" ");
        }
        //proses selection sort
        System.out.println("\n\nProses Selection Sort");
        for (int x = 0; x < jmlh_data; x++){
            System.out.println("Iterasi ke-"+(x+1)+" : ");
            for(int y = 0; y < jmlh_data; y++)
            System.out.println(data[y]+" ");

            System.out.println("Apakah Data"+data[x]+" sudah benar pada urutannya????");

            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = " Tidak ada Pertukaran Data nih";
            for(int y = x+1; y<jmlh_data; y++)
            {
                if(min > data [y])
                {
                    tukar = true;
                    index = y;
                    min = data[y];
                }
            }
            if(tukar == true)
            {
                // Pertukaran Data
                pesan = " Data "+data[x]+ "ditukar dengan Data "+data[index];
                int temp = data [x];
                data [x] = data [index];
                data [index] = temp;
            }

            for(int y = 0; y < jmlh_data; y++)
                System.out.println(data[y]+" ");

            System.out.println(pesan+"\n");
        }
    }
}