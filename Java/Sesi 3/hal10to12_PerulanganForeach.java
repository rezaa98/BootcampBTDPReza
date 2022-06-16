public class hal10to12_PerulanganForeach {
    public static void main(String[] args) {
        //make array
        int angka[] = {3,1,42,24,12};

        //menggunakan perulangan for each untuk menampilkan angka
        for( int x : angka ){
            System.out.print(x + " ");
        }
        System.out.println("");
        //==================================================================================
        //BREAK AND CONTINUE
        //=================================================================================
        System.out.println("================================================ ");
        System.out.println("==================== BREAK =====================");
        System.out.println("================================================ ");

        int i;
        for (i=0; i < 4; i++){
            if (i>=3){
                break;
            }
            System.out.println(" ");
            System.out.println("Selamat Belajar Gaesss!!!!");
        }
        System.out.println(i);
        System.out.println(" ");

        System.out.println("================================================ ");
        System.out.println("=================== Continue ====================");
        System.out.println("================================================ ");

        int q;
        for (q = 0; i < 4; q++) {
            if(q >= 3) {
                break;
            }
            System.out.println("Selamat Belajar yakk!!!");
            if(q >=2) {
                continue;
            }
            System.out.println("JAVAA");
        }
        System.out.println(q);
    }
}
