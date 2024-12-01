package DSA.Arrays.BuySellStocks;

// can buy and sell as many times

public class BestTimeToBuyAndSellStocks2 {
    public static void main(String[] args) {
        int[] stocks = {5,2,6,1,4,7,3,6};
        int profit= 0;
        for (int i = 1; i < stocks.length; i++) {
            if (stocks[i-1]<stocks[i])
                profit+= stocks[i] - stocks[i-1];
        }
        System.out.println("Max profit from the above stocks prices obtained is :: "+ profit);
    }
}
