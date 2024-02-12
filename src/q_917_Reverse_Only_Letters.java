import java.util.Scanner;

public class q_917_Reverse_Only_Letters {
    public static String reverseOnlyLetters(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (!Character.isLetter(charArray[start])) {
                start++;
            } else if (!Character.isLetter(charArray[end])) {
                end--;
            } else {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(reverseOnlyLetters(str));
    }
}
