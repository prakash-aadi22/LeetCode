import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class q_2215_Find_the_Difference_of_Two_Arrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return fd(nums1, nums2);
    }

    public static List<List<Integer>> fd(int[] nums1, int[] nums2) {
        return new AbstractList<List<Integer>>() {
            private List<List<Integer>> list;

            public List<Integer> get(int index) {
                if (list == null) {
                    helper();
                }
                return list.get(index);
            }

            public int size() {
                if (list == null) {
                    helper();
                }
                return list.size();
            }

            void helper() {
                boolean[] rep1 = new boolean[2001]; //
                int min = 1001;
                int max = -1001;
                for (int j : nums1) {
                    rep1[j + 1000] = true;
                    min = Math.min(min, j);
                    max = Math.max(max, j);
                }
                boolean[] rep2 = new boolean[2001]; //
                for (int j : nums2) {
                    rep2[j + 1000] = true;
                    min = Math.min(min, j);
                    max = Math.max(max, j);
                }
                List<Integer> l1 = new LinkedList<>();
                List<Integer> l2 = new LinkedList<>();
                for (int i = min + 1000; i <= max + 1000; i++) {
                    if (rep1[i] && !rep2[i]) {
                        l1.add(i - 1000);
                    }
                    if (rep2[i] && !rep1[i]) {
                        l2.add(i - 1000);
                    }
                }
                list = List.of(l1, l2);
            }
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the first array: ");
        int len1 = sc.nextInt();
        int[] arr1 = new int[len1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the length of the first array: ");
        int len2 = sc.nextInt();
        int[] arr2 = new int[len2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr2[i] = sc.nextInt();
        }
        System.out.println((findDifference(arr1, arr2)));
    }
}
