import java.util.Scanner;

public class q_1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the value of columns: ");
        int columns = sc.nextInt();
        int[][] twoD = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the value of " + i + "th row and " + j + "th column: ");
                twoD[i][j] = sc.nextInt();
            }
        }
        System.out.println(maximumWealth(twoD));
        System.out.print("\nData you entered : \n");
        for (int[] x : twoD) {
            for (int y : x) {
                System.out.print(y + "      ");
            }
            System.out.println();
        }
    }
}
