//Say you have an array for which the ith element is the price of a given stock on day i.
//Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
public class _122BestTimeToBuyAndSellStock2 {
	public int maxProfit(int[] prices) {
		int maxPrice = 0;
		
		for (int j = 0; j < prices.length - 1; j++) {
			if (prices[j] < prices[j + 1])
				maxPrice += prices[j + 1] -prices[j];
		}
		
		return maxPrice;
	}
}
