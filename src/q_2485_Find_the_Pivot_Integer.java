import java.util.Scanner;

public class q_2485_Find_the_Pivot_Integer {
    public static int pivotInteger(int n) {
        int ans = (n * n + n) / 2;
        int sq = (int) Math.sqrt(ans);
        return sq * sq == ans ? sq : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(pivotInteger(n));
    }
}
