package array;

//(Easy)
//121. Best Time to Buy and Sell Stock 1 --> IMP
public class BestTimeToBuyAndSellStockOne {

    //Brute Force Approach --> TC :- O(n^2)
    public static int maxProfitOne(int[] prices) {
        int maxProfit = 0;
       for(int i = 0; i < prices.length; i++){
           for(int j = i+1; j < prices.length; j++){
               if(prices[i] < prices[j]){
                   int profit = prices[j] - prices[i];
                   maxProfit = Math.max(maxProfit, profit);
               }
           }
       }
       return maxProfit;
    }


    // using Auxiliary Array --> TC & SC :- O(n)
    public static int maxProfitTwo(int[] prices){
        int n = prices.length;
        int[] maxArr = new int[n];

        maxArr[n-1] = prices[n-1];
        for(int i = n-2; i >= 0; i--){
            maxArr[i] = Math.max(prices[i], maxArr[i+1]);
        }

        int maxProfit = 0;
        for(int i = 0; i < n; i++){
           maxProfit =  Math.max((maxArr[i] - prices[i]), maxProfit);
        }
        return maxProfit;
    }


    //Optimized solution --> Tc :- O(n) & Sc :- O(1)
    public static int maxProfitOptimized(int[] prices){
        int maxProfit = 0;
        int minBuy = prices[0];

        for(int i = 0; i < prices.length; i++){
            minBuy = Math.min(minBuy, prices[i]);
//            int profit = prices[i] - minBuy;
            maxProfit = Math.max(maxProfit, (prices[i] - minBuy));
        }
        return maxProfit;
    }
    public static void main(String[] args) {
//        int[] num = {7,1,5,3,6,4};
//        int[] num = {7,6,4,3,1};
//        int[] num = {5, 2, 6, 1, 4};
        int[] num = {2, 4, 1};
//        System.out.println(maxProfitOne(num));
//        System.out.println(maxProfitTwo(num));
        System.out.println(maxProfitOptimized(num));


    }
}
