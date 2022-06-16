package Anak;

public class Manusia {

}

abstract class Manusia {
    protected abstract void nyanyiLagu();
}

class Cowok extends Manusia {
    @Override
    protected void nyanyiLagu() {
        System.out.println("da du di dam");
        // statement dari perilaku yang menampilkan output pesan text yang berbeda dari
        // class manusia
    }
}

class Cewek extends Manusia {
    // menggunakan method dari class abstract manusia
    @Override
    protected void nyanyiLagu() {
        System.out.println("du ri dam dam");
        // statement dari perilaku yang menampilkan output pesan text yang berbeda dari
        // class manusia
    }
}

public class Cetak {
    public static void main(String[] args) {
        // buat object referensi class manusia, dengan cons cowok
        Manusia cowok = new Cowok();

        // menampilkan output pada method yang ada di class cowok
        cowok.nyanyiLagu();

        // buat objek referensi class manusia, dengan cons cewek
        Manusia cewek = new Cewek();

        // menampilkan output pada method yang ada di class cewek
        cewek.nyanyiLagu();
    }
}
