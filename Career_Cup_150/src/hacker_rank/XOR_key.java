/**
 * 
 */
package hacker_rank;

import java.util.Scanner;

/**
 * @author Wenzhe
 * @date 4/8/2013
 * 
 */
public class XOR_key {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sin = new Scanner(System.in);
		int T = sin.nextInt();
		int tc = 0;
		while (tc < T) {
			int N = sin.nextInt();
			int Q = sin.nextInt();
			int[] arr = new int[N];
			int[][] query = new int[Q][3];
			for (int i = 0; i < N; i++) {
				arr[i] = sin.nextInt();
			}
			for (int j = 0; j < Q; j++) {
				query[j][0] = sin.nextInt();
				query[j][1] = sin.nextInt();
				query[j][2] = sin.nextInt();
			}

			xOrq(arr, query, Q);

			tc++;

		}
	}

	private static int xOrq(int[] arr, int[][] query, int sizeQ) {
		// TODO Auto-generated method stub

		for (int i = 0; i < sizeQ; i++) {
			int res = Integer.MIN_VALUE;
			for (int j = query[i][1] - 1; j < query[i][2]; j++) {
				res = Math.max(res, query[i][0] ^ arr[j]);
			}
			System.out.println(res);

		}

		return 0;
	}
}
