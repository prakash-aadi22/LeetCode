import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_40_Combination_Sum_II {
    static int point;
    static List<List<Integer>> ans;
    static int[] candidates;

    public static List<List<Integer>> combinationSum2(int[] allCandidates, int target) {
        return new AbstractList<>() {
            @Override
            public int size() {
                init();
                return ans.size();
            }

            @Override
            public List<Integer> get(int index) {
                init();
                return ans.get(index);
            }

            private void init() {
                candidates = allCandidates;
                int[] sortArr = new int[51];
                for (int val : candidates) {
                    sortArr[val]++;
                }
                int count = 0;
                for (int i = 0; i < 51; i++) {
                    if (sortArr[i]-- != 0) {
                        candidates[count++] = i;
                        i--;
                    }
                }
                ans = new ArrayList<>();
                point = target;
                recursive(new ArrayList<>(), 0, 0);
            }
        };
    }

    public static void recursive(ArrayList<Integer> memory, int start, int sum) {
        if (sum == point) {
            ans.add(new ArrayList<>(memory));
        } else if (sum > point) {
            return;
        }
        int prev = 0;
        for (int i = start; i < candidates.length; i++) {
            if (prev != candidates[i]) {
                memory.add(candidates[i]);
                recursive(memory, i + 1, sum + candidates[i]);
                memory.remove(memory.size() - 1);
            }
            prev = candidates[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of the target: ");
        int t = sc.nextInt();
        System.out.println((combinationSum2(arr, t)));
    }
}
