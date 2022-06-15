public class hal21_NestedLoop {
    public static void main(String[] args) {
        int x, y;

        //bikin perulangan sebantak x dan y kali ya gees yak

        for(x=0; x<=5; x++){
            for( y = 0; y <= 3; y++){
                System.out.format("Perulangan [x=%d, y=%d] %n", x, y);
            }
        }
    }
}
