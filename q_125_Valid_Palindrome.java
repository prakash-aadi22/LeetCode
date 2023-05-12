import java.util.Scanner;

public class q_125_Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder(s1);
//         return s1.equals(sb.reverse().toString());
        return s1.contentEquals(sb.reverse());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        System.out.println(isPalindrome(sc.nextLine()));
    }
}
