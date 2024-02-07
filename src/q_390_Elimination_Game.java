import java.util.Scanner;

public class q_390_Elimination_Game {
    public static int lastRemaining(int n) {
        return n == 1 ? 1 : (n / 2 - lastRemaining(n / 2) + 1) * 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(lastRemaining(n));
    }
}
