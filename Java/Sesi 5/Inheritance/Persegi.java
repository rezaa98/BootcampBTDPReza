package Inheritance;

public class Persegi extends BangunDatar{
    double sisi;

    @Override
    double luas(){
        double luas = sisi * sisi;
        System.out.println("Luas Persegi : "+ luas);
        return luas;
    }
    @Override
    double keliling(){
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi: "+keliling);
        System.out.println("");
        return keliling;
    }
}
