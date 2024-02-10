import java.util.Scanner;

public class q_714_Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee {
    public static int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int ahead0 = 0;
        int ahead1 = 0;
        for (int ind = n - 1; ind >= 0; ind--) {
            int curr0 = 0;
            int curr1 = 0;
            for (int buy = 0; buy <= 1; buy++) {
                if (buy == 0) {
                    curr0 = Math.max(-prices[ind] + ahead1, ahead0);
                } else {
                    curr1 = Math.max(prices[ind] - fee + ahead0, ahead1);
                }
            }
            ahead0 = curr0;
            ahead1 = curr1;
        }
        return ahead0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value for the " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the fee: ");
        int f = sc.nextInt();
        System.out.println(maxProfit(arr, f));
    }
}
