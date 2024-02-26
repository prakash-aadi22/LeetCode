import java.util.Arrays;
import java.util.Scanner;

public class q_1402_Reducing_Dishes {
    public static int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int res = 0, total = 0, n = satisfaction.length;
        for (int i = n - 1; i >= 0 && satisfaction[i] > -total; --i) {
            total += satisfaction[i];
            res += total;
        }
        return res;
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
        System.out.println((maxSatisfaction(arr)));
    }
}
