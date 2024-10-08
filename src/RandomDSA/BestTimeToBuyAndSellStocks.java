package RandomDSA;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = {3,1,4,8,7,2,5};
        int minPrice=Integer.MAX_VALUE;
        int maxprofit=Integer.MIN_VALUE;

        for (int eachPrice: arr){
            minPrice = Math.min(minPrice,eachPrice);
            int profit = eachPrice - minPrice;
            maxprofit = Math.max(maxprofit,profit);
        }

        System.out.println("Maximum profit from the buying and selling of the share will be :: "+ maxprofit);
    }
}
