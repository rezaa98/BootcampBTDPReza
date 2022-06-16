package Inheritance;

public class Lingkaran extends BangunDatar {
    double r;
    //r = jari jari lingkaran

    @Override
    double luas(){
        double luas = (double) (Math.PI * r * r);
        System.out.println("Luas Lingkaran : "+ luas);
        return luas;
    }
    @Override
    double keliling(){
        double keliling = (double) (Math.PI * r);
        System.out.println("Keliling Lingkaran: "+keliling);
        System.out.println("");
        return keliling;
    }
}
