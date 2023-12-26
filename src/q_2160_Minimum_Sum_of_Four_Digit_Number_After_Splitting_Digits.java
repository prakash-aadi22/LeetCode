import java.util.Arrays;
import java.util.Scanner;

public class q_2160_Minimum_Sum_of_Four_Digit_Number_After_Splitting_Digits {
    public static int minimumSum(int num) {
        int[] digitsArr = new int[4];
        int index = 0;
        while (num != 0) {
            digitsArr[index++] = num % 10;
            num /= 10;
        }
        Arrays.sort(digitsArr);
        return ((digitsArr[0] * 10 + digitsArr[3]) + (digitsArr[1] * 10 + digitsArr[2]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(minimumSum(n));
    }
}
