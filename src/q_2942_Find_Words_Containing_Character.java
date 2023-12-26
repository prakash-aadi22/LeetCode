import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_2942_Find_Words_Containing_Character {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
//            if (words[i].contains(String.valueOf(x))) {
//                l.add(i);
//            }
            if (words[i].indexOf(x) != -1) {
                l.add(i);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l = sc.nextInt();
        sc.nextLine();
        String[] str = new String[l];
        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter the String for the " + i + " index: ");
            str[i] = sc.nextLine();
        }
        System.out.print("Enter the value of char: ");
        String c = sc.next();
        System.out.println(findWordsContaining(str, c.charAt(0)));
    }
}
