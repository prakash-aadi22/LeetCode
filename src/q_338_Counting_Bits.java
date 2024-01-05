import java.util.Arrays;
import java.util.Scanner;

public class q_338_Counting_Bits {
    public static int[] countBits(int n) {
//        int[] arr = new int[n + 1];
//        for (int i = 1; i <= n; i++) {
//            arr[i] = arr[i >> 1] + (i & 1);
//        }
//        return arr;

        int[] arr1 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr1[i] = arr1[i / 2] + i % 2;
        }

        return arr1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(Arrays.toString(countBits(n)));
    }
}
