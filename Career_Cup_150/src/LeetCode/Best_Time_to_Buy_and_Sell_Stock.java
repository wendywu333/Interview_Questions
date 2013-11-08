/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jul 4, 2013
 * 
 * passed all tests
 * 
 */
public class Best_Time_to_Buy_and_Sell_Stock {

	public int maxProfit(int[] prices) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int min = Integer.MAX_VALUE;
		int maxprofit = 0;

		for (int i = 0; i < prices.length; i++) {
			min = (prices[i] < min) ? prices[i] : min;
			maxprofit = (prices[i] - min > maxprofit) ? prices[i] - min
					: maxprofit;
		}

		return maxprofit;

	}

}
