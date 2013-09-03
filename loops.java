

public class loops {

	public static void main(String[] args) {
		
		exponents(1);


		// int x = 45;

		// // while (x<101) {
		// // 	System.out.println(x);
		// // 	x = x+1;
		// // }



		// // for (int i=1; i <= 100; i++) {
		// // 	System.out.println(i);
		// // }

		// while (x>=20) {
		// 	System.out.println(x);
		// 	x = x-5;
		// }

		// for (int i=24; i <=68; i=i+2) {
		// 	System.out.println(i);
		// }

	}

	// public static int findLength(String str) {

	// 	for (int i = 0; i <str.length(); i++) {
	// 		len++
	// 	}

	// 	return len;

	// }

	public static void drugPotency(int loss, int minimum) {
		int month = 0;

		for (double i = 100; i >= minimum; i = i-(i*loss/100)) {
			System.out.println("month: "+month+"     effectiveness: "+i);
			month++;
		}

	}

	public static void exponents(int x) {
		double term = 1;
		double sum = 1.0;
		int i = 1;


		while (term>=1.0E-12) {
			int w=i;
			int y=1;

			while (w>1) {
				y=w*(w-1);
				w--;
			}

			term = Math.pow(x,i)/y;
			sum = sum + term;
			i++;
		}

		System.out.println("My     e^x: "+sum);
		System.out.println("Real   e^x: "+Math.exp(x));
	}

}
