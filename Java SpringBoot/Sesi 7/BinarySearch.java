import java.util.Scanner;

class BinarySearch {
	 public static void binarySearch(int arr[], int first, int last, int key){  
		   int mid = (first + last)/2;  

		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element berhasil ditemukan pada index ke-" + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element tidak ditemukan mas bro!!");  
		   }  
		 }  
public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int arraySize = 0;
		int valueToFind;

		// INPUT ARRAY SIZE
		System.out.print("Input Jumlah Element : ");
		arraySize = scan.nextInt();
		int[] data = new int[arraySize];

		System.out.format("Masukan %d elements : \n", arraySize);
		for (int i = 0; i < arraySize; i++) {
			data[i] = scan.nextInt();
		}

		// FIND ARRAY
		System.out.print("Nilai yang di cari : ");
		valueToFind = scan.nextInt();
		int last = data.length - 1;

		BinarySearch.binarySearch(data, 0, last, valueToFind);
		scan.close();
	}
}