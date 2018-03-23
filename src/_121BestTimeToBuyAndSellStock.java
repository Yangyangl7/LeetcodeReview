//Say you have an array for which the ith element is the price of a given stock on day i.
//
//If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
public class _121BestTimeToBuyAndSellStock {
	 public int maxProfit(int[] prices) {
		 int minPrice = Integer.MAX_VALUE;
		 int maxPrice = 0;
		 
		 for (int i = 0; i < prices.length; i++) {
			 if (prices[i] < minPrice)
				 minPrice = prices[i];
			 else if (prices[i] - minPrice > maxPrice) {
				 maxPrice =  prices[i] - minPrice;
			 }
		 }
		 
		 return maxPrice;
	 }
}
