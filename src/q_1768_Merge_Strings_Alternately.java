import java.util.Scanner;

public class q_1768_Merge_Strings_Alternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String w1 = sc.next();
        System.out.print("Enter the second word: ");
        String w2 = sc.next();
        System.out.println((mergeAlternately(w1, w2)));
    }
}
