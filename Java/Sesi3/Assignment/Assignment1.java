package Assignment;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("===== MENGHITUNG LUAS LINGKARAN =====");
        System.out.println("=====================================");

        double Luas, P1;
        int r;

        P1 = 3.14 ;
        r = 18 ;

        //proses
        Luas = P1 * r * r;

        //hasil
        System.out.println("Diketahui : ");
        System.out.println("Jari - Jari = "+r);
        System.out.println("Konstanta Phi = "+ P1);
        System.out.println("Maka Luas Lingkaran = "+ Luas);
    }
}
