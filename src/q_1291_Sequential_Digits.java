import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class q_1291_Sequential_Digits {

    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        for (int digit = 1; digit < 9; ++digit) {
            int next = digit, n = next;
            while (n <= high && next < 10) {
                if (n >= low) {
                    ans.add(n);
                }
                n = n * 10 + ++next;
            }
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the low value: ");
        int l = sc.nextInt();
        System.out.print("Enter the high value: ");
        int h = sc.nextInt();
        System.out.println(sequentialDigits(l, h));
    }
}
