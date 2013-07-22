/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jul 21, 2013
 * 
 * passed all tests
 */
public class Unique_Paths_II {

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (obstacleGrid.length == 0)
			return 0;
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int[][] array = new int[m][n];

		array[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
		for (int i = 1; i < m; i++) {
			array[i][0] = obstacleGrid[i][0] == 1 ? 0 : array[i - 1][0];
		}

		for (int i = 1; i < n; i++) {
			array[0][i] = obstacleGrid[0][i] == 1 ? 0 : array[0][i - 1];
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (obstacleGrid[i][j] == 1) {
					array[i][j] = 0;
				} else {
					array[i][j] = array[i - 1][j] + array[i][j - 1];
				}
			}
		}
		return array[m - 1][n - 1];
	}
}