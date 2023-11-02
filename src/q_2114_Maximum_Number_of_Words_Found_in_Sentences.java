import java.util.Scanner;

public class q_2114_Maximum_Number_of_Words_Found_in_Sentences {
    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
//        for (int i = 0; i < sentences.length; i++) {
//            maxWords = Math.max(maxWords, (sentences[i].split(" ").length));
//        }
        for (String s : sentences) {
            maxWords = Math.max(maxWords, (s.split(" ").length));
        }
        return maxWords;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int l = sc.nextInt();
        sc.nextLine();
        String[] str = new String[l];
        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter the String for the " + i + " index: ");
            str[i] = sc.nextLine();
        }
        System.out.println(mostWordsFound(str));
    }
}
