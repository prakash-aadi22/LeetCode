import java.util.Arrays;
import java.util.Scanner;

public class q_1790_Check_if_One_String_Swap_Can_Make_Strings_Equal {
    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        int count = 0;  // counts the number of in differences
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
            if (count > 2) {    // same string not achievable by a single swap
                return false;
            }
            // build the frequency array
            f1[s1.charAt(i) - 'a']++;
            f2[s2.charAt(i) - 'a']++;
        }
        // if no other case, then character will have same frequencies
        // if given strings are already equal, that'll also be handled by this
        return Arrays.equals(f1, f2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = sc.next();
        System.out.print("Enter the second string: ");
        String s2 = sc.next();
        System.out.println(areAlmostEqual(s1, s2));
    }
}
