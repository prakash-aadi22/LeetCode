import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class remove_element_q_27_copy {
    /*
    INPUT:-
    nums = [3,2,2,3]
    val = 2
    OUTPUT:-
    [3,3,2,2]
    2
    */
    public static int removeElement1(int[] nums1, int val) {
        System.out.println(Arrays.toString(nums1));
        ArrayList<Integer> al = IntStream.of(nums1).boxed().collect(Collectors.toCollection(ArrayList::new));
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == val) {
                al.remove(i);
                i--;
            }
        }
        System.out.println("nums1: " + al);
        return al.size();
    }

    public static int removeElement2(int[] nums2, int val) {
        System.out.println(Arrays.toString(nums2));
        ArrayList<Integer> al1 = new ArrayList<>();
//        for (int i = 0; i < nums2.length; i++) {
//            if (nums2[i] != val) {
//                al1.add(nums2[i]);
//            }
//        }
        for (int j : nums2) {
            if (j != val) {
                al1.add(j);
            }
        }
        System.out.println("nums2: " + al1);
        return al1.size();
    }

    public static int removeElement3(int[] nums3, int val) {
        System.out.println(Arrays.toString(nums3));
        for (int i = 0, j = 0; i < nums3.length; i++) {
            if (nums3[i] == val) {
                int temp = nums3[i];
                nums3[i] = nums3[j];
                nums3[j] = temp;
                j++;
            }
        }
        System.out.print("nums3: ");
        System.out.println(Arrays.toString(nums3));
        int a;
        for (a = 0; a < nums3.length; a++) {
            if (nums3[a] != val) {
                break;
            }
        }
        return a;
    }

    public static int removeElement4(int[] nums4, int val) {
        System.out.println(Arrays.toString(nums4));
        for (int i = 0; i < nums4.length; i++) {
            if (nums4[i] != val) {
                int temp = nums4[i];
                nums4[i] = nums4[nums4.length - 1];
                nums4[nums4.length - 1] = temp;
            }
        }
        System.out.print("nums4: ");
        System.out.println(Arrays.toString(nums4));
        int b;
        for (b = 0; b < nums4.length; b++) {
            if (nums4[b] == val) {
                break;
            }
        }
        return b;
    }

    public static int removeElement5(int[] nums5, int val) {
        System.out.println(Arrays.toString(nums5));
        for (int i = 0; i < nums5.length; i++) {
            if (nums5[i] == val) {
                int temp = nums5[i];
                nums5[i] = nums5[nums5.length - 1];
                nums5[nums5.length - 1] = temp;
            }
        }
        System.out.print("nums5: ");
        System.out.println(Arrays.toString(nums5));
        int c;
        for (c = 0; c < nums5.length; c++) {
            if (nums5[c] == val) {
                break;
            }
        }
        return c;
    }

    public static int removeElement6(int[] nums6, int val) {
        int left_most_index = 0;
        System.out.println(Arrays.toString(nums6));
        for (int i = 0; i < nums6.length; i++) {
            if (nums6[i] != val) {
                nums6[left_most_index++] = nums6[i];
            }
        }
        System.out.print("nums6: ");
        System.out.println(Arrays.toString(nums6));
        return left_most_index;

    }


    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int[] nums2 = {3, 2, 2, 3};
        int[] nums3 = {3, 2, 2, 3};
        int[] nums4 = {3, 2, 2, 3};
        int[] nums5 = {3, 2, 2, 3};
        int[] nums6 = {3, 2, 2, 3};
        int val = 2;
        System.out.println(removeElement1(nums1, val));
        System.out.println(removeElement2(nums2, val));
        System.out.println(removeElement3(nums3, val));
        System.out.println(removeElement4(nums4, val));
        System.out.println(removeElement5(nums5, val));
        System.out.println(removeElement6(nums6, val));
    }
}
