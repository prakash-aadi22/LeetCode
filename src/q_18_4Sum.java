import java.util.*;

public class q_18_4Sum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        return new AbstractList<>() {
            private List<List<Integer>> ans;

            @Override
            public List<Integer> get(int index) {
                init();
                return ans.get(index);
            }

            @Override
            public int size() {
                init();
                return ans.size();
            }

            private void init() {
                if (ans != null) {
                    return;
                }
                ans = new LinkedList<>();
                if (nums == null || nums.length < 3) {
                    return;
                }
                Arrays.sort(nums);
                int n = nums.length;
                for (int i = 0; i < n - 3; i++) {
//                    if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                    if (i == 0 || nums[i] != nums[i - 1]) {
                        for (int j = i + 1; j < n - 2; j++) {
                            if (j == i + 1 || (j > i + 1 && nums[j] != nums[j - 1])) {
                                int left = j + 1;
                                int right = n - 1;
                                while (left < right) {
                                    long sum = nums[i];
                                    sum += nums[j];
                                    sum += nums[left];
                                    sum += nums[right];
                                    if (sum == target) {
                                        ArrayList<Integer> miniSol = new ArrayList<>();
                                        miniSol.add(nums[i]);
                                        miniSol.add(nums[j]);
                                        miniSol.add(nums[left]);
                                        miniSol.add(nums[right]);
                                        ans.add(miniSol);
                                        while (left < right && nums[left] == nums[left + 1]) {
                                            left++;
                                        }
                                        while (left < right && nums[right] == nums[right - 1]) {
                                            right--;
                                        }
                                        left++;
                                        right--;
                                    } else if (sum > target) {
                                        right--;
                                    } else {
                                        left++;
                                    }
                                }
                            }
                        }
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
        System.out.print("Enter the value of target: ");
        int x = sc.nextInt();
        System.out.println(fourSum(arr, x));
    }
}
