import java.util.Arrays;
import java.util.Scanner;

public class q_1317_Convert_Integer_to_the_Sum_of_Two_No_Zero_Integers {

    public static int[] getNoZeroIntegers(int n) {
        n--;
        int m = 1;
        int[] ans = {m, n};
        while (contains(ans[0]) || contains(ans[1])) {
            ans[0]++;
            ans[1]--;
        }
        return ans;
    }

    public static boolean contains(int n) {
        while (n != 0) {
            if (n % 10 == 0)
                return true;
            n = n / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(Arrays.toString(getNoZeroIntegers(n)));
    }
}
