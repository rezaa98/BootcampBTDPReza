public class Latihan4_Operator {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = 2;
        int d = 1;
        int e = 1;

        if(a==2){
            a = 1;
            b += 1;
            c -= 1;
            d /= 2;
            e = a%1;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
