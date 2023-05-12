import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class q_349_Intersection_of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        ArrayList<Integer> al = new ArrayList<>();
//        int i = 0, j = 0;
//        while (i < nums1.length && j < nums2.length) {
//            if (nums1[i] < nums2[j]) {
//                i++;
//            } else if (nums1[i] > nums2[j]) {
//                j++;
//            } else {
//                if (!al.contains(nums1[i])) {
//                    al.add(nums1[i]);
//                }
//                i++;
//                j++;
//            }
//        }
//        int[] ans = new int[al.size()];
//        for (int k = 0; k < al.size(); k++) {
//            ans[k] = al.get(k);
//        }
//        return ans;

        Set<Integer> n2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums1).boxed().filter(n2Set::contains).distinct().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of first array: ");
        int len1 = sc.nextInt();
        int[] arr1 = new int[len1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the length of second array: ");
        int len2 = sc.nextInt();
        int[] arr2 = new int[len2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }
}
