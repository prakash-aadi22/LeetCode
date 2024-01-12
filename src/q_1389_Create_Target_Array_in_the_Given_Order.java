import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q_1389_Create_Target_Array_in_the_Given_Order {

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            al.add(index[i], nums[i]);
        }
        int k = 0;
        for (int a : al) {
            target[k] = a;
            k++;
        }
        return target;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the nums array: ");
        int len1 = sc.nextInt();
        int[] nums = new int[len1];
        System.out.println("Enter " + nums.length + " integers for 'nums':");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the length of the index array: ");
        int len2 = sc.nextInt();
        int[] index = new int[len2];
        System.out.println("Enter " + index.length + " integers for 'index':");
        for (int i = 0; i < index.length; i++) {
            index[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
}
