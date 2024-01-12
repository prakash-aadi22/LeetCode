import java.util.Scanner;

public class q_1704_Determine_if_String_Halves_Are_Alike {

//        public static boolean halvesAreAlike(String s) { // 3ms
//        s = s.toLowerCase();
//        int count1 = 0, count2 = 0;
//        for (int i = 0; i < s.length() / 2; i++) {
//            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
//                count1++;
//            }
//        }
//        for (int i = s.length() / 2; i < s.length(); i++) {
//            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
//                count2++;
//            }
//        }
//        return count1 == count2;
//    }

    public static boolean halvesAreAlike(String s) { // 1ms
        int mid = s.length() / 2;
        String firstHalf = s.substring(0, mid);
        String secondHalf = s.substring(mid);

        return countVowels(firstHalf) == countVowels(secondHalf);
    }

    private static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.println(halvesAreAlike(str));
    }
}
