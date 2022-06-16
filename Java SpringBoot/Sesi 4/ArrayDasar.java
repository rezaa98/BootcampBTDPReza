public class ArrayDasar {
    public static void main(String[] args) {
        //cara pertama
        //=========================================================
        // String [] nama;
        //==========================================================

        // //cara kedua
        //======================================================
        // String nama[];
        //======================================================

        //cara ketiga dengan kata kunci new

         //model 1 definisi array
        String[] bahasa = new String[6];

        bahasa [0] = "ReactJS";
        bahasa [1] = "ReactNative";
        bahasa [2] = "Golang";
        bahasa [3] = "PHP";
        bahasa [4] = "Python";
        bahasa [5] = "MaterialUI";

       
        // String[] bahasa= {"Reactjs","Reactnative", "golang", "php", "phyton"}; 
        //model 2 definisi array

        System.out.println(bahasa[5]);
    }
}