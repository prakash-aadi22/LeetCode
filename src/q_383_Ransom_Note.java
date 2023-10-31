import java.util.Scanner;

public class q_383_Ransom_Note {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] alphabets_counter = new int[26];
        for (char c : magazine.toCharArray()) {
            alphabets_counter[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (alphabets_counter[c - 'a'] == 0) {
                return false;
            }
            alphabets_counter[c - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ransom note: ");
        String ransomNote = sc.next();
        System.out.print("Enter the magazine: ");
        String magazine = sc.next();
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
