import java.util.Scanner;

public class q_400_Nth_Digit {
    public static int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;
        while (n > len * count) {
            n -= (int) (len * count);
            len++;
            count *= 10;
            start *= 10;
        }
        int target = start + (n - 1) / len;
        int remainder = (n - 1) % len;
        return Character.getNumericValue(Integer.toString(target).charAt(remainder));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(findNthDigit(n));
    }
}
