package Inheritance;

public class Main {
    public static void main(String[] args) {
        //buat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();

        //bikin objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        //membuat objek Lingkaran dan mengisi nilainya
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        //membuat objek persegi panjang dan isiin nilainya
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 3;

        //membuat objek segitiga dan isiin nilainya
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 15;
        segitiga.tinggi = 8;

        //memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        segitiga.luas();
        segitiga.keliling();
    }
}
