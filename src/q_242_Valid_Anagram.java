import java.util.Scanner;

public class q_242_Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//        int[] map = new int[26];
//        for (int i = 0; i < s.length(); i += 1) {
//            map[s.charAt(i) - 'a'] += 1;
//            map[t.charAt(i) - 'a'] -= 1;
//        }
////        return Arrays.stream(map).boxed().filter(i -> i < 0).count() == 0;
//        return Arrays.stream(map).boxed().noneMatch(i -> i < 0);

        int[] sCharMap = new int[26]; // initialized to be 0s by default in Java!
        for (int i = 0; i < s.length(); i++) {
            int mapIdx = s.charAt(i) - 97;
            sCharMap[mapIdx] = sCharMap[mapIdx] + 1;
        }
        for (int i = 0; i < t.length(); i++) {
            int mapIdx = t.charAt(i) - 97;
            if (sCharMap[mapIdx] == 0) {
                return false;
            } else {
                sCharMap[mapIdx] = sCharMap[mapIdx] - 1;
            }
        }
        // verify the sCharMap
        int acc = 0;
//        for (int i = 0; i < sCharMap.length; i++) {
//            acc += sCharMap[i];
//        }
        for (int j : sCharMap) {
            acc += j;
        }
//        return acc == 0 ? true : false;
        return acc == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s = sc.next();
        System.out.print("Enter the second string: ");
        String t = sc.next();
        System.out.println(isAnagram(s, t));
    }
}
