public class objek {

}

class Nilai {
    int num1;
    int num2;
    nilai n = new Nilai();

    void cetakNilai(){
        System.out.println("(" + num1 + "," + num2 +")");
    }
    Nilai center(Nilai other){
        return new Nilai ((num1 + other.num1)/2, (num2 + other.num2)/2);
    }
    }
Nilai() {
    this(0,0);
}
Nilai(int num1, int num2){
    this.num1 = 11;
    this.num2 = 2;
}


