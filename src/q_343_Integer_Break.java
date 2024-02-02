import java.util.Scanner;

public class q_343_Integer_Break {

    public static int integerBreak(int n) {
        if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        } else if (n % 3 == 0) {
            return (int) Math.pow(3, n / 3);
        } else if (n % 3 == 1) {
            return 2 * 2 * (int) Math.pow(3, (n - 4) / 3);
        } else {
            return 2 * (int) Math.pow(3, n / 3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(integerBreak(n));
    }
}
