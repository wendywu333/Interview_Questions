/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jul 13, 2013
 * 
 * passed all tests
 */
public class Jump_Game {

	public boolean canJump(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int n = A.length;
		boolean[] a = new boolean[n];
		a[0] = true;
		for (int i = 1; i < n; i++) {
			for(int j = i-1; j >= 0; j--){
				if(a[j] == true && j + A[j] >= i){
					a[i] = true;
					break;
				}
			}
		}
		return a[n - 1];
	}

}
