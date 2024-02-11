import java.util.Scanner;

public class q_1456_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
    public static int maxVowels(String s, int k) {
        int i = 0, j = 0, n = s.length();
        int maxNoOfVowel = 0, countOfVowel = 0;
        byte[] str = new byte[n];
        s.getBytes(0, n, str, 0);
        byte[] vowel = new byte[123];
        vowel['a'] = vowel['e'] = vowel['u'] = vowel['i'] = vowel['o'] = 1;
        while (i < k) {
            countOfVowel += vowel[str[i++]];
        }
        maxNoOfVowel = countOfVowel;
        while (i < n)
            if ((countOfVowel += vowel[str[i++]] - vowel[str[j++]]) > maxNoOfVowel && (maxNoOfVowel = countOfVowel) == k) {
                return k;
            }
        return maxNoOfVowel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.next();
        System.out.print("Enter the Integer: ");
        int n = sc.nextInt();
        System.out.println((maxVowels(s, n)));
    }
}
