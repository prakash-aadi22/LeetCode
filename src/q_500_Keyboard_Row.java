import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class q_500_Keyboard_Row {

    public static String[] findWords(String[] words) {
        String[] preDefined = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> worPref = new ArrayList<>();
        for (String i : words) {
            for (String keyPad : preDefined) {
                if (keyPad.contains(String.valueOf(i.charAt(0)).toLowerCase())) {
                    boolean flag = true;
                    for (char a : i.toCharArray()) {
                        if (!keyPad.contains(String.valueOf(a).toLowerCase())) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) worPref.add(i);
                }
            }
        }
//        return worPref.toArray(new String[worPref.size()]);
        return worPref.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < words.length; i++) {
            System.out.print("Enter the string of " + i + " index: ");
            words[i] = sc.next();
        }
        System.out.println(Arrays.toString(findWords(words)));
    }
}
