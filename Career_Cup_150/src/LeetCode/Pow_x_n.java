/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jul 7, 2013
 * 
 * passed all tests
 */
public class Pow_x_n {

	public double pow(double x, int n) {
		// Start typing your Java solution below
		// DO NOT write main() function

		if (n < 0)
			return 1.0 / power(x, -n);
		else
			return power(x, n);

	}

	public double power(double x, int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (n == 0)
			return 1;

		double a = pow(x, n / 2);

		if (n % 2 == 0)
			return a * a;
		else
			return a * a * x;
	}
	// public double pow(double x, int n) {
	// // Start typing your Java solution below
	// // DO NOT write main() function
	// if (n == 0)
	// return 1;
	// if (n < 0)
	// return 1.0 / pow(x, -n);
	//
	// double a = pow(x, n / 2);
	//
	// if (n % 2 == 0)
	// return a * a;
	// else
	// return a * a * x;
	// }
	//
	// public static void main(String args[]) {
	// (new Pow_x_n()).pow(1.00000, -8);
	// }

}


