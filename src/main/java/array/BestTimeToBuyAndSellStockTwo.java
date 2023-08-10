package array;

//(Medium)
//122. Best Time to Buy and Sell Stock 2  --> IMP
public class BestTimeToBuyAndSellStockTwo {

    public static int maxProfitOne(int[] prices){ // O(n)
        int sum = 0, maxProfit = 0;
        int minBuy = prices[0];

        for(int i = 0; i < prices.length; i++){
            minBuy = Math.min(prices[i], minBuy);
            maxProfit = Math.max((prices[i]-minBuy), maxProfit);
            if(maxProfit > 0){
                sum+=maxProfit;
                minBuy = prices[i];
                maxProfit = 0;
            }
        }
        return sum;
    }

    public static int maxProfitTwo(int[] prices){ //O(n)
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1])
                profit+= prices[i] - prices[i-1];
        }
        return profit;
    }


    public static void main(String[] args) {
//        int[] num = {7,1,5,3,6,4};
//        int[] num = {7,6,4,3,1};
//        int[] num = {5, 2, 6, 1, 4};
//        int[] num = {2, 4, 1};
        int[] num = {5, 2, 7, 3, 6, 1, 2, 4};
//        int[] num = {1, 2, 3, 4, 5};
//        int[] num = {2,1,2,0,1};
        System.out.println(maxProfitOne(num));
        System.out.println(maxProfitTwo(num));


    }
}
