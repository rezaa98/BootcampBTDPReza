package Assignment;

public class Assignment5 {
    public static void main(String[] args) {
        int X1, X2;
        int y1, y2;

        y1 = 8;
        y2 = 7;

        X1 = (y1+y2)*(y1+y2);
        X2 = (y1%4)*y2;
        System.out.println("===============================================");
        System.out.println("======A. SCRIPT MENGHITUNG X1 dan X2===========");
        System.out.println("===============================================");
        System.out.println("Nilai dari X1 = "+X1);
        System.out.println("Nilai dari X2 = "+X2);
        System.out.println("");
        System.out.println("===============================================");
        System.out.println("======B. MENAMPILKAN HASIL EVALUASI ===========");
        System.out.println("===============================================");
        System.out.println(X1 >= X2);
        System.out.println(X2 >= X1);
        System.out.println(X1%4 == ++X2%5);



        //x1=jumlah y1 dan y2 dikali jumlah y1 dan y2
        //x2=bagi y1 dengan 4 kemudian dikalikan y2
    }
}
