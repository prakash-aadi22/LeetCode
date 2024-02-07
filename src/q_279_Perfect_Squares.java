import java.util.Scanner;

public class q_279_Perfect_Squares {
    public static int numSquares(int n) {
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            return 1;
        }
        while (n % 4 == 0) {
            n = n / 4;
        }
        if (n % 8 == 7) {
            return 4;
        }
        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            int base = (int) Math.sqrt(n - square);
            if (base * base == n - square) {
                return 2;
            }
        }
        return 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(numSquares(n));
    }
}
