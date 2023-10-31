import java.util.Scanner;

public class q_29_Divide_Two_Integers {
    public static int divide(int dividend, int divisor) {
        int j;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0) || (divisor > 0 && dividend > 0)) {
            j = dividend / divisor;
            return j;
        } else if (divisor < 0 && dividend < 0) {
            j = dividend / divisor;
            if (j == Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            } else {
                return j;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        System.out.println(divide(dividend, divisor));
    }
}
