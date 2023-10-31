import java.util.Scanner;

public class q_7_Reverse_Integer {
    public static int reverse(int x) {
        long reverseNum = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            reverseNum += lastDigit;
            reverseNum *= 10;
            x /= 10;
        }
        reverseNum /= 10;
        if (reverseNum > Integer.MAX_VALUE || reverseNum < Integer.MIN_VALUE) {
            return 0;
        }
        if (x < 0) {
            return (int) (-1 * reverseNum);
        } else {
            return (int) reverseNum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(reverse(x));
    }
}
