import java.util.Scanner;

public class q_2413_Smallest_Even_Multiple {
    public static int smallestEvenMultiple(int n) {
        if (n % 2 != 0) {
            return n * 2;
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(smallestEvenMultiple(n));
    }
}
