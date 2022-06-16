import java.util.LinkedList;

public class Latihan1{

   public static void main(String[] args) {
      
      LinkedList<String> barang = new LinkedList<>();

      barang.add ("Laptop");
      barang.add ("Komputer");
      barang.add ("Radio");
         
      if (barang.isEmpty()){
         System.out.println("Data Kosong");
      }else{
         System.out.println("Data Penuh");
      }
      if (barang.contains("Komputer")){
         System.out.println("Barang Ditemukan");
      }else{
         System.out.println("Barang Tidak Ditemukan");
      }
   }
}