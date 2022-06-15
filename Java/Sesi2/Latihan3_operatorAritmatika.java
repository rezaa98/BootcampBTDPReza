public class Latihan3_operatorAritmatika {
    public static void main(String[] args) {
        int x = 20;
        int y = 40;

        System.out.println("x + y = "+ (x+y));
        System.out.println("x - y = "+ (x-y));
        System.out.println("x * y = "+ (x*y));
        System.out.println("x / y = "+ (x/y));
        System.out.println("x % y = "+ (x%y));
        System.out.println("x++ = "+ (x++));
        System.out.println("x-- = "+ (x--));
        System.out.println("--x = "+ (--x));
        System.out.println("++x = "+ (++x));

        //bedane X++ lawan ++X kek gini ges
        System.out.println("x++ = "+ (x++));
        System.out.println("++x = "+ (++x));
    }
}
