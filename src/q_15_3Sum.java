import java.util.*;

public class q_15_3Sum {
    private static List<List<Integer>> res;

    public static List<List<Integer>> threeSum(int[] nums) {
        return new AbstractList<>() {
            public List<Integer> get(int index) {
                init();
                return res.get(index);
            }

            public int size() {
                init();
                return res.size();
            }

            private void init() {
                if (res != null) return;
                Arrays.sort(nums);
                ArrayList<List<Integer>> ans = new ArrayList<>();
                for (int i = 0; i < nums.length; i++) {
                    if (i != 0 && nums[i] == nums[i - 1]) continue;
                    twoSum(i, ans);
                }
                res = ans;
            }

            private void twoSum(int i, ArrayList<List<Integer>> ans) {
                int target = -nums[i], left = i + 1, right = nums.length - 1;
                while (left < right) {
                    if (i + 1 < left && nums[left - 1] == nums[left]) {
                        left++;
                        continue;
                    }
                    if (nums[left] + nums[right] > target) right--;
                    else if (nums[left] + nums[right] < target) left++;
                    else {
                        ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                    }
                }
            }
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the String for the " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(threeSum(arr));
    }
}
