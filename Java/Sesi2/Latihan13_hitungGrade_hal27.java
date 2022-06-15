import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Latihan13_hitungGrade_hal27 {
    public static void main(String[] args) {
        //create variable and scan
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        //get input
        System.out.print("Inputkan nilai anda : ");
        nilai = scan.nextInt();

        //kondisi grade
        if ( nilai >= 90){
            grade ="A Pinter gaes";
        }
        else if ( nilai >= 80 ){
            grade = "B+ Mayan pinter gaes";
        }
        else if ( nilai >= 70 ){
            grade = "B bolehlah";
        }
        else if ( nilai >= 60 ){
            grade = "C+ Belajar lagi ya";
        }
        else if ( nilai >= 50 ){
            grade = "C duh harus semangat lagi belajarnya";
        }
        else if ( nilai >= 40 ){
            grade = "D yok bisa belajarnya yang giat";
        }
        else {
            grade = "E ngulang ini mah";
        }

        System.out.println("Grade: "+ grade);
    }
}
