public class Latihan5_operatorPenugasan {
    public static void main(String[] args) {
        int a;
        int b;

        // input nilai
        a = 5 ;
        b = 10;

        //penambahan
        b +=a;
        //sekarang hasil b = 15 soalnya di tambah
        System.out.println("penambahan : "+ b);

        //pengurangan
        b -= a;
        //sekarang b = 10 coz 15-5=10. nilainya ikut yang diatas
        System.out.println("Pengurangan : "+ b);

        //perkalian
        b *= a;
        //sekarang nilai b adalah 50 karena 10 kali 5 ikut nilai b diatas
        System.out.println("Perkalian : "+ b);

        //pembagian
        b/= a;
        System.out.println("Pembagian : "+ b);

        //sisa bagi
        b%=a;
        System.out.println("modulus : "+ b);

    }
    
}
