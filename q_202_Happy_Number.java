import java.util.HashSet;
import java.util.Scanner;

public class q_202_Happy_Number {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1) {
            int curr = n;
            int sum = 0;
            while (curr > 0) {
                sum += (curr % 10) * (curr % 10);
                curr /= 10;
            }
            if (!set.add(sum)) {
                return false;
            }
            n = sum;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(isHappy(n));
    }
}
