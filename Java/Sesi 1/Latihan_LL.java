import java.util.LinkedList;

public class Latihan_LL {
    public static void main(String[] args) {
        LinkedList<String> buah = new LinkedList<>();
        
        buah.add("Jeruk"); //0
        buah.add("Jambu");//1
        buah.add("Apel");//2
        buah.add("Melon");//3
        buah.add("Semangka");//4
        buah.add("Nanas");//5
        buah.add("Sirsak");//6

        //mencetak menampilkan Data
        System.out.println("nama buah:"+buah);

        //menghitung jumlah/ukuran pada objek linkedlist
        System.out.println("Jumlah Buah :"+buah.size());

        //mengambil data urutan teratas
        System.out.println("Data teratas: "+buah.getFirst());

        //mengambil data urutan terbawah
        //menggunakan fungsi getLast
        System.out.println("Data Terbawah : "+buah.getLast());

        //mengambil data pada nomor urut index n
        //menggunakan fungsi get
        System.out.println("Data noIndex 1 : "+buah.get(1));

        //mengambil data pada nomor urut index n
        //menggunakan fungsi get
        System.out.println("Data noIndex 1 : "+buah.get(6));

        //nambahin data ibjek buah gesyak
        buah.add("jeruk1");
        buah.add("Jambu2");
        buah.add("Apel");
        buah.add("Melon");

        buah.removeFirst(); //menghapus data pada urutan teratas
        buah.removeLast(); //menghapus data terakhir
        buah.remove(2); //menghapus data index ke n

        //cetak data
        System.out.println(buah);
    }
    
}
