import java.util.Scanner;

public class q_557_Reverse_Words_in_a_String_III {
    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversed.append(reversedWord).append(" ");
        }
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        String str = sc.next();
        System.out.println(reverseWords(str));
    }
}
