package Restoran;

public class makanan extends restoran{
    public static void main(String[] args) {
        restoran data = new restoran();

        //membuat data pada variabel
        data.setMenu ("Ayam Goreng");
        data.setHarga (17.000);
        data.setSpesial (true);

        //call get method
        System.out.println("Menu Makanan :"+ data.getMenu());
        System.out.println("Harga Makanan :"+ data.getHarga());
        System.out.println("Menu Spesial :"+ data.getSpesial());
    }
}
