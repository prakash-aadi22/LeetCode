import java.util.Scanner;

public class q_2520_Coun_the_Digits_That_Divide_a_Number {
    public static int countDigits(int num) {
        int count = 0;
        int x = num;
        while (x != 0) {
            int t = x % 10;
            if (t != 0 && num % t == 0) {
                count++;
            }
            x /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(countDigits(n));
    }
}
