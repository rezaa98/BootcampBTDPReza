 import java.util.Scanner;

public class Latihan14_LampuLaluLintas_hal31 {
    public static void main(String[] args) {
        
        //make variable
        String lampu;
        Scanner scan = new Scanner(System.in);

        //take input
        System.out.println("inputkan nama warna yah : ");
        lampu = scan.nextLine();

        switch(lampu){
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("Warna Lampu Salah!");
        }
    }
}
