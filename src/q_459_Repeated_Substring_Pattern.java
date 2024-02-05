import java.util.Scanner;

public class q_459_Repeated_Substring_Pattern {
    public static boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        System.out.println(repeatedSubstringPattern(s));
    }
}
