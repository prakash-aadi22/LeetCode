import java.util.Scanner;

public class q_2806_Account_Balance_After_Rounded_Purchase {
    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        return 100 - (purchaseAmount + 5) / 10 * 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the purchase amount: ");
        int n = sc.nextInt();
        System.out.println(accountBalanceAfterPurchase(n));
    }
}
