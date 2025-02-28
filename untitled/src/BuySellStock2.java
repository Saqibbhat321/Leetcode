public class BuySellStock2 {
//Find and return the maximum profit you can achieve.

    //using greedy approach
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit = maxProfit + prices[i] - prices[i - 1];
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices =  {7,1,5,3,6,4};//{7,6,4,3,1}
        int max = maxProfit(prices);
        System.out.println("Maximum profit is: "+max);
    }
}

