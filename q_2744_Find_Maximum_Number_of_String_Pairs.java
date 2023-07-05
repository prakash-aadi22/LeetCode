import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class q_2744_Find_Maximum_Number_of_String_Pairs {
    public static int maximumNumberOfStringPairs(String[] words) {
        int maxPairs = 0;
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            String reversedWord = sb.reverse().toString();
            if (wordSet.contains(reversedWord)) {
                maxPairs++;
            }
            wordSet.add(word);
        }
        return maxPairs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < words.length; i++) {
            words[i] = sc.next();
        }
        System.out.println(maximumNumberOfStringPairs(words));
    }
}
