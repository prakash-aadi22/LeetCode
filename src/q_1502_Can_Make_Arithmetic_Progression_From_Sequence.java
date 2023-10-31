import java.util.Arrays;
import java.util.Scanner;

public class q_1502_Can_Make_Arithmetic_Progression_From_Sequence {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        boolean ans = false;
        Arrays.sort(arr);
        if (arr.length == 2) {
            ans = true;
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (Math.abs(arr[i + 1] - arr[i]) == Math.abs(arr[i + 2] - arr[i + 1])) {
                ans = true;
            } else {
                return false;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(canMakeArithmeticProgression(arr));
    }
}
