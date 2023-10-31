import java.util.Scanner;

public class q_70_Climbing_Stairs {
    public static int climbStairs(int n) {

        // Time Limit Exceed
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        return climbStairs(n - 1) + climbStairs(n - 2);

        // correct
//        if (n == 1) {
//            return 1;
//        }
//        if (n == 2) {
//            return 2;
//        }
//        int[] a = new int[n];
//        a[0] = 1;
//        a[1] = 2;
//        for (int i = 2; i < n; i++) {
//            a[i] = a[i - 1] + a[i - 2];
//        }
//        return a[n - 1];
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int n2 = 1, n1 = 2, all = 0;
        for (int i = 2; i < n; i++) {
            all = n2 + n1;
            n2 = n1;
            n1 = all;
        }
        return all;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        System.out.println(climbStairs(sc.nextInt()));
    }
}
