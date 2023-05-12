import java.util.Scanner;

public class q_344_Reverse_String {
    public static void reverseString(char[] s) {
        int j = s.length - 1;
        char temp;
        for (int i = 0; i < s.length / 2; i++, j--) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        reverseString(str.toCharArray());
    }
}
