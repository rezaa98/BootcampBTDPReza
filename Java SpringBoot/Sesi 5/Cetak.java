public class Cetak {

	static double maxNumber(double a, double b) {
		if (a > b)
			return a;
		else
			return b;
	}

	static int maxNumber(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxNumber(10, 20)); // method int
		System.out.println(maxNumber(10.65, 20.34)); // method double
	}

}
