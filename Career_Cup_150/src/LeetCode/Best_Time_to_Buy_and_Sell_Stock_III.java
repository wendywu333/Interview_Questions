/**
 * 
 */
package LeetCode;


/**
 * @author Wenzhe
 * @date Jul 5, 2013
 * 
 * passed all tests
 * 
 */
public class Best_Time_to_Buy_and_Sell_Stock_III {

	public int maxProfit(int[] prices) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int max = 0;
		int n = prices.length;

		if (prices.length <= 1)
			return max;

		// max [0...i]
		int[] maxprofit1 = new int[n];
		// max[i...n-1]
		int[] maxprofit2 = new int[n];

		maxprofit1[0] = 0;
		int min = prices[0];
		for (int i = 1; i < n; i++) {
			min = (prices[i] < min) ? prices[i] : min;
			maxprofit1[i] = (prices[i] - min > maxprofit1[i - 1]) ? prices[i]
					- min : maxprofit1[i - 1];
		}

		maxprofit2[0] = maxprofit1[n - 1];
		maxprofit2[n - 1] = 0;
		int maxx = prices[n - 1];

		for (int i = n - 2; i > 0; i--) {

			maxx = (prices[i] > maxx) ? prices[i] : maxx;
			maxprofit2[i] = (maxx - prices[i] > maxprofit2[i + 1]) ? maxx
					- prices[i] : maxprofit2[i + 1];
		}

		for (int i = 0; i < n - 1; i++) {
			max = maxprofit1[i] + maxprofit2[i + 1] > max ? maxprofit1[i]
					+ maxprofit2[i + 1] : max;
		}

		max = maxprofit1[n - 1] > max ? maxprofit1[n - 1] : max;
		return max;

	}

}
