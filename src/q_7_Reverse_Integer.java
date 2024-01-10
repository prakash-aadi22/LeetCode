import java.util.Scanner;

public class q_7_Reverse_Integer {
    public static int reverse(int x) {
        long reverseNum = 0;
        while (x != 0) {
            reverseNum = (reverseNum * 10) + (x % 10);
            x /= 10;
        }
        if (reverseNum > Integer.MAX_VALUE || reverseNum < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reverseNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.println(reverse(x));
    }
}
