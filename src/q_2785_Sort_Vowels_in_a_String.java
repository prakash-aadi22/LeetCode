import java.util.Scanner;

public class q_2785_Sort_Vowels_in_a_String {
    public static String sortVowels(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
                    || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                str.append(s.charAt(i));
            }
        }
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != 'a' || s.charAt(i) != 'e' || s.charAt(i) != 'i' || s.charAt(i) != 'o' || s.charAt(i) != 'u'
//                    || s.charAt(i) != 'A' || s.charAt(i) != 'E' || s.charAt(i) != 'I' || s.charAt(i) != 'O' || s.charAt(i) != 'U') {
//                str.append(s.charAt(i));
//            }
//        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u'
                    && s.charAt(i) != 'A' && s.charAt(i) != 'E' && s.charAt(i) != 'I' && s.charAt(i) != 'O' && s.charAt(i) != 'U') {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
    // lEetcOde

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(sortVowels(s));
    }
}
