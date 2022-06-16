package Inheritance;

public class Segitiga extends BangunDatar {
    double alas;
    double tinggi;
    
    @Override
    double luas(){
        double luas = (0.5 * (alas * tinggi));
        System.out.println("Luas Segitiga : "+ luas);
        return luas;
    }
    //========SEGITIGA SAMA KAKIIIIIIII!!!!!======
    @Override
    double keliling(){
        double pitagoras = Math.sqrt((alas*alas)+(tinggi*tinggi));
        double keliling = pitagoras+alas+tinggi;
        System.out.println("Keliling Segitiga: "+keliling);
        System.out.println("");
        return keliling;
    }
}
