import java.util.Scanner;

public class q_121_Best_Time_to_Buy_and_Sell_Stock {

    public static int maxProfit(int[] prices) {
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
