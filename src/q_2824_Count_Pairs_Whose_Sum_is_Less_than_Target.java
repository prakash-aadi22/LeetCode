import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_2824_Count_Pairs_Whose_Sum_is_Less_than_Target {
    public static int countPairs(List<Integer> nums, int target) {
//        int ans = 0;
//        for (int i = 0; i < nums.size(); i++) {
//            for (int j = i + 1; j < nums.size(); j++) {
//                if ((nums.get(i) + nums.get(j)) < target) {
//                    ans++;
//                }
//            }
//        }
//        return ans;

        Integer[] arr = new Integer[nums.size()];
        arr = nums.toArray(arr);
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] + arr[j] < target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the nums: ");
        int len = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            System.out.print("Enter the value of " + i + ": ");
            al.add(sc.nextInt());
        }
        System.out.print("Enter the target: ");
        int t = sc.nextInt();
        System.out.println(countPairs(al, t));
    }
}
