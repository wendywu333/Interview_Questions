/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 4/6/2013
 * passes all test cases
 * 
 */
public class Unique_Paths {

	public int uniquePaths(int m, int n) {

		if (m == 1 || n == 1) {
			return 1;
		}
		int[][] table = new int[m + 1][n + 1];
		table[m][n] = 0;
		for (int a = 0; a < m + 1; a++) {
			table[a][n] = 1;
		}
		for (int a = 0; a < n + 1; a++) {
			table[m][a] = 1;
		}
		for (int i = m - 1; i > 0; i--) {
			for (int j = n - 1; j > 0; j--) {
				table[i][j] = table[i + 1][j] + table[i][j + 1];
			}
		}

		return table[1][1];

	}

	public static void main(String args[]) {
		Unique_Paths o = new Unique_Paths();
		System.out.println(o.uniquePaths(8, 9));
	}

}
