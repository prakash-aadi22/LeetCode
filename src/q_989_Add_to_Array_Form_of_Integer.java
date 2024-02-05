import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class q_989_Add_to_Array_Form_of_Integer {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int ind = num.length - 1;
        int car = 0;
        while (k > 0 && ind >= 0) {
            int r = k % 10;
            int var = ((car + num[ind] + r) % 10);
            car = ((car + num[ind] + r) / 10);
            num[ind] = var;
            k /= 10;
            ind--;
        }
        List<Integer> ans = new ArrayList<>();
        while (k > 0) {
            int r = k % 10;
            int var = (car + r) % 10;
            car = (car + r) / 10;
            ans.add(0, var);
            k /= 10;
        }
        while (car > 0 && ind >= 0) {
            int var = ((car + num[ind]) % 10);
            car = ((car + num[ind]) / 10);
            num[ind] = var;
            ind--;
        }
        if (car > 0)
            ans.add(0, car);
        for (int j : num) {
            ans.add(j);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + "th index: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to sum: ");
        int k = sc.nextInt();
        System.out.println(Arrays.toString(new List[]{addToArrayForm(arr, k)}));
    }
}
