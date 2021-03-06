/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 4/4/2013
 * passes all test cases
 * 
 */
public class Valid_Sudoku {

	public boolean isValidSudoku(char[][] board) {

		if (board == null)
			return false;

		for (int i = 0; i < 9; i++) {
			boolean[] checkrow = new boolean[10];

			boolean[] checkcolumn = new boolean[10];

			for (int j = 0; j < 9; j++) {

				if (board[i][j] != '.') {
					if (checkrow[Character.getNumericValue(board[i][j])]) {
						return false;
					} else {
						checkrow[Character.getNumericValue(board[i][j])] = true;
					}
				}

				if (board[j][i] != '.') {
					if (checkcolumn[Character.getNumericValue(board[j][i])]) {
						return false;
					} else {
						checkcolumn[Character.getNumericValue(board[j][i])] = true;
					}
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!checkZone(i * 3, j * 3, board)) {
					return false;
				}
			}
		}

		return true;

	}

	private boolean checkZone(int i, int j, char[][] board) {
		boolean[] check = new boolean[10];

		for (int q = 0; q < 3; q++) {
			for (int p = 0; p < 3; p++) {
				if (board[i * 3 + p][j * 3 + q] != '.') {
					if (check[Character.getNumericValue(board[i + p][j + q])]) {
						return false;
					} else {
						check[Character.getNumericValue(board[i + p][j + q])] = true;
					}
				}
			}
		}
		return true;
	}

}
