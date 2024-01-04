import java.util.Arrays;
import java.util.Scanner;

public class q_75_Sort_Colors {
    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] num = new int[len];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter the value of " + i + ": ");
            num[i] = sc.nextInt();
        }
        sortColors(num);
    }
}
