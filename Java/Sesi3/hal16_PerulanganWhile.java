import java.util.Scanner;

public class hal16_PerulanganWhile {
    public static void main(String[] args) {
        
        //make variabel
        boolean running = true;
        int counter = 0;
        String jawab ;
        Scanner scan = new Scanner(System.in);

        //perulangan menggunakan while
        while(running) {
            System.out.println ("Apakah anda ingin keluar?");
            System.out.print ("Jawab (ya atau tidak)> ");

            jawab = scan.nextLine();

            //cek jawabannya kalau iya stop looping
            if(jawab.equalsIgnoreCase("ya")){
                running = false;
            }
            counter++;
        }
        System.out.println("anda sudah melakukan perulangan sebanyak : "+ counter +" kali");
    
    }
}
