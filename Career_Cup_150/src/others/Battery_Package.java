/**
 * 
 */
package others;

/**
 * @author Wenzhe
 * @date Jun 27, 2013
 * 
 * to be continue...
 * 
 */

/*
 * There are 3 types of battery package, including 6,9,20 batteries
 * respectively. Given N batteries, calculate all possible combinations of these
 * 3 packages.
 */
public class Battery_Package {

	public int[] calculate(int[] value, int sum) {

		// res: store how many of packages are needed
		// res[0]: 6 res[1]: 9 res[2]:20
		int[] res = new int[value.length];
		if (sum < value[0])
			return null;
		
		

		return res;

	}

	public void main(String args) {

		Battery_Package o = new Battery_Package();

		// important: declare and initialize array
		int[] value = new int[] { 6, 9, 20 };
		o.calculate(value, 58);

	}

}
