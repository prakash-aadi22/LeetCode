import java.util.Scanner;

public class q_121_Best_Time_to_Buy_and_Sell_Stock {

    public static int maxProfit(int[] prices) {
        // Wrong for [2,4,1] but correct for [7,6,4,3,1] and [7,1,5,3,6,4]
//        int min = Integer.MAX_VALUE, minIndex = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < min) {
//                min = prices[i];
//                minIndex = i;
//            }
//        }
//        int max = Integer.MIN_VALUE;
//        for (int i = minIndex; i < prices.length; i++) {
//            if (prices[i] > max) {
//                max = prices[i];
//            }
//        }
//        return (max - min);

        int profit = 0;
        int buyAmt = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (buyAmt > prices[i]) {
                buyAmt = prices[i];
            } else if (profit < (prices[i] - buyAmt)) {
                profit = prices[i] - buyAmt;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProfit(arr));
    }
}
