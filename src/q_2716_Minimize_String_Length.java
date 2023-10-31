import java.util.HashSet;
import java.util.Scanner;

public class q_2716_Minimize_String_Length {
    public static int minimizedStringLength(String s) {
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i));
        }
        return hs.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.println(minimizedStringLength(str));
    }
}
