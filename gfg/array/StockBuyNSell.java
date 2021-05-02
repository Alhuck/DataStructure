package gfg.array;

public class StockBuyNSell {

    public static int getMaxProfit(int[] arr) {

        int res = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] > arr[i]) {
                res = res + (arr[i + 1] - arr[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 5 ,3, 4, 2, 12 };
        System.out.println("The max profit is: " + getMaxProfit(arr));
    }

}
