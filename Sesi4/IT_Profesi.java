import java.util.Scanner;

public class IT_Profesi {
    public static void main(String[] args) {

        String  [] itProfesi = new String[5];

        //make scanner
        Scanner scan = new Scanner(System.in);

        //fill data to array
        for (int i = 0; i< itProfesi.length; i++){
            System.out.println("buah ke-"+i+": ");
            itProfesi[i] = scan.nextLine();
        }
        System.out.println("============================");

        //show all array
        for( String b : itProfesi ){
            System.out.println(b);
        }
        scan.close();
    }
}
