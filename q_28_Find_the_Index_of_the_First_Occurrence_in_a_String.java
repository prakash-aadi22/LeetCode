import java.util.Scanner;

public class q_28_Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static int strStr(String haystack, String needle) {
//        if (haystack.contains(needle)) {
//            return haystack.indexOf(needle);
//        } else {
//            return -1;
//        }
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the haystack: ");
        String haystack = sc.next();
        System.out.print("Enter the needle: ");
        String needle = sc.next();
        System.out.println(strStr(haystack, needle));
    }
}
