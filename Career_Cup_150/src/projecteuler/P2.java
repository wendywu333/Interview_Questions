package projecteuler;

public class P2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 2;
		int a = 1;
		int b = 2;
		while (b <= 4000000) {
			int temp = b;
			b = a + b;
			a = temp;
			if (b % 2 == 0) {
				sum += b;
			}

		}

		System.out.println(sum);

	}

}
