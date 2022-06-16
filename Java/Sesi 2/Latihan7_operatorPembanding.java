public class Latihan7_operatorPembanding {
    public static void main(String[] args) {
        int nilaiA = 12;
        int nilaiB = 4;
        boolean hasil;

        // apakah nilai A lebih besar dari nilai B?
        hasil = nilaiA > nilaiB;
        System.out.println(hasil);

        //apakah nilai A lebih kecil dari nilai B
        hasil = nilaiA < nilaiB;
        System.out.println(hasil);

        //apakah nilai A lebih besar sama dengan dari nilai B
        hasil = nilaiA >= nilaiB;
        System.out.println(hasil);

        //apakah nilai A lebih kecil sama dengan dari nilai B
        hasil = nilaiA <= nilaiB;
        System.out.println(hasil);

        //apakah nilai A sama dengan nilai B
        hasil = nilaiA == nilaiB;
        System.out.println(hasil);

        //apakah nilai A tidak sama dengan nilai B
        hasil = nilaiA != nilaiB;
        System.out.println(hasil);
    }
}
