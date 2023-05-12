import java.util.Scanner;

public class q_1822_Sign_of_the_Product_of_an_Array {
    public static int arraySign(int[] nums) {
        double product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                return 0;
            }
            product *= nums[i];
        }
        if (product > 0){
            return 1;
        } else if (product < 0){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arraySign(arr));
    }
}
