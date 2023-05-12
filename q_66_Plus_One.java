import java.util.Arrays;
import java.util.Scanner;

public class q_66_Plus_One {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int[] digits = new int[len];
        for (int i = 0; i < digits.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            digits[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
