import java.util.*;

public class q_39_Combination_Sum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        return new AbstractList<>() {
            private List<List<Integer>> result;

            private void findCombination(int index, int target, ArrayList<Integer> elements) {
                if (0 == target) {
                    result.add(new ArrayList<>(elements));
                    return;
                }
                for (int i = index; i < candidates.length; i++) {
                    if (target >= candidates[i]) {
                        elements.add(candidates[i]);
                        findCombination(i, target - candidates[i], elements);
                        elements.remove(elements.size() - 1);
                    } else {
                        break;
                    }
                }
            }

            private void init() {
                if (null != result) {
                    return;
                }
                result = new ArrayList<>();
                Arrays.sort(candidates);
                findCombination(0, target, new ArrayList<>());
            }

            @Override
            public List<Integer> get(int index) {
                init();
                return result.get(index);
            }

            @Override
            public int size() {
                init();
                return result.size();
            }
        };
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
        System.out.println((combinationSum(arr, t)));
    }
}
